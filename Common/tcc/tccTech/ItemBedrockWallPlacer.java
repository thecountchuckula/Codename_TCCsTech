package tcc.tccTech;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ItemBedrockWallPlacer extends Item
{
    public ItemBedrockWallPlacer(int par1)
    {
        super(par1);
        this.maxStackSize = 1;
        this.setMaxDamage(64);
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setUnlocalizedName("bedrockWallPlacer");
    }

    /**
     * This item generates a bedrock wall around an area defined when you use the item the block used, defined in the config.
     */
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {

        if (par7 == 0)
        {
            --par5;
        }

        if (par7 == 1)
        {
            ++par5;
        }

        if (par7 == 2)
        {
            --par6;
        }

        if (par7 == 3)
        {
            ++par6;
        }

        if (par7 == 4)
        {
            --par4;
        }

        if (par7 == 5)
        {
            ++par4;
        }

        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
        {
            return false;
        }
        else
        {
            if (par3World.isAirBlock(par4, par5, par6))
            {
            	for(int wall = -tcctechMain.bedrockhalf; wall < tcctechMain.bedrockhalf; wall = wall+1){
            		for(par5 = 0; par5 < 256; par5 = par5+1){
            			par3World.setBlock(par4+wall, par5, par6-tcctechMain.bedrockhalf, Block.bedrock.blockID);
            			
            		}
            		for(par5 = 0; par5 < 256; par5 = par5+1){
            			par3World.setBlock(par4+wall, par5, par6+tcctechMain.bedrockhalf, Block.bedrock.blockID);
            			
            		}
            		for(par5 = 0; par5 < 256; par5 = par5+1){
            			par3World.setBlock(par4-tcctechMain.bedrockhalf, par5, par6+wall, Block.bedrock.blockID);
            			
            		}
            		for(par5 = 0; par5 < 256; par5 = par5+1){
            			par3World.setBlock(par4+tcctechMain.bedrockhalf, par5, par6+wall, Block.bedrock.blockID);
            			
            		}
            		
            	}
		    	par2EntityPlayer.addChatMessage("A bedrock wall now surrounds the area...");
		    	par1ItemStack.damageItem(1, par2EntityPlayer);
	        }          

            par1ItemStack.damageItem(getMaxDamage(), par2EntityPlayer);
            return true;
        }
    }
	@Override
	@SideOnly(Side.CLIENT)
	
    public void registerIcons(IconRegister par1IconRegister) {
    	itemIcon = par1IconRegister.registerIcon(tcctechInfo.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
	}
}
