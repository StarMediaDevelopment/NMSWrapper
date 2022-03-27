package com.starmediadev.nmswrapper;

import org.bukkit.inventory.ItemStack;

public abstract class NMS {
    
    public abstract double[] getRecentTPS();
    public abstract float getAverageTickTime();
    public abstract ItemStack addNBTString(ItemStack itemStack, String key, String value);
    public abstract String getNBTString(ItemStack itemStack, String key);

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