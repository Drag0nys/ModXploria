
package net.mcreator.test.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.test.init.TestModTabs;

public class XplorialivreItem extends Item {
	public XplorialivreItem() {
		super(new Item.Properties().tab(TestModTabs.TAB_XPLORIAONGLETCREA).stacksTo(1).rarity(Rarity.COMMON));
	}
}
