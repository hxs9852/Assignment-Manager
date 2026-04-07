package finalProject;

public class Test extends Assignment{
    //Instance Variable
    private int numOfQuestions;

    //Constructor
    Test(){
        super();
        this.numOfQuestions = 1;
    }
    Test(double grade, Date due, String title, String course, int questions){
        super(grade, due, title, course);
        this.numOfQuestions = questions;
    }

    //Setters
    public void setNumOfQuestions(int questions){
        this.numOfQuestions = questions;
    }
    //Getters
    public int getNumOfQuestions(){
        return this.numOfQuestions;
    }

    //Methods
    public double calculateGrade(int numberCorrect){
        return (double) (numberCorrect / getNumOfQuestions()) * 100;
    }

    public String toString() {
        return "[Test]: " + super.toString() + "\n" + "Number of Questions: " + getNumOfQuestions();
    }
}
