package gtca.init;

import gtca.GTCA;
import gtca.blocks.GTCABlockOre;
import gtca.blocks.GTCABlockOreEnd;
import gtca.blocks.GTCABlockOreNether;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = GTCA.MODID)
public final class GTCABlock {

    public static final GTCABlockOre oreZircon = new GTCABlockOre("Zircon", 0, 3.0F, 1);
    public static final GTCABlockOreEnd oreBismuthinite = new GTCABlockOreEnd("Bismuthinite", 1, 4.0F, 2);
    public static final GTCABlockOre oreGadolinite = new GTCABlockOre("Gadolinite", 2, 3.2F, 1);
    public static final GTCABlockOre oreMolybdenite = new GTCABlockOre("Molybdenite", 3, 3.2F, 1);
    public static final GTCABlockOreNether oreNGold = new GTCABlockOreNether("Gold", 4, 3.5F, 2);

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(oreZircon);
        event.getRegistry().register(oreBismuthinite);
        event.getRegistry().register(oreMolybdenite);
        event.getRegistry().register(oreGadolinite);
        event.getRegistry().register(oreNGold);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(oreGadolinite).setRegistryName(GTCA.MODID + "_oreGadolinite"));
        event.getRegistry().register(new ItemBlock(oreZircon).setRegistryName(GTCA.MODID + "_oreZircon"));
        event.getRegistry().register(new ItemBlock(oreBismuthinite).setRegistryName(GTCA.MODID + "_oreBismuthinite"));
        event.getRegistry().register(new ItemBlock(oreMolybdenite).setRegistryName(GTCA.MODID + "_oreMolybdenite"));
        event.getRegistry().register(new ItemBlock(oreNGold).setRegistryName(GTCA.MODID + "_orenetherGold"));


    }


}

