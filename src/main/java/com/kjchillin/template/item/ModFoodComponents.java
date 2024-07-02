package com.kjchillin.template.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent TOMATO = new FoodComponent.Builder().nutrition(4).saturationModifier(2.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON,40),0.5f).alwaysEdible().build();
public static final FoodComponent POTATO = new FoodComponent.Builder().nutrition(4).saturationModifier(2.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON,40),0.5f).alwaysEdible().build();
}
