package gtca.recipies;

import gtc_expansion.material.GTCXMaterial;
import gtc_expansion.material.GTCXMaterialGen;
import gtca.GTCAMaterial;
import gtca.init.GTCABlocks;
import gtca.init.GTCAItems;
import gtclassic.api.material.GTMaterial;
import gtclassic.api.material.GTMaterialGen;
import gtclassic.common.tile.GTTileCentrifuge;
import ic2.api.item.IC2Items;
import ic2.core.IC2;
import ic2.core.block.machine.low.TileEntityMacerator;
import ic2.core.inventory.base.IC2ItemInventory;
import ic2.core.platform.registry.Ic2Items;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.FurnaceRecipes;

public class GTCARecipes {

    // Smelting recipies below. Please group Blocks, Items, and ItemStacks together.
    public static void addSmelting()
    {

        FurnaceRecipes.instance().addSmeltingRecipeForBlock(GTCABlocks.MOLYBDENITE_ORE, GTMaterialGen.getIngot(GTCAMaterial.Molybdenum, 1), 10);
        FurnaceRecipes.instance().addSmeltingRecipeForBlock(GTCABlocks.GADOLINITE_ORE, GTMaterialGen.getIngot(GTMaterial.Beryllium, 1), 10);
        FurnaceRecipes.instance().addSmeltingRecipeForBlock(GTCABlocks.NETHER_GOLD_ORE, GTMaterialGen.get(Items.GOLD_INGOT, 2), 10);

    }


    public static void addMacerator()
    {

        TileEntityMacerator.addRecipe("oreMolybdenite", 1, GTCXMaterialGen.getCrushedOre(GTCAMaterial.Molybdenite, 1));
        TileEntityMacerator.addRecipe("crushedoreMolybdenite", 1, GTMaterialGen.getDust(GTCAMaterial.Molybdenite, 1));
        TileEntityMacerator.addRecipe("crushedorePurifiedMolybdenite", 1, GTMaterialGen.getDust(GTCAMaterial.Molybdenite, 2));

        TileEntityMacerator.addRecipe("oreGadolinite", 1, GTCXMaterialGen.getCrushedOre(GTCAMaterial.Gadolinite, 1));
        TileEntityMacerator.addRecipe("crushedoreGadolinite", 1, GTMaterialGen.getDust(GTCAMaterial.Gadolinite, 1));
        TileEntityMacerator.addRecipe("crushedorePurifiedGadolinite", 1, GTMaterialGen.getDust(GTCAMaterial.Gadolinite, 2));

        TileEntityMacerator.addRecipe("oreNetherGold", 1, GTMaterialGen.get(GTCAItems.CRUSHED_NETHER_GOLD, 1));
        TileEntityMacerator.addRecipe(GTMaterialGen.get(GTCAItems.CRUSHED_NETHER_GOLD, 1), GTCXMaterialGen.getCrushedOre(GTCXMaterial.Gold, 3));
        TileEntityMacerator.addRecipe("crushedoreGold",1, GTMaterialGen.getDust(GTCXMaterial.Gold, 2));
        TileEntityMacerator.addRecipe("crushedorePurifiedGold",1, GTMaterialGen.getDust(GTCXMaterial.Gold, 4));

    }


    public static void addCentrifuge()
    {

        GTTileCentrifuge.addRecipe("dustGadolinite", 7, 0, GTTileCentrifuge.totalEu(750), GTMaterialGen.get(GTCAItems.MIXED_METAL_DUST, 2), GTMaterialGen.getDust(GTCXMaterial.Iron, 1), GTMaterialGen.getDust(GTMaterial.Beryllium, 2), GTMaterialGen.getDust(GTMaterial.Silicon, 2));
        //GTTileCentrifuge.addRecipe("crushedoreGadolinite", 1, 0,GTTileCentrifuge.totalEu(750), GTMaterialGen.getDust(GTCAMaterials.Gadolinite, 3));
        //GTTileCentrifuge.addRecipe("crushedPurifiedGadolinite", 1,0,GTTileCentrifuge.totalEu(750), GTMaterialGen.getDust(GTCAMaterials.Gadolinite, 5));

        GTTileCentrifuge.addRecipe("dustMolybdenite", 3, 0, GTTileCentrifuge.totalEu(750), GTMaterialGen.getDust(GTCAMaterial.Molybdenum, 1), GTMaterialGen.getDust(GTMaterial.Sulfur, 2));
        //GTTileCentrifuge.addRecipe("crushedoreMolybdenite", 1, 0,GTTileCentrifuge.totalEu(750), GTMaterialGen.getDust(GTCAMaterials.Molybdenite, 3));
        //GTTileCentrifuge.addRecipe("crushedPurifiedMolybdenite", 1,0,GTTileCentrifuge.totalEu(750), GTMaterialGen.getDust(GTCAMaterials.Molybdenite, 5));

    }



}


