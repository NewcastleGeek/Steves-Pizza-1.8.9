package uk.co.scottwears.pizza.moditems;

import co.uk.scottwears.pizza.lib.References;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
		private static Item Pizza_Base;
	
		
		
	public static void initItems(){
		
		
		Pizza_Base = new Pizza_Base();
		
		
		
		
	}
	 public static void registerItems(){
		 GameRegistry.registerItem(Pizza_Base, ModItemInfo.Pizza_base, References.MOD_ID);
		 
		 
	 }
	public static void registerModels(){
		registerRenders(Pizza_Base);
	}

	public static void registerRenders(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Pizza_Base, 0, 
				new ModelResourceLocation(References.MOD_ID + ":" + Pizza_Base.getUnlocalizedName().substring(5), "inventory"));
		
	}
	
	
	
	
	
}
