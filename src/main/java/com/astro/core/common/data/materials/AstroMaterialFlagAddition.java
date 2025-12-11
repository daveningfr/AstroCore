package com.astro.core.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.properties.OreProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.common.data.GTMaterials;

import static com.astro.core.common.data.materials.AstroMaterials.*;

public class AstroMaterialFlagAddition {

    public static void register() {
        OreProperty OreProp = DESH.getProperty(PropertyKey.ORE);
        OreProp.setOreByProducts(GTMaterials.Iron, OSTRUM, GTMaterials.Iron, OSTRUM);
        OreProp.setWashedIn(GTMaterials.SodiumPersulfate);
        OreProp.setSeparatedInto(OSTRUM);
    }
}
