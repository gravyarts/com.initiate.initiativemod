package com.initiate.initiativemod.tabs;

import com.initiate.initiativemod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTab extends CreativeTabs
{

	public ModTab(String label) 
	{
		super("modtab");
		
		this.setBackgroundImageName("tab.png");
	}
		
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.DARK_MATTER);
	}

}