import java.util.Scanner; //imports scanner

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //initializes scanner

        // stores user input as variable name
        System.out.println("What is your name?: ");
        String name = scan.nextLine();

        // calls the greeting for user (welcome message)
        Physics obj = new Physics();
        System.out.println(obj.Greeting(name));

        // stores user input as variable age
        System.out.println("How old are you?");
        int age = scan.nextInt();
        scan.nextLine(); //clears buffer

        // calls the greeting for user (secret code)
        Physics obj1 = new Physics();
        System.out.println(obj1.Greeting(age));

        //stores confirmation as next double entered by user
        double confirm = scan.nextDouble();
        scan.nextLine(); //clears buffer

        // runs if user chooses to proceed with program
        if (confirm == (age + 24)) {
            System.out.println("What would you like to learn about? \n Please choose an option (case sensitive!): \n -History \n -Regents Phys Topics \n -Equations");
            String topicChoice = scan.nextLine();

            Physics obj2 = new Physics();
            obj2.choiceOfTopics(topicChoice);

        // prompts uer to try again; ends program
        } else {
            while (confirm != (age + 24)) {
                System.out.println("That's not the correct code! Please try again if you want to run the bot. \n Otherwise, please have a good day. Hope to see you soon!");
                confirm = scan.nextInt();
            }
        }

        //calls toString
        Physics obj3 = new Physics();
        System.out.println(obj3.toString(name));

        //calls and prints method to find length of user's name
        Physics obj4 = new Physics();
        System.out.println(obj4.lengthOfName(name));
    }
}
