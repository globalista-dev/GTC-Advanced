package gtca;

import gtclassic.api.material.GTMaterial;
import gtclassic.api.material.GTMaterialFlag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static gtc_expansion.material.GTCXMaterial.*;
import static gtclassic.api.material.GTMaterialFlag.*;


@Mod(modid = GTCA.MODID, name = GTCA.NAME, version = GTCA.VERSION, acceptedMinecraftVersions = GTCA.MC_VERSION, dependencies = GTCA.DEPENDENCIES)
public class GTCA {

    public static final String MODID = "gtca";
    public static final String NAME = "GregTech Classic Advanced";
    public static final String VERSION = "0.0.1";
    public static final String MC_VERSION = "[1.12.2]";
    public static final String DEPENDENCIES = "required-after:ic2;required-after:ic2-classic-spmod;required-after:gtclassic@[1.1.0,);required-after:gtc_expansion";

    public static final Logger LOGGER = LogManager.getLogger(GTCA.MODID);

    static GTMaterialFlag[] dustAll = { smalldust, DUST };
    static GTMaterialFlag[] crushedAll = { DUST, smalldust, crushedore, crushedorePurified };
    static GTMaterialFlag[] gemAll1 = { smalldust, DUST, RUBY, blockGem };
    static GTMaterialFlag[] gemAll2 = { smalldust, DUST, SAPPHIRE, blockGem };
    static GTMaterialFlag[] gemAll3 = { smalldust, DUST, gemGarnetShape, blockGem };
    static GTMaterialFlag[] metalFull = { molten, smalldust, tinydust, DUST, nugget, INGOT, plate, stick, gear, BLOCKMETAL };
    static GTMaterialFlag[] metalFullWHull = { molten, smalldust, tinydust, DUST, nugget, INGOT, plate, stick, gear, BLOCKMETAL, hull };
    static GTMaterialFlag[] metalFullHot = { molten, smalldust, DUST, nugget, INGOT, hotIngot, plate, stick, gear, BLOCKMETAL };
    static GTMaterialFlag[] metalFullHotWHull = { molten, smalldust, DUST, nugget, INGOT, hotIngot, plate, stick, gear, BLOCKMETAL, hull };
    static GTMaterialFlag[] metalBase = { molten, smalldust, DUST, nugget, INGOT, plate, stick };

    public static final GTMaterial Molybdenum = new GTMaterial(42, "Molybdenum", 180, 180, 220, metalFull);
        // Molybdenum is here because its ore can be used to obtain Rhenium.
    public static final GTMaterial Rhenium = new GTMaterial(75, "Rhenium", 255, 255, 200, metalFullWHull);
        // Rhenium can be obtained through the processing of both molybdenum and copper ores.

    public static final GTMaterial Yttrium = new GTMaterial(39, "Yttrium", 220, 250, 220, metalFull);
    public static final GTMaterial Lanthanum = new GTMaterial(57, "Lanthanum", 200, 200, 200, metalFull);
    public static final GTMaterial Cerium = new GTMaterial(58, "Cerium", 255, 255, 190, metalFull);
    public static final GTMaterial Neodymium = new GTMaterial(60, "Neodymium", 100, 100, 100, metalFull);
        // The above materials can be obtained through the processing of gadolinite ore.

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        LOGGER.info(GTCA.NAME + "GTC Advanced has been loaded.");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
