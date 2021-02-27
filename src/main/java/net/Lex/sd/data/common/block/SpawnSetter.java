package net.Lex.sd.data.common.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class SpawnSetter extends Block {
    public SpawnSetter() {
        super(AbstractBlock.Properties.create(Material.BARRIER).hardnessAndResistance(-1, 3600000));
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        if (entityIn instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entityIn;

        }

        super.onEntityWalk(worldIn, pos, entityIn);
    }
}
