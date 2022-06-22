package net.hxn30324.useful_gun;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.tinyremapper.Main;
import net.hxn30324.useful_gun.items.useful_gun_author;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.event.ItemListener;

public class UsefulGun implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	public static final String MOD_ID = "useful_gun";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	//Item_Group

	public static final ItemGroup USEFUL_GUN = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID,"useful_gun"),
			() -> new ItemStack(UsefulGun.Author));

	//Author
	public static final Item Author = new useful_gun_author(new FabricItemSettings()/*.group(ItemGroup.MISC)*/);



	//Item



	//Block

	public static final Block Gunpowder_Block = new Block(FabricBlockSettings.of(Material.TNT).hardness(0.5F));


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		//Author

		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"useful_gun_author"),Author);

		//Item



		//Block

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"gunpowder_block"),Gunpowder_Block);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"gunpowder_block"), new BlockItem(Gunpowder_Block, new FabricItemSettings().group(USEFUL_GUN)));

		LOGGER.info("Hello Fabric world!");
	}
}
