package net.zachafton.theshadow.item;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.zachafton.theshadow.Theshadow;

public class Moditems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Theshadow.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
