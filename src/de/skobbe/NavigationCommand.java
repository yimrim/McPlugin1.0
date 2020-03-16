package de.skobbe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class NavigationCommand implements CommandExecutor {

    // /navigate SoulFoxer on
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.getInventory().addItem(new ItemStack(Material.COMPASS));
            Player toFollowPlayer = Bukkit.getPlayer(strings[0]);
            if (toFollowPlayer != null) {
                player.setCompassTarget(toFollowPlayer.getLocation());
            }
        } else {
            sender.sendMessage("Dieses Kommand darf du nur als Spieler benutzen");
        }
        return false;
    }
}
