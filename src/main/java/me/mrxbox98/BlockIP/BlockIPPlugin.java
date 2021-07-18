package me.mrxbox98.BlockIP;

import org.bukkit.plugin.java.JavaPlugin;

public class BlockIPPlugin extends JavaPlugin {

    public static JavaPlugin instance;

    @Override
    public void onEnable()
    {
        instance=this;
        getServer().getPluginManager().registerEvents(new ChatListener(),this);
    }

}
