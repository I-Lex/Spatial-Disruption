package net.Lex.sd.data.common;

import net.Lex.sd.SpatialDisruption;
import net.Lex.sd.data.common.block.PhasedMatterBlock;
import net.Lex.sd.data.common.block.SpawnSetter;
import net.Lex.sd.setup.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class BlocksSD {
    public static final RegistryObject<Block> PERMANENT_PHASED_MATTER = register("perm_phased_matter", () ->
            new Block(AbstractBlock.Properties.create(Material.BARRIER).doesNotBlockMovement().hardnessAndResistance(-1, 3600000).sound(SoundType.SHROOMLIGHT)));
    public static final RegistryObject<Block> PHASED_MATTER = register("phased_matter", PhasedMatterBlock::new);
    public static final RegistryObject<Block> SPAWN_SETTER = register("spawn_setter", SpawnSetter::new);
    public static void register() {}

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(SpatialDisruption.SD)));
        return ret;
    }
}