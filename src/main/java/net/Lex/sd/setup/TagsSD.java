package net.Lex.sd.setup;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.Lex.sd.SpatialDisruption;

//https://github.com/MinecraftForge/MinecraftForge/tree/1.16.x/src/generated/resources/data/forge/tags
public class TagsSD {
    public static final class Blocks {
        public static final ITag.INamedTag<Block> BLOCKS_PHASED = mod("blocks/phased");
        public static final ITag.INamedTag<Block> BLOCKS_PPHASED = mod("blocks/pphased");
        public static final ITag.INamedTag<Block> BLOCKS_SPAWNS = mod("blocks/spawns");

        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation(SpatialDisruption.MOD_ID, path).toString());
        }
    }

    public static final class Items {
        //Blocks
        public static final ITag.INamedTag<Item> BLOCKS_PHASED = mod("blocks/phased");
        public static final ITag.INamedTag<Item> BLOCKS_PPHASED = mod("blocks/pphased");
        public static final ITag.INamedTag<Item> BlOCKS_SPAWNS = mod("blocks/spawns");

        public static final ITag.INamedTag<Item> UPGRADES_MODULE = mod("upgrades/module");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation(SpatialDisruption.MOD_ID, path).toString());
        }
    }

}
