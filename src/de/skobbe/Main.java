package de.skobbe;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onDisable() {

    }

    @Override
    public void onEnable() {
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("rename").setExecutor(new RenameCommand());
        getCommand("starterkit").setExecutor(new StarterKitCommand());
        getCommand("lightning").setExecutor(new LightningCommand());
    }

    public static void main(String[] args) {

    }
}
