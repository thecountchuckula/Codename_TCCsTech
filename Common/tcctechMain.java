package tcc.tccTech;

import java.util.ArrayList;

import javax.swing.text.html.parser.Entity;

import net.minecraft.block.Block;
import net.minecraft.command.CommandHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;



@Mod(modid = tcctechInfo.MOD_ID, name = tcctechInfo.NAME, version = tcctechInfo.version)
@NetworkMod(channels = { tcctechInfo.MOD_ID }, clientSideRequired = true, serverSideRequired = true)
public class tcctechMain {
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		tcctechInfo.crafting();
		// Strip mining made very difficult. Caves are better.
		Block.blocksList[Block.dirt.blockID].setHardness(10F);
		Block.blocksList[Block.grass.blockID].setHardness(10F);
		Block.blocksList[Block.stone.blockID].setHardness(10F);
		Block.blocksList[Block.cobblestone.blockID].setHardness(10F);
		Block.blocksList[Block.cobblestoneMossy.blockID].setHardness(10F);
		Block.blocksList[Block.mobSpawner.blockID].setHardness(10F);
		// Dimmer Torches, Harder to Break.
		Block.blocksList[Block.torchWood.blockID].setLightValue(0.8F).setHardness(10F);
		// Stack the Important Stuff.
		Item.itemsList[Item.appleGold.itemID].setMaxStackSize(16);
		Item.itemsList[Item.potion.itemID].setMaxStackSize(3);
		// Can carry fewer arrows.
		Item.itemsList[Item.arrow.itemID].setMaxStackSize(24);
		
		/*ToDo
		 * 1.	Add Auto-Suspension of DayLightCycle, and NaturalRegeneration
		 * 2.	Set Time to Midnight
		 * 3.	Generate Bedrock Wall around 0,0 at Radius X (Circle)
		 * 			-or-
		 * 		Generate Bedrock Wall from -X,-X to X,X (Square)
		 * 
		 * 		Based on Config Settings, or in-game command.*/
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}

}
