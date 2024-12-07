package net.maxigames.armor_extras.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maxigames.armor_extras.ArmorExtras;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Identifier itemID = Identifier.of(ArmorExtras.MOD_ID, id);

        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        // Return the registered item!
        return registeredItem; 
    }

    public static void initialize() {


    }
}