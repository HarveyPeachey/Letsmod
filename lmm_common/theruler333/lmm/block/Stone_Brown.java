package theruler333.lmm.block;

import theruler333.lmm.lib.BlockIDs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;


public class Stone_Brown extends Block {


        public Stone_Brown (int id, Material material)
        {
                super(BlockIDs.Stone_brown, Material.rock);
                setHardness(2.0F);
                setStepSound(Block.soundStoneFootstep);
                setUnlocalizedName("Brown Stone");
                setCreativeTab(CreativeTabs.tabBlock);
        }
        
        public void registerIcons(IconRegister iconRegister) {
            this.blockIcon = iconRegister.registerIcon("lmm:stone brown");
        }



} 