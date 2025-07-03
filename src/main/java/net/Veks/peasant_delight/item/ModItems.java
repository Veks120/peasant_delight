package net.Veks.peasant_delight.item;
import net.Veks.peasant_delight.peasant_delight;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.BowlFoodItem;

import javax.swing.*;

public class ModItems {


    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, peasant_delight.MOD_ID);


public static final RegistryObject<Item> frumenty = ITEMS.register("frumenty",
        () -> new BowlFoodItem(new Item.Properties().food(ModFoods.frumenty).stacksTo(16)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}


