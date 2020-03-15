package de.skobbe;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class StarterKitCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.getInventory().clear();
            player.getInventory().setItem(0, new ItemStack(Material.DIAMOND_SWORD));
            //player.setCustomName("");

        }
        return false;
    }
}
