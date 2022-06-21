package net.hxn30324.useful_gun;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.hxn30324.useful_gun.items.useful_gun_author;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsefulGun implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	public static final String MOD_ID = "useful_gun";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	//author
	public static final Item Author = new useful_gun_author(new FabricItemSettings()/*.group(ItemGroup.MISC)*/);
	//Item




	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		//author

		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"useful_gun_author"),Author);

		//Item




		LOGGER.info("Hello Fabric world!");
	}
}
