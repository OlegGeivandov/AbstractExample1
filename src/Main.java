import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList <Pet> listPets = new ArrayList<>();

        listPets.add(new Cat("Vaska"));
        listPets.add(new Cat("Murka"));
        listPets.add(new Cat("Пушок"));
        listPets.add(new Dog("Бобик"));


        for (Pet p: listPets) {
            p.say();

        }

        listPets.stream()
                .forEach(pet -> pet.say());






    }
}