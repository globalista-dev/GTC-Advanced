package gtca.init;

import gtca.GTCA;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import static gtclassic.GTMod.creativeTabGT;


@ObjectHolder(GTCA.MODID)
public class GTCAItem {

    //public static final Item ITEM_NAME = null;

    @Mod.EventBusSubscriber(modid = GTCA.MODID)
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            final Item[] items = {
                    //new Item().setRegistryName(GTCA.MODID, "item_name").setTranslationKey(GTCA.MODID + "." + "item_name").setCreativeTab(creativeTabGT)
            };

            event.getRegistry().registerAll(items);
        }

    }

}