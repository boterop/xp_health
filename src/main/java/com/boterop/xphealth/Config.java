package com.boterop.xphealth;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.IntValue DIFFICULTY = BUILDER
            .comment("Difficulty of the mod. 1 is easy, 2 is normal, 3 is hard.")
            .defineInRange("difficulty", 2, 1, 3);

    static final ModConfigSpec SPEC = BUILDER.build();
}
