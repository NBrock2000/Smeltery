package com.nathan.smeltery.init;

import com.nathan.smeltery.block.Blockx;
import com.nathan.smeltery.block.StoneFrame;
import com.nathan.smeltery.block.StoneSmeltery;
import com.nathan.smeltery.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Nathan on 2/8/2018.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final Blockx stoneSmeltery = new StoneSmeltery();
    public static final Blockx stoneFrame = new StoneFrame();
    public static void init(){
        GameRegistry.registerBlock(stoneSmeltery, "StoneSmeltery");
        GameRegistry.registerBlock(stoneFrame, "StoneFrame");
    }
}
