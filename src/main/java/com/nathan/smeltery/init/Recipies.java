package com.nathan.smeltery.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;


/**
 * Created by Nathan on 2/8/2018.
 */
public class Recipies {
    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ModItems.smeltingCore), "prp", "rcr", "prp", 'p', new ItemStack(Items.blaze_powder), 'r', new ItemStack(Items.redstone), 'c', new ItemStack(Blocks.coal_block));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.stoneFrame), "ccc", "csc", "ccc", 'c', new ItemStack(Blocks.cobblestone), 's', new ItemStack(ModItems.smeltingCore));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.stoneSmeltery), "ccc", "cfc", "rrr", 'c', new ItemStack(Blocks.cobblestone), 's', new ItemStack(ModBlocks.stoneFrame), 'r', new ItemStack(Blocks.redstone_block));
    }
}
