package gtca.blocks;

<<<<<<< HEAD
import gtca.GTCA;
import gtclassic.GTMod;
import gtclassic.api.block.GTBlockBaseOre;
import ic2.core.platform.lang.components.base.LangComponentHolder;
import ic2.core.platform.textures.Ic2Icons;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;

public class GTCABlockOreNether extends GTBlockBaseOre {
    String name;
    int id;

    public GTCABlockOreNether(String name, int id, float hardness, int level) {
        super(GTBlockBaseOre.BackgroundSet.NETHERRACK);
        this.name = name;
        this.id = id;
        setRegistryName(this.name.toLowerCase() + "_netherore");
        setUnlocalizedName(new LangComponentHolder.LocaleBlockComp(GTCA.MODID + ".netherore" + this.name));
        setCreativeTab(GTMod.creativeTabGT);
        setHardness(hardness);
        setResistance(10.0F);
        setHarvestLevel("pickaxe", level);

    }

    @Override
    public TextureAtlasSprite getTopLayer() {
        return Ic2Icons.getTextures("gtca_ores")[this.id];

    }


=======
public class GTCABlockOreNether {
>>>>>>> master
}
