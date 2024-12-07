package net.maxigames.armor_extras;

import net.fabricmc.api.ModInitializer;

import net.maxigames.armor_extras.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArmorExtras implements ModInitializer {
	public static final String MOD_ID = "armor-extras";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.initialize();
	}



}