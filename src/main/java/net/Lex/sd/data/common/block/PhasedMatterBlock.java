package net.Lex.sd.data.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PhasedMatterBlock extends Block {
    public PhasedMatterBlock() {
        super(Properties.create(Material.ROCK).doesNotBlockMovement().hardnessAndResistance(-1, 3600000).sound(SoundType.SHROOMLIGHT));
    }

    @Override
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        if (entityIn instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entityIn;
        }
        super.onEntityCollision(state, worldIn, pos, entityIn);
    }

}
