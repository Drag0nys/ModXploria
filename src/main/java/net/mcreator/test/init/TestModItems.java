
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.test.item.XplorialivreItem;
import net.mcreator.test.item.LivremagiquefoudreItem;
import net.mcreator.test.item.EpeeexplosiveItem;
import net.mcreator.test.item.BatonmagiqueItem;
import net.mcreator.test.TestMod;

public class TestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);
	public static final RegistryObject<Item> EPEEEXPLOSIVE = REGISTRY.register("epeeexplosive", () -> new EpeeexplosiveItem());
	public static final RegistryObject<Item> BLOCK_PRINCIPAL_MOD = block(TestModBlocks.BLOCK_PRINCIPAL_MOD, null);
	public static final RegistryObject<Item> XPLORIALIVRE = REGISTRY.register("xplorialivre", () -> new XplorialivreItem());
	public static final RegistryObject<Item> BATONMAGIQUE = REGISTRY.register("batonmagique", () -> new BatonmagiqueItem());
	public static final RegistryObject<Item> LIVREMAGIQUEFOUDRE = REGISTRY.register("livremagiquefoudre", () -> new LivremagiquefoudreItem());
	public static final RegistryObject<Item> TABLEDESORT = block(TestModBlocks.TABLEDESORT, TestModTabs.TAB_XPLORIAONGLETCREA);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
