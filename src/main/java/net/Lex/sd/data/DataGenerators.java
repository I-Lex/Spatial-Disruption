package net.Lex.sd.data;

import net.Lex.sd.SpatialDisruption;
import net.Lex.sd.data.client.provider.BlockStateProviderSD;
import net.Lex.sd.data.client.provider.BlockTagsProviderSD;
import net.Lex.sd.data.client.provider.ItemModelProviderSD;
import net.Lex.sd.data.client.provider.ItemTagProviderSD;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = SpatialDisruption.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        gen.addProvider(new BlockStateProviderSD(gen, existingFileHelper));
        gen.addProvider(new ItemModelProviderSD(gen, existingFileHelper));

        BlockTagsProviderSD blockTags = new BlockTagsProviderSD(gen, existingFileHelper);
        gen.addProvider(blockTags);
        gen.addProvider(new ItemTagProviderSD(gen, blockTags, existingFileHelper));
    }
}
