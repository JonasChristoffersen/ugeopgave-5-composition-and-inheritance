package Del2;

public class Contest {
    private Animal animal1;
    private Animal animal2;

    public Contest(Animal animal1, Animal animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    //Har problemer med at display ned til de faktisk dør?

    public void playRound() {
        int roundCount = 1;
        while (getWinner() == null) {
            System.out.println("--- Round " + roundCount + " ---");
            animal2.loseEnergy(animal1.attack());
            System.out.println(animal1.getName() + " angriber " + animal2.getName() + " for " + animal1.attack() + " (" + animal2.getName() + " har " + animal2.getEnergy() + " energi tilbage!)");
            animal2.loseEnergy(animal2.attack());
            System.out.println(animal2.getName() + " angriber " + animal1.getName() + " for " + animal2.attack() + " (" + animal1.getName() + " har " + animal1.getEnergy() + " energi tilbage!)");
            roundCount++;
        }
        System.out.println(getWinner().getName() + " is the winner");
    }

    public Animal getWinner() {
        if (!animal1.isActive()) {
            return animal2;
        } else if (!animal2.isActive()) {
            return animal1;
        } else {
            return null;
        }
    }
}
