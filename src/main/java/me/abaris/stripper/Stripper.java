package me.abaris.stripper;

import org.bukkit.plugin.java.JavaPlugin;

public final class Stripper extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("strip").setExecutor(new Strip());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
