package indi.goldenwater.playerfeedback.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class InventoryGUI {
    private Map<Integer, Map<Integer, ItemStack>> inventoryItems;
    private Inventory inventory;
    private String title;
    private int size;

    public InventoryGUI(int rowNum) {
        this(rowNum, "");
    }

    public InventoryGUI(int rowNum, String title) {
        size = rowNum * 9;
        this.title = title;
    }

    public void setSize(int rowNum) {
        size = rowNum * 9;
    }

    public void createFor(Player player) {
        inventory = Bukkit.createInventory(player, size, title);
    }

    public InventoryView openFor(Player player) {
        return player.openInventory(inventory);
    }
}
