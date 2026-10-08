package Del1;

import java.util.ArrayList;

public class Building {
    private String name;
    private ArrayList<Room> rooms;

    public Building(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public int getTotalLampCount() {
        int count = 0;
        for (Room room : rooms) {
            count += room.getLampCount();
        }
        return count;
    }

    public int getTotalWatt() {
        int totalWatt = 0;
        for (Room room : rooms) {
            totalWatt += room.getTotalWatt();
        }
        return totalWatt;
    }

    public void printBuilding() {
        System.out.println("--- " + name + " ---");
        for (Room room : rooms) {
            System.out.println();
            room.printRoom();
        }
        System.out.println("\n" + "Total: " + getTotalLampCount() + " lamper, " + getTotalWatt() + "watt");
    }
}
