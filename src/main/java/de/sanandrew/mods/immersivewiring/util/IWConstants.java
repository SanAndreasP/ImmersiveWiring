/* ******************************************************************************************************************
   * Authors:   SanAndreasP
   * Copyright: SanAndreasP
   * License:   Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International
   *                http://creativecommons.org/licenses/by-nc-sa/4.0/
   *******************************************************************************************************************/
package de.sanandrew.mods.immersivewiring.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class IWConstants
{
    public static final String ID = "immersivewiring";
    public static final Logger LOG = LogManager.getLogger(ID);
    public static final String VERSION = "0.8.0-alpha.1";
    public static final String CHANNEL = "ImmIntegrationNWCH";
    public static final String NAME = "Immersive Integration Rebirth";
    public static final String DEPENDENCIES = "required-after:Forge@[12.18.3.2511,];required-after:sanlib@[1.3.0,]";

    public static final String COMPAT_APPLIEDENERGISTICS = "appliedenergistics2";
}
