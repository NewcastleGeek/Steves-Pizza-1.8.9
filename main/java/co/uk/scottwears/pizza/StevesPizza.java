package co.uk.scottwears.pizza;

import co.uk.scottwears.pizza.lib.References;
import co.uk.scottwears.pizza.proxy.Commonproxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import uk.co.scottwears.pizza.moditems.ModItems;

@Mod(modid = References.MOD_ID , version = References.VERSION , name = References.MOD_NAME) 
public class StevesPizza {
	
	@SidedProxy(clientSide = References.ClIENT_PROXY_CLASS, serverSide = References.COMMON_PROXY_CLASS)
	public static Commonproxy proxy;
	
	@EventHandler
	public static void preinit(FMLPreInitializationEvent pre){
		
		ModItems.initItems();
		ModItems.registerItems();
		
	}
	
	
	@EventHandler
	public static void init(FMLInitializationEvent init){
		
		
		proxy.registerRenders();
		
	}
	
	@EventHandler
	public static void postinit(FMLPostInitializationEvent post){
		
		
	}
	
}
