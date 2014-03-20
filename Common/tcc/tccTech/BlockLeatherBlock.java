package tcc.tccTech;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockLeatherBlock extends Block {

	public BlockLeatherBlock(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setHardness(0.4F);
		this.setUnlocalizedName("leatherBlock");
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return Item.leather.itemID;
	}

	@Override
	public void registerIcons(IconRegister reg) {
		blockIcon = reg.registerIcon(tcctechInfo.MOD_ID.toLowerCase() + ":"
				+ this.getUnlocalizedName().substring(5));
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random par1Random) {
		return 9;
	}

}
