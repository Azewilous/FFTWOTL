package com.pixelfantasy.pixelfantasymod.items;


import com.pixelfantasy.pixelfantasymod.ModReference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WeaponsInit {

    public static Item choas_bringer;

    public static void initialize(){
        choas_bringer = new Item().setUnlocalizedName("choas_bringer");
    }

    public static void register(){
        GameRegistry.registerItem(choas_bringer, choas_bringer.getUnlocalizedName().substring(5));
    }

    public static void registerRenders(){
        registerRender(choas_bringer);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
                new ModelResourceLocation(ModReference.MOD_ID + ":" + item.getUnlocalizedName().substring(5)
                        , "inventory"));
    }

}
