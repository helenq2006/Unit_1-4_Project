import java.util.Scanner;
public class Physics {
    private String name;
    private String topicChoice;
    private int age;
    private int secretCode;
    private int topics;
    private int subTopics;
    private int total;

    public Physics() {
        name = "";
        topicChoice = "";
        age = 0;
        secretCode = 0;
        topics = 0;
        subTopics = 0;
        total = 0;
    }


    public String Greeting(String name) {
            String str = "";
            str += "Hi " + name + ". Welcome to the physBot helper! \nI am here to help you with your questions about physics.";
            return str;
    }

    public String Greeting(int age) {
        String str = "";
        secretCode = Math.abs(age + 24);
        str += "Your secret code is " + secretCode + " . Please enter that to continue.";
        return str;
    }

    public void choiceOfTopics(String topicChoice) {
        if ((topicChoice.equals("History") || (topicChoice.equals("history")))) {
            System.out.println("Physics is a branch of science whose primary topics of study are matter and energy.\n It is divided into classical and modern physics.\n Developed in the 20th century,\n modern physics include quantum mechanics,special relativity, and general relativity.\n Classical physics deals with theories of physics that may not be precise since it is old.");
        } else if ((topicChoice.equals("Regents Phys Topics") || (topicChoice.equals("regents phys topics")))) {
            int topics = 5;
            int subTopics = 19;
            int total = topics + subTopics;
            //public String toString() {
            //    System.out.println("There are a total of" + topics + "topics and " + subTopics + " subtopics in this course. These include: ");
            //}

            System.out.println();
            System.out.println("Mechanics \n -Kinematics \n -Statics \n -Dynamics \n -Momentum");
            System.out.println();
            System.out.println("Energy \n -Work \n -Power \n -Energy");
            System.out.println();
            System.out.println("Electricity and Magnetism \n -Static Electricity \n -Electric Current \n -Magnetism \n -Electromagnetic Induction");
            System.out.println();
            System.out.println("Waves \n -Wave Characteristics \n -Periodic Wave Phenomenon \n -Light");
            System.out.println();
            System.out.println("Modern Physics \n -Dual Nature of Light \n -Quantum Theory \n -Models of the Atom \n -Standard Model of Particle Physics");
        } else {
            System.out.println("Most of the equations needed to solve regents physics problems are found on the reference table. \n Here are three example equations:");
            System.out.println("f = ma \n force is equal to mass times acceleration");
            System.out.println("vf = vi + at \n final velocity is equal to initial velocity added to acceleration multiplied by time");
            System.out.println("p = mv \n power is equal to mass times velocity");
        }
    }
}
