package tcb.spiderstpo.common;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import tcb.spiderstpo.mixins.access.BlockTagsAccess;

public class ModTags {
	public static final TagKey<Block> NON_CLIMBABLE = BlockTagsAccess.invokeCreate("spiderstpo:non_climbable");
}
