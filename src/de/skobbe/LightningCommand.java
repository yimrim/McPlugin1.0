package de.skobbe;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LightningCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Player toStrikePlayer = Bukkit.getPlayer(strings[0]);
            World world = null;
            if (toStrikePlayer != null) {
                world = toStrikePlayer.getWorld();
                world.strikeLightning(toStrikePlayer.getLocation());
            }
        } else {
            sender.sendMessage("Dieses Kommand darf du nur als Spieler benutzen");
        }
        return false;
    }
}
