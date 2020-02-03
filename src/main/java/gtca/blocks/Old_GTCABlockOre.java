package gtca.blocks;

import gtca.GTCAMaterial;
import gtca.init.Old_GTCABlocks;
import gtclassic.GTMod;
import gtclassic.api.material.GTMaterialGen;
import gtclassic.common.GTBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;

import static gtclassic.GTMod.creativeTabGT;

public class Old_GTCABlockOre extends Block {
    String name;
    int id;

    public Old_GTCABlockOre(String name, int id, float hardness, int level) {
        super(Material.ROCK);
        this.name = name;
        this.id = id;
        setCreativeTab(creativeTabGT);
        setSoundType(SoundType.STONE);
        this.setCreativeTab(GTMod.creativeTabGT);
        this.setResistance(10.0F);
        this.setHardness(hardness);
        this.setResistance(10.0F);
        this.setHarvestLevel("pickaxe", level);

    }

    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        int bonus = fortune > 0 ? RANDOM.nextInt(fortune + 1) : 0;
        if (this.equals(Old_GTCABlocks.ZIRCON_ORE)) {
            drops.add(GTMaterialGen.getGem(GTCAMaterial.Zircon, 1 + bonus));
        }
        if (this.equals(Old_GTCABlocks.BISMUTHINITE_ORE)) {
            drops.add(GTMaterialGen.get(Old_GTCABlocks.BISMUTHINITE_ORE));
        }
        if (this.equals(Old_GTCABlocks.MOLYBDENITE_ORE)) {
            drops.add(GTMaterialGen.get(Old_GTCABlocks.MOLYBDENITE_ORE));
        }
        if (this.equals(Old_GTCABlocks.GADOLINITE_ORE)) {
            drops.add(GTMaterialGen.get(Old_GTCABlocks.GADOLINITE_ORE));
        }
        if (this.equals(Old_GTCABlocks.NETHER_GOLD_ORE)) {
            drops.add(GTMaterialGen.get(Old_GTCABlocks.NETHER_GOLD_ORE));
        }


    }

    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
        if (this.equals(GTBlocks.oreIridium)) {
            return MathHelper.getInt(RANDOM, 3, 7);
        } else {
            return !this.equals(GTBlocks.oreRuby) && !this.equals(GTBlocks.oreSapphire) ? 0 : MathHelper.getInt(RANDOM, 2, 5);
        }

    }
}
