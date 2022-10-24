package media.syrup.molassesenhancements.item;

import media.syrup.molassesenhancements.MolassesEnhancements;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item NECO_ARC = registerItem("neco_arc", 
        new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MolassesEnhancements.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MolassesEnhancements.LOGGER.debug("Registering mod items for " + MolassesEnhancements.MOD_ID);
    }
}
