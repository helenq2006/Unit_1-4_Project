import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?: ");
        String name = scan.nextLine();

        Physics obj = new Physics();
        System.out.println(obj.Greeting(name));

        System.out.println("How old are you?");
        int age = scan.nextInt();
        scan.nextLine(); //clears buffer

        Physics obj1 = new Physics();
        System.out.println(obj1.Greeting(age));

        double confirm = scan.nextDouble();
        scan.nextLine(); //clears buffer

        if (confirm == (age + 24)) {
            System.out.println("What would you like to learn about? \n Please choose an option: \n -History \n -Regents Phys Topics \n -Equations");
            String topicChoice = scan.nextLine();

            Physics obj2 = new Physics();
            obj2.choiceOfTopics(topicChoice);

        } else {
            while (confirm != (age + 24)) {
                System.out.println("That's not the correct code! Please try again if you want to run the bot. Otherwise, please have a good day. Hope to see you soon!");
                confirm = scan.nextInt();
            }
        }
    }
}
