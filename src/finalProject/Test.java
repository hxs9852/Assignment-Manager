package finalProject;

public class Test extends Assignment{
    //Instance Variable
    private int numOfQuestions;

    //Constructor
    Test(){
        super();
        this.numOfQuestions = 1;
    }
    Test(Date due, String title, String course, int correct, int questions){
        super(0, due, title, course);
        this.numOfQuestions = questions;
        this.setGrade(correct);
    }

    //Setters
    public void setNumOfQuestions(int questions){
        this.numOfQuestions = questions;
    }
    
    public void setGrade(int numberCorrect){
        super.setGrade((double) (numberCorrect / getNumOfQuestions()) * 100);
        System.out.println(this.getGrade());
    }
    
    //Getters
    public int getNumOfQuestions(){
        return this.numOfQuestions;
    }

    //Methods
    

    public String toString() {
        return "[Test]: " + super.toString() + "\n" + "Number of Questions: " + getNumOfQuestions();
    }
}
