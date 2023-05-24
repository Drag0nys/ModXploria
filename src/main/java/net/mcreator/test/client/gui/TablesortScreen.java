package net.mcreator.test.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.test.world.inventory.TablesortMenu;
import net.mcreator.test.network.TablesortButtonMessage;
import net.mcreator.test.TestMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TablesortScreen extends AbstractContainerScreen<TablesortMenu> {
	private final static HashMap<String, Object> guistate = TablesortMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_livre_magique_foudre;
	ImageButton imagebutton_livre_magique_foudre1;
	ImageButton imagebutton_livre_magique_foudre2;
	ImageButton imagebutton_livre_magique_bdf;
	ImageButton imagebutton_livre_magique_bdf1;
	ImageButton imagebutton_book;

	public TablesortScreen(TablesortMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 300;
		this.imageHeight = 180;
	}

	private static final ResourceLocation texture = new ResourceLocation("test:textures/screens/tablesort.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.test.tablesort.label_foudre"), 112, 8, -14017837);
		this.font.draw(poseStack, Component.translatable("gui.test.tablesort.label_i"), 95, 31, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.test.tablesort.label_ii"), 95, 49, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.test.tablesort.label_iii"), 95, 67, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.test.tablesort.label_bdf"), 160, 8, -52429);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		imagebutton_livre_magique_foudre = new ImageButton(this.leftPos + 120, this.topPos + 26, 16, 16, 0, 0, 16, new ResourceLocation("test:textures/screens/atlas/imagebutton_livre_magique_foudre.png"), 16, 32, e -> {
			if (true) {
				TestMod.PACKET_HANDLER.sendToServer(new TablesortButtonMessage(0, x, y, z));
				TablesortButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_livre_magique_foudre", imagebutton_livre_magique_foudre);
		this.addRenderableWidget(imagebutton_livre_magique_foudre);
		imagebutton_livre_magique_foudre1 = new ImageButton(this.leftPos + 120, this.topPos + 44, 16, 16, 0, 0, 16, new ResourceLocation("test:textures/screens/atlas/imagebutton_livre_magique_foudre1.png"), 16, 32, e -> {
			if (true) {
				TestMod.PACKET_HANDLER.sendToServer(new TablesortButtonMessage(1, x, y, z));
				TablesortButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_livre_magique_foudre1", imagebutton_livre_magique_foudre1);
		this.addRenderableWidget(imagebutton_livre_magique_foudre1);
		imagebutton_livre_magique_foudre2 = new ImageButton(this.leftPos + 120, this.topPos + 62, 16, 16, 0, 0, 16, new ResourceLocation("test:textures/screens/atlas/imagebutton_livre_magique_foudre2.png"), 16, 32, e -> {
			if (true) {
				TestMod.PACKET_HANDLER.sendToServer(new TablesortButtonMessage(2, x, y, z));
				TablesortButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_livre_magique_foudre2", imagebutton_livre_magique_foudre2);
		this.addRenderableWidget(imagebutton_livre_magique_foudre2);
		imagebutton_livre_magique_bdf = new ImageButton(this.leftPos + 160, this.topPos + 26, 16, 16, 0, 0, 16, new ResourceLocation("test:textures/screens/atlas/imagebutton_livre_magique_bdf.png"), 16, 32, e -> {
			if (true) {
				TestMod.PACKET_HANDLER.sendToServer(new TablesortButtonMessage(3, x, y, z));
				TablesortButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_livre_magique_bdf", imagebutton_livre_magique_bdf);
		this.addRenderableWidget(imagebutton_livre_magique_bdf);
		imagebutton_livre_magique_bdf1 = new ImageButton(this.leftPos + 160, this.topPos + 44, 16, 16, 0, 0, 16, new ResourceLocation("test:textures/screens/atlas/imagebutton_livre_magique_bdf1.png"), 16, 32, e -> {
			if (true) {
				TestMod.PACKET_HANDLER.sendToServer(new TablesortButtonMessage(4, x, y, z));
				TablesortButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_livre_magique_bdf1", imagebutton_livre_magique_bdf1);
		this.addRenderableWidget(imagebutton_livre_magique_bdf1);
		imagebutton_book = new ImageButton(this.leftPos + 160, this.topPos + 62, 16, 16, 0, 0, 16, new ResourceLocation("test:textures/screens/atlas/imagebutton_book.png"), 16, 32, e -> {
			if (true) {
				TestMod.PACKET_HANDLER.sendToServer(new TablesortButtonMessage(5, x, y, z));
				TablesortButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_book", imagebutton_book);
		this.addRenderableWidget(imagebutton_book);
	}
}
