package Del2;

public class Wolf extends Animal{
    public Wolf(String name, int energy) {
        super(name, energy);
    }

    @Override
    public int attack() {
        return 15;
    }
}
