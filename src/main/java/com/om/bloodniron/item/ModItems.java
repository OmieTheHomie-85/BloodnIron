package com.om.bloodniron.item;

import com.om.bloodniron.BloodnIron;
import com.om.bloodniron.item.custom.BattleAxeItem;
import com.om.bloodniron.item.custom.MorningStarItem;
import com.om.bloodniron.item.custom.RapierItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BloodnIron.MOD_ID);

    public static final RegistryObject<Item> IRON_RAPIER = ITEMS.register("iron_rapier", ()-> new RapierItem(Tiers.IRON, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> GOLD_RAPIER = ITEMS.register("gold_rapier", ()-> new RapierItem(Tiers.GOLD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> DIAMOND_RAPIER = ITEMS.register("diamond_rapier", ()-> new RapierItem(Tiers.DIAMOND, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> NETHERITE_RAPIER = ITEMS.register("netherite_rapier", ()-> new RapierItem(Tiers.NETHERITE, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));

    public static final RegistryObject<Item> IRON_BATTLEAXE = ITEMS.register("iron_battle_axe", ()-> new BattleAxeItem(Tiers.IRON, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> GOLD_BATTLEAXE = ITEMS.register("gold_battle_axe", ()-> new BattleAxeItem(Tiers.GOLD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> DIAMOND_BATTLEAXE = ITEMS.register("diamond_battle_axe", ()-> new BattleAxeItem(Tiers.DIAMOND, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> NETHERITE_BATTLEAXE = ITEMS.register("netherite_battle_axe", ()-> new BattleAxeItem(Tiers.NETHERITE, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));

    public static final RegistryObject<Item> IRON_MORNINGSTAR = ITEMS.register("iron_morningstar", ()-> new MorningStarItem(Tiers.IRON, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> GOLD_MORNINGSTAR = ITEMS.register("gold_morningstar", ()-> new MorningStarItem(Tiers.GOLD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> DIAMOND_MORNINGSTAR = ITEMS.register("diamond_morningstar", ()-> new MorningStarItem(Tiers.DIAMOND, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> NETHERITE_MORNINGSTAR = ITEMS.register("netherite_morningstar", ()-> new MorningStarItem(Tiers.NETHERITE, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
