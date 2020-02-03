package gtca.blocks;

import gtca.GTCA;
import gtclassic.GTMod;
import gtclassic.api.block.GTBlockBaseOre;
import ic2.core.platform.lang.components.base.LangComponentHolder;
import ic2.core.platform.textures.Ic2Icons;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;

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
        return Ic2Icons.getTextures(GTMod.MODID + "_ores")[this.id];

    }

}
