package net.zachafton.theshadow.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.zachafton.theshadow.Theshadow;

public class Moditems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Theshadow.MODID);

    public static final DeferredItem<Item> Shadow = ITEMS.register("shadow",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
