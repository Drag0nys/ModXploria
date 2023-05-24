package net.mcreator.test.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.test.init.TestModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DropepeeexplosiveProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.REDSTONE_WIRE && (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.REDSTONE_WIRE
				&& (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.REDSTONE_WIRE && (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.REDSTONE_WIRE
				&& (world.getBlockState(new BlockPos(x + 2, y, z))).getBlock() == Blocks.ZOMBIE_HEAD && (world.getBlockState(new BlockPos(x - 2, y, z))).getBlock() == Blocks.SKELETON_SKULL
				&& (world.getBlockState(new BlockPos(x, y, z + 2))).getBlock() == Blocks.WITHER_SKELETON_SKULL && (world.getBlockState(new BlockPos(x, y, z - 2))).getBlock() == Blocks.CREEPER_HEAD
				&& (world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == Blocks.NETHERITE_BLOCK && (world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == Blocks.NETHERITE_BLOCK
				&& (world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == Blocks.NETHERITE_BLOCK && (world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == Blocks.NETHERITE_BLOCK
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.NETHERITE_SWORD) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.NETHERITE_SWORD);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(TestModItems.EPEEEXPLOSIVE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
