package Del2;

public class Animal {
    private String name;
    private int energy;

    public Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void loseEnergy(int amount) {
        energy -= amount;
    }

    public boolean isActive() {
        return energy > 0;
    }

    public int attack() {
        return 10;
    }

/*    @Override
    public String toString() {
        return getName() + " (Energi: " + getEnergy() + ")" ;
    }*/
}
