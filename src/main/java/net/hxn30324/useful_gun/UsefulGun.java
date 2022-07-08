package net.hxn30324.useful_gun;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hxn30324.useful_gun.items.useful_gun_author;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
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


			//Item_Group Useful_Gun

			public static final ItemGroup USEFUL_GUN = FabricItemGroupBuilder.build(
					new Identifier(MOD_ID,"useful_gun"),
					() -> new ItemStack(net.hxn30324.useful_gun.UsefulGun.Author));

			//Author
			public static final Item Author = new useful_gun_author(new FabricItemSettings()/*.group(ItemGroup.MISC)*/);



			//Item

			public static final Item Iron_Stick = new Item(new FabricItemSettings().group(USEFUL_GUN));
			public static final Item Needle = new Item(new FabricItemSettings().group(USEFUL_GUN));
			public static final Item Needle_And_String = new Item(new FabricItemSettings().group(USEFUL_GUN));
			public static final Item Fabric = new Item(new FabricItemSettings().group(USEFUL_GUN))

			//Tool



			//Armor



			//Shied



			//enchantments



			//Block

			public static final Block Gunpowder_Block = new Block(FabricBlockSettings.of(Material.AGGREGATE).strength(0.5F).sounds(BlockSoundGroup.SAND));
			public static final Block Bagged_Gunpowder_Block = new Block(FabricBlockSettings.of(Material.AGGREGATE).strength(1.0F,1.5F).sounds(BlockSoundGroup.WOOL));
			public static final Block Reinforced_Bagged_Gunpowder_Block = new Block(FabricBlockSettings.of(Material.METAL).strength(1.0F,2.0F).sounds(BlockSoundGroup.METAL));
			public static final Block Fabric_Bag = new Block(FabricBlockSettings.of(Material.WOOL).strength(1.0F,1.0F).sounds(BlockSoundGroup.WOOL));
			public static final Block Reinforced_Fabric_Bag = new Block(FabricBlockSettings.of(Material.METAL).strength(1.0F,2.0F).sounds(BlockSoundGroup.METAL));


			@Override
			public void onInitialize() {
				// This code runs as soon as Minecraft is in a mod-load-ready state.
				// However, some things (like resources) may still be uninitialized.
				// Proceed with mild caution.

				//Author

				Registry.register(Registry.ITEM, new Identifier(MOD_ID,"useful_gun_author"),Author);

				//Item

				Registry.register(Registry.ITEM, new Identifier(MOD_ID,"iron_stick"),Iron_Stick);
				Registry.register(Registry.ITEM, new Identifier(MOD_ID,"needle"),Needle);
				Registry.register(Registry.ITEM, new Identifier(MOD_ID,"needle_and_string"),Needle_And_String);
				Registry.register(Registry.ITEM, new Identifier(MOD_ID,"fabric"),Fabric);

				//Tool



				//Armor



				//Shied



				//enchantments



				//Block

				Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"gunpowder_block"),Gunpowder_Block);
				Registry.register(Registry.ITEM, new Identifier(MOD_ID,"gunpowder_block"), new BlockItem(Gunpowder_Block, new FabricItemSettings().group(USEFUL_GUN)));
				Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bagged_gunpowder_block"),Bagged_Gunpowder_Block);
				Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bagged_gunpowder_block"), new BlockItem(Bagged_Gunpowder_Block, new FabricItemSettings().group(USEFUL_GUN)));
				Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"reinforced_bagged_gunpowder_block"), Reinforced_Bagged_Gunpowder_Block);
				Registry.register(Registry.ITEM, new Identifier(MOD_ID,"reinforced_bagged_gunpowder_block"), new BlockItem(Reinforced_Bagged_Gunpowder_Block, new FabricItemSettings().group(USEFUL_GUN)));
				Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"fabric_bag"), Fabric_Bag);
				Registry.register(Registry.ITEM, new Identifier(MOD_ID,"fabric_bag"), new BlockItem(Fabric_Bag, new FabricItemSettings().group(USEFUL_GUN)));
				Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"reinforced_fabric_bag"), Reinforced_Fabric_Bag);
				Registry.register(Registry.ITEM, new Identifier(MOD_ID,"reinforced_fabric_bag"), new BlockItem(Reinforced_Fabric_Bag, new FabricItemSettings().group(USEFUL_GUN)));


		LOGGER.info("Hello Fabric world!");
	}
}
