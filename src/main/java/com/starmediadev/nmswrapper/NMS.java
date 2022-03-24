package com.starmediadev.nmswrapper;

public abstract class NMS {
    
    public abstract double[] getRecentTPS();
    public abstract float getAverageTickTime();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public enum Version {
        MC_1_18_R2
    }
    
    public static NMS getNMS(Version version) {
        if (version == Version.MC_1_18_R2) {
            return new NMS_1_18();
        }
        throw new UnsupportedOperationException("That version is unsupported");
    }
}