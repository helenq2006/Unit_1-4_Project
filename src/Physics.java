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

        } else if ((topicChoice.equals("Regents Phys Topics") || (topicChoice.equals("regents phys topics")))) {

        } else if ((topicChoice.equals("Equations") || (topicChoice.equals("equations")))) {

        } else {

        }
    }
}
