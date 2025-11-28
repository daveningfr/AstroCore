package com.astro.core.common.machine.multiblock.generator;

import com.astro.core.AstroCore;
import com.astro.core.common.data.AstroRecipeTypes;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;

import static com.astro.core.common.data.block.AstroBlocks.ALFSTEEL_GEARBOX_CASING;
import static com.astro.core.common.data.block.AstroBlocks.ALFSTEEL_MACHINE_CASING;
import static com.gregtechceu.gtceu.common.data.machines.GTMachineUtils.registerLargeTurbine;

@SuppressWarnings("unused")

public class AetherEngine {

    public static final MultiblockMachineDefinition AETHER_ENGINE = registerLargeTurbine(
            "aether_turbine",
            GTValues.IV,
            AstroRecipeTypes.AETHER_ENGINE_RECIPES,
            ALFSTEEL_MACHINE_CASING,
            ALFSTEEL_GEARBOX_CASING,
            AstroCore.id("block/generators/machine_casing_turbine_alfsteel"),
            AstroCore.id("block/multiblock/aether_engine"));

    public static void init() {}
}
