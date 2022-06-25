package me.experimental.events;/*
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
 * This was written by ExperimentalX on 6/24/2022
 */

import me.experimental.LifeSteal;
import me.experimental.utils.HealthSystem;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class OnPlayerDeath implements Listener {
    private static Player victim;
    private static Player murderer;
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        this.victim = e.getEntity();
        if(!(victim instanceof Player)) { return; }
        this.murderer = e.getEntity().getKiller();
        e.setDeathMessage(ChatColor.translateAlternateColorCodes('&', "&0&l[&c ☠ &0&l] &7Player &a"+victim.getDisplayName()+"&7 has committed die by Player &a"+murderer.getDisplayName()));
        victim.sendMessage(LifeSteal.prefix+ChatColor.RED+"You have lost one heart to "+murderer.getDisplayName());
        HealthSystem.decreaseIfOver(2, 0, victim);
        murderer.sendMessage(LifeSteal.prefix+ChatColor.RED+"You have gained one heart from "+victim.getDisplayName());
        HealthSystem.increaseIfUnder(2, 60, murderer);
    }
}
