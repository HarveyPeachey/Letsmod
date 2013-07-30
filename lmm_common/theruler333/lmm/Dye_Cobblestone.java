package theruler333.lmm;

import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import theruler333.lmm.block.Cobble_Black;
import theruler333.lmm.lib.Reference;
import theruler333.lmm.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
//import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
//@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Dye_Cobblestone 
{
    public final Block Black_Cobblestone = new Cobble_Black(0, null);


    @Instance
    public static Dye_Cobblestone instance; {
    
    }

    @SidedProxy(clientSide = "theruler333.lmm.proxy.ClientProxy", serverSide = "theruler333.lmm.proxy.CommonProxy" ) 
     public static CommonProxy proxy; {
         
     }

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
   
    }
   
    @Init
    public void load(FMLInitializationEvent event) {
            proxy.registerRenderers();
            LanguageRegistry.addName(Black_Cobblestone, "Black Cobblestone");
            MinecraftForge.setBlockHarvestLevel(Black_Cobblestone, "pickaxe", 1);
            GameRegistry.registerBlock(Black_Cobblestone, "Black Cobblestone");
    
    }
   
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }




}
