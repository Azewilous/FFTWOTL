package com.pixelfantasy.pixelfantasymod.proxy;

import com.pixelfantasy.pixelfantasymod.items.WeaponsInit;

public class ClientProxy extends CommonProxy{
    @Override
    public void registerRenders() {
        WeaponsInit.registerRenders();
    }
}
