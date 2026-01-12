package net.nephar.nuka_refreshments.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nephar.nuka_refreshments.NukaRefreshments;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVEMODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NukaRefreshments.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NUKA_REFRESHMENTS_TAB = CREATIVEMODE_TABS.register("nuka_refreshments_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NUKA_BOTTLE.get()))
                    .title(Component.translatable("creativetab.nuka_refreshments_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.EMPTY_NUKA_BOTTLE.get());
                        pOutput.accept(ModItems.CAPPED_NUKA_BOTTLE.get());
                        pOutput.accept(ModItems.NUKA_BOTTLE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVEMODE_TABS.register(eventBus);
    }
}
