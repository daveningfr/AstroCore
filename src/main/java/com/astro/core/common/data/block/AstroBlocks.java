package com.astro.core.common.data.block;

import com.gregtechceu.gtceu.data.recipe.CustomTags;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import com.astro.core.AstroCore;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.nullness.NonNullBiFunction;

import static com.gregtechceu.gtceu.common.registry.GTRegistration.REGISTRATE;

public class AstroBlocks {

    public static void init() {}

    private static BlockEntry<Block> createSidedCasingBlock(String name, String id, String texture,
                                                            NonNullBiFunction<Block, Item.Properties, ? extends BlockItem> func) {
        return REGISTRATE
                .block(id, Block::new)
                .initialProperties(() -> Blocks.IRON_BLOCK)
                .properties(p -> p.isValidSpawn((state, level, pos, ent) -> false))
                .blockstate((ctx, prov) -> prov.simpleBlock(ctx.getEntry(),
                        prov.models().cubeAll(ctx.getName(), AstroCore.id("block/" + texture))))
                .tag(CustomTags.MINEABLE_WITH_CONFIG_VALID_PICKAXE_WRENCH)
                .lang(name)
                .item(func)
                .build()
                .register();
    }

    public static final BlockEntry<Block> AETHER_ENGINE_CASING = createSidedCasingBlock(
            "§3Æther§r Engine Casing", "alfsteel_turbine_casing",
            "generators/machine_casing_turbine_alfsteel", BlockItem::new);

    public static final BlockEntry<Block> ALFSTEEL_PIPE_CASING = createSidedCasingBlock(
            "Alfsteel Pipe Casing", "alfsteel_pipe_casing",
            "generators/machine_casing_pipe_alfsteel", BlockItem::new);
}
