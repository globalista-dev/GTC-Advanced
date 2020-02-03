package gtca.init;

import gtca.GTCA;
import gtca.blocks.GTCABlockOre;
import gtclassic.common.block.GTBlockOre;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

@ObjectHolder(GTCA.MODID)
public class GTCABlocks {
    static final List<Block> toRegister = new ArrayList();
    public static final GTCABlockOre MOLYBDENITE_ORE = (GTCABlockOre) registerBlock(new GTCABlockOre("Bauxite", 78, 3.0F, 1)) ;
    public static final GTCABlockOre GADOLINITE_ORE = null;
    public static final GTCABlockOre NETHER_GOLD_ORE = null;
    public static final GTCABlockOre ZIRCON_ORE = null;
    public static final GTCABlockOre BISMUTHINITE_ORE = null;


    static <T extends Block> T registerBlock(T block) {
        toRegister.add(block);
        return block;
    }
}

