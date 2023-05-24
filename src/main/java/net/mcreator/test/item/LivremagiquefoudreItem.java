
package net.mcreator.test.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.test.init.TestModTabs;

public class LivremagiquefoudreItem extends Item {
	public LivremagiquefoudreItem() {
		super(new Item.Properties().tab(TestModTabs.TAB_XPLORIAONGLETCREA).stacksTo(1).rarity(Rarity.COMMON));
	}
}
