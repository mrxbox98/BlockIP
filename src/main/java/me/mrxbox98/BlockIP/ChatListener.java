package me.mrxbox98.BlockIP;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onAsyncPlayerChatEvent(AsyncPlayerChatEvent event)
    {
        String[] pi = event.getMessage().split(".");
        if(pi.length<4)
        {
            return;
        }
        try
        {
            for(int i=0;i<4;i++)
            {
                int t = Integer.parseInt(pi[i]);
            }
            event.setCancelled(true);
        }
        catch(Error e)
        {
            return;
        }
    }

}
