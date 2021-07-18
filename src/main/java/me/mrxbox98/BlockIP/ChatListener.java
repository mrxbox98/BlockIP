package me.mrxbox98.BlockIP;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onAsyncPlayerChatEvent(AsyncPlayerChatEvent event)
    {
        if(hasIP(event.getMessage()))
        {
            event.setCancelled(true);
        }

    }

    public boolean hasIP(String str)
    {
        String[] pi = split(str);
        if(pi.length<3)
        {
            return false;
        }
        try
        {
            for(int i=0;i<4;i++)
            {
                Integer.parseInt(pi[i]);
            }
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public String[] split(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='.')
            {
                count++;
            }
        }
        int bi=0;
        int ei=0;
        String[] arr = new String[count];
        for(int i=0;i<count;i++)
        {
            ei=str.indexOf(".");
            arr[i]=str.substring(bi,ei);
            str=str.substring(ei+1);
        }
        return arr;
    }

}
