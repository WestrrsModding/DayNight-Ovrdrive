package net.kaupenjoe.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.item.custom.ModArmorItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MIDNIGHTIUM_SCRAP = registerItem( "midnightium_scrap", new Item(new Item.Settings()));
    public static final Item MIDNIGHTIUM_INGOT = registerItem( "midnightium_ingot", new Item(new Item.Settings()));
    public static final Item DARK_DIAMOND = registerItem( "dark_diamond", new Item(new Item.Settings()));
    public static final Item BRIGHT_DIAMOND = registerItem( "bright_diamond", new Item(new Item.Settings()));
    public static final Item LUCENTIUM_INGOT = registerItem( "lucentium_ingot", new Item(new Item.Settings()));
    public static final Item LUCENTIUM_SCRAP = registerItem( "lucentium_scrap", new Item(new Item.Settings()));

    public static final Item MIDNIGHTIUM_HELMET = registerItem("midnightium_helmet",
            new ModArmorItem(ModArmorMaterials.MIDNIGHTIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(50))));
    public static final Item MIDNIGHTIUM_CHESTPLATE = registerItem("midnightium_chestplate",
            new ModArmorItem(ModArmorMaterials.MIDNIGHTIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(60))));
    public static final Item MIDNIGHTIUM_LEGGINGS = registerItem("midnightium_leggings",
            new ModArmorItem(ModArmorMaterials.MIDNIGHTIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(55))));
    public static final Item MIDNIGHTIUM_BOOTS = registerItem("midnightium_boots",
            new ModArmorItem(ModArmorMaterials.MIDNIGHTIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(47))));

    public static final Item LUCENTIUM_HELMET = registerItem("lucentium_helmet",
            new ModArmorItem(ModArmorMaterials.LUCENTIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(50))));
    public static final Item LUCENTIUM_CHESTPLATE = registerItem("lucentium_chestplate",
            new ModArmorItem(ModArmorMaterials.LUCENTIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(60))));
    public static final Item LUCENTIUM_LEGGINGS = registerItem("lucentium_leggings",
            new ModArmorItem(ModArmorMaterials.LUCENTIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(55))));
    public static final Item LUCENTIUM_BOOTS = registerItem("lucentium_boots",
            new ModArmorItem(ModArmorMaterials.LUCENTIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(47))));

    public static final Item MIDNIGHTIUM_SWORD = registerItem("midnightium_sword",
            new SwordItem(ModToolMaterials.MIDNIGHTIUM_INGOT, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.MIDNIGHTIUM_INGOT, 3, -2.4f))));
    public static final Item MIDNIGHTIUM_PICKAXE = registerItem("midnightium_pickaxe",
            new PickaxeItem(ModToolMaterials.MIDNIGHTIUM_INGOT, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.MIDNIGHTIUM_INGOT, 1, -2.8f))));
    public static final Item MIDNIGHTIUM_SHOVEL = registerItem("midnightium_shovel",
            new ShovelItem(ModToolMaterials.MIDNIGHTIUM_INGOT, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.MIDNIGHTIUM_INGOT, 1.5f, -3.0f))));
    public static final Item MIDNIGHTIUM_AXE = registerItem("midnightium_axe",
            new AxeItem(ModToolMaterials.MIDNIGHTIUM_INGOT, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.MIDNIGHTIUM_INGOT, 6, -3.2f))));

    public static final Item LUCENTIUM_SWORD = registerItem("lucentium_sword",
            new SwordItem(ModToolMaterials.LUCENTIUM_INGOT, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.LUCENTIUM_INGOT, 3, -2.4f))));
    public static final Item LUCENTIUM_PICKAXE = registerItem("lucentium_pickaxe",
            new PickaxeItem(ModToolMaterials.LUCENTIUM_INGOT, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.LUCENTIUM_INGOT, 1, -2.8f))));
    public static final Item LUCENTIUM_SHOVEL = registerItem("lucentium_shovel",
            new ShovelItem(ModToolMaterials.LUCENTIUM_INGOT, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.LUCENTIUM_INGOT, 1.5f, -3.0f))));
    public static final Item LUCENTIUM_AXE = registerItem("lucentium_axe",
            new AxeItem(ModToolMaterials.LUCENTIUM_INGOT, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.LUCENTIUM_INGOT, 6, -3.2f))));


    public static final Item OVERNIGHTIUM_INGOT = registerItem( "overnightium_ingot", new Item(new Item.Settings()));
    public static final Item OVERCENTIUM_INGOT = registerItem( "overcentium_ingot", new Item(new Item.Settings()));
    public static final Item OVERDRIVE_SHARD = registerItem( "overdrive_shard", new Item(new Item.Settings()));

    public static final Item OVERNIGHTIUM_HELMET = registerItem("overnightium_helmet",
            new ModArmorItem(ModArmorMaterials.OVERNIGHTIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(53))));
    public static final Item OVERNIGHTIUM_CHESTPLATE = registerItem("overnightium_chestplate",
            new ModArmorItem(ModArmorMaterials.OVERNIGHTIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(63))));
    public static final Item OVERNIGHTIUM_LEGGINGS = registerItem("overnightium_leggings",
            new ModArmorItem(ModArmorMaterials.OVERNIGHTIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(58))));
    public static final Item OVERNIGHTIUM_BOOTS = registerItem("overnightium_boots",
            new ModArmorItem(ModArmorMaterials.OVERNIGHTIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(50))));

    public static final Item OVERCENTIUM_HELMET = registerItem("overcentium_helmet",
            new ModArmorItem(ModArmorMaterials.OVERCENTIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(53))));
    public static final Item OVERCENTIUM_CHESTPLATE = registerItem("overcentium_chestplate",
            new ModArmorItem(ModArmorMaterials.OVERCENTIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(63))));
    public static final Item OVERCENTIUM_LEGGINGS = registerItem("overcentium_leggings",
            new ModArmorItem(ModArmorMaterials.OVERCENTIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(58))));
    public static final Item OVERCENTIUM_BOOTS = registerItem("overcentium_boots",
            new ModArmorItem(ModArmorMaterials.OVERCENTIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(50))));

    public static final Item OVERNIGHTIUM_SWORD = registerItem("overnightium_sword",
            new SwordItem(ModToolMaterials.OVERNIGHTIUM_INGOT, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.OVERNIGHTIUM_INGOT, 3, -2f))));
    public static final Item OVERNIGHTIUM_PICKAXE = registerItem("overnightium_pickaxe",
            new PickaxeItem(ModToolMaterials.OVERNIGHTIUM_INGOT, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.OVERNIGHTIUM_INGOT, 1, -2f))));
    public static final Item OVERNIGHTIUM_SHOVEL = registerItem("overnightium_shovel",
            new ShovelItem(ModToolMaterials.OVERNIGHTIUM_INGOT, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.OVERNIGHTIUM_INGOT, 1.5f, -2.5f))));
    public static final Item OVERNIGHTIUM_AXE = registerItem("overnightium_axe",
            new AxeItem(ModToolMaterials.OVERNIGHTIUM_INGOT, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.OVERNIGHTIUM_INGOT, 6, -3f))));

    public static final Item OVERCENTIUM_SWORD = registerItem("overcentium_sword",
            new SwordItem(ModToolMaterials.OVERCENTIUM_INGOT, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.OVERCENTIUM_INGOT, 3, -2f))));
    public static final Item OVERCENTIUM_PICKAXE = registerItem("overcentium_pickaxe",
            new PickaxeItem(ModToolMaterials.OVERCENTIUM_INGOT, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.OVERCENTIUM_INGOT, 1, -2f))));
    public static final Item OVERCENTIUM_SHOVEL = registerItem("overcentium_shovel",
            new ShovelItem(ModToolMaterials.OVERCENTIUM_INGOT, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.OVERCENTIUM_INGOT, 1.5f, -2.5f))));
    public static final Item OVERCENTIUM_AXE = registerItem("overcentium_axe",
            new AxeItem(ModToolMaterials.OVERCENTIUM_INGOT, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.OVERCENTIUM_INGOT, 6, -3f))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for Day&Night-Overdrive");
    }
}