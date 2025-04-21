package net.luko.accretion.block.entity;

import net.luko.accretion.Accretion;
import net.luko.accretion.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntites {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Accretion.MODID);

    public static final RegistryObject<BlockEntityType<VoidBinderBlockEntity>> VOID_BINDER_BE =
            BLOCK_ENTITIES.register("void_binder_be", ()->
                    BlockEntityType.Builder.of(VoidBinderBlockEntity::new,
                            ModBlocks.VOID_BINDER.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
