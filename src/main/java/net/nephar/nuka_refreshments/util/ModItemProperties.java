package net.nephar.nuka_refreshments.util;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.nephar.nuka_refreshments.NukaRefreshments;
import net.nephar.nuka_refreshments.item.ModItems;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        ItemProperties.register(ModItems.NUKA_BOTTLE.get(), ResourceLocation.fromNamespaceAndPath(NukaRefreshments.MOD_ID, "drinking"),
        (ItemStack, ClientLevel, LivingEntity, pSeed) -> {
            return LivingEntity != null && LivingEntity.isUsingItem() && LivingEntity.getUseItem() == ItemStack ? 1F : 0F;
        });
    }
}
