package uk.co.scottwears.pizza.moditems;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Pizza_Base  extends Item {
	
	public Pizza_Base(){
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setMaxStackSize(16);
		this.setUnlocalizedName(ModItemInfo.Pizza_base);
		
	}
	
	
	
	@Override
	public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List list, boolean p_77624_4_) {
		super.addInformation(p_77624_1_, p_77624_2_, list, p_77624_4_ );{
			list.add("Pizza Base, Can be eating but lets face it its a little plain");
		}
	}

	public ItemStack onRightClick(ItemStack itemStack, World world, EntityPlayer player){
		return itemStack;
		
		
		
	}
	
	
	

}
