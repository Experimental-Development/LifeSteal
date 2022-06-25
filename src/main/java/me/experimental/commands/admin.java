package me.experimental.commands;

import me.experimental.LifeSteal;
import me.experimental.items.hearts;
import me.experimental.utils.HealthSystem;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

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
public class admin implements CommandExecutor {


    int amount;
    Player target;
    public boolean onCommand(CommandSender commandSender, Command command, String cmd, String[] args) {
        if( commandSender instanceof Player ) {
            Player p = (Player)commandSender;
            if( args.length >= 2 ) {
                if( args[0].equalsIgnoreCase("get") ) {
                    if( args[1].equalsIgnoreCase("1") ) {
                        if(! args[2].isEmpty() ) {
                            try {
                                int amount = Integer.parseInt(args[2]);
                                p.getInventory().addItem(hearts.getLevelOne(amount));
                                return true;
                            } catch(NumberFormatException e) {
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', LifeSteal.prefix+"&cThe amount you specified was not valid."));
                                return false;
                            }
                        }
                        p.getInventory().addItem(hearts.getLevelOne(1));
                        return true;
                    }
                    if( args[1].equalsIgnoreCase("2") ) {
                        if(! args[2].isEmpty() ) {
                            try {
                                int amount = Integer.parseInt(args[2]);
                                p.getInventory().addItem(hearts.getLevelTwo(amount));
                                return true;
                            } catch(NumberFormatException e) {
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', LifeSteal.prefix+"&cThe amount you specified was not valid."));
                                return false;
                            }
                        }
                        p.getInventory().addItem(hearts.getLevelTwo(1));
                        return true;
                    }
                    if( args[1].equalsIgnoreCase("3") ) {
                        if(! args[2].isEmpty() ) {
                            try {
                                int amount = Integer.parseInt(args[2]);
                                p.getInventory().addItem(hearts.getLevelThree(amount));
                                return true;
                            } catch(NumberFormatException e) {
                                p.sendMessage(ChatColor.translateAlternateColorCodes('&', LifeSteal.prefix+"&cThe amount you specified was not valid."));
                                return false;
                            }
                        }
                        p.getInventory().addItem(hearts.getLevelThree(1));
                        return true;
                    } else { p.sendMessage("Valid Options: 1/2/3"); }
                } else if (args[0].equalsIgnoreCase("health")) {
                    // lsadmin health <add/remove/set> <player> <amount>
                    try { amount = Integer.parseInt(args[3]) * 2; } catch (NumberFormatException e) { p.sendMessage("Your number is invalid.");  e.printStackTrace(); return false; }
                    try { target = Bukkit.getPlayer(args[2]); } catch (NullPointerException e) { p.sendMessage("Your player was not found"); e.printStackTrace(); return false; }
                    if (args[1].equalsIgnoreCase("add")) { HealthSystem.increase(amount, target); return true; }
                    if (args[1].equalsIgnoreCase("remove")) { HealthSystem.decrease(amount, target); return true; }
                    if (args[1].equalsIgnoreCase("set")) { HealthSystem.set(amount, target); return true; }
                }
            }
        } else { commandSender.sendMessage("You are not a player."); return false; }
        return false;
    }
}
