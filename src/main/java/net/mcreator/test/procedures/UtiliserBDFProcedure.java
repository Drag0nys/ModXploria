<<<<<<< Updated upstream
package net.mcreator.test.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;

import net.mcreator.test.network.TestModVariables;
import net.mcreator.test.init.TestModEnchantments;
import net.mcreator.test.TestMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class UtiliserBDFProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double speed = 0;
		double yaw = 0;
		if (EnchantmentHelper.getItemEnchantmentLevel(TestModEnchantments.BOULE_DE_FEU.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0 && TestModVariables.MapVariables.get(world).mana >= 10) {
			speed = 0.1;
			yaw = entity.getYRot();
			if (TestModVariables.MapVariables.get(world).VraiCoupEpee == false) {
				TestModVariables.MapVariables.get(world).VraiCoupEpee = true;
				TestModVariables.MapVariables.get(world).syncData(world);
				TestModVariables.MapVariables.get(world).mana = TestModVariables.MapVariables.get(world).mana - 10;
				TestModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new LargeFireball(EntityType.FIREBALL, _level);
					entityToSpawn.moveTo(x, y, z, 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					entityToSpawn.setDeltaMovement((speed * Math.cos((yaw + 90) * (Math.PI / 180))), (entity.getDeltaMovement().y() + 0.2), (speed * Math.sin((yaw + 90) * (Math.PI / 180))));
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				TestMod.queueServerWork((int) (100 - EnchantmentHelper.getItemEnchantmentLevel(TestModEnchantments.BOULE_DE_FEU.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) * 5), () -> {
					TestModVariables.MapVariables.get(world).VraiCoupEpee = false;
					TestModVariables.MapVariables.get(world).syncData(world);
				});
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Capaciter en recharge !"), (true));
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Pas asser de mana !"), (true));
		}
	}
}
=======
package net.mcreator.test.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;

import net.mcreator.test.network.TestModVariables;
import net.mcreator.test.init.TestModEnchantments;
import net.mcreator.test.TestMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class UtiliserBDFProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double speed = 0;
		double yaw = 0;
		if (EnchantmentHelper.getItemEnchantmentLevel(TestModEnchantments.BOULE_DE_FEU.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0 && TestModVariables.MapVariables.get(world).mana >= 10) {
			speed = 0.1;
			yaw = entity.getYRot();
			if (TestModVariables.MapVariables.get(world).VraiCoupEpee == false) {
				TestModVariables.MapVariables.get(world).VraiCoupEpee = true;
				TestModVariables.MapVariables.get(world).syncData(world);
				TestModVariables.MapVariables.get(world).mana = TestModVariables.MapVariables.get(world).mana - 10;
				TestModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new LargeFireball(EntityType.FIREBALL, _level);
					entityToSpawn.moveTo(x, y, z, 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					entityToSpawn.setDeltaMovement((speed * Math.cos((yaw + 90) * (Math.PI / 180))), (entity.getDeltaMovement().y() + 0.2), (speed * Math.sin((yaw + 90) * (Math.PI / 180))));
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				TestMod.queueServerWork((int) (100 - EnchantmentHelper.getItemEnchantmentLevel(TestModEnchantments.BOULE_DE_FEU.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) * 5), () -> {
					TestModVariables.MapVariables.get(world).VraiCoupEpee = false;
					TestModVariables.MapVariables.get(world).syncData(world);
				});
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Capaciter en recharge !"), (true));
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Pas asser de mana !"), (true));
		}
	}
}
>>>>>>> Stashed changes
