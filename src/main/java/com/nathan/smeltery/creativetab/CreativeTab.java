package com.nathan.smeltery.creativetab;

import com.nathan.smeltery.init.ModItems;
import com.nathan.smeltery.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Nathan on 2/8/2018.
 */
public class CreativeTab {
    public static final CreativeTabs SmelteryTab = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.smeltingCore;
        }

    };
}
