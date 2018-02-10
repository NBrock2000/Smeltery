package com.nathan.smeltery.init;

import com.nathan.smeltery.item.SmeltingCore;
import com.nathan.smeltery.item.Itemx;
import com.nathan.smeltery.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Nathan on 2/7/2018.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final Itemx smeltingCore = new SmeltingCore();

    public static void init(){
        GameRegistry.registerItem(smeltingCore, "SmeltingCore");
    }
}
