package com.om.bloodniron.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.block.state.BlockState;

public abstract class WeaponItem extends SwordItem {
    public WeaponItem(Tiers tier, int damageIn, float speedIn, Item.Properties builder) {
        super(tier, damageIn, speedIn, builder);
    }

    @Override
    public boolean isCorrectToolForDrops(BlockState blockIn) {
        return false;
    }
}
