package theruler333.lmm.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import theruler333.lmm.lib.BlockIDs;
theruler333.lmm.lib.BlockStrings


public class Blocks {
    
    //CobbleStone Dye Blocks
    public final static Block cobbleBlack;
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
        
        cobbleBlack = new BlockCobbleBlack(BlockIDs.Cobblestone_black);
        
        
    }
}
