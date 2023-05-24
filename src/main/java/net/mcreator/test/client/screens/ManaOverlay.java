<<<<<<< Updated upstream

package net.mcreator.test.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.test.procedures.ReturnMaxManaProcedure;
import net.mcreator.test.procedures.ReturnManaProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ManaOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w/2;
		int posY = h/2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.test.mana.label_100"), w-((w/3+w/6)+9), h-(h/18), -16750849);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ReturnManaProcedure.execute(world), w-((w/3+w/6)+28), h-(h/18), -16750849);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ReturnMaxManaProcedure.execute(world), w-(w/3+w/6), h-(h/18), -16750849);
		}
	}
}
=======

package net.mcreator.test.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.test.procedures.ReturnMaxManaProcedure;
import net.mcreator.test.procedures.ReturnManaProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ManaOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w/2;
		int posY = h/2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.test.mana.label_100"), w-((w/3+w/6)+9), h-(h/18), -16750849);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ReturnManaProcedure.execute(world), w-((w/3+w/6)+28), h-(h/18), -16750849);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ReturnMaxManaProcedure.execute(world), w-(w/3+w/6), h-(h/18), -16750849);
		}
	}
}
>>>>>>> Stashed changes
