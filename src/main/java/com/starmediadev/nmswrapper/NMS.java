package com.starmediadev.nmswrapper;

import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public abstract class NMS {
    
    public abstract double[] getRecentTPS();
    public abstract float getAverageTickTime();
    public abstract ItemStack removeNBTValue(ItemStack itemStack, String key);
    public abstract ItemStack addNBTString(ItemStack itemStack, String key, String value);
    public abstract String getNBTString(ItemStack itemStack, String key);
    public abstract ItemStack addNBTByte(ItemStack itemStack, String key, byte value);
    public abstract byte getNBTByte(ItemStack itemStack, String key);
    public abstract ItemStack addNBTShort(ItemStack itemStack, String key, short value);
    public abstract short getNBTShort(ItemStack itemStack, String key);
    public abstract ItemStack addNBTFloat(ItemStack itemStack, String key, float value);
    public abstract float getNBTFloat(ItemStack itemStack, String key);
    public abstract ItemStack addNBTInt(ItemStack itemStack, String key, int value);
    public abstract int getNBTInt(ItemStack itemStack, String key);
    public abstract ItemStack addNBTLong(ItemStack itemStack, String key, long value);
    public abstract long getNBTLong(ItemStack itemStack, String key);
    public abstract ItemStack addNBTDouble(ItemStack itemStack, String key, double value);
    public abstract double getNBTDouble(ItemStack itemStack, String key);
    public abstract ItemStack addNBTBoolean(ItemStack itemStack, String key, boolean value);
    public abstract boolean getNBTBoolean(ItemStack itemStack, String key);
    public abstract ItemStack addNBTUuid(ItemStack itemStack, String key, UUID value);
    public abstract UUID getNBTUuid(ItemStack itemStack, String key);

    public enum Version {
        MC_1_18_R2
    }
    
    public static NMS getNMS(Version version) {
        if (version == Version.MC_1_18_R2) {
            return new NMS_1_18_R2();
        }
        throw new UnsupportedOperationException("That version is unsupported");
    }
}