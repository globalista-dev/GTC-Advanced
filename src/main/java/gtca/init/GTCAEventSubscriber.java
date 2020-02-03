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

    //Subscribe all ItemBlocks and Items here
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        //ItemBlocks
        final Item[] itemBlocks = {
                new ItemBlock(GTCABlocks.MOLYBDENITE_ORE).setRegistryName(GTCABlocks.MOLYBDENITE_ORE.getRegistryName()),
                new ItemBlock(GTCABlocks.GADOLINITE_ORE).setRegistryName(GTCABlocks.GADOLINITE_ORE.getRegistryName()),
                new ItemBlock(GTCABlocks.NETHER_GOLD_ORE).setRegistryName(GTCABlocks.NETHER_GOLD_ORE.getRegistryName()),
                new ItemBlock(GTCABlocks.ZIRCON_ORE).setRegistryName(GTCABlocks.ZIRCON_ORE.getRegistryName()),
                new ItemBlock(GTCABlocks.BISMUTHINITE_ORE).setRegistryName(GTCABlocks.BISMUTHINITE_ORE.getRegistryName()),

        };

        //Items
        final Item[] items = {
                //new Item().setRegistryName(GTCA.MODID, "crushed_nether_gold").setTranslationKey(GTCA.MODID + "." + "crushed_nether_gold").setCreativeTab(creativeTabGT),
                new Item().setRegistryName(GTCA.MODID, "mixed_metal_dust").setTranslationKey(GTCA.MODID + "." + "mixed_metal_dust").setCreativeTab(creativeTabGT),


        };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }
}