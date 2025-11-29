package com.astro.core.common.machine.multiblock.generator;

import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.common.block.BoilerFireboxType;

import com.astro.core.AstroCore;
import com.astro.core.common.data.block.AstroBlocks;
import com.astro.core.common.data.configs.AstroConfigs;

import static com.astro.core.common.machine.multiblock.generator.AstroBoilers.registerAstroBoiler;

public class ManaBoilers {

    public static final MultiblockMachineDefinition MANASTEEL_MANA_BOILER = registerAstroBoiler(
            "manasteel_mana",
            "Large §9Manasteel§r Mana Boiler",
            AstroBlocks.MANASTEEL_MACHINE_CASING,
            AstroBlocks.MANASTEEL_PIPE_CASING,
            AstroBlocks.MANASTEEL_FIREBOX,
            AstroCore.id("block/multiblock/large_manasteel_boiler"),
            BoilerFireboxType.MANASTEEL_FIREBOX,
            AstroConfigs.INSTANCE.features.manasteelBoilerMaxTemperature,
            AstroConfigs.INSTANCE.features.manasteelBoilerHeatSpeed);

    public static void init() {}
}
