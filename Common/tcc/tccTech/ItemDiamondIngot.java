package tcc.tccTech;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemDiamondIngot extends Item {

	public ItemDiamondIngot(int par1) {
		super(par1);
        this.setCreativeTab(CreativeTabs.tabMaterials);
        this.setUnlocalizedName("diamondIngot");		
	}
	@Override
	@SideOnly(Side.CLIENT)

	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon(tcctechInfo.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
	}
	

}
