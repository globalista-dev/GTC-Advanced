package gtca.client;

import gtca.GTCA;
import gtca.init.Old_GTCABlocks;
import gtca.init.GTCAItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = GTCA.MODID)
public class ModelRegistrationHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        //Items
        //registerModel(GTCAItems.CRUSHED_NETHER_GOLD, 0);
        registerModel(GTCAItems.MIXED_METAL_DUST, 0);

        //ItemBlocks
        registerModel(Item.getItemFromBlock(Old_GTCABlocks.GADOLINITE_ORE), 0);
        registerModel(Item.getItemFromBlock(Old_GTCABlocks.MOLYBDENITE_ORE), 0);
        registerModel(Item.getItemFromBlock(Old_GTCABlocks.NETHER_GOLD_ORE), 0);
        registerModel(Item.getItemFromBlock(Old_GTCABlocks.BISMUTHINITE_ORE), 0);
        registerModel(Item.getItemFromBlock(Old_GTCABlocks.ZIRCON_ORE), 0);

    }

    private static void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta,
                new ModelResourceLocation(item.getRegistryName(),
                        "inventory"));
    }

}
