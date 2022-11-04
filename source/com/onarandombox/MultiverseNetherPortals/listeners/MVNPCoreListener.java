package com.onarandombox.MultiverseNetherPortals.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import com.onarandombox.MultiverseCore.event.MVConfigReloadEvent;
import com.onarandombox.MultiverseNetherPortals.MultiverseNetherPortals;

public class MVNPCoreListener implements Listener {

    private final MultiverseNetherPortals plugin;

    public MVNPCoreListener(MultiverseNetherPortals plugin) {
        this.plugin = plugin;
    }

    /**
     * This method is called when Multiverse-Core wants to reload config files.
     *
     * @param event The Config Reload event.
     */
    @EventHandler
    public void configReloadEvent(MVConfigReloadEvent event) {
        this.plugin.loadConfig();
        event.addConfig("Multiverse-NetherPortals - config.yml");
    }

    // VERSION BROKEN
    /**
     * This method is called when Multiverse-Core wants version info.
     *
     * @param event The Version event.
     */
//    @EventHandler
//	  public void versionEvent(MVVersionEvent event) {
//        event.appendVersionInfo(this.plugin.getVersionInfo());
//        File configFile = new File(this.plugin.getDataFolder(), "config.yml");
//        event.putDetailedVersionInfo("multiverse-netherportals/config.yml", configFile);
//    }

    // DEBUG BROKEN
    /**
     * This method is called when Multiverse-Core changes the debug mode.
     *
     * @param event The Debug Mode event.
     */
//    @EventHandler
//    public void debugModeChange(MVDebugModeEvent event) {
//        Logging.setDebugLevel(event.getLevel());
//    }
}
