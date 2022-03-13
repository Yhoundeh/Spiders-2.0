package tcb.spiderstpo.mixins.access;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(BlockTags.class)
public interface BlockTagsAccess {

    @Invoker
    static TagKey<Block> invokeCreate(String string) {
        throw new Error("Mixin did not apply");
    }
}
