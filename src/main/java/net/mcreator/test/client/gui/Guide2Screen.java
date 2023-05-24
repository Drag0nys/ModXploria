package net.mcreator.test.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.test.world.inventory.Guide2Menu;
import net.mcreator.test.network.Guide2ButtonMessage;
import net.mcreator.test.TestMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Guide2Screen extends AbstractContainerScreen<Guide2Menu> {
	private final static HashMap<String, Object> guistate = Guide2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Checkbox page1;
	Checkbox page2;
	Checkbox page3;
	Checkbox page4;
	Checkbox page5;
	Button button_page_suivante;
	Button button_page_1;
	Button button_page_2;
	Button button_page_3;
	Button button_page_4;
	Button button_page_5;
	Button button_menu;

	public Guide2Screen(Guide2Menu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = new ResourceLocation("test:textures/screens/guide_2.png");

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
		button_page_suivante = new Button(this.leftPos + 214, this.topPos + 135, 93, 20, Component.translatable("gui.test.guide_2.button_page_suivante"), e -> {
			if (true) {
				TestMod.PACKET_HANDLER.sendToServer(new Guide2ButtonMessage(0, x, y, z));
				Guide2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_page_suivante", button_page_suivante);
		this.addRenderableWidget(button_page_suivante);
		button_page_1 = new Button(this.leftPos + 24, this.topPos + 18, 56, 20, Component.translatable("gui.test.guide_2.button_page_1"), e -> {
			if (true) {
				TestMod.PACKET_HANDLER.sendToServer(new Guide2ButtonMessage(1, x, y, z));
				Guide2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_page_1", button_page_1);
		this.addRenderableWidget(button_page_1);
		button_page_2 = new Button(this.leftPos + 24, this.topPos + 45, 56, 20, Component.translatable("gui.test.guide_2.button_page_2"), e -> {
			if (true) {
				TestMod.PACKET_HANDLER.sendToServer(new Guide2ButtonMessage(2, x, y, z));
				Guide2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_page_2", button_page_2);
		this.addRenderableWidget(button_page_2);
		button_page_3 = new Button(this.leftPos + 24, this.topPos + 72, 56, 20, Component.translatable("gui.test.guide_2.button_page_3"), e -> {
		});
		guistate.put("button:button_page_3", button_page_3);
		this.addRenderableWidget(button_page_3);
		button_page_4 = new Button(this.leftPos + 24, this.topPos + 99, 56, 20, Component.translatable("gui.test.guide_2.button_page_4"), e -> {
		});
		guistate.put("button:button_page_4", button_page_4);
		this.addRenderableWidget(button_page_4);
		button_page_5 = new Button(this.leftPos + 114, this.topPos + 18, 56, 20, Component.translatable("gui.test.guide_2.button_page_5"), e -> {
		});
		guistate.put("button:button_page_5", button_page_5);
		this.addRenderableWidget(button_page_5);
		button_menu = new Button(this.leftPos + 4, this.topPos + 135, 46, 20, Component.translatable("gui.test.guide_2.button_menu"), e -> {
			if (true) {
				TestMod.PACKET_HANDLER.sendToServer(new Guide2ButtonMessage(6, x, y, z));
				Guide2ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:button_menu", button_menu);
		this.addRenderableWidget(button_menu);
		page1 = new Checkbox(this.leftPos + 4, this.topPos + 18, 20, 20, Component.translatable("gui.test.guide_2.page1"), false);
		guistate.put("checkbox:page1", page1);
		this.addRenderableWidget(page1);
		page2 = new Checkbox(this.leftPos + 4, this.topPos + 45, 20, 20, Component.translatable("gui.test.guide_2.page2"), false);
		guistate.put("checkbox:page2", page2);
		this.addRenderableWidget(page2);
		page3 = new Checkbox(this.leftPos + 4, this.topPos + 72, 20, 20, Component.translatable("gui.test.guide_2.page3"), false);
		guistate.put("checkbox:page3", page3);
		this.addRenderableWidget(page3);
		page4 = new Checkbox(this.leftPos + 4, this.topPos + 99, 20, 20, Component.translatable("gui.test.guide_2.page4"), false);
		guistate.put("checkbox:page4", page4);
		this.addRenderableWidget(page4);
		page5 = new Checkbox(this.leftPos + 94, this.topPos + 18, 20, 20, Component.translatable("gui.test.guide_2.page5"), false);
		guistate.put("checkbox:page5", page5);
		this.addRenderableWidget(page5);
	}
}
