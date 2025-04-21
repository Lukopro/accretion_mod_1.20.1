package net.luko.accretion.item;

import net.luko.accretion.Accretion;
import net.luko.accretion.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Accretion.MODID);

    public static final RegistryObject<CreativeModeTab> ACCRETION_TAB = CREATIVE_MODE_TABS.register("accretion_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.METAL_DISK.get()))
                    .title(Component.translatable("creativetab.accretion_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        /* Add items to Accretion creative mode tab */

                        pOutput.accept(ModItems.METAL_DISK.get());

                        pOutput.accept(ModBlocks.VOID_BINDER.get());

                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
