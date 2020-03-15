package de.skobbe;

import net.minecraft.server.v1_15_R1.EntityPlayer;
import net.minecraft.server.v1_15_R1.PlayerChunkMap;
import net.minecraft.server.v1_15_R1.WorldServer;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RenameCommand implements CommandExecutor {

    /**
     * param string[0]   playerName
     * param string[1]   choosenName
     */

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(strings[0] + " heißt nun " + strings[1]);
            Player toRenamePlayer = Bukkit.getPlayer(strings[0]);
            toRenamePlayer.setPlayerListName(strings[1]);
            toRenamePlayer.setDisplayName(strings[1]);
        } else {
            sender.sendMessage("Dieses Kommand darf du nur als Spieler benutzen");
        }

        return false;
    }


}
