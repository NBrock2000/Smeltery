package com.nathan.smeltery.init;

import com.nathan.smeltery.block.Blockx;
import com.nathan.smeltery.block.StoneFrame;
import com.nathan.smeltery.block.StoneSmeltery;
import com.nathan.smeltery.reference.Reference;
import com.nathan.smeltery.tileentity.BlockTileEntity;
import com.nathan.smeltery.tileentity.TileEntityStoneSmeltery;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by Nathan on 2/8/2018.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockTileEntity stoneSmeltery = new StoneSmeltery();
    public static final Blockx stoneFrame = new StoneFrame();
    public static void init(){
        GameRegistry.registerTileEntity(TileEntityStoneSmeltery.class, "StoneSmeltery");
        GameRegistry.registerBlock(stoneFrame, "StoneFrame");
    }
}
