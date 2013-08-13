package theruler333.lmm.block;

import theruler333.lmm.lib.BlockIDs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;


public class Cobble_Light_grey extends Block {


        public Cobble_Light_grey (int id, Material material)
        {
                super(BlockIDs.Cobblestone_light_grey, Material.rock);
                setHardness(2.0F);
                setStepSound(Block.soundStoneFootstep);
                setUnlocalizedName("Light Grey Cobblestone");
                setCreativeTab(CreativeTabs.tabBlock);
        }
        
        public void registerIcons(IconRegister iconRegister) {
            this.blockIcon = iconRegister.registerIcon("lmm:cobblestone light grey");
        }



} 