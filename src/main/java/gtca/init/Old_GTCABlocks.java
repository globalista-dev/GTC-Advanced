package gtca.init;

import gtca.GTCA;
import gtca.blocks.Old_GTCABlockOre;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

@ObjectHolder(GTCA.MODID)
public class Old_GTCABlocks {
    static final List<Block> toRegister = new ArrayList();
    public static final Old_GTCABlockOre MOLYBDENITE_ORE = (Old_GTCABlockOre) registerBlock(new Old_GTCABlockOre("Bauxite", 78, 3.0F, 1)) ;
    public static final Old_GTCABlockOre GADOLINITE_ORE = null;
    public static final Old_GTCABlockOre NETHER_GOLD_ORE = null;
    public static final Old_GTCABlockOre ZIRCON_ORE = null;
    public static final Old_GTCABlockOre BISMUTHINITE_ORE = null;


    static <T extends Block> T registerBlock(T block) {
        toRegister.add(block);
        return block;
    }
}

