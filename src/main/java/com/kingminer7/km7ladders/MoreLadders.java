package com.kingminer7.km7ladders;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreLadders implements ModInitializer {

	public static final String NAME = "More Ladders";
	public static final String AUTHOR = "Kingminer7";
	public static final String VERSION = "1.0.0";
	public static final String MOD_ID = "km7ladders";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info(NAME + " version " + VERSION + " by " + AUTHOR + " has loaded!");

	}
}
