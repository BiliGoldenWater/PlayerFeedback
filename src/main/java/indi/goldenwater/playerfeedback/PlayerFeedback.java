package indi.goldenwater.playerfeedback;

import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerFeedback extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Enabled.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Disabled.");
    }
}
