package net.mcreator.test.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.test.world.inventory.Guide4Menu;
import net.mcreator.test.network.Guide4ButtonMessage;
import net.mcreator.test.TestMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Guide4Screen extends AbstractContainerScreen<Guide4Menu> {
	private final static HashMap<String, Object> guistate = Guide4Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_menu;
	Button button_page_suivante;

	public Guide4Screen(Guide4Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 322;
		this.imageHeight = 162;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("test:textures/screens/guide_4.png");

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
		this.font.draw(poseStack, Component.translatable("gui.test.guide_4.label_mission_2"), 134, 9, -12829636);
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
		button_menu = new Button(this.leftPos + 4, this.topPos + 135, 46, 20, Component.translatable("gui.test.guide_4.button_menu"), e -> {
			if (true) {
				TestMod.PACKET_HANDLER.sendToServer(new Guide4ButtonMessage(0, x, y, z));
				Guide4ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_menu", button_menu);
		this.addRenderableWidget(button_menu);
		button_page_suivante = new Button(this.leftPos + 214, this.topPos + 135, 93, 20, Component.translatable("gui.test.guide_4.button_page_suivante"), e -> {
			if (true) {
				TestMod.PACKET_HANDLER.sendToServer(new Guide4ButtonMessage(1, x, y, z));
				Guide4ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_page_suivante", button_page_suivante);
		this.addRenderableWidget(button_page_suivante);
	}
}
