package com.boterop.xphealth;

import com.boterop.xphealth.events.XPEventHandler;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.common.NeoForge;
@Mod(XPHealth.MODID)
public class XPHealth {
    public static final String MODID = "xphealth";

    public XPHealth(IEventBus modEventBus, ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
        NeoForge.EVENT_BUS.register(XPEventHandler.class);
    }
}
