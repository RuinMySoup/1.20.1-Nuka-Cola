package net.nephar.nuka_refreshments.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nephar.nuka_refreshments.NukaRefreshments;
import net.nephar.nuka_refreshments.item.custom.SodaItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NukaRefreshments.MOD_ID);

    public static final RegistryObject<Item> EMPTY_NUKA_BOTTLE = ITEMS.register("empty_nuka_bottle",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CAPPED_NUKA_BOTTLE = ITEMS.register("capped_nuka_bottle",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NUKA_BOTTLE = ITEMS.register("nuka_bottle",
            () -> new SodaItem(new Item.Properties().food(ModFoods.NUKA_BOTTLE)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
