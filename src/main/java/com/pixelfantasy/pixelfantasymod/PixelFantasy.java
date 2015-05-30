package com.pixelfantasy.pixelfantasymod;

import com.pixelfantasy.pixelfantasymod.items.WeaponsInit;
import com.pixelfantasy.pixelfantasymod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModReference.MOD_ID, name = ModReference.MOD_NAME, version = ModReference.VERSION)
public class PixelFantasy {

    @SidedProxy(clientSide = ModReference.CLIENT_PROXY, serverSide = ModReference.SERVER_PROXY)
    public static CommonProxy proxy;

    public void preInit(FMLPreInitializationEvent event){
        WeaponsInit.initialize();
        WeaponsInit.register();
    }

    public void init(FMLInitializationEvent event){
        proxy.registerRenders();
    }

    public void postInit(FMLPostInitializationEvent event){

    }
}
