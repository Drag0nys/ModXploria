<<<<<<< Updated upstream
package net.mcreator.test.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.test.network.TestModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MaxManaProcedure {
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
		if (TestModVariables.MapVariables.get(world).mana > TestModVariables.MapVariables.get(world).manaMax) {
			TestModVariables.MapVariables.get(world).mana = TestModVariables.MapVariables.get(world).manaMax;
			TestModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
=======
package net.mcreator.test.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.test.network.TestModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MaxManaProcedure {
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
		if (TestModVariables.MapVariables.get(world).mana > TestModVariables.MapVariables.get(world).manaMax) {
			TestModVariables.MapVariables.get(world).mana = TestModVariables.MapVariables.get(world).manaMax;
			TestModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
>>>>>>> Stashed changes
