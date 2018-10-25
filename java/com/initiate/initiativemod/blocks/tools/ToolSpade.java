package com.initiate.initiativemod.blocks.tools;

import com.initiate.initiativemod.Main;
import com.initiate.initiativemod.init.ModItems;
import com.initiate.initiativemod.util.IHasModel;

import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel
{

	public ToolSpade(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.modtab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
