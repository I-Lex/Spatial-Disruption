package net.Lex.sd.data.client.provider;

import net.Lex.sd.SpatialDisruption;
import net.Lex.sd.data.common.BlocksSD;
import net.Lex.sd.setup.TagsSD;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTagsProviderSD extends BlockTagsProvider {
    public BlockTagsProviderSD(DataGenerator generatorIn, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, SpatialDisruption.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        getOrCreateBuilder(TagsSD.Blocks.BLOCKS_SPAWNS).add(BlocksSD.SPAWN_SETTER.get());
        getOrCreateBuilder(TagsSD.Blocks.BLOCKS_PHASED).add(BlocksSD.PHASED_MATTER.get());
        getOrCreateBuilder(TagsSD.Blocks.BLOCKS_PPHASED).add(BlocksSD.PERMANENT_PHASED_MATTER.get());
    }
}
