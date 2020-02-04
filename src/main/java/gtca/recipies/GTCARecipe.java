package gtca.recipies;

import gtc_expansion.material.GTCXMaterial;
import gtc_expansion.material.GTCXMaterialGen;
import gtca.GTCAMaterial;
import gtca.init.GTCASubscriber;
import gtclassic.api.material.GTMaterial;
import gtclassic.api.material.GTMaterialGen;
import gtclassic.common.tile.GTTileCentrifuge;
import ic2.core.block.machine.low.TileEntityMacerator;
import ic2.core.platform.registry.Ic2Items;

public class GTCARecipes {

    // Smelting recipies below. Please group Blocks, Items, and ItemStacks together.
    public static void addSmelting()
    {

        //FurnaceRecipes.instance().addSmeltingRecipeForBlock(Old_GTCABlocks.MOLYBDENITE_ORE, GTMaterialGen.getIngot(GTCAMaterial.Molybdenum, 1), 10);
       // FurnaceRecipes.instance().addSmeltingRecipeForBlock(Old_GTCABlocks.GADOLINITE_ORE, GTMaterialGen.getIngot(GTMaterial.Beryllium, 1), 10);
       // FurnaceRecipes.instance().addSmeltingRecipeForBlock(Old_GTCABlocks.NETHER_GOLD_ORE, GTMaterialGen.get(Items.GOLD_INGOT, 2), 10);

    }


    public static void addMacerator()
    {

        TileEntityMacerator.addRecipe(GTMaterialGen.get(GTCASubscriber.oreMolybdenite), GTCXMaterialGen.getCrushedOre(GTCAMaterial.Molybdenite, 1));
        TileEntityMacerator.addRecipe("crushedoreMolybdenite", 1, GTMaterialGen.getDust(GTCAMaterial.Molybdenite, 1));
        TileEntityMacerator.addRecipe("crushedorePurifiedMolybdenite", 1, GTMaterialGen.getDust(GTCAMaterial.Molybdenite, 2));

        TileEntityMacerator.addRecipe("oreGadolinite", 1, GTCXMaterialGen.getCrushedOre(GTCAMaterial.Gadolinite, 1));
        TileEntityMacerator.addRecipe("crushedoreGadolinite", 1, GTMaterialGen.getDust(GTCAMaterial.Gadolinite, 1));
        TileEntityMacerator.addRecipe("crushedorePurifiedGadolinite", 1, GTMaterialGen.getDust(GTCAMaterial.Gadolinite, 2));

        TileEntityMacerator.addRecipe("oreNGold", 1, GTCXMaterialGen.getCrushedOre(GTCXMaterial.Gold, 1));
        TileEntityMacerator.addRecipe("crushedoreGold",1, GTMaterialGen.getDust(GTCXMaterial.Gold, 2));
        TileEntityMacerator.addRecipe("crushedorePurifiedGold",1, GTMaterialGen.getDust(GTCXMaterial.Gold, 4));

        TileEntityMacerator.addRecipe("oreZircon", 1, GTCXMaterialGen.getCrushedOre(GTCAMaterial.Zircon, 1));
        TileEntityMacerator.addRecipe("crushedoreZircon", 1, GTMaterialGen.getDust(GTCAMaterial.Zircon, 1));
        TileEntityMacerator.addRecipe("crushedorePurifiedZircon", 1, GTMaterialGen.getDust(GTCAMaterial.Zircon, 2));

        TileEntityMacerator.addRecipe("oreBismuthinite", 1, GTCXMaterialGen.getCrushedOre(GTCAMaterial.Bismuthinite, 1));
        TileEntityMacerator.addRecipe("crushedoreBismuthinite", 1, GTMaterialGen.getDust(GTCAMaterial.Bismuthinite, 1));
        TileEntityMacerator.addRecipe("crushedorePurifiedBismuthinite", 1, GTMaterialGen.getDust(GTCAMaterial.Bismuthinite, 2));

    }


    public static void addCentrifuge()
    {

        GTTileCentrifuge.addRecipe("crushedoreGadolinite", 4, 0, GTTileCentrifuge.totalEu(750), GTMaterialGen.getIc2(Ic2Items.ironDust), GTMaterialGen.getDust(GTCAMaterial.Beryllium, 1), GTMaterialGen.getDust(GTMaterial.Flint, 1), GTMaterialGen.getDust(GTCXMaterial.Stone, 1), GTMaterialGen.getDust(GTCAMaterial.Impurities, 1));
        GTTileCentrifuge.addRecipe("crushedorePurifiedGadolinite", 4, 0, GTTileCentrifuge.totalEu(750), GTMaterialGen.getIc2(Ic2Items.ironDust), GTMaterialGen.getDust(GTCAMaterial.Beryllium, 1), GTMaterialGen.getDust(GTMaterial.Flint, 1), GTCXMaterialGen.getTinyDust(GTCAMaterial.Mixed_Metal, 1));

        GTTileCentrifuge.addRecipe("dustMolybdenite", 3, 0, GTTileCentrifuge.totalEu(750), GTMaterialGen.getDust(GTCAMaterial.Molybdenum, 1), GTMaterialGen.getDust(GTMaterial.Sulfur, 2));

        GTTileCentrifuge.addRecipe("dustZircon", 3, 0, GTTileCentrifuge.totalEu(750), GTMaterialGen.getDust(GTCAMaterial.Zirconium, 1), GTMaterialGen.getDust(GTMaterial.Flint, 1));

        GTTileCentrifuge.addRecipe("dustBismuthinite", 3, 0, GTTileCentrifuge.totalEu(750), GTMaterialGen.getDust(GTCAMaterial.Bismuth, 2), GTMaterialGen.getDust(GTMaterial.Sulfur, 3));

    }
}


