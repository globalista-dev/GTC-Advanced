package gtca.init;

import gtca.GTCA;
import gtca.blocks.GTCABlockOre;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = GTCA.MODID)
public final class GTCAEventSubscriber {

    public static final GTCABlockOre oreSample = new GTCABlockOre("Sample", 0, 3.0F, 1);
    public static final GTCABlockOre oreMolybdenite = new GTCABlockOre("Molybdenite", 1, 3.0F, 1);

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(oreSample);
        event.getRegistry().register(oreMolybdenite);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(oreSample).setRegistryName(oreSample.getRegistryName()));
        event.getRegistry().register(new ItemBlock(oreMolybdenite.setRegistryName(oreMolybdenite.getRegistryName())));


    }


}

