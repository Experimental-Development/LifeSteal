package me.experimental.events;

import me.experimental.utils.HealthSystem;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.Title;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

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
public class ItemUseEvent implements Listener {
    @EventHandler
    public void onItemUse(PlayerInteractEvent e) {
        /*
         * The RETURN statements that say hey, if no, no
         */
        //if(! e.hasItem() ) { e.getPlayer().sendMessage("Need item"); return; }
        if( e.getAction() != Action.RIGHT_CLICK_AIR ) {  return; }
        if(! e.getItem().hasItemMeta() ) {  return; }
        if(! e.getItem().getItemMeta().hasCustomModelData() ) { return; }

        /*
         * The ACTUAL event
         */
        if(e.getItem().getItemMeta().getCustomModelData() == 501) {
            if( HealthSystem.increaseIfUnder(2, 60, e.getPlayer()) ) {
                e.getItem().setAmount(e.getItem().getAmount() - 1);
                e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lMineStash &7>> &aYou have gained &4+1 ❤"));
                e.getPlayer().sendTitle(ChatColor.translateAlternateColorCodes('&', "&4+1 ❤"), ChatColor.translateAlternateColorCodes('&', "&aGained one Heart"), 10, 150, 10);
            } else {
                e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lMineStash &7>> &cYou appear to be at the maximum amount of hearts!"));
            }
        }else if(e.getItem().getItemMeta().getCustomModelData() == 502) {
            if( HealthSystem.increaseIfUnder(4, 60, e.getPlayer()) ) {
                e.getItem().setAmount(e.getItem().getAmount() - 1);
                e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lMineStash &7>> &aYou have gained &4+2 ❤"));
                e.getPlayer().sendTitle(ChatColor.translateAlternateColorCodes('&', "&4+2 ❤"), ChatColor.translateAlternateColorCodes('&', "&aGained two Hearts"), 10, 150, 10);
            } else {
                e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lMineStash &7>> &cYou appear to be at the maximum amount of hearts!"));
            }
        }else if(e.getItem().getItemMeta().getCustomModelData() == 503) {
            if( HealthSystem.increaseIfUnder(6, 60, e.getPlayer()) ) {
                e.getItem().setAmount(e.getItem().getAmount() - 1);
                e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lMineStash &7>> &aYou have gained &4+3 ❤"));
                e.getPlayer().sendTitle(ChatColor.translateAlternateColorCodes('&', "&4+3 ❤"), ChatColor.translateAlternateColorCodes('&', "&aGained three Hearts"), 10, 150, 10);
            } else {
                e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lMineStash &7>> &cYou appear to be at the maximum amount of hearts!"));
            }
        }
    }
}
