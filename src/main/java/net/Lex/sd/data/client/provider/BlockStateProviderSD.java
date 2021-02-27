package net.Lex.sd.data.client.provider;

import net.Lex.sd.SpatialDisruption;
import net.Lex.sd.data.common.BlocksSD;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStateProviderSD extends BlockStateProvider {
    public BlockStateProviderSD(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, SpatialDisruption.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(BlocksSD.SPAWN_SETTER.get());
        simpleBlock(BlocksSD.PHASED_MATTER.get());
        simpleBlock(BlocksSD.PERMANENT_PHASED_MATTER.get());
    }
}
