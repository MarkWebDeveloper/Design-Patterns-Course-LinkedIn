package dev.mark.java_design_patterns.factory;

public class CalendarTest {
    public static void main(String[] args) {
        Zone zone = ZoneFactory.createZone("US/Eastern");
        Calendar calendar = new Calendar(zone);
        calendar.print();
    }
}
