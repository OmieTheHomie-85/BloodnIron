package com.om.bloodniron.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class RapierItem extends WeaponItem{
    public RapierItem(Tiers tier, Item.Properties builder) {
        super(tier, 1, -1.9f, builder);
    }
}

