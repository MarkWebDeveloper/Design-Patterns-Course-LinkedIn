package dev.mark.java_design_patterns.factory;

public class ZoneFactory {
    
    public static Zone createZone(String zoneId) {
        if (zoneId.equals("US/Eastern")) {
            return new ZoneUsEastern();
        } else if (zoneId.equals("US/Central")) {
            return new ZoneUsCentral();
        } else if (zoneId.equals("US/Mountain")) {
            return new ZoneUsMountain();
        } else if (zoneId.equals("US/Pacific")) {
            return new ZoneUsPacific();
        } else {
            return null;
        }
    }
}
