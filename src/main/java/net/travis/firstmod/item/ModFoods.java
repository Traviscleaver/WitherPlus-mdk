package net.travis.firstmod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraftforge.event.entity.living.MobEffectEvent;

public class ModFoods {



    public static final FoodProperties BONE_MARROW = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(1).effect(() -> new MobEffectInstance(MobEffects.WITHER, 100), 0.6f).build();

    public static final FoodProperties WITHER_STEW = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(1)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1600,1),1f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1600,1),1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600,1),1f)
            .effect(() -> new MobEffectInstance(MobEffects.HARM, 800,20),0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1600,1),1f)
            .alwaysEat()
            .build();

}
