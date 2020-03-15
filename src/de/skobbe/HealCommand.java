package de.skobbe;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.setHealth(20);
            player.setFoodLevel(20);
            player.sendMessage("DU wurdest geheilt");
        }else{
            sender.sendMessage("Dieses Kommand darf du nur als Spieler benutzen");
        }

        return false;
    }
}
