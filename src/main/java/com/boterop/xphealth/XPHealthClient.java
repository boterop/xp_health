package com.boterop.xphealth;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = XPHealth.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = XPHealth.MODID, value = Dist.CLIENT)
public class XPHealthClient {
    public XPHealthClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }
}
