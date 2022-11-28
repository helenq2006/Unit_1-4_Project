import java.util.Scanner;
public class Physics {
    private String name;
    private String topicChoice;

    public Physics() {
        name = "";
        topicChoice = "";
    }

    public String Greeting(String name) {
        String str = "";
        str += "Hi " + name + ". Welcome to the physBot helper! \nI am here to help you with your questions about physics. \nPlease enter \"okay\" to continue.";
        return str;
    }

    public void choiceOfTopics(String topicChoice) {
        if ((topicChoice.equals("History") || (topicChoice.equals("history")))) {
            System.out.println("Physics is a branch of science whose primary topics of study are matter and energy.\n It is divided into classical and modern physics.\n Developed in the 20th century,\n modern physics include quantum mechanics,special relativity, and general relativity.\n Classical physics deals with theories of physics that may not be precise since it is old.");
        } else if ((topicChoice.equals("Regents Phys Topics") || (topicChoice.equals("regents phys topics")))) {

        } else if ((topicChoice.equals("Equations") || (topicChoice.equals("equations")))) {

        } else {

        }
    }
}
