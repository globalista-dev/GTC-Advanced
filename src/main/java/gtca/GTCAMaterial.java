package gtca;

import gtclassic.api.material.GTMaterial;
import gtclassic.api.material.GTMaterialFlag;

import static gtc_expansion.material.GTCXMaterial.*;
import static gtclassic.api.material.GTMaterialFlag.*;

public class GTCAMaterial {

    // These materials are automatically added by GTC, as this code runs. Nothing else is needed.

    // Note that some of the static flag groups below use GTCX flags, such as gear.
    static GTMaterialFlag[] dustAll = {smalldust, DUST, tinydust};
    static GTMaterialFlag[] crushedAll = {DUST, smalldust, tinydust, crushedore, crushedorePurified};
    static GTMaterialFlag[] gemAll1 = {smalldust, tinydust, DUST, RUBY, blockGem};
    static GTMaterialFlag[] gemAll2 = {smalldust, tinydust, DUST, SAPPHIRE, blockGem};
    static GTMaterialFlag[] gemAll3 = {smalldust, tinydust, DUST, gemGarnetShape, blockGem};
    static GTMaterialFlag[] metalFull = {molten, smalldust, tinydust, DUST, nugget, INGOT, plate, stick, gear, BLOCKMETAL};
    static GTMaterialFlag[] metalFullCrushed = {molten, smalldust, tinydust, DUST, nugget, INGOT, plate, stick, gear, BLOCKMETAL, crushedore, crushedorePurified};
    static GTMaterialFlag[] metalFullWHull = {molten, smalldust, tinydust, DUST, nugget, INGOT, plate, stick, gear, BLOCKMETAL, hull};
    static GTMaterialFlag[] metalFullHot = {molten, smalldust, DUST, nugget, INGOT, hotIngot, plate, stick, gear, BLOCKMETAL};
    static GTMaterialFlag[] metalFullHotWHull = {molten, smalldust, DUST, nugget, INGOT, hotIngot, plate, stick, gear, BLOCKMETAL, hull};
    static GTMaterialFlag[] metalBase = {molten, smalldust, DUST, nugget, INGOT, plate, stick};

    public static final GTMaterial Beryllium = new GTMaterial(4, "Beryllium", 180, 180, 220, metalFull);
    public static final GTMaterial Molybdenum = new GTMaterial(42, "Molybdenum", 180, 180, 220, metalFull);
    public static final GTMaterial Rhenium = new GTMaterial(75, "Rhenium", 255, 255, 200, metalFullHotWHull).setSmeltable(false);
    public static final GTMaterial Yttrium = new GTMaterial(39, "Yttrium", 220, 250, 220, metalFull);
    public static final GTMaterial Zirconium = new GTMaterial(40, "Zirconium", 200, 255, 255,metalFullHot).setSmeltable(false);
    public static final GTMaterial Lanthanum = new GTMaterial(57, "Lanthanum", 200, 200, 200, metalFull);
    public static final GTMaterial Cerium = new GTMaterial(58, "Cerium", 255, 255, 190, metalFull);
    public static final GTMaterial Neodymium = new GTMaterial(60, "Neodymium", 100, 100, 100, metalFull);
    public static final GTMaterial Bismuth = new GTMaterial(83, "Bismuth", 100, 160, 160, metalFullHot).setSmeltable(false);

    // Add below the materials that are added by GTCA. They all are registered as GTMaterials.
    public static final GTMaterial Gadolinite = new GTMaterial("Gadolinite", 230, 0, 0, crushedAll);
    public static final GTMaterial Molybdenite = new GTMaterial("Molybdenite", 102, 102, 153, crushedAll);
    public static final GTMaterial Zircon = new GTMaterial("Zircon", 127, 146, 255, gemAll3);
    public static final GTMaterial Bismuthinite = new GTMaterial("Bismuthinite", 255, 251, 229, crushedAll);
    public static final GTMaterial Mixed_Metal = new GTMaterial("Mixed_Metal", 204, 153, 255, dustAll);
    public static final GTMaterial Impurities = new GTMaterial("Impurities", 61, 41, 41, dustAll);

    public static void init() {

    }

}

