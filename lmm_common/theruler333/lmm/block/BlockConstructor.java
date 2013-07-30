package theruler333.lmm.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;


public class BlockConstructor extends Block {


        public BlockConstructor (int id, Material material)
        {
                super(id, material);
        }
        
        @Override
        public void registerIcons(IconRegister iconRegister) {
            this.blockIcon = iconRegister.registerIcon("lmm:cobblestone black");
        }



} 
