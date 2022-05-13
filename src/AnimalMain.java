import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Animal> animal = new ArrayList<Animal>();
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");
        while (true) {
            System.out.print("Please enter a name: ");
            String name = in.nextLine();
            if (name.isBlank())
                break;
            System.out.print("Is it a dog? yes or no: ");
            boolean isADog;
            while (true) {
                String isItADog = in.nextLine();
                if (!isItADog.equalsIgnoreCase("yes") && 
                    !isItADog.equalsIgnoreCase("no")) {
                    System.out.print("invalid input, Please only enter yes or no: ");
                } else {
                    if (isItADog.equalsIgnoreCase("yes")) {
                        isADog = true;
                    } else {
                        isADog = false;
                    }
                    break;
                }
            }
            Animal input = new Animal(name, isADog);
            animal.add(input);
        }
        for (int i = 0; i < animal.size(); i++) {
            System.out.println(animal.get(i).toString());
        }
        in.close();
    }
}