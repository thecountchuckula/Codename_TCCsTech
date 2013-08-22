package tcc.tccTech;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandGameRule;
import net.minecraft.command.CommandGive;
import net.minecraft.command.ICommandSender;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.GameRules;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;

public class tcctechInfo {
	public static final String NAME = "Mow The Lawn UHC Add-On";
	public static final String MOD_ID = "mtluhc";
	public static final String version = "v1.0dev-1.6.2";
	public static final ItemStack beef = new ItemStack(Item.beefRaw, 2, 0);
	public static final ItemStack bonemeal = new ItemStack(Item.dyePowder, 1, 15);
	public static final ItemStack fireball = new ItemStack(Item.fireballCharge, 1, 0);
	public static final ItemStack torches = new ItemStack(Block.torchWood, 4, 0);
	public static final ItemStack coal = new ItemStack(Item.coal, 1, 0);
	public static final ItemStack charCoal = new ItemStack(Item.coal, 1, 1);
	public static void crafting() {
		GameRegistry.addSmelting(Item.eyeOfEnder.itemID, fireball, 0.8F);
		GameRegistry.addShapelessRecipe(beef, Item.redstone, Item.rottenFlesh, Item.sugar, bonemeal);
		GameRegistry.addRecipe(torches,
				"c",
				"p",
				'c', coal,
				'p', Block.planks);
		GameRegistry.addRecipe(torches,
				"c",
				"p",
				'c', charCoal,
				'p', Block.planks);
		MinecraftForge.addGrassSeed(new ItemStack(Item.potato), 10);
		MinecraftForge.addGrassSeed(new ItemStack(Item.rottenFlesh), 10);
		MinecraftForge.addGrassSeed(new ItemStack(Item.carrot), 10);
		MinecraftForge.addGrassSeed(new ItemStack(Item.pumpkinSeeds), 7);
		MinecraftForge.addGrassSeed(new ItemStack(Item.melonSeeds), 6);
		MinecraftForge.addGrassSeed(new ItemStack(Item.coal), 6);
		MinecraftForge.addGrassSeed(new ItemStack(Item.appleRed), 5);
		MinecraftForge.addGrassSeed(new ItemStack(Item.ingotIron), 4);
		MinecraftForge.addGrassSeed(new ItemStack(Item.goldNugget), 3);
		MinecraftForge.addGrassSeed(new ItemStack(Item.diamond), 1);
		MinecraftForge.addGrassSeed(new ItemStack(Block.obsidian), 1);
		MinecraftForge.addGrassSeed(new ItemStack(Item.dyePowder, 1, 15), 1);
	}
}
