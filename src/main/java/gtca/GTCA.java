package gtca;

import gtca.init.GTCAOreDict;
import gtca.recipies.GTCARecipes;
import gtca.proxy.CommonProxy;
import net.minecraftforge.fml.common.SidedProxy;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = GTCA.MODID, name = GTCA.NAME, version = GTCA.VERSION, acceptedMinecraftVersions = GTCA.MC_VERSION, dependencies = GTCA.DEPENDENCIES)
public class GTCA {

    public static final String MODID = "gtca";
    public static final String NAME = "GregTech Classic Advanced";
    public static final String VERSION = "0.0.1";
    public static final String MC_VERSION = "[1.12.2]";
    public static final String DEPENDENCIES = "required-after:ic2;required-after:ic2-classic-spmod;required-after:gtclassic@[1.1.0,);required-after:gtc_expansion";

    @SidedProxy(clientSide = "gtca.proxy.ClientProxy", serverSide = "gtca.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static GTCA instance;
    public static Logger logger;

    static {
        GTCAMaterial.init();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
        logger.info(GTCA.NAME + "GTC Advanced has been loaded.");
        GTCAOreDict.init();
        GTCARecipes.addSmelting();
        GTCARecipes.addMacerator();
        GTCARecipes.addCentrifuge();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);

    }

}
