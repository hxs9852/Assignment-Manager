package finalProject;

public class Test extends Assignment{
    //Instance Variable
    private int numOfQuestions;
    private double gradePercent; //overriding this one a tad

    //Constructor
    Test(){
        super();
        this.numOfQuestions = 1;
    }
    Test(Date due, String title, String course, int correct, int questions){
        super(0, due, title, course);
        this.numOfQuestions = questions;
        this.calculateGrade(correct);
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
    public void calculateGrade(int numberCorrect){
        this.gradePercent = (double) (numberCorrect / getNumOfQuestions()) * 100;
    }

    public String toString() {
        return "[Test]: " + super.toString() + "\n" + "Number of Questions: " + getNumOfQuestions();
    }
}
