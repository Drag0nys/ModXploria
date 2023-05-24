package net.mcreator.test.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.test.network.TestModVariables;
import net.mcreator.test.TestMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CalculeepeeexplosiveProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (TestModVariables.MapVariables.get(world).NbCoupEpeeExplo == 0) {
			TestModVariables.MapVariables.get(world).NbCoupEpeeExplo = -1;
			TestModVariables.MapVariables.get(world).syncData(world);
			TestMod.queueServerWork(100, () -> {
				TestModVariables.MapVariables.get(world).NbCoupEpeeExplo = 5;
				TestModVariables.MapVariables.get(world).syncData(world);
			});
		}
	}
}
