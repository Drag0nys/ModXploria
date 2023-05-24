
package net.mcreator.test.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.test.init.TestModTabs;

public class BatonmagiqueItem extends Item {
	public BatonmagiqueItem() {
		super(new Item.Properties().tab(TestModTabs.TAB_XPLORIAONGLETCREA).durability(10000).rarity(Rarity.COMMON));
	}

	@Override
	public int getEnchantmentValue() {
		return 1;
	}
}
