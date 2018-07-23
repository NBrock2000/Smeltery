package com.nathan.smeltery.block;


import com.nathan.smeltery.reference.Reference;
import com.nathan.smeltery.tileentity.BlockTileEntity;
import com.nathan.smeltery.tileentity.TileEntityStoneSmeltery;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Nathan on 2/7/2018.
 */
public class StoneSmeltery extends BlockTileEntity {
    public StoneSmeltery() {
        super("stonesmeltery", Material.iron);

    }
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityStoneSmeltery();
    }
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(this.getUnlocalizedName()));
    }
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
         iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
