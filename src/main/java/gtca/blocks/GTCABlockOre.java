package gtca.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import static gtclassic.GTMod.creativeTabGT;

public class GTCABlockOre extends Block {

    public GTCABlockOre() {
        super(Material.ROCK);
        setCreativeTab(creativeTabGT);
        setSoundType(SoundType.STONE);
    }
}
