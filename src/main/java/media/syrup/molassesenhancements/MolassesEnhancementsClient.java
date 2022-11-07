package media.syrup.molassesenhancements;

import media.syrup.molassesenhancements.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class MolassesEnhancementsClient implements ClientModInitializer {
@Override
public void onInitializeClient() {
    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORIENTAL_WINDOW_PANEL, RenderLayer.getCutout());
}
}
