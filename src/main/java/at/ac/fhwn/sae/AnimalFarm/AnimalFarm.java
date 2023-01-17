package at.ac.fhwn.sae.AnimalFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class AnimalFarm {
    public static void main(String[] args) {

        List<Animal> list = new ArrayList<>();
        System.out.println("Herzlich Willkommen bei der AnimalFarm");

        while (true) {
            Scanner Input = new Scanner(System.in);
            System.out.println();
            System.out.println("Was möchten Sie tun?");
            System.out.println("1. Tier hinzufügen\n" + "2. Tiere anzeigen\n" + "3. Tiere nach Art anzeigen\n" + "4. Tier entfernen\n" + "5. Programm beenden");
            int choice = Integer.parseInt(Input.next());

            while(choice !=1 && choice !=2 && choice !=3 && choice !=4 && choice !=5) {
                System.out.println("Falsche Eingabe. Versuchen Sie es erneut: ");
                choice = Integer.parseInt(Input.next());
            }

            if (choice == 1) {
                Scanner animalSelection = new Scanner(System.in);
                System.out.println("Welche Tierart wollen Sie hinzufügen?");
                System.out.println("1. Pferd\n" + "2. Kuh\n" + "3. Schwein\n" + "4. Huhn");
                int animalSelected = Integer.parseInt(animalSelection.next());

                while(animalSelected !=1 && animalSelected !=2 && animalSelected !=3 && animalSelected !=4) {
                    System.out.println("Falsche Eingabe. Versuchen Sie es erneut: ");
                    animalSelected = Integer.parseInt(animalSelection.next());
                }
                Scanner add = new Scanner(System.in);
                Scanner nameSelection = new Scanner(System.in);
                System.out.println("Geben Sie einen Namen für das Tier ein: ");
                String nameSelected = nameSelection.next();
                if (animalSelected == 1) {
                    list.add(new Horse(nameSelected));
                } else if (animalSelected == 2) {
                    list.add(new Cow(nameSelected));
                } else if (animalSelected == 3) {
                    list.add(new Pig(nameSelected));
                } else if (animalSelected == 4) {
                    list.add(new Chicken(nameSelected));
                }
// ------------------------------------------------------
            }else if (choice == 2) {
                animalList(list);
//-------------------------------------------------------
            }else if (choice == 3) {
                Scanner showAnimal = new Scanner(System.in);
                System.out.println("Welche Tierart wollen Sie sich anzeigen lassen?");
                System.out.println("1. Pferd\n" + "2. Kuh\n" + "3. Schwein\n" + "4. Huhn");
                int showAnimalType = Integer.parseInt(showAnimal.next());
                int i = 0;
                System.out.println(String.format("%-3s %-6s %-8s ", "Nr.", "| Id", "| Name"));
                System.out.println("-------------------");
                List<Animal> newList = new ArrayList<>();
                for (Animal animal : list) {
                    if (showAnimalType == 1 && animal instanceof Horse) {
                        System.out.println(String.format("%-3s %-6s %-8s ", i + 1, "| " + animal.getID(), "| " + animal.name));
                        i += 1;
                        newList.add(animal);
                    } else if (showAnimalType == 2 && animal instanceof Cow) {
                        System.out.println(String.format("%-3s %-6s %-8s ", i + 1, "| " + animal.getID(), "| " + animal.name));
                        i += 1;
                        newList.add(animal);
                    } else if (showAnimalType == 3 && animal instanceof Pig) {
                        System.out.println(String.format("%-3s %-6s %-8s ", i + 1, "| " + animal.getID(), "| " + animal.name));
                        i += 1;
                        newList.add(animal);
                    } else if (showAnimalType == 4 && animal instanceof Chicken) {
                        System.out.println(String.format("%-3s %-6s %-8s ", i + 1, "| " + animal.getID(), "| " + animal.name));
                        i += 1;
                        newList.add(animal);
                    }
                }
                if(newList.size() == 0){
                    System.out.println("Im Tierbestand befindet sich kein Tier dieser Tierart");
                }
//-------------------------------------------------------
            }else if (choice == 4) {
                animalList(list);
                System.out.println("Nummer des Tieres das gelöscht werden soll: ");
                Scanner deleteAnimal = new Scanner(System.in);
                int removeAnimal = Integer.parseInt(deleteAnimal.next());
                list.remove(removeAnimal-1);

                System.out.println("Hier die aktuelle Tierliste:");
                animalList(list);
//-------------------------------------------------------
            }else if (choice == 5) {
                System.exit(0);
            }
        }}

    private static void animalList(List<Animal> list) {
        System.out.println(String.format("%-3s %-6s %-8s ", "Nr.", "| Id", "| Name"));
        System.out.println("-------------------");
        for (int i = 0; i < list.size(); i++)
            System.out.println(String.format("%-3s %-6s %-8s ", i + 1, "| " + list.get(i).getID(), "| " + list.get(i).name));
    }
}
