package com.bte.mod.block.solarpanel2.solarpanel;

import com.bte.mod.BTEMod;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

/**
 * Created by Timeout on 2017-08-22.
 */
public class SolarPanelConfig {

    public static Configuration config;

    public static int panelCapacity = 50000;
    public static int panelPowerGen = 10;
    public static int panelTransferRate = 50;

    public static void initConfig (File configFile) {

        config = new Configuration(configFile);
        syncConfigData();
    }

    /**
     * Synchronizes the configuration file.
     */
    private static void syncConfigData () {

        panelCapacity = config.getInt("PanelCapacity", "SolarPanel", panelCapacity, 0, Integer.MAX_VALUE, "The amount of power that can be stored by the basic solar panel.");
        panelPowerGen = config.getInt("PanelPowerGen", "SolarPanel", panelPowerGen, 0, Integer.MAX_VALUE, "The amount of power that is generated by the basic solar panel every tick.");
        panelTransferRate = config.getInt("PanelTransferRate", "SolarPanel", panelTransferRate, 0, Integer.MAX_VALUE, "The amount of power that can be pulled from the basic solar panel at a time.");

        if (config.hasChanged())
            config.save();
    }

    @SubscribeEvent
    public void onConfigChange (ConfigChangedEvent.OnConfigChangedEvent event) {

        if (event.getModID().equals(BTEMod.MODID))
            syncConfigData();
    }
}
