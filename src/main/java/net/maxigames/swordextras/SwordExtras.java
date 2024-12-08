package net.maxigames.swordextras;

import net.fabricmc.api.ModInitializer;

import net.maxigames.swordextras.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SwordExtras implements ModInitializer {
	public static final String MOD_ID = "swordextras";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.initialize();
	}



}