package net.Lex.sd.data.client.provider;

import net.Lex.sd.SpatialDisruption;
import net.Lex.sd.data.common.ItemsSD;
import net.Lex.sd.setup.TagsSD;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTagProviderSD extends ItemTagsProvider {
    public ItemTagProviderSD(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, SpatialDisruption.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        copy(TagsSD.Blocks.BLOCKS_PHASED, TagsSD.Items.BLOCKS_PHASED);
        copy(TagsSD.Blocks.BLOCKS_PPHASED, TagsSD.Items.BLOCKS_PPHASED);
        copy(TagsSD.Blocks.BLOCKS_SPAWNS, TagsSD.Items.BlOCKS_SPAWNS);

        getOrCreateBuilder(TagsSD.Items.UPGRADES_MODULE).add(ItemsSD.UPGRADE_MODULE.get());
    }
}
