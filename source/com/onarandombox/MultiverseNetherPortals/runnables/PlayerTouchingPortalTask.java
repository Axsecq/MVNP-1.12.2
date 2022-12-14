package com.onarandombox.MultiverseNetherPortals.runnables;

import com.onarandombox.MultiverseNetherPortals.utils.MVEventRecord;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.PortalType;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.UUID;

public class PlayerTouchingPortalTask extends BukkitRunnable {
    private final MVEventRecord eventRecord;
    private final PortalType portalType;
    private final UUID uuid;

    public PlayerTouchingPortalTask(MVEventRecord eventRecord, PortalType portalType, UUID uuid) {
        this.eventRecord = eventRecord;
        this.portalType = portalType;
        this.uuid = uuid;
    }

    @Override
    public void run() {
        PortalType type = null;
        Player p = Bukkit.getPlayer(this.uuid);

        if (p != null && p.isOnline()) {
            if (p.getLocation().getBlock().getType() == Material.ENDER_PORTAL) {
                type = PortalType.ENDER;
            } else if (p.getLocation().getBlock().getType() == Material.PORTAL) {
                type = PortalType.NETHER;
            }
        }

        if (type != this.portalType) {
            this.eventRecord.removeFromRecord(this.portalType, this.uuid);
        }
    }
}
