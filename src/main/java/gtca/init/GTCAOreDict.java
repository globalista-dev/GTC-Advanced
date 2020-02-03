package gtca.init;

import gtc_expansion.material.GTCXMaterial;
import gtc_expansion.material.GTCXMaterialGen;
import gtca.GTCAMaterial;
import gtclassic.api.material.GTMaterial;
import gtclassic.api.material.GTMaterialFlag;
import gtclassic.api.material.GTMaterialGen;
import ic2.core.platform.registry.Ic2Items;
import net.minecraftforge.advancements.critereon.OredictItemPredicate;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Iterator;

import static gtca.GTCAMaterial.*;

public class GTCAOreDict {
    public GTCAOreDict() {
    }

    public static void init() {

        OreDictionary.registerOre("oreMolybdenite", GTCABlocks.MOLYBDENITE_ORE);
        OreDictionary.registerOre("oreGadolinite", GTCABlocks.GADOLINITE_ORE);
        OreDictionary.registerOre("oreNetherGold", GTCABlocks.NETHER_GOLD_ORE);
        OreDictionary.registerOre("oreZircon", GTCABlocks.ZIRCON_ORE);
        OreDictionary.registerOre("dustRareEarth", Ic2Items.rareEarthDust);
        OreDictionary.registerOre("dustMixedMetal", GTCAItems.MIXED_METAL_DUST);
        OreDictionary.registerOre("dustGadolinite", GTMaterialGen.getDust(Gadolinite, 1));
        OreDictionary.registerOre("dustMolybdenite", GTMaterialGen.getDust(Molybdenite, 1));

        Iterator var0 = GTMaterial.values().iterator();

        GTMaterial mat;
        while(var0.hasNext()) {
            mat = (GTMaterial)var0.next();
            if (mat.hasFlag(GTMaterialFlag.BLOCKMETAL) || mat.hasFlag(GTMaterialFlag.BLOCKGEM)) {
                OreDictionary.registerOre("block" + mat.getDisplayName(), GTMaterialGen.getMaterialBlock(mat, 1));
            }

            if (mat.hasFlag(GTMaterialFlag.DUST)) {
                OreDictionary.registerOre("dust" + mat.getDisplayName(), GTMaterialGen.getDust(mat, 1));
            }

            if (GTMaterial.isGem(mat)) {
                OreDictionary.registerOre("gem" + mat.getDisplayName(), GTMaterialGen.getGem(mat, 1));
            }

            if (mat.hasFlag(GTMaterialFlag.INGOT)) {
                OreDictionary.registerOre("ingot" + mat.getDisplayName(), GTMaterialGen.getIngot(mat, 1));
            }

            if (mat.hasFlag(GTCXMaterial.crushedore)) {
                OreDictionary.registerOre("crushedore" + mat.getDisplayName(), GTCXMaterialGen.getCrushedOre(mat, 1));
            }

            if (mat.hasFlag(GTCXMaterial.crushedorePurified)) {
                OreDictionary.registerOre("crushedorePurified" + mat.getDisplayName(), GTCXMaterialGen.getPurifiedCrushedOre(mat, 1));
            }
        }
    }
}

