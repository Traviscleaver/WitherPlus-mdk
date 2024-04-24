package net.travis.firstmod.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.travis.firstmod.item.custom.CustomWitherSkull;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.travis.firstmod.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Predicate;

public class WitherBowItem extends BowItem {
    public WitherBowItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void releaseUsing(ItemStack bowStack, Level level, LivingEntity livingEntity, int timeLeft) {
        if (!(livingEntity instanceof Player player)) return;
        boolean hasInfinity = player.getAbilities().instabuild || bowStack.getEnchantmentLevel(Enchantments.INFINITY_ARROWS) > 0;
        ItemStack projectileStack = player.getProjectile(bowStack);

        int useTicks = this.getUseDuration(bowStack) - timeLeft;
        if (useTicks < 0) return;

        if (projectileStack.isEmpty() && !hasInfinity) return;
        if (projectileStack.isEmpty()) {
            projectileStack = new ItemStack(Items.ARROW);
        }

        float power = getPowerForTime(useTicks);
        if (power < 0.1d) return;
        boolean isInfinite = player.getAbilities().instabuild || (projectileStack.getItem() instanceof ArrowItem arrowItem && arrowItem.isInfinite(projectileStack, bowStack, player));
        if (!level.isClientSide) {
            Vec3 playerFeetPos = player.position();
            player.setPos(player.getEyePosition());
            CustomWitherSkull witherSkull = new CustomWitherSkull(level, player, 0, -1, 0); // I think there should be 0s here, if something doesn't work, change these
            player.setPos(playerFeetPos);
            witherSkull.setOwner(player);
            witherSkull.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, power * 4.0F, 0);
            if (bowStack.getEnchantmentLevel(Enchantments.FLAMING_ARROWS) > 0) {
                witherSkull.setSecondsOnFire(300);
            }


            bowStack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(player.getUsedItemHand()));

            level.addFreshEntity(witherSkull);
        }

        level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ARROW_SHOOT, SoundSource.PLAYERS,
                1.0F, 1.0F / (level.getRandom().nextFloat() * 0.4F + 1.2F) + power * 0.5F);
        if (!isInfinite && !player.getAbilities().instabuild) {
            projectileStack.shrink(1);
            if (projectileStack.isEmpty()) {
                player.getInventory().removeItem(projectileStack);
            }
        }

        player.awardStat(Stats.ITEM_USED.get(this));
    }


    public static float getPowerForTime(int chargeTicks) {
        float arrowVelocity = (float)chargeTicks / 20.0F;
        arrowVelocity = (arrowVelocity * arrowVelocity + arrowVelocity * 2.0F) / 3.0F;
        if (arrowVelocity > 1.0F) {
            arrowVelocity = 1.0F;
        }

        return arrowVelocity;
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 72000;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.BOW;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stackInHand = player.getItemInHand(hand);
        boolean hasProjectile = !player.getProjectile(stackInHand).isEmpty();

        if (player.getAbilities().instabuild || hasProjectile) {
            player.startUsingItem(hand);
            return InteractionResultHolder.consume(stackInHand);
        }
        return InteractionResultHolder.fail(stackInHand);
    }

    @Override
    public Predicate<ItemStack> getAllSupportedProjectiles() {
        return stack -> stack.is(ModItems.WITHER_ARROW.get());
    }

    @Override
    public int getDefaultProjectileRange() {
        return 15;
    }

    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("Shoots Wither Skeleton Skulls!").withStyle((ChatFormatting.BLUE)));
        pTooltipComponents.add(Component.translatable("25 Attack Damage").withStyle((ChatFormatting.DARK_GREEN)));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }
}
