package com.boterop.xphealth.events;

import net.minecraft.world.entity.ai.attributes.Attributes;

import com.boterop.xphealth.Config;
import com.boterop.xphealth.XPHealth;

import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.entity.player.PlayerXpEvent;

public class XPEventHandler {
    @SubscribeEvent
    public static void onXPChange(PlayerXpEvent.XpChange event) {
        updateHealth(event.getEntity());
    }

    @SubscribeEvent
    public static void onLogged(PlayerEvent.PlayerLoggedInEvent event) {
        updateHealth(event.getEntity());
    }

    private static void updateHealth(Player player) {
        int playerExp = player.experienceLevel;
        float difficulty = Config.DIFFICULTY.get() * (-0.2f) + 0.8f;

        int hearts = (int) Math.floor(playerExp * difficulty);

        hearts = hearts < 0 ? 0 : hearts;

        Identifier attributeId = Identifier.fromNamespaceAndPath(XPHealth.MODID, "max_health");
        AttributeModifier modifier = new AttributeModifier(attributeId, hearts, AttributeModifier.Operation.ADD_VALUE);

        AttributeMap attributes = player.getAttributes();

        attributes.getInstance(Attributes.MAX_HEALTH).addOrReplacePermanentModifier(modifier);
    }
}
