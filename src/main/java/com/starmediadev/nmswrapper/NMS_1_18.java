package com.starmediadev.nmswrapper;

import net.minecraft.server.MinecraftServer;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_18_R2.CraftServer;

class NMS_1_18 extends NMS {
    @Override
    public double[] getRecentTPS() {
        return ((CraftServer) Bukkit.getServer()).getServer().recentTps;
    }
    
    @Override
    public float getAverageTickTime() {
        MinecraftServer minecraftServer = ((CraftServer) Bukkit.getServer()).getServer();
        return minecraftServer.getAverageTickTime();
    }
}