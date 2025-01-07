package dev.mark.java_design_patterns.factory;

public class Calendar {
    private Zone zone;

    public Calendar(Zone zone) {
        this.zone = zone;
    }

    public void print() {
        System.out.println("Calendar: " + zone.getDisplayName() + " offset: " + zone.getOffset());
    }

    public Calendar createCalendar(String zoneId) {
        zone = ZoneFactory.createZone(zoneId);
        return new Calendar(zone);
    }

    public Zone getZone() {
        return zone;
    }
}
