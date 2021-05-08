package indi.goldenwater.playerfeedback;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerFeedback extends JavaPlugin {
    private static PlayerFeedback instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

        getServer().getPluginCommand("playerfeedback").setExecutor(new CommandExecutor() {
            @Override
            public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
                test(args[0]);
                return true;
            }
        });

        getLogger().info("Enabled.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Disabled.");
    }

    public static PlayerFeedback getInstance() {
        return instance;
    }

    public void test(String arg1) {
        Player player_gw = getServer().getPlayer("Golden_Water");

        if (player_gw != null) {
            Inventory inventory = Bukkit.createInventory(player_gw, Integer.parseInt(arg1));
            player_gw.openInventory(inventory);
            inventory.addItem(new ItemStack(Material.GLASS));
//            player_gw.closeInventory();
        }
    }
}
