package net.dvd.experium;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class xperiumChestGUI extends GuiContainer {
	
	public static final ResourceLocation field_110421_t = new ResourceLocation("textures/gui/xperiumChest.png");

	public xperiumChestGUI(InventoryPlayer inventoryPlayer, xperiumTileEntityBase TileEntity) {
		super(new xperiumChestContainer(inventoryPlayer, TileEntity));
		
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(field_110421_t);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, xSize, ySize);
        
	
		
	}
	
	protected void drawGuiContainerForegroundLayout(int param1, int param2){
		fontRenderer.drawString("ExperiumChest", 8 ,6 ,4210752);
		fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8 , ySize - 96 + 2, 4210752);
	}
	


}
