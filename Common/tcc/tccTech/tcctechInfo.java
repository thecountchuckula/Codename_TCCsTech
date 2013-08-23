package tcc.tccTech;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class tcctechInfo {
	public static Block leatherBlock;
	public static Item diamondIngot;
	public static Item denseIronIngot;
		
	public static final String NAME = "Mow The Lawn UHC Add-On";
	public static final String MOD_ID = "mtluhc";
	public static final String version = "v1.1-1.6.2";
	public static final ItemStack beef = new ItemStack(Item.beefRaw, 2, 0);
	public static final ItemStack bonemeal = new ItemStack(Item.dyePowder, 1, 15);
	public static final ItemStack fireball = new ItemStack(Item.fireballCharge, 1, 0);
	public static final ItemStack torches = new ItemStack(Block.torchWood, 8, 0);
	public static final ItemStack coal = new ItemStack(Item.coal, 1, 0);
	public static final ItemStack charCoal = new ItemStack(Item.coal, 1, 1);
	public static final ItemStack diamond = new ItemStack(Item.diamond, 1, 1);
	public static final ItemStack iron = new ItemStack(Item.ingotIron, 1, 1);
	public static final ItemStack leather = new ItemStack(Item.leather, 1, 1);
	public static final ItemStack helmetLeather = new ItemStack(Item.helmetLeather, 1, 1);
	public static final ItemStack plateLeather = new ItemStack(Item.plateLeather, 1, 1);
	public static final ItemStack legsLeather = new ItemStack(Item.legsLeather, 1, 1);
	public static final ItemStack bootsLeather = new ItemStack(Item.bootsLeather, 1, 1);
	public static final ItemStack helmetIron = new ItemStack(Item.helmetIron, 1, 1);
	public static final ItemStack plateIron = new ItemStack(Item.plateIron, 1, 1);
	public static final ItemStack legsIron = new ItemStack(Item.legsIron, 1, 1);
	public static final ItemStack bootsIron = new ItemStack(Item.bootsIron, 1, 1);
	public static final ItemStack helmetDiamond = new ItemStack(Item.helmetDiamond, 1, 1);
	public static final ItemStack plateDiamond = new ItemStack(Item.plateDiamond, 1, 1);
	public static final ItemStack legsDiamond = new ItemStack(Item.legsDiamond, 1, 1);
	public static final ItemStack bootsDiamond = new ItemStack(Item.bootsDiamond, 1, 1);
	


	public static void itemInit(){
			denseIronIngot = new ItemDenseIronIngot(tcctechMain.denseIronIngotID);
			diamondIngot = new ItemDiamondIngot(tcctechMain.diamondIngotID);		
	}
	public static void blockInit() {
		leatherBlock = new BlockLeatherBlock(tcctechMain.leatherBlockID, Material.cloth);
		MinecraftForge.setBlockHarvestLevel(leatherBlock, 0, "Axe", 0);
		GameRegistry.registerBlock(leatherBlock, "Block of Leather");
	}
	
	public static void craftingR() {
		if(tcctechMain.hardarmor == true) {
			tcctechInfo.RemoveRecipe(new ItemStack(Item.helmetLeather, 1, 0));
			tcctechInfo.RemoveRecipe(new ItemStack(Item.plateLeather, 1, 0));
			tcctechInfo.RemoveRecipe(new ItemStack(Item.legsLeather, 1, 0));
			tcctechInfo.RemoveRecipe(new ItemStack(Item.bootsLeather, 1, 0));
			tcctechInfo.RemoveRecipe(new ItemStack(Item.helmetIron, 1, 0));
			tcctechInfo.RemoveRecipe(new ItemStack(Item.plateIron, 1, 0));
			tcctechInfo.RemoveRecipe(new ItemStack(Item.legsIron, 1, 0));
			tcctechInfo.RemoveRecipe(new ItemStack(Item.bootsIron, 1, 0));
			tcctechInfo.RemoveRecipe(new ItemStack(Item.helmetDiamond, 1, 0));
			tcctechInfo.RemoveRecipe(new ItemStack(Item.plateDiamond, 1, 0));
			tcctechInfo.RemoveRecipe(new ItemStack(Item.legsDiamond, 1, 0));
			tcctechInfo.RemoveRecipe(new ItemStack(Item.bootsDiamond, 1, 0));
		}
	}
	
	public static void crafting() {
		if(tcctechMain.hardarmor == true) {
			//Hard Armor Recipes
			//Leather
			GameRegistry.addRecipe(new ItemStack(Item.helmetLeather, 1, 0),
	        		"lll",
	        		"l l",
	        		'l', leatherBlock);
			GameRegistry.addRecipe(new ItemStack(Item.plateLeather, 1, 0),
	        		"l l",
	        		"lll",
	        		"lll",
	        		'l', leatherBlock);
			GameRegistry.addRecipe(new ItemStack(Item.legsLeather, 1, 0),
	        		"lll",
	        		"l l",
	        		"l l",
	        		'l', leatherBlock);
			GameRegistry.addRecipe(new ItemStack(Item.bootsLeather, 1, 0),
	        		"l l",
	        		"l l",
	        		'l', leatherBlock);
			//Iron
			GameRegistry.addRecipe(new ItemStack(Item.helmetIron, 1, 0),
	        		"lll",
	        		"l l",
	        		'l', denseIronIngot);
			GameRegistry.addRecipe(new ItemStack(Item.plateIron, 1, 0),
	        		"i i",
	        		"iii",
	        		"iii",
	        		'i', denseIronIngot);
			GameRegistry.addRecipe(new ItemStack(Item.legsIron, 1, 0),
	        		"iii",
	        		"i i",
	        		"i i",
	        		'i', denseIronIngot);
			GameRegistry.addRecipe(new ItemStack(Item.bootsIron, 1, 0),
	        		"i i",
	        		"i i",
	        		'i', denseIronIngot);
			//Diamond
			GameRegistry.addRecipe(new ItemStack(Item.helmetDiamond, 1, 0),
	        		"ddd",
	        		"d d",
	        		'd', diamondIngot);
			GameRegistry.addRecipe(new ItemStack(Item.plateDiamond, 1, 0),
	        		"d d",
	        		"ddd",
	        		"ddd",
	        		'd', diamondIngot);
			GameRegistry.addRecipe(new ItemStack(Item.legsDiamond, 1, 0),
	        		"ddd",
	        		"d d",
	        		"d d",
	        		'd', diamondIngot);
			GameRegistry.addRecipe(new ItemStack(Item.bootsDiamond, 1, 0),
	        		"d d",
	        		"d d",
	        		'd', diamondIngot);
			GameRegistry.addRecipe(new ItemStack(denseIronIngot, 1, 0),
					"ii",
					"ii",
					'i', Item.ingotIron);
	        GameRegistry.addRecipe(new ItemStack(diamondIngot, 1, 0),
					"dd",
					'd', Item.diamond);
		}
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
		GameRegistry.addRecipe(new ItemStack(leatherBlock, 1, 0),
        		"lll",
        		"lll",
        		"lll",
        		'l', Item.leather);

		if(tcctechMain.mowlawn == true) {
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
	
	public static void names() {
		if(tcctechMain.hardarmor == true) {
			LanguageRegistry.addName(denseIronIngot, "Dense Iron Ingot");
			LanguageRegistry.addName(diamondIngot, "Diamond Ingot");
			LanguageRegistry.addName(leatherBlock, "Block of Leather");
		}
	}
	
    protected static void RemoveRecipe(ItemStack resultItem) {
        ItemStack recipeResult = null;
        ArrayList recipes = (ArrayList) CraftingManager.getInstance().getRecipeList();
        for (int scan = 0; scan < recipes.size(); scan++) {
            IRecipe tmpRecipe = (IRecipe) recipes.get(scan);
            if (tmpRecipe instanceof ShapedRecipes) {
                ShapedRecipes recipe = (ShapedRecipes) tmpRecipe;
                recipeResult = recipe.getRecipeOutput();
            }
            if (tmpRecipe instanceof ShapelessRecipes) {
                ShapelessRecipes recipe = (ShapelessRecipes) tmpRecipe;
                recipeResult = recipe.getRecipeOutput();
            }
            if (ItemStack.areItemStacksEqual(resultItem, recipeResult)) {
                System.out.println("[tccTech] Removed Recipe: " + recipes.get(scan) + " -> " + recipeResult);
                recipes.remove(scan);
            }
        }
    }
}
