package gtca.blocks;

import gtca.GTCA;
import gtca.GTCAMaterial;
import gtca.init.GTCABlock;
import gtclassic.GTMod;
import gtclassic.api.block.GTBlockBaseOre;
import gtclassic.api.material.GTMaterialGen;
import ic2.core.platform.lang.components.base.LangComponentHolder;
import ic2.core.platform.textures.Ic2Icons;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;

public class GTCABlockOre extends GTBlockBaseOre {
    String name;
    int id;

    public GTCABlockOre(String name, int id, float hardness, int level) {
        super(GTBlockBaseOre.BackgroundSet.STONE);
        this.name = name;
        this.id = id;
        setRegistryName(this.name.toLowerCase() + "_ore");
        setUnlocalizedName(new LangComponentHolder.LocaleBlockComp(GTCA.MODID + ".ore" + this.name));
        setCreativeTab(GTMod.creativeTabGT);
        setHardness(hardness);
        setResistance(10.0F);
        setHarvestLevel("pickaxe", level);

    }

    @Override
    public TextureAtlasSprite getTopLayer() {
        return Ic2Icons.getTextures("gtca_ores")[this.id];

    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        int bonus = fortune > 0 ? RANDOM.nextInt(fortune + 1) : 0;
        if (this.equals(GTCABlock.oreZircon)) {
            drops.add(GTMaterialGen.getGem(GTCAMaterial.Zircon, 1 + bonus));
        }
        if (this.equals(GTCABlock.oreMolybdenite)) {
            drops.add(GTMaterialGen.get(GTCABlock.oreMolybdenite));
        }
        if (this.equals(GTCABlock.oreGadolinite)) {
            drops.add(GTMaterialGen.get(GTCABlock.oreGadolinite));
        }

    }

    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
        if (this.equals(GTCABlock.oreZircon)) {
            return MathHelper.getInt(RANDOM, 3, 7);
        }
        return 0;

    }

}
