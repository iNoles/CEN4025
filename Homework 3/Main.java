import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) {
		int options;

		Scanner scanner = new Scanner(System.in);

		do {
		    // Display menu graphics
		    System.out.println("Enter one of the following commands: ");
		    System.out.println("1 - Animals");
		    System.out.println("2 - Habits");
		    System.out.println("3 - Exit");
		    options = scanner.nextInt();

		    switch (options) {
		    	case 1:
		    	    setAnimals();
		    	    break;
		    	case 2:
		    	   setHabits();
                   break;
                case 3:
                    break;
                default:
                    System.out.println("Choice must be a value between 1 and 3.");
            }   
		}
		while (options != 3);
	}

	private static void setAnimals() {
		Scanner animalScanner = new Scanner(System.in);
		Animals animal = new Animals();
		System.out.println("Which type of Animals?");
		animal.setType(animalScanner.next());
		System.out.println("Which is Animal name?");
		animal.setName(animalScanner.next());

		try(PrintStream ps = new PrintStream(new FileOutputStream("animal.txt", true))) {
			ps.println("Name: " + animal.getName());
			ps.println("Type: " + animal.getType());
			ps.println();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		System.out.println();

		animal.display();
	}

	private static void setHabits() {
		Scanner habitScanner = new Scanner(System.in);
		Habits habit = new Habits();
		System.out.println("Which type of Habits?");
		habit.setType(habitScanner.next());
		System.out.println("Which is Habits name?");
		habit.setName(habitScanner.next());

		try(PrintStream ps = new PrintStream(new FileOutputStream("habit.txt", true))) {
			ps.println("Name: " + habit.getName());
			ps.println("Type: " + habit.getType());
			ps.println();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		System.out.println();

		habit.display();
	}
}
