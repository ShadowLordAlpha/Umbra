package sla.umbra;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = UmbraConfig.MOD_ID, useMetadata = true, updateJSON = UmbraConfig.UPDATE_JSON)
public class Umbra {

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		// some example code
		System.out.println("DIRT BLOCK >> " + Blocks.DIRT.getUnlocalizedName());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
