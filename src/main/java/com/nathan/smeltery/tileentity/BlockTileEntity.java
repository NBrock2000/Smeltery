package com.nathan.smeltery.tileentity;

import com.nathan.smeltery.init.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by Nathan on 2/10/2018.
 */
public class BlockTileEntity extends BlockBase{
    public BlockTileEntity(String name) {

        this(name, Material.iron);

    }



    public BlockTileEntity(String name, Material material) {

        super(name, material);

    }
}
