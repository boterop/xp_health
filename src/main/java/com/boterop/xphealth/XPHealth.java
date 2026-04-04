package com.boterop.xphealth;

import com.boterop.xphealth.events.XPEventHandler;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;

@Mod(XPHealth.MODID)
public class XPHealth {
    public static final String MODID = "xphealth";

    public XPHealth(IEventBus modBus) {
        NeoForge.EVENT_BUS.register(XPEventHandler.class);
    }
}
