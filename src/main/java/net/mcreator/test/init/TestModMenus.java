
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.test.world.inventory.TablesortMenu;
import net.mcreator.test.world.inventory.Guide5Menu;
import net.mcreator.test.world.inventory.Guide4Menu;
import net.mcreator.test.world.inventory.Guide3Menu;
import net.mcreator.test.world.inventory.Guide2Menu;
import net.mcreator.test.world.inventory.Guide1Menu;
import net.mcreator.test.TestMod;

public class TestModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TestMod.MODID);
	public static final RegistryObject<MenuType<Guide2Menu>> GUIDE_2 = REGISTRY.register("guide_2", () -> IForgeMenuType.create(Guide2Menu::new));
	public static final RegistryObject<MenuType<Guide1Menu>> GUIDE_1 = REGISTRY.register("guide_1", () -> IForgeMenuType.create(Guide1Menu::new));
	public static final RegistryObject<MenuType<Guide3Menu>> GUIDE_3 = REGISTRY.register("guide_3", () -> IForgeMenuType.create(Guide3Menu::new));
	public static final RegistryObject<MenuType<Guide4Menu>> GUIDE_4 = REGISTRY.register("guide_4", () -> IForgeMenuType.create(Guide4Menu::new));
	public static final RegistryObject<MenuType<Guide5Menu>> GUIDE_5 = REGISTRY.register("guide_5", () -> IForgeMenuType.create(Guide5Menu::new));
	public static final RegistryObject<MenuType<TablesortMenu>> TABLESORT = REGISTRY.register("tablesort", () -> IForgeMenuType.create(TablesortMenu::new));
}
