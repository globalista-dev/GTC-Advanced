package gtca;

import gtc_expansion.material.GTCXMaterial;
import gtca.init.GTCAOreDict;
import gtca.recipies.GTCARecipes;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = GTCA.MODID, name = GTCA.NAME, version = GTCA.VERSION, acceptedMinecraftVersions = GTCA.MC_VERSION, dependencies = GTCA.DEPENDENCIES)
public class GTCA extends GTCAMaterial {

    public static final String MODID = "gtca";
    public static final String NAME = "GregTech Classic Advanced";
    public static final String VERSION = "0.0.1";
    public static final String MC_VERSION = "[1.12.2]";
    public static final String DEPENDENCIES = "required-after:ic2;required-after:ic2-classic-spmod;required-after:gtclassic@[1.1.0,);required-after:gtc_expansion";

    public static final Logger LOGGER = LogManager.getLogger(GTCA.MODID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        LOGGER.info(GTCA.NAME + "GTC Advanced has been loaded.");
        GTCAOreDict.init();
        GTCARecipes.addSmelting();
        GTCARecipes.addMacerator();
        GTCARecipes.addCentrifuge();

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
