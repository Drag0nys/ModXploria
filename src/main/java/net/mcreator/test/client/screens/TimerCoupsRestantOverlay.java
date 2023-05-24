
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

import net.mcreator.test.procedures.ReturnoverlaycoupsrestantProcedure;
import net.mcreator.test.procedures.ConditionafficheroverlayProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class TimerCoupsRestantOverlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
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
			if (ConditionafficheroverlayProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.test.timer_coups_restant.label_coups_restant"), posX + -87, posY + 68, -65536);
			if (ConditionafficheroverlayProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						ReturnoverlaycoupsrestantProcedure.execute(world), posX + -7, posY + 68, -65536);
		}
	}
}
