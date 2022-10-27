package media.syrup.molassesenhancements.block;

import media.syrup.molassesenhancements.MolassesEnhancements;
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
            new Block(FabricBlockSettings.of(Material.STONE).breakInstantly()), ItemGroup.BUILDING_BLOCKS);

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
}
