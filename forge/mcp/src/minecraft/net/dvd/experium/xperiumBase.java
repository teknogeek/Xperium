package net.dvd.experium;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.world.World;

public class xperiumBase extends Block {
boolean providePower = false;
boolean isOreGen = false;
	
	public xperiumBase(int id, Material material, boolean powerSource, boolean isOre) {
		super(id, material);
		if(powerSource == true){
			providePower=true;
		}
		if(isOre == true){
			isOreGen = true;
		}
	}
	public int onBlockPlaced(World par1World, int x, int y, int z, int par5, float par6, float par7, float par8, int par9){
		
		if(this.providePower == true){
			
		if(par1World.getBlockId(x-1, y, z) == Block.furnaceIdle.blockID){
			par1World.setBlock(x-1, y, z, Block.furnaceBurning.blockID);
			int l = par1World.getBlockMetadata(x-1, y, z);
			 par1World.setBlockMetadataWithNotify(x-1, y, z, l, 2);
			 TileEntityFurnace tileentity = (TileEntityFurnace)par1World.getBlockTileEntity(x-1, y, z);
			 if (tileentity != null)
		        {
		            tileentity.validate();
		            tileentity.furnaceBurnTime = 9999;
		            par1World.setBlockTileEntity(x-1, y, z, tileentity);
		        }

		}
		if(par1World.getBlockId(x, y, z-1) == Block.furnaceIdle.blockID){
			par1World.setBlock(x, y, z-1, Block.furnaceBurning.blockID);
			int l = par1World.getBlockMetadata(x, y, z-1);
			 par1World.setBlockMetadataWithNotify(x, y, z-1, l, 2);
			 TileEntityFurnace tileentity = (TileEntityFurnace)par1World.getBlockTileEntity(x, y, z-1);
			 if (tileentity != null)
		        {
		            tileentity.validate();
		            tileentity.furnaceBurnTime = 9999;
		            par1World.setBlockTileEntity(x, y, z-1, tileentity);
		        }

		}
		if(par1World.getBlockId(x+1, y, z) == Block.furnaceIdle.blockID){
			par1World.setBlock(x+1, y, z, Block.furnaceBurning.blockID);
			int l = par1World.getBlockMetadata(x+1, y, z);
			 par1World.setBlockMetadataWithNotify(x+1, y, z, l, 2);
			 TileEntityFurnace tileentity = (TileEntityFurnace)par1World.getBlockTileEntity(x+1, y, z);
			 if (tileentity != null)
		        {
		            tileentity.validate();
		            tileentity.furnaceBurnTime = 9999;
		            par1World.setBlockTileEntity(x+1, y, z, tileentity);
		        }
		}
		if(par1World.getBlockId(x, y, z + 1) == Block.furnaceIdle.blockID){
			par1World.setBlock(x, y, z + 1, Block.furnaceBurning.blockID);
			int l = par1World.getBlockMetadata(x, y, z+1);
			 par1World.setBlockMetadataWithNotify(x, y, z+1, l, 2);
			 TileEntityFurnace tileentity = (TileEntityFurnace)par1World.getBlockTileEntity(x, y, z+1);
			 if (tileentity != null)
		        {
		            tileentity.validate();
		            tileentity.furnaceBurnTime = 9999;
		            par1World.setBlockTileEntity(x, y, z+1, tileentity);
		        }

		}
		}
		
		return 0;
	}

	@Override
	public boolean onBlockActivated(World par1World, int x, int y, int z, EntityPlayer entityplayer, int par6, float par7, float par8, float par9)
    {
		if(this.providePower == true){
			
		if(par1World.getBlockId(x-1, y, z) == Block.furnaceIdle.blockID){
			par1World.setBlock(x-1, y, z, Block.furnaceBurning.blockID);
			int l = par1World.getBlockMetadata(x-1, y, z);
			 par1World.setBlockMetadataWithNotify(x-1, y, z, l, 2);
			 TileEntityFurnace tileentity = (TileEntityFurnace)par1World.getBlockTileEntity(x-1, y, z);
			 if (tileentity != null)
		        {
		            tileentity.validate();
		            tileentity.furnaceBurnTime = 9999;
		            par1World.setBlockTileEntity(x-1, y, z, tileentity);
		        }

		}
		if(par1World.getBlockId(x, y, z-1) == Block.furnaceIdle.blockID){
			par1World.setBlock(x, y, z-1, Block.furnaceBurning.blockID);
			int l = par1World.getBlockMetadata(x, y, z-1);
			 par1World.setBlockMetadataWithNotify(x, y, z-1, l, 2);
			 TileEntityFurnace tileentity = (TileEntityFurnace)par1World.getBlockTileEntity(x, y, z-1);
			 if (tileentity != null)
		        {
		            tileentity.validate();
		            tileentity.furnaceBurnTime = 9999;
		            par1World.setBlockTileEntity(x, y, z-1, tileentity);
		        }

		}
		if(par1World.getBlockId(x+1, y, z) == Block.furnaceIdle.blockID){
			par1World.setBlock(x+1, y, z, Block.furnaceBurning.blockID);
			int l = par1World.getBlockMetadata(x+1, y, z);
			 par1World.setBlockMetadataWithNotify(x+1, y, z, l, 2);
			 TileEntityFurnace tileentity = (TileEntityFurnace)par1World.getBlockTileEntity(x+1, y, z);
			 if (tileentity != null)
		        {
		            tileentity.validate();
		            tileentity.furnaceBurnTime = 9999;
		            par1World.setBlockTileEntity(x+1, y, z, tileentity);
		        }
		}
		if(par1World.getBlockId(x, y, z + 1) == Block.furnaceIdle.blockID){
			par1World.setBlock(x, y, z + 1, Block.furnaceBurning.blockID);
			int l = par1World.getBlockMetadata(x, y, z+1);
			 par1World.setBlockMetadataWithNotify(x, y, z+1, l, 2);
			 TileEntityFurnace tileentity = (TileEntityFurnace)par1World.getBlockTileEntity(x, y, z+1);
			 if (tileentity != null)
		        {
		            tileentity.validate();
		            tileentity.furnaceBurnTime = 9999;
		            par1World.setBlockTileEntity(x, y, z+1, tileentity);
		        }

		}
		}
		return false;
    }
	
}
