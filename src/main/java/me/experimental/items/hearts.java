package me.experimental.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

/*
 * LICENSE NOTICE
 *
 * If you are to have stumbled upon this file and are reading this,
 * this is the License for all code in this file:
 *
 * THIS MESSAGE WILL NOT BE REMOVED. EVEN IN FORKS. THIS MESSAGE MUST STAY
 * I WILL FIND YOU IF YOU REMOVE IT
 *
 * LICENSE:
 *
 * All code is editable by the user (you), and requestable by ExperimentalX
 * at any time. If requested, I (ExperimentalX) am allowed to view modified code.
 * You can do whatever the heck you want to, as long as this message remains
 * and the command "/experimental" stays. If it is removed, I can revoke your
 * access to this code and all forks you have.
 *
 * This was written by ExperimentalX on 6/19/2022
 */
public class hearts {
    public static ItemStack getLevelOne(int num) {
        ItemStack item = new ItemStack(Material.RED_DYE);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c&lHeart"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.RED+"-"+ChatColor.WHITE+" Information:");
        lore.add("  " + ChatColor.RED + ">> "+ ChatColor.GRAY+"Adds: "+ChatColor.DARK_RED+"❤");
        lore.add("");
        lore.add(ChatColor.RED+"-"+ChatColor.WHITE+" Usage:");
        lore.add("  "+ChatColor.RED+">> "+ChatColor.GRAY+"Right Click to Consume");
        lore.add("");
        lore.add(ChatColor.DARK_GRAY+"[CLICK TO USE]");

        itemMeta.setLore(lore);
        itemMeta.setCustomModelData(501);

        item.setItemMeta(itemMeta);

        item.setAmount(num);

        return item;
    }

    public static ItemStack getLevelTwo(int num) {
        ItemStack item = new ItemStack(Material.YELLOW_DYE);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lGolden Heart"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD+"-"+ChatColor.WHITE+" Information:");
        lore.add("  " + ChatColor.GOLD + ">> "+ ChatColor.GRAY+"Adds: "+ChatColor.DARK_RED+"❤❤");
        lore.add("");
        lore.add(ChatColor.GOLD+"-"+ChatColor.WHITE+" Usage:");
        lore.add("  "+ChatColor.GOLD+">> "+ChatColor.GRAY+"Right Click to Consume");
        lore.add("");
        lore.add(ChatColor.DARK_GRAY+"[CLICK TO USE]");
        itemMeta.setLore(lore);
        itemMeta.setCustomModelData(502);

        item.setItemMeta(itemMeta);

        item.setAmount(num);

        return item;
    }

    public static ItemStack getLevelThree(int num) {
        ItemStack item = new ItemStack(Material.CYAN_DYE);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&b&lExotic Heart"));
        ArrayList<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.AQUA+"-"+ChatColor.WHITE+" Information:");
        lore.add("  " + ChatColor.AQUA + ">> "+ ChatColor.GRAY+"Adds: "+ChatColor.DARK_RED+"❤❤❤");
        lore.add("");
        lore.add(ChatColor.AQUA+"-"+ChatColor.WHITE+" Usage:");
        lore.add("  "+ChatColor.AQUA+">> "+ChatColor.GRAY+"Right Click to Consume");
        lore.add("");
        lore.add(ChatColor.DARK_GRAY+"[CLICK TO USE]");

        itemMeta.setLore(lore);
        itemMeta.setCustomModelData(503);

        item.setItemMeta(itemMeta);

        item.setAmount(num);

        return item;
    }
}
