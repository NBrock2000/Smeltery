package com.nathan.smeltery;

import com.nathan.smeltery.init.ModBlocks;
import com.nathan.smeltery.init.ModItems;
import com.nathan.smeltery.handler.ConfigurationHandler;
import com.nathan.smeltery.init.Recipies;
import com.nathan.smeltery.proxy.IProxy;
import com.nathan.smeltery.reference.Reference;
import com.nathan.smeltery.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class Smeltery {
	@Mod.Instance(Reference.MOD_ID)
	public static Smeltery instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		LogHelper.info("Pre-Initialization Complete!");

		ModItems.init();
        ModBlocks.init();

	}
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
        Recipies.init();
	    LogHelper.info("Initialization Complete");
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

        LogHelper.info("Post-Initialization Complete");
	}
	
	
	
	
	
	
	
	
	
}
