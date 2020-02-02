package gtca.init;

import gtca.GTCA;
import gtca.blocks.GTCABlockOre;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static gtclassic.GTMod.creativeTabGT;

@Mod.EventBusSubscriber(modid = GTCA.MODID)
public final class GTCAEventSubscriber {

    //Subscribe all Blocks here
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        final Block[] blocks = {
                new GTCABlockOre().setRegistryName("molybdenum_ore").setTranslationKey(GTCA.MODID + "." + "molybdenum_ore").setCreativeTab(creativeTabGT),
                new GTCABlockOre().setRegistryName("gadolinite_ore").setTranslationKey(GTCA.MODID + "." + "gadolinite_ore").setCreativeTab(creativeTabGT),
        };

        event.getRegistry().registerAll(blocks);
    }


    //Subscribe all ItemBlocks and Items here
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        //ItemBlocks
        final Item[] itemBlocks = {
                new ItemBlock(GTCABlocks.MOLYBDENUM_ORE).setRegistryName(GTCABlocks.MOLYBDENUM_ORE.getRegistryName()),
                new ItemBlock(GTCABlocks.GADOLINITE_ORE).setRegistryName(GTCABlocks.GADOLINITE_ORE.getRegistryName()), };

        //Items
        final Item[] items = {
                new Item().setRegistryName(GTCA.MODID, "test_item").setTranslationKey(GTCA.MODID + "." + "test_item").setCreativeTab(creativeTabGT),
                new Item().setRegistryName(GTCA.MODID, "test_item_2").setTranslationKey(GTCA.MODID + "." + "test_item_2").setCreativeTab(creativeTabGT) };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }
}