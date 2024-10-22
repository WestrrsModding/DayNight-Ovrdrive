package net.kaupenjoe.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MIDNIGHTIUM = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "midnightium"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MIDNIGHTIUM_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorialmod.midnightium"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MIDNIGHTIUM_SCRAP);
                        entries.add(ModItems.MIDNIGHTIUM_INGOT);

                        entries.add(ModBlocks.MIDNIGHTIUM_BLOCK);

                        entries.add(ModItems.MIDNIGHTIUM_SWORD);
                        entries.add(ModItems.MIDNIGHTIUM_AXE);
                        entries.add(ModItems.MIDNIGHTIUM_PICKAXE);
                        entries.add(ModItems.MIDNIGHTIUM_SHOVEL);

                        entries.add(ModItems.MIDNIGHTIUM_HELMET);
                        entries.add(ModItems.MIDNIGHTIUM_CHESTPLATE);
                        entries.add(ModItems.MIDNIGHTIUM_LEGGINGS);
                        entries.add(ModItems.MIDNIGHTIUM_BOOTS);
                    }).build());

    public static final ItemGroup DAY_AND_NIGHT = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "dark_diamond"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.DARK_DIAMOND))
                    .displayName(Text.translatable("itemgroup.tutorialmod.day_and_night"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.DARK_DIAMOND);
                        entries.add(ModItems.BRIGHT_DIAMOND);

                        entries.add(ModBlocks.NIGHTLIGHT);
                        entries.add(ModBlocks.DAYLIGHT);
                    }).build());

    public static final ItemGroup LUCENTIUM = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "lucentium"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.LUCENTIUM_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorialmod.lucentium"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.LUCENTIUM_SCRAP);
                        entries.add(ModItems.LUCENTIUM_INGOT);

                        entries.add(ModBlocks.LUCENTIUM_BLOCK);

                        entries.add(ModItems.LUCENTIUM_SWORD);
                        entries.add(ModItems.LUCENTIUM_AXE);
                        entries.add(ModItems.LUCENTIUM_PICKAXE);
                        entries.add(ModItems.LUCENTIUM_SHOVEL);

                        entries.add(ModItems.LUCENTIUM_HELMET);
                        entries.add(ModItems.LUCENTIUM_CHESTPLATE);
                        entries.add(ModItems.LUCENTIUM_LEGGINGS);
                        entries.add(ModItems.LUCENTIUM_BOOTS);
                    }).build());

    public static final ItemGroup OVERCENTIUM = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "overcentium"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.OVERCENTIUM_CHESTPLATE))
                    .displayName(Text.translatable("itemgroup.tutorialmod.overcentium"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.OVERCENTIUM_INGOT);

                        entries.add(ModBlocks.OVERCENTIUM_BLOCK);

                        entries.add(ModItems.OVERCENTIUM_SWORD);
                        entries.add(ModItems.OVERCENTIUM_AXE);
                        entries.add(ModItems.OVERCENTIUM_PICKAXE);
                        entries.add(ModItems.OVERCENTIUM_SHOVEL);

                        entries.add(ModItems.OVERCENTIUM_HELMET);
                        entries.add(ModItems.OVERCENTIUM_CHESTPLATE);
                        entries.add(ModItems.OVERCENTIUM_LEGGINGS);
                        entries.add(ModItems.OVERCENTIUM_BOOTS);
                    }).build());

    public static final ItemGroup OVERNIGHTIUM = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "overnightium"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.OVERNIGHTIUM_CHESTPLATE))
                    .displayName(Text.translatable("itemgroup.tutorialmod.overnightium"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.OVERNIGHTIUM_INGOT);

                        entries.add(ModBlocks.OVERNIGHTIUM_BLOCK);

                        entries.add(ModItems.OVERNIGHTIUM_SWORD);
                        entries.add(ModItems.OVERNIGHTIUM_AXE);
                        entries.add(ModItems.OVERNIGHTIUM_PICKAXE);
                        entries.add(ModItems.OVERNIGHTIUM_SHOVEL);

                        entries.add(ModItems.OVERNIGHTIUM_HELMET);
                        entries.add(ModItems.OVERNIGHTIUM_CHESTPLATE);
                        entries.add(ModItems.OVERNIGHTIUM_LEGGINGS);
                        entries.add(ModItems.OVERNIGHTIUM_BOOTS);
                    }).build());

    public static final ItemGroup OVERDRIVE = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "overdrive"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.OVERDRIVE_SHARD))
                    .displayName(Text.translatable("itemgroup.tutorialmod.overdrive"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.OVERDRIVE_SHARD);
                    }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for Day&Night-Overdrive");
    }
}
