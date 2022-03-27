package com.starmediadev.nmswrapper;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.MinecraftServer;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_18_R2.CraftServer;
import org.bukkit.craftbukkit.v1_18_R2.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

class NMS_1_18_R2 extends NMS {
    @Override
    public double[] getRecentTPS() {
        return ((CraftServer) Bukkit.getServer()).getServer().recentTps;
    }
    
    @Override
    public float getAverageTickTime() {
        MinecraftServer minecraftServer = ((CraftServer) Bukkit.getServer()).getServer();
        return minecraftServer.getAverageTickTime();
    }
    
    @Override
    public ItemStack addNBTString(ItemStack itemStack, String key, String value) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        CompoundTag tag = nmsStack.getOrCreateTag();
        tag.putString(key, value);
        return CraftItemStack.asBukkitCopy(nmsStack);
    }
    
    @Override
    public String getNBTString(ItemStack itemStack, String key) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        CompoundTag tag = nmsStack.getTag();
        if (tag != null) {
            return tag.getString(key);
        }
        return null;
    }
}