package net.dvd.experium;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
	

@Mod(modid="XPM", name="Xperium", version="0.0.1")
@NetworkMod(clientSideRequired=true)
public class XeperiumMain {
	
	 public static CreativeTabs XperiumTab = new CreativeTabs("xperiumTab") {
         @Override
		public ItemStack getIconItemStack() {
             return new ItemStack(xperiumOre, 1, 0);
     }
};
	
	public final static Block xperiumOre = new xperiumBase(500, Material.ground,false, true)
    .setHardness(0.5F)
    .setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("xperiumOre")
    .setCreativeTab(XperiumTab)
    .setTextureName("xperium:xperiumOre");
	
	public final static Block xperiumBlock = new xperiumBase(501, Material.ground,true, false)
    .setHardness(0.5F)
    .setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("xperiumBlock")
    .setCreativeTab(XperiumTab)
    .setTextureName("xperium:xperiumBlock")
    .setLightValue(1f)
    .setLightOpacity(0);
	
	public final static Item xperiumCrushed = new XperiumItemBase(5000)
	.setMaxStackSize(3)
	.setUnlocalizedName("crushedXP")
	.setCreativeTab(XperiumTab)
	.setTextureName("xperium:crushedIngot");
	
	public final static Item xperiumIngot = new XperiumItemBase(5001)
	.setMaxStackSize(3)
	.setUnlocalizedName("XPingot")
	.setCreativeTab(XperiumTab)
	.setTextureName("xperium:ingot")
	.setMaxStackSize(64);
	
	public final static Item solidXperiumIngot = new XperiumItemBase(5002)
	.setMaxStackSize(3)
	.setUnlocalizedName("SolidXPingot")
	.setPotionEffect(Potion.moveSpeed.getName())
	.setCreativeTab(XperiumTab)
	.setTextureName("xperium:Singot")
	.setMaxStackSize(64);
	
	@Instance(value = "XPM")
    public static XeperiumMain instance;
    
    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="net.dvd.experium.client.ClientProxy", serverSide="net.dvd.experium.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler // used in 1.6.2
    //@PreInit    // used in 1.5.2
    public void preInit(FMLPreInitializationEvent event) {
            // Stub Method
    }
    
    @EventHandler // used in 1.6.2
    //@Init       // used in 1.5.2
    public void load(FMLInitializationEvent event) {
            proxy.registerRenderers();
            //Xperium Ore
            GameRegistry.registerBlock(xperiumOre, "xperiumOre");
            MinecraftForge.setBlockHarvestLevel(xperiumOre, "pickaxe", 2);
            LanguageRegistry.addName(xperiumOre, "Xperium Ore");
            
          //Xperium Block
            GameRegistry.registerBlock(xperiumBlock, "xperiumBlock");
            MinecraftForge.setBlockHarvestLevel(xperiumBlock, "pickaxe", 2);
            LanguageRegistry.addName(xperiumBlock, "Xperium Block");
            GameRegistry.addRecipe(new ItemStack(xperiumBlock , 2), "xxx", "xxx", "xxx",
                    'x', solidXperiumIngot);
            
            //Impure Crushed Xperium Ingot
            GameRegistry.registerItem(xperiumCrushed, "crushedXP");
            LanguageRegistry.addName(xperiumCrushed, "Impure Crushed Xperium Ore");
            GameRegistry.addSmelting(xperiumCrushed.itemID, new ItemStack(xperiumIngot , 2), 0.1f);
            
          //Pure Crushed Xperium Ingot
            GameRegistry.registerItem(xperiumIngot, "XPingot");
            LanguageRegistry.addName(xperiumIngot, "Crushed Xperium Ore");
            
          //Xperium Ingot
            GameRegistry.registerItem(solidXperiumIngot, "SolidXPingot");
            LanguageRegistry.addName(solidXperiumIngot, "Solid Pure Xperium Ingot");
            GameRegistry.addRecipe(new ItemStack(solidXperiumIngot), "xxx", "xxx", "xxx",
                    'x', xperiumIngot);
            
            LanguageRegistry.instance().addStringLocalization("itemGroup.xperiumTab", "en_US", "Xperium");
    }
    
    @EventHandler // used in 1.6.2
    //@PostInit   // used in 1.5.2
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }
	
	
	
	

}
