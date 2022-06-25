package me.experimental;

import me.experimental.commands.admin;
import me.experimental.events.ItemUseEvent;
import me.experimental.items.hearts;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

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
public class LifeSteal extends JavaPlugin {

    public void onEnable() {
        System.out.print("LIFESTEAL LOADED");
        getCommand("lsadmin").setExecutor(new admin());
        getServer().getPluginManager().registerEvents(new ItemUseEvent(), this);
        String ver = getPlugin(this.getClass()).getDescription().getVersion();
        if (ver.contains("SNAPSHOT")) {
            getLogger().log(Level.WARNING, "You are using a SNAPSHOT version of LifeSteal. Be wary there are probably bugs.");
        }else if (ver.contains("BETA")) {
            getLogger().log(Level.WARNING, "You are using a BETA version of LifeSteal. Be wary there are probably bugs.");
        }else if (ver.contains("RELEASE")) {
            getLogger().log(Level.WARNING, "You are using a RELEASE version of LifeSteal. If you find a bug, please report it.");
        }


        /*
         * RECIPES
         */

        NamespacedKey key = new NamespacedKey(this, "leveloneheart");
        ShapedRecipe L1 = new ShapedRecipe(key, hearts.getLevelOne(1));
        L1.shape("FNF", "NBN", "FNF");

        /*
         * INGREDIENTS
         */

        L1.setIngredient('F', Material.FEATHER);
        L1.setIngredient('N', Material.NETHERITE_INGOT);
        L1.setIngredient('B', Material.BEACON);
    }

    public void onDisable() {

    }
}
