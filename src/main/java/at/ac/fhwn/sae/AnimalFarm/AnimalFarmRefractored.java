/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalFarm {

    private static final Scanner in = new Scanner(System.in);
    private static final List<Animal> animals = new ArrayList<>();

    static MainMenuAction showMainMenu() {
        System.out.println("    Animal Farm");
        System.out.println("Was möchten Sie tun?");
        System.out.println(" ");
        System.out.println(String.format("%-5s", "1.") + "Tier hinzufügen");
        System.out.println(String.format("%-5s", "2.") + "Tiere anzeigen");
        System.out.println(String.format("%-5s", "3.") + "Tiere nach Art anzeigen");
        System.out.println(String.format("%-5s", "4.") + "Tier entfernen");
        System.out.println(String.format("%-5s", "5.") + "Programm beenden");

        String enteredNumber = in.nextLine();
        int parsedNumber = Integer.parseInt(enteredNumber);

        return MainMenuAction.values()[parsedNumber-1];
    }

    public static void main(String[] args) {
        MainMenuAction currentaction = showMainMenu();
        while (currentaction != MainMenuAction.EXIT) {
            if (currentaction == MainMenuAction.ADD_ANIMAL) {
                addAnimal();
            }

            if (currentaction == MainMenuAction.SHOW_ALL_ANIMALS) {
                printAnimals(animals);
            }

            if (currentaction == MainMenuAction.SHOW_ANIMAL_KIND) {
                AnimalKind animalKind = askAnimalKind("Welche Tierart wollen Sie anzeigen");
                printAnimals(animals, animalKind);
            }
            if (currentaction == MainMenuAction.DELETE_ANIMAL) {
                deleteAnimal();
            }
            currentaction = showMainMenu();
        }
    }


     * deletes an {@link Animal}

        printAnimals(animalsToDelete);

        System.out.println("Nummder des Tieres das gelöscht werden soll:");
        int numberToDelete = Integer.parseInt(in.nextLine());

        animals.remove(animalsToDelete.get(numberToDelete-1));
    }

    static AnimalKind askAnimalKind(String question){
        System.out.println("             Animal Farm");
        System.out.println(question);
        System.out.println(" ");
        System.out.println(String.format("%-5s", "1.") + "Pferd");
        System.out.println(String.format("%-5s", "2.") + "Kuh");
        System.out.println(String.format("%-5s", "3.") + "Schwein");
        System.out.println(String.format("%-5s", "4.") + "Huhn");
        String enteredNumber2 = in.nextLine();
        return AnimalKind.values()[Integer.parseInt(enteredNumber2)-1];
    }

    private static void addAnimal() {

        AnimalKind animalKind = askAnimalKind("Welche Tierart wollen Sie hinzufügen?");
        askForAnimalName(animalKind);

        String enteredName = in.nextLine();

        Animal animal =new AnimalFactory().getAnimal(animalKind, enteredName);
        animals.add(animal);
    }

    private static void askForAnimalName(AnimalKind animalKind) {
        System.out.println("Bitte geben Sie einen Namen für ihr "+animalKind.name() + " ein: ");
    }

    static void printAnimals(List<Animal> animals){
        System.out.println(String.format("%-3s", "Nr.") + "|" + String.format("%-4s", "ID") + "|" + String.format("%-8s", "Name"));
        System.out.println("__________________");

        int numbering = 0;

        for (Animal animal : animals) {

            numbering++;
            System.out.println(String.format("%-3s", numbering) + "|" + String.format("%-4s", animal.getId()) + "|" + String.format("%-8s", animal.name));

        }
    }

    static void printAnimals(List<Animal> animals, AnimalKind animalKind){
        List<Animal> animalsOfKind = getAnimalKindList(animals, animalKind);
        printAnimals(animalsOfKind);
    }

    private static List<Animal> getAnimalKindList(List<Animal> animals, AnimalKind animalKind) {
//        return animals.stream().filter(animal -> animalKind.getAnimalClass().isInstance(animal)).collect(Collectors.toList());

        List<Animal> animalsOfKind = new ArrayList<>();

        for(Animal animal : animals){
            if(animalKind.getAnimalClass().isInstance(animal)){
                animalsOfKind.add(animal);
            }
        }
        return animalsOfKind;
    }
}
*/