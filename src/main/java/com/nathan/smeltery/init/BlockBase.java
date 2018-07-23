package com.nathan.smeltery.init;

import com.nathan.smeltery.Smeltery;
import com.nathan.smeltery.creativetab.CreativeTab;
import com.nathan.smeltery.reference.Reference;
import net.minecraft.block.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Nathan on 7/20/2018.
 */
public abstract class BlockBase extends Block {


    private final String BASE_NAME;


    public BlockBase(String name) {
        this(name, Material.iron);
    }


    public BlockBase(String name, Material material) {
        super(material);
       // setRegistryName(name);
       // setUnlocalizedName(name);
        setCreativeTab(CreativeTab.SmelteryTab);
        BASE_NAME = name;
    }


    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s:%s", Reference.MOD_ID, BASE_NAME);
    }
}
