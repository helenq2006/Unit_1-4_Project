import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?: ");
        String name = scan.nextLine();

        Physics obj = new Physics();
        System.out.println(obj.Greeting(name));

        String confirm = scan.nextLine();
        if (confirm.equals("okay")) {
            System.out.println("What would you like to learn about? \n Please choose an option: \n History \n Regents Phys Topics \n Equations \n Random!");
            String topicChoice = scan.nextLine();
            System.out.println();




        } else {
            while (!confirm.equals("okay")) {
                System.out.println("That's okay! Have a good day. See you next time!");
                confirm = scan.nextLine();
            }
        }
    }
}
