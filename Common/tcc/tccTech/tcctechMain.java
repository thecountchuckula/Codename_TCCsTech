package tcc.tccTech;

import javax.swing.text.html.parser.Entity;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.GameRules;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;



@Mod(modid = tcctechInfo.MOD_ID, name = tcctechInfo.NAME, version = tcctechInfo.version)
@NetworkMod(channels = { tcctechInfo.MOD_ID }, clientSideRequired = true, serverSideRequired = true)
public class tcctechMain {
	
	static int denseIronIngotID;
	static int diamondIngotID;
	static int leatherBlockID;
	static boolean hardground;
	static boolean hardarmor;
	static boolean mowlawn;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();

		denseIronIngotID = config.get(Configuration.CATEGORY_ITEM, "Dense Iron Ingot", 4300).getInt();
		diamondIngotID = config.get(Configuration.CATEGORY_ITEM, "Diamond Ingot", 4301).getInt();
		leatherBlockID = config.get(Configuration.CATEGORY_BLOCK, "Block of Leather", 651).getInt();
		hardground = config.get(Configuration.CATEGORY_GENERAL, "Ground Harder to Dig", false).getBoolean(false);
		hardarmor = config.get(Configuration.CATEGORY_GENERAL, "Harder Armor Recipes", true).getBoolean(true);
		mowlawn = config.get(Configuration.CATEGORY_GENERAL, "Mow the Lawn", true).getBoolean(true);
		
		config.save();

		
		// Strip mining made very difficult. Caves are better, but still harder.
		
		if(hardground == true) {
		Block.blocksList[Block.dirt.blockID].setHardness(8F);
		Block.blocksList[Block.grass.blockID].setHardness(8F);
		Block.blocksList[Block.sand.blockID].setHardness(8F);
		Block.blocksList[Block.sandStone.blockID].setHardness(10F);
		Block.blocksList[Block.stone.blockID].setHardness(10F);
		Block.blocksList[Block.cobblestone.blockID].setHardness(10F);
		Block.blocksList[Block.cobblestoneMossy.blockID].setHardness(10F);
		Block.blocksList[Block.mobSpawner.blockID].setHardness(10F);
		Block.blocksList[Block.fence.blockID].setHardness(10F);
		Block.blocksList[Block.planks.blockID].setHardness(10F);
		Block.blocksList[Block.chest.blockID].setHardness(10F);
		Block.blocksList[Block.chestTrapped.blockID].setHardness(10F);
		Block.blocksList[Block.cloth.blockID].setHardness(10F);
		Block.blocksList[Block.netherrack.blockID].setHardness(10F);
		Block.blocksList[Block.netherBrick.blockID].setHardness(10F);
		Block.blocksList[Block.netherFence.blockID].setHardness(10F);
		Block.blocksList[Block.slowSand.blockID].setHardness(10F);
		}
		// Dimmer Torches, Harder to Break.
		Block.blocksList[Block.torchWood.blockID].setLightValue(0.5F).setHardness(.5F);
		// Stack the Important Stuff.
		Item.itemsList[Item.potion.itemID].setMaxStackSize(3);
		// Can carry fewer arrows.
		Item.itemsList[Item.arrow.itemID].setMaxStackSize(24);
		
		
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		tcctechInfo.craftingR();
		tcctechInfo.itemInit();
		tcctechInfo.blockInit();
		tcctechInfo.names();
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {

		tcctechInfo.crafting();
	}
	
}
