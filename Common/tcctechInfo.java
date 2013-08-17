package tcc.tccTech;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.command.CommandTime;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.inventory.ICrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class tcctechInfo {
	public static final String NAME = "Mow The Lawn UHC";
	public static final String MOD_ID = "mtlUHC";
	public static final String version = "v1.0dev-1.6.2";
	public static final ItemStack beef = new ItemStack(Item.beefRaw, 1, 0);
	public static final ItemStack fireball = new ItemStack(Item.fireballCharge, 1, 0);
	public static void crafting() {
		GameRegistry.addSmelting(Item.rottenFlesh.itemID, beef, 0.8F);
		GameRegistry.addSmelting(Item.eyeOfEnder.itemID, fireball, 0.8F);
		MinecraftForge.addGrassSeed(new ItemStack(Item.potato), 10);
		MinecraftForge.addGrassSeed(new ItemStack(Item.carrot), 10);
		MinecraftForge.addGrassSeed(new ItemStack(Item.pumpkinSeeds), 7);
		MinecraftForge.addGrassSeed(new ItemStack(Item.melonSeeds), 6);
		MinecraftForge.addGrassSeed(new ItemStack(Item.coal), 6);
		MinecraftForge.addGrassSeed(new ItemStack(Item.appleRed), 5);
		MinecraftForge.addGrassSeed(new ItemStack(Item.ingotIron), 4);
		MinecraftForge.addGrassSeed(new ItemStack(Item.goldNugget), 3);
		MinecraftForge.addGrassSeed(new ItemStack(Item.diamond), 1);
		MinecraftForge.addGrassSeed(new ItemStack(Block.obsidian), 1);
	}
}
