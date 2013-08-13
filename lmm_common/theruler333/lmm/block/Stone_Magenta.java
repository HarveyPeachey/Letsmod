package theruler333.lmm.block;

import java.util.Random;

import theruler333.lmm.lib.BlockIDs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;


public class Stone_Magenta extends Block {


        public Stone_Magenta (int id, Material material)
        {
                super(BlockIDs.Stone_magenta, Material.rock);
                setHardness(2.0F);
                setStepSound(Block.soundStoneFootstep);
                setUnlocalizedName("Magenta Stone");
                setCreativeTab(CreativeTabs.tabBlock);
        }
        
        public void registerIcons(IconRegister iconRegister) {
            this.blockIcon = iconRegister.registerIcon("lmm:stone magenta");
        }

        public int idDropped(int par1, Random par2Random, int par3)
        {
            return BlockIDs.Cobblestone_magenta;
        }


} 