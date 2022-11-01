package media.syrup.molassesenhancements.block;

import media.syrup.molassesenhancements.MolassesEnhancements;
import media.syrup.molassesenhancements.block.custom.ModSlabBlock;
import media.syrup.molassesenhancements.block.custom.ModStairsBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block NECO_ARC_BLOCK = registerBlock("neco_arc_block", 
        new Block(FabricBlockSettings.of(Material.WOOL).breakInstantly()), ItemGroup.DECORATIONS);

    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
        new Block(FabricBlockSettings.of(Material.STONE).hardness(0.15f).resistance(0.6f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block CRACKED_ANDESITE_BRICKS = registerBlock("cracked_andesite_bricks",
        new Block(FabricBlockSettings.of(Material.STONE).hardness(0.15f).resistance(0.6f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block MOSSY_ANDESITE_BRICKS = registerBlock("mossy_andesite_bricks",
        new Block(FabricBlockSettings.of(Material.STONE).hardness(0.15f).resistance(0.6f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
        new ModStairsBlock(ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(ANDESITE_BRICKS)), ItemGroup.BUILDING_BLOCKS);

    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
        new ModSlabBlock(FabricBlockSettings.copy(ANDESITE_BRICKS)), ItemGroup.BUILDING_BLOCKS);         

    public static final Block DACITE = registerBlock("dacite",
        new Block(FabricBlockSettings.of(Material.STONE).hardness(0.15f).resistance(0.6f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block COBBLED_DACITE = registerBlock("cobbled_dacite",
        new Block(FabricBlockSettings.of(Material.STONE).hardness(0.15f).resistance(0.6f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block POLISHED_DACITE = registerBlock("polished_dacite",
        new Block(FabricBlockSettings.of(Material.STONE).hardness(0.15f).resistance(0.6f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block DACITE_BRICKS = registerBlock("dacite_bricks",
        new Block(FabricBlockSettings.of(Material.STONE).hardness(0.15f).resistance(0.6f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block CRACKED_DACITE_BRICKS = registerBlock("cracked_dacite_bricks",
        new Block(FabricBlockSettings.of(Material.STONE).hardness(0.15f).resistance(0.6f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block MOSSY_DACITE_BRICKS = registerBlock("mossy_dacite_bricks",
        new Block(FabricBlockSettings.of(Material.STONE).hardness(0.15f).resistance(0.6f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block DACITE_BRICK_STAIRS = registerBlock("dacite_brick_stairs",
        new ModStairsBlock(DACITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(DACITE_BRICKS)), ItemGroup.BUILDING_BLOCKS);

    public static final Block DACITE_BRICK_SLAB = registerBlock("dacite_brick_slab",
        new ModSlabBlock(FabricBlockSettings.copy(DACITE_BRICKS)), ItemGroup.BUILDING_BLOCKS);         

    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
        new Block(FabricBlockSettings.of(Material.STONE).hardness(0.15f).resistance(0.6f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block CRACKED_DIORITE_BRICKS = registerBlock("cracked_diorite_bricks",
        new Block(FabricBlockSettings.of(Material.STONE).hardness(0.15f).resistance(0.6f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block MOSSY_DIORITE_BRICKS = registerBlock("mossy_diorite_bricks",
        new Block(FabricBlockSettings.of(Material.STONE).hardness(0.15f).resistance(0.6f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
        new ModStairsBlock(DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(DIORITE_BRICKS)), ItemGroup.BUILDING_BLOCKS);

    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            new ModSlabBlock(FabricBlockSettings.copy(ANDESITE_BRICKS)), ItemGroup.BUILDING_BLOCKS);

    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
        new Block(FabricBlockSettings.of(Material.STONE).hardness(0.15f).resistance(0.6f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block CRACKED_GRANITE_BRICKS = registerBlock("cracked_granite_bricks",
        new Block(FabricBlockSettings.of(Material.STONE).hardness(0.15f).resistance(0.6f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block MOSSY_GRANITE_BRICKS = registerBlock("mossy_granite_bricks",
        new Block(FabricBlockSettings.of(Material.STONE).hardness(0.15f).resistance(0.6f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
        new ModStairsBlock(GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(GRANITE_BRICKS)), ItemGroup.BUILDING_BLOCKS);

    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
        new ModSlabBlock(FabricBlockSettings.copy(ANDESITE_BRICKS)), ItemGroup.BUILDING_BLOCKS);  

    public static final Block OBSIDIAN_BRICKS = registerBlock("obsidian_bricks",
        new Block(FabricBlockSettings.of(Material.STONE).hardness(10.0f).resistance(120.0f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block CRACKED_OBSIDIAN_BRICKS = registerBlock("cracked_obsidian_bricks",
        new Block(FabricBlockSettings.of(Material.STONE).hardness(10.0f).resistance(120.0f)), ItemGroup.BUILDING_BLOCKS);

    public static final Block OBSIDIAN_BRICK_STAIRS = registerBlock("obsidian_brick_stairs",
        new ModStairsBlock(OBSIDIAN_BRICKS.getDefaultState(), FabricBlockSettings.copy(OBSIDIAN_BRICKS)), ItemGroup.BUILDING_BLOCKS);

    public static final Block OBSIDIAN_BRICK_SLAB = registerBlock("obsidian_brick_slab",
        new ModSlabBlock(FabricBlockSettings.copy(ANDESITE_BRICKS)), ItemGroup.BUILDING_BLOCKS);  

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(MolassesEnhancements.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(MolassesEnhancements.MOD_ID, name), 
            new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        MolassesEnhancements.LOGGER.debug("Registering mod blocks for " + MolassesEnhancements.MOD_ID);
    }
    public static final Block RIVER_STONES = registerBlock("river_stones", 
        new Block(FabricBlockSettings.of(Material.STONE).hardness(0.15f).resistance(0.6f)), ItemGroup.DECORATIONS);

    public static final Block MOSSY_RIVER_STONES = registerBlock("mossy_river_stones", 
        new Block(FabricBlockSettings.of(Material.STONE).hardness(0.15f).resistance(0.6f)), ItemGroup.DECORATIONS);
}
