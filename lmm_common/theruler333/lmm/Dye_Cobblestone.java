package theruler333.lmm;

import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import theruler333.lmm.block.Cobble_Black;
import theruler333.lmm.block.Cobble_Brown;
import theruler333.lmm.block.Cobble_Cactus;
import theruler333.lmm.block.Cobble_Cyan;
import theruler333.lmm.block.Cobble_Grey;
import theruler333.lmm.block.Cobble_Lapis;
import theruler333.lmm.block.Cobble_Light_blue;
import theruler333.lmm.block.Cobble_Light_grey;
import theruler333.lmm.block.Cobble_Lime;
import theruler333.lmm.block.Cobble_Magenta;
import theruler333.lmm.block.Cobble_Orange;
import theruler333.lmm.block.Cobble_Pink;
import theruler333.lmm.block.Cobble_Purple;
import theruler333.lmm.block.Cobble_Red;
import theruler333.lmm.block.Cobble_White;
import theruler333.lmm.block.Cobble_Yellow;
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
    public final Block Brown_Cobblestone = new Cobble_Brown(0, null);
    public final Block Cactus_Cobblestone = new Cobble_Cactus(0, null);
    public final Block Cyan_Cobblestone = new Cobble_Cyan(0, null);
    public final Block Grey_Cobblestone = new Cobble_Grey(0, null);
    public final Block Lapis_Cobblestone = new Cobble_Lapis(0, null);
    public final Block Light_blue_Cobblestone = new Cobble_Light_blue(0, null);
    public final Block Light_grey_Cobblestone = new Cobble_Light_grey(0, null);
    public final Block Lime_Cobblestone = new Cobble_Lime(0, null);
    public final Block Magenta_Cobblestone = new Cobble_Magenta(0, null);
    public final Block Orange_Cobblestone = new Cobble_Orange(0, null);
    public final Block Pink_Cobblestone = new Cobble_Pink(0, null);
    public final Block Purple_Cobblestone = new Cobble_Purple(0, null);
    public final Block Red_Cobblestone = new Cobble_Red(0, null);
    public final Block White_Cobblestone = new Cobble_White(0, null);
    public final Block Yellow_Cobblestone = new Cobble_Yellow(0, null);

    
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
            LanguageRegistry.addName(Brown_Cobblestone, "Brown Cobblestone");
            LanguageRegistry.addName(Cactus_Cobblestone, "Cactus Cobblestone");
            LanguageRegistry.addName(Cyan_Cobblestone, "Cyan Cobblestone");
            LanguageRegistry.addName(Grey_Cobblestone, "Grey Cobblestone");
            LanguageRegistry.addName(Lapis_Cobblestone, "Lapis Cobblestone");
            LanguageRegistry.addName(Light_blue_Cobblestone, "Light_blue Cobblestone");
            LanguageRegistry.addName(Light_grey_Cobblestone, "Light_grey Cobblestone");
            LanguageRegistry.addName(Lime_Cobblestone, "Lime Cobblestone");
            LanguageRegistry.addName(Magenta_Cobblestone, "Magenta Cobblestone");
            LanguageRegistry.addName(Orange_Cobblestone, "Orange Cobblestone");
            LanguageRegistry.addName(Pink_Cobblestone, "Pink Cobblestone");
            LanguageRegistry.addName(Purple_Cobblestone, "Purple Cobblestone");
            LanguageRegistry.addName(Red_Cobblestone, "Red Cobblestone");
            LanguageRegistry.addName(White_Cobblestone, "White Cobblestone");
            LanguageRegistry.addName(Yellow_Cobblestone, "Yellow Cobblestone");
            
            MinecraftForge.setBlockHarvestLevel(Black_Cobblestone, "pickaxe", 1);
            MinecraftForge.setBlockHarvestLevel(Brown_Cobblestone, "pickaxe", 1);
            MinecraftForge.setBlockHarvestLevel(Cactus_Cobblestone, "pickaxe", 1);
            MinecraftForge.setBlockHarvestLevel(Cyan_Cobblestone, "pickaxe", 1);
            MinecraftForge.setBlockHarvestLevel(Grey_Cobblestone, "pickaxe", 1);
            MinecraftForge.setBlockHarvestLevel(Lapis_Cobblestone, "pickaxe", 1);
            MinecraftForge.setBlockHarvestLevel(Light_blue_Cobblestone, "pickaxe", 1);
            MinecraftForge.setBlockHarvestLevel(Light_grey_Cobblestone, "pickaxe", 1);
            MinecraftForge.setBlockHarvestLevel(Lime_Cobblestone, "pickaxe", 1);
            MinecraftForge.setBlockHarvestLevel(Magenta_Cobblestone, "pickaxe", 1);
            MinecraftForge.setBlockHarvestLevel(Orange_Cobblestone, "pickaxe", 1);
            MinecraftForge.setBlockHarvestLevel(Pink_Cobblestone, "pickaxe", 1);
            MinecraftForge.setBlockHarvestLevel(Purple_Cobblestone, "pickaxe", 1);
            MinecraftForge.setBlockHarvestLevel(Red_Cobblestone, "pickaxe", 1);
            MinecraftForge.setBlockHarvestLevel(White_Cobblestone, "pickaxe", 1);
            MinecraftForge.setBlockHarvestLevel(Yellow_Cobblestone, "pickaxe", 1);
            
            GameRegistry.registerBlock(Black_Cobblestone, "Black Cobblestone");
            GameRegistry.registerBlock(Brown_Cobblestone, "Brown Cobblestone");
            GameRegistry.registerBlock(Cactus_Cobblestone, "Cactus Cobblestone");
            GameRegistry.registerBlock(Cyan_Cobblestone, "Cyan Cobblestone");
            GameRegistry.registerBlock(Grey_Cobblestone, "Grey Cobblestone");
            GameRegistry.registerBlock(Lapis_Cobblestone, "Lapis Cobblestone");
            GameRegistry.registerBlock(Light_blue_Cobblestone, "Light_blue Cobblestone");
            GameRegistry.registerBlock(Light_grey_Cobblestone, "Light_grey Cobblestone");
            GameRegistry.registerBlock(Lime_Cobblestone, "Lime Cobblestone");
            GameRegistry.registerBlock(Magenta_Cobblestone, "Magenta Cobblestone");
            GameRegistry.registerBlock(Orange_Cobblestone, "Orange Cobblestone");
            GameRegistry.registerBlock(Pink_Cobblestone, "Pink Cobblestone");
            GameRegistry.registerBlock(Purple_Cobblestone, "Purple Cobblestone");
            GameRegistry.registerBlock(Red_Cobblestone, "Red Cobblestone");
            GameRegistry.registerBlock(White_Cobblestone, "White Cobblestone");
            GameRegistry.registerBlock(Yellow_Cobblestone, "Yellow Cobblestone");

    }
   
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }




}