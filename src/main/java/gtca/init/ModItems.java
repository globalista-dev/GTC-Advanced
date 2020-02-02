package gtca.init;

import gtca.GTCA;
import gtclassic.GTMod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@ObjectHolder(GTCA.MODID)
public class ModItems {

    public static final Item TEST_ITEM = null;
    public static final Item TEST_ITEM_2 = null;

    @EventBusSubscriber(modid = GTCA.MODID)
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(Register<Item> event) {
            final Item[] items = {
                new Item().setRegistryName(GTCA.MODID, "test_item").setTranslationKey(GTCA.MODID + "." + "test_item").setCreativeTab(GTMod.creativeTabGT),
                new Item().setRegistryName(GTCA.MODID, "test_item_2").setTranslationKey(GTCA.MODID + "." + "test_item_2").setCreativeTab(GTMod.creativeTabGT) };

            event.getRegistry().registerAll(items);
        }

    }

}
