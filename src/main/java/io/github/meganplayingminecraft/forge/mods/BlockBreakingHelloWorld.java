package io.github.meganplayingminecraft.forge.mods;

import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockBreakingHelloWorld {

    // Tell Forge that we want to run this code whenever
    // a BreakEvent happens (when a block is broken)
 
    @SubscribeEvent
    public void sendMessage(BreakEvent event){
     
     event.getPlayer().sendMessage(
       new TextComponentString("HelloWorld!"));
    }
    
}
