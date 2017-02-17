package io.github.meganplayingminecraft.forge.mods;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent; 

// @Mod tells Forge this is the mod's main file
@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.NAME) 

public class Main { 

	public static final String MODID = "meganplayingminecraft"; 
	public static final String VERSION = "0.1"; 
	public static final String NAME = "Megan Playing Minecraft Mods";
  
	@EventHandler
	public void init(FMLInitializationEvent event) {
	
		  MinecraftForge.EVENT_BUS.register(new BlockBreakingHelloWorld());

		
	}
	
 }

