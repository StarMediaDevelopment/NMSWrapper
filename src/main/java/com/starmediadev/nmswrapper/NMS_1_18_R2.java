package com.starmediadev.nmswrapper;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.MinecraftServer;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_18_R2.CraftServer;
import org.bukkit.craftbukkit.v1_18_R2.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

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
    
    @Override
    public ItemStack addNBTByte(ItemStack itemStack, String key, byte value) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        CompoundTag tag = nmsStack.getOrCreateTag();
        tag.putByte(key, value);
        return CraftItemStack.asBukkitCopy(nmsStack);
    }
    
    @Override
    public byte getNBTByte(ItemStack itemStack, String key) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        CompoundTag tag = nmsStack.getTag();
        if (tag != null) {
            return tag.getByte(key);
        }
        return 0;
    }
    
    @Override
    public ItemStack addNBTShort(ItemStack itemStack, String key, short value) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        CompoundTag tag = nmsStack.getOrCreateTag();
        tag.putShort(key, value);
        return CraftItemStack.asBukkitCopy(nmsStack);
    }
    
    @Override
    public short getNBTShort(ItemStack itemStack, String key) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        CompoundTag tag = nmsStack.getTag();
        if (tag != null) {
            return tag.getShort(key);
        }
        return 0;
    }
    
    @Override
    public ItemStack addNBTFloat(ItemStack itemStack, String key, float value) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        CompoundTag tag = nmsStack.getOrCreateTag();
        tag.putFloat(key, value);
        return CraftItemStack.asBukkitCopy(nmsStack);
    }
    
    @Override
    public float getNBTFloat(ItemStack itemStack, String key) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        CompoundTag tag = nmsStack.getTag();
        if (tag != null) {
            return tag.getFloat(key);
        }
        return 0;
    }
    
    @Override
    public ItemStack addNBTInt(ItemStack itemStack, String key, int value) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        CompoundTag tag = nmsStack.getOrCreateTag();
        tag.putInt(key, value);
        return CraftItemStack.asBukkitCopy(nmsStack);
    }
    
    @Override
    public int getNBTInt(ItemStack itemStack, String key) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        CompoundTag tag = nmsStack.getTag();
        if (tag != null) {
            return tag.getInt(key);
        }
        return 0;
    }
    
    @Override
    public ItemStack addNBTLong(ItemStack itemStack, String key, long value) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        CompoundTag tag = nmsStack.getOrCreateTag();
        tag.putLong(key, value);
        return CraftItemStack.asBukkitCopy(nmsStack);
    }
    
    @Override
    public long getNBTLong(ItemStack itemStack, String key) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        CompoundTag tag = nmsStack.getTag();
        if (tag != null) {
            return tag.getLong(key);
        }
        return 0;
    }
    
    @Override
    public ItemStack addNBTDouble(ItemStack itemStack, String key, double value) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        CompoundTag tag = nmsStack.getOrCreateTag();
        tag.putDouble(key, value);
        return CraftItemStack.asBukkitCopy(nmsStack);
    }
    
    @Override
    public double getNBTDouble(ItemStack itemStack, String key) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        CompoundTag tag = nmsStack.getTag();
        if (tag != null) {
            return tag.getDouble(key);
        }
        return 0;
    }
    
    @Override
    public ItemStack addNBTBoolean(ItemStack itemStack, String key, boolean value) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        CompoundTag tag = nmsStack.getOrCreateTag();
        tag.putBoolean(key, value);
        return CraftItemStack.asBukkitCopy(nmsStack);
    }
    
    @Override
    public boolean getNBTBoolean(ItemStack itemStack, String key) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        CompoundTag tag = nmsStack.getTag();
        if (tag != null) {
            return tag.getBoolean(key);
        }
        return false;
    }
    
    @Override
    public ItemStack addNBTUuid(ItemStack itemStack, String key, UUID value) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        CompoundTag tag = nmsStack.getOrCreateTag();
        tag.putUUID(key, value);
        return CraftItemStack.asBukkitCopy(nmsStack);
    }
    
    @Override
    public UUID getNBTUuid(ItemStack itemStack, String key) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        CompoundTag tag = nmsStack.getTag();
        if (tag != null) {
            return tag.getUUID(key);
        }
        return null;
    }
    
    @Override
    public ItemStack removeNBTValue(ItemStack itemStack, String key) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        CompoundTag tag = nmsStack.getTag();
        if (tag != null) {
            tag.remove(key);
        }
        return CraftItemStack.asBukkitCopy(nmsStack);
    }
}