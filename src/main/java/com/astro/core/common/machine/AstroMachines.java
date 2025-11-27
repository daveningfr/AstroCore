package com.astro.core.common.machine;

import com.astro.core.AstroCore;

import static com.gregtechceu.gtceu.common.registry.GTRegistration.REGISTRATE;

@SuppressWarnings("all")
public class AstroMachines {

    static {
        REGISTRATE.creativeModeTab(() -> AstroCore.ASTRO_CREATIVE_TAB);
    }

    public static void init() {}
}
