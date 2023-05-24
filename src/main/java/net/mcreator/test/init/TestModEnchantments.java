
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.test.enchantment.FoudreEnchantment;
import net.mcreator.test.TestMod;

public class TestModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, TestMod.MODID);
	public static final RegistryObject<Enchantment> FOUDRE = REGISTRY.register("foudre", () -> new FoudreEnchantment());
}
