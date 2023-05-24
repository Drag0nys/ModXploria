package net.mcreator.test.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.test.network.TestModVariables;

public class ReturnoverlaycoupsrestantProcedure {
	public static String execute(LevelAccessor world) {
		return "" + Math.round(TestModVariables.MapVariables.get(world).NbCoupEpeeExplo);
	}
}
