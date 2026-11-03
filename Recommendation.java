import java.util.Scanner;

public class Recommendation {

    static String recommendation(int age, String genre) {
        if (age < 18) {
            if (genre.equalsIgnoreCase("fantasy")) {
                return ("Harry Potter");
            } else {
                return ("Coraline");
            }
        } else if (age < 65) {
            if (genre.equalsIgnoreCase("fantasy")) {
                return ("The Odyssey");
            } else {
                return ("The Shining");
            }
        } else {
            if (genre.equalsIgnoreCase("fantasy")) {
                return ("The Wizard of Oz");
            } else {
                return ("Frankenstein");
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String genre = "placeholder";

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + "! What is your age?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Great! Do you like fantasy or horror movies more?");

        while (!genre.equalsIgnoreCase("fantasy") && !genre.equalsIgnoreCase("horror")) {
            genre = scanner.nextLine();
            if (!genre.equalsIgnoreCase("fantasy") && !genre.equalsIgnoreCase("horror")) {
                System.out.println("Try again, you said " + genre);
            }
        }

        System.out.println(
                "Great choice " + name + "! In that case, I would recommend you " + recommendation(age, genre) + "!");
    }
}
