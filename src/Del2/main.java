package Del2;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Lion("Løve", 90));
        animals.add(new Wolf("Ulv", 75));
        animals.add(new Rabbit("Kanin", 60));

        Contest contest = new Contest(animals.get(0), animals.get(1));

        contest.playRound();

        System.out.println();
    }
}
