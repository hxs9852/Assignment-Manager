package finalProject;
import java.util.ArrayList;

public class AssignmentManager {
    //Instance Variables
    private ArrayList<Assignment> assignments;

    //Constructor
    AssignmentManager(){
        assignments = new ArrayList<>();
    }

    public void addAssignment(Assignment newAssignment){
        assignments.add(newAssignment);
    }

    public void removeAssignment(Assignment toRemove){
        assignments.remove(toRemove);
    }

    public void sortAssignments(){
        assignments.sort(null);
    }

    public double getAverage(){
        double average = 0;
        Assignment x;

        for (int i = 0; i < assignments.size(); i++) {
           x = assignments.get(i);
           average += x.getGrade();
        }

        average = average / assignments.size();

        return average;
    }
}
