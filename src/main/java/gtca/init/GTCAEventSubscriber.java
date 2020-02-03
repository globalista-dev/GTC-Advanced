package gtca.init;

import gtca.GTCA;
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
                new ItemBlock(Old_GTCABlocks.MOLYBDENITE_ORE).setRegistryName(Old_GTCABlocks.MOLYBDENITE_ORE.getRegistryName()),
                new ItemBlock(Old_GTCABlocks.GADOLINITE_ORE).setRegistryName(Old_GTCABlocks.GADOLINITE_ORE.getRegistryName()),
                new ItemBlock(Old_GTCABlocks.NETHER_GOLD_ORE).setRegistryName(Old_GTCABlocks.NETHER_GOLD_ORE.getRegistryName()),
                new ItemBlock(Old_GTCABlocks.ZIRCON_ORE).setRegistryName(Old_GTCABlocks.ZIRCON_ORE.getRegistryName()),
                new ItemBlock(Old_GTCABlocks.BISMUTHINITE_ORE).setRegistryName(Old_GTCABlocks.BISMUTHINITE_ORE.getRegistryName()),

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