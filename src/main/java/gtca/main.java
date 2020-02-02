package gtca;

import gtc_expansion.material.GTCXMaterial;
import gtclassic.api.material.GTMaterial;
import gtclassic.api.material.GTMaterialFlag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = main.MODID, name = main.NAME, version = main.VERSION, acceptedMinecraftVersions = main.MC_VERSION, dependencies = main.DEPENDENCIES)
public class main {

    public static final String MODID = "gtc_advanced";
    public static final String NAME = "GregTech Classic Advanced";
    public static final String VERSION = "0.0.1";
    public static final String MC_VERSION = "[1.12.2]";
    public static final String DEPENDENCIES = "required-after:ic2;required-after:ic2-classic-spmod;required-after:gtclassic@[1.1.0,);required-after:gtc_expansion";

    public static final Logger LOGGER = LogManager.getLogger(main.MODID);

    static GTMaterialFlag[] metalAll = { GTMaterialFlag.DUST, GTMaterialFlag.INGOT, GTMaterialFlag.BLOCKMETAL,
            GTCXMaterial.tinydust, GTCXMaterial.smalldust, GTCXMaterial.hotIngot, GTCXMaterial.gear, GTCXMaterial.hull,
            GTCXMaterial.molten, GTCXMaterial.nugget, GTCXMaterial.plate, GTCXMaterial.stick};

    public static final GTMaterial Boron = new GTMaterial(5, "Boron", 210, 250, 210, metalAll);
    public static final GTMaterial Rhenium = new GTMaterial(75, "Rhenium", 255, 255, 210, metalAll);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        LOGGER.info(main.NAME + "GTC Advanced has been loaded.");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
