package dev.mark.java_design_patterns.factory;

public class Zone {

    private String displayName;
    private int offset;

    public Zone(String displayName, int offset) {
        this.displayName = displayName;
        this.offset = offset;
    }
    public String getDisplayName() {
        return displayName;
    }
    public int getOffset() {
        return offset;
    }
    
}
