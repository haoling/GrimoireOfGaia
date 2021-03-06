package gaia.items;

import gaia.Gaia;
import gaia.GaiaConfig;
import gaia.init.GaiaItems;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemShard extends Item {

	public ItemShard(String name) {
		this.setHasSubtypes(true);
		this.setUnlocalizedName(name);
		this.setCreativeTab(Gaia.tabGaia);
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < 6; i ++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}

	/**
	 * Drops a nugget in the world.
	 * Will drop Gaia nuggets if no other nuggets are present.
	 */
	public static void Drop_Nugget(Entity ent, int i){
		ItemStack stack = new ItemStack(GaiaItems.Shard, 1, i);

		if(GaiaConfig.OreUnity){
			if(i == 0){
				stack = OreCheck(stack,"nuggetIron" );
			}
			if(i == 1){
				stack = OreCheck(stack,"nuggetGold" );
			}
			if(i == 2){
				stack = OreCheck(stack,"nuggetDiamond" );
			}
			if(i == 3){
				stack = OreCheck(stack,"nuggetEmerald" );
			}
			if(i == 4){
				stack = OreCheck(stack,"nuggetCopper" );
			}
			if(i == 5){
				stack = OreCheck(stack,"nuggetSilver" );
			}
		}

		ent.entityDropItem(stack, 0.0F);
	}

	/**
	 * Checks ore dictionary if there is already a registered nugget.
	 * Then attempts to use that instead 
	 */
	public static ItemStack OreCheck(ItemStack stack, String s){		
		List<ItemStack>Ores = OreDictionary.getOres(s);
		int size = Ores.size();

		if(s != null){
			if(Ores.get(0)!= null){
				ItemStack unity = Ores.get(0);
				Item item = unity.getItem();
				int meta = unity.getItemDamage();

				//if it grabbed a gaia ore try the next in the list
				if(item == GaiaItems.Shard && size >1){
					if(Ores.get(1)!= null){
						unity = Ores.get(1);
						item = unity.getItem();
						meta = unity.getItemDamage();
					}
				}

				stack = new ItemStack(item, 1, meta);
			}
		}
		return stack;
	}
}
