package me.mrxbox98.BlockIP;

import org.bukkit.plugin.java.JavaPlugin;

public class BlockIPPlugin extends JavaPlugin {

    @Override
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(new ChatListener(),this);
    }

}
