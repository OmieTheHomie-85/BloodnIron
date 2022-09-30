package com.om.bloodniron.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class BattleAxeItem extends WeaponItem {
    public BattleAxeItem(Tiers tier, Item.Properties builder) {
        super(tier, 5, -2.7f, builder);
    }
}

