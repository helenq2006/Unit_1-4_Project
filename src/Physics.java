/**
 * The Physics class represents physics. Physics represents the user's name, age,
 * topics and subtopics of physics, the topic chosen by the user, and the secret
 * code the user has to enter
 */
public class Physics {
    private String name; //stores user's name
    private String topicChoice; //stores topic chosen by user
    private int age; //stores user's age
    private double secretCode; //stores secret code
    private int topics; //stores num of topics in course
    private int subTopics; //stores num of subtopics in course
    private int total; //stores total num of topics + subtopics

    private String num; //stores num

    /** Constructor for Physics class. This initializes each variable above. Strings are
     * set to empty Strings, doubles are set to 0.0, ints are set to 0
     */
// initializes variables
    public Physics() {
        name = "";
        topicChoice = "";
        age = 0;
        secretCode = 0.0;
        topics = 0;
        subTopics = 0;
        total = 0;
        num = "fourty";
    }

    public Physics(String name) {
        this.name = name;
        topicChoice = "";
        age = 0;
        secretCode = 0.0;
        topics = 0;
        subTopics = 0;
        total = 0;
        num = "fourty";
    }

    /** Greeting method for the Physics class. This method will return a String welcoming
     * the user based on the name inputted when the program asks for their name
     * @return returns a String in a properly formatted sentence containing the welcome message
     */
// greets user by name; bot gives a bit of info about itself
    public String Greeting() {
            String str = "";
            str += "Hi " + name + ". Welcome to the physBot helper! \nI am here to help you with your questions about physics.";
            return str;
    }

    /** Greeting method for Physics class. This method will return a String containing
     * the secret code, which is the user's age + 24 * length of the String num
     * @param age represents the age of the user
     * @return returns a String in a properly formatted sentence containing the secret code
     */
//asks user for their age and converts it into a secret code
    public String Greeting(int age) {
        String str = "";
        secretCode = (double) (Math.abs(age + 24) * num.length());
        str += "Your secret code is " + secretCode + " . Please enter that to continue.";
        return str;
    }

    /** choiceOfTopics method for Physics class. This method will return normally but
     * does not provide a result value to its caller. The if then statements will run
     * based on the topic chosen by the user.
     * @param topicChoice represents the topic chosen by the user
     */
// if then statement that prints specific information based on user choice
    public void choiceOfTopics(String topicChoice) {
        if (topicChoice.toLowerCase().equals("History")) {
            System.out.println("Physics is a branch of science whose primary topics of study are matter and energy.\n It is divided into classical and modern physics.\n Developed in the 20th century,\n modern physics include quantum mechanics,special relativity, and general relativity.\n Classical physics deals with theories of physics that may not be precise since it is old.");
        } else if (topicChoice.toLowerCase().equals("Regents Phys Topics")) {
            int topics = 5;
            int subTopics = 19;
            int total = topics + subTopics;
            System.out.println("There are a total of" + topics + "topics and " + subTopics + " subtopics in this course. These include: ");
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

    /** toString method for the Physics class. This method will return a String
     * that shows a thank you message for the user using the program
     * @param name represents the name of the user
     * @return returns a properly formatted String containing a thank you
     */
// thanks user with their name
    public String toString(String name) {
        return " \nThank you " + name + " for using this program!";
    }

}
