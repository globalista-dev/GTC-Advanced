package gtca.client;

import gtca.GTCA;
import gtca.init.GTCABlocks;
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
        registerModel(GTCAItems.TEST_ITEM, 0);
        registerModel(GTCAItems.TEST_ITEM_2, 0);
        registerModel(Item.getItemFromBlock(GTCABlocks.GADOLINITE_ORE), 0);
        registerModel(Item.getItemFromBlock(GTCABlocks.MOLYBDENUM_ORE), 0);

    }

    private static void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta,
                new ModelResourceLocation(item.getRegistryName(),
                        "inventory"));
    }

}
