
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TestModTabs {
	public static CreativeModeTab TAB_XPLORIAONGLETCREA;

	public static void load() {
		TAB_XPLORIAONGLETCREA = new CreativeModeTab("tabxploriaongletcrea") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TestModBlocks.BLOCK_PRINCIPAL_MOD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
