package co.uk.scottwears.pizza.proxy;

import uk.co.scottwears.pizza.moditems.ModItems;

public class ClientProxy extends Commonproxy{
	
	@Override
	public void registerRenders(){
			ModItems.registerModels();
		
	}

}
