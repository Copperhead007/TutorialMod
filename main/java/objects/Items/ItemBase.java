package objects.Items;

import caelan.mod.Main;
import caelan.mod.proxy.ClientProxy;
import init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import util.IHasModel;

public class ItemBase extends Item implements IHasModel {
		
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this,0,"inventory");
	}
}
