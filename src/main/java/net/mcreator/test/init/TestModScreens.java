
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.test.client.gui.TablesortScreen;
import net.mcreator.test.client.gui.Guide5Screen;
import net.mcreator.test.client.gui.Guide4Screen;
import net.mcreator.test.client.gui.Guide3Screen;
import net.mcreator.test.client.gui.Guide2Screen;
import net.mcreator.test.client.gui.Guide1Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TestModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(TestModMenus.GUIDE_2.get(), Guide2Screen::new);
			MenuScreens.register(TestModMenus.GUIDE_1.get(), Guide1Screen::new);
			MenuScreens.register(TestModMenus.GUIDE_3.get(), Guide3Screen::new);
			MenuScreens.register(TestModMenus.GUIDE_4.get(), Guide4Screen::new);
			MenuScreens.register(TestModMenus.GUIDE_5.get(), Guide5Screen::new);
			MenuScreens.register(TestModMenus.TABLESORT.get(), TablesortScreen::new);
		});
	}
}
