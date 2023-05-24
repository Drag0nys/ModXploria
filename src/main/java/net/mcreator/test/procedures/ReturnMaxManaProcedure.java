<<<<<<< Updated upstream
package net.mcreator.test.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.test.network.TestModVariables;

public class ReturnMaxManaProcedure {
	public static String execute(LevelAccessor world) {
		return "" + Math.round(TestModVariables.MapVariables.get(world).manaMax);
	}
}
=======
package net.mcreator.test.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.test.network.TestModVariables;

public class ReturnMaxManaProcedure {
	public static String execute(LevelAccessor world) {
		return "" + Math.round(TestModVariables.MapVariables.get(world).manaMax);
	}
}
>>>>>>> Stashed changes
