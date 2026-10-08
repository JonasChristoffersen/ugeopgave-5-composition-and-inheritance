package Del1;

public class Main {
    public static void main(String[] args) {
        Building building = new Building("Kontorbygningen");

        //Create rooms
        Room room1 = new Room("Mødelokale");
        Room room2 = new Room("Køkken");

        //Create lamps
        Lamp lamp1 = new Lamp(40);
        Lamp lamp2 = new Lamp(60);

        //Create windows
        Window window1 = new Window(120, 90);
        Window window2 = new Window(60, 60);

        room1.addLamp(lamp1);
        room1.addLamp(lamp2);
        room1.addLamp(lamp2);
        room1.addWindow(window1);
        room1.addWindow(window2);

        room2.addLamp(lamp2);
        room2.addLamp(lamp1);
        room2.addWindow(window2);

        building.addRoom(room1);
        building.addRoom(room2);

        building.printBuilding();
    }
}

