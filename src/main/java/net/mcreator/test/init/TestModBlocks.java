
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.test.block.TabledesortBlock;
import net.mcreator.test.block.BlockPrincipalModBlock;
import net.mcreator.test.block.BjmbBlock;
import net.mcreator.test.TestMod;

public class TestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);
	public static final RegistryObject<Block> BLOCK_PRINCIPAL_MOD = REGISTRY.register("block_principal_mod", () -> new BlockPrincipalModBlock());
	public static final RegistryObject<Block> TABLEDESORT = REGISTRY.register("tabledesort", () -> new TabledesortBlock());
	public static final RegistryObject<Block> BJMB = REGISTRY.register("bjmb", () -> new BjmbBlock());
}
