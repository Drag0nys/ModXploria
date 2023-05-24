package net.mcreator.test.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.test.network.TestModVariables;
import net.mcreator.test.init.TestModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ClickdroitepeeexplosiveProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TestModItems.EPEEEXPLOSIVE.get()) {
			if (TestModVariables.MapVariables.get(world).NbCoupEpeeExplo > 0) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (entity.getX()), (entity.getY()), (entity.getZ()), 1, Explosion.BlockInteraction.NONE);
				TestModVariables.MapVariables.get(world).NbCoupEpeeExplo = TestModVariables.MapVariables.get(world).NbCoupEpeeExplo - 1;
				TestModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
