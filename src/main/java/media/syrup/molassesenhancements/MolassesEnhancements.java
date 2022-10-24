package media.syrup.molassesenhancements;

import net.fabricmc.api.ModInitializer;
import media.syrup.molassesenhancements.block.ModBlocks;
import media.syrup.molassesenhancements.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MolassesEnhancements implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "molassesenhancements";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Using Molasses' Enhancements! 🥞");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
