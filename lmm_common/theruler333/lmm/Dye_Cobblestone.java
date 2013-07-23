package theruler333.lmm;

//import theruler333.lmm.block.Blocks;
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
//import cpw.mods.fml.common.network.NetworkMod;

@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
//@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Dye_Cobblestone {

    @Instance
    public static Dye_Cobblestone instance;

    @SidedProxy(clientSide = "theruler333.lmm.proxy.ClientProxy", serverSide = "theruler333.lmm.proxy.CommonProxy" )
    public static CommonProxy proxy;

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        
    }
   
    @Init
    public void load(FMLInitializationEvent event) {
            proxy.registerRenderers();
    }
   
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }




}
