package theruler333.lmm.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import theruler333.lmm.lib.BlockConstructor;
import theruler333.lmm.lib.BlockIDs;




public class Blocks {
    
    
    public static Block cobbleBlack;
    public final static Block cobbleBrown;
    public final static Block cobbleCactus;
    public final static Block cobbleCyan;
    public final static Block cobbleGrey;
    public final static Block cobbleLightBlue;
    public final static Block cobbleLightGrey;
    public final static Block cobbleLime;
    public final static Block cobbleMagenta;
    public final static Block cobbleOrange;
    public final static Block cobblePink;
    public final static Block cobblePurple;
    public final static Block cobbleRed;
    public final static Block cobbleWhite;
    public final static Block cobbleYellow; 
   
    
    
    
    public static void init() {
        
        cobbleBlack = new BlockConstructor(BlockIDs.Cobblestone_black, Material.rock)
        .setHardness(0.5F).setStepSound(Block.soundStoneFootstep)
        .setUnlocalizedName("cobbleBlack").setCreativeTab(CreativeTabs.tabBlock);
        
        GameRegistry.registerBlock(cobbleBlack, "Black Cobblestone");
        LanguageRegistry.addName(cobbleBlack, "Black Cobblestone");
        
        
    }
}
