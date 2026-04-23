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
    	int check = search(newAssignment.getTitle());
        if(check != -1) {
            assignments.remove(check);
        }
        assignments.add(newAssignment);
    }

    public void removeAssignment(Assignment toRemove){
        assignments.remove(toRemove);
    }

    public void sortAssignments(SortType sortType){
        for (int i = 0; i < this.assignments.size()-1; i++) {
        	Assignment item1 = this.assignments.get(i);
        	int chosen = i;
        	for (int j = i+1; j < this.assignments.size(); j++) {
        		boolean goesFirst = false;
        		Assignment item2 = this.assignments.get(j);
        		
        		//sort it based on the chosen sort condition
        		switch (sortType) {
        			case SortType.GRADE_ASCENDING:
        				goesFirst = (item2.getGrade() <= item1.getGrade());
        				break;
        			case SortType.GRADE_DESCENDING:
        				goesFirst = (item2.getGrade() >= item1.getGrade());
        				break;
        			case SortType.DATE_NEWEST:
        				goesFirst = (item2.getDueDate().compareTo(item1.getDueDate()) >= 0);
        				break;
        			default:
        				goesFirst = (item2.getDueDate().compareTo(item1.getDueDate()) <= 0);
        				break;
        		}
        		
        		if (goesFirst) {
        			chosen = j;
        		}
        	}
        	if (chosen != i) {
        		Assignment temp = this.assignments.get(chosen);
        		this.assignments.set(chosen, item1);
        		this.assignments.set(i, temp);
        	}
        }
    }

    public double getAverage(){
    	if (assignments.size() == 0)
    		return 0;
        double average = 0;
        Assignment x;

        for (int i = 0; i < assignments.size(); i++) {
           x = assignments.get(i);
           average += x.getGrade();
        }

        average = average / assignments.size();
        
        //rounding it out so its not ugly
        average = Math.floor(average*100)/100;

        return average;
    }
    
    public ArrayList<Assignment> getAssignments() {
    	return this.assignments;
    }
    
    public int getCount() {
    	return this.assignments.size();    
    }
    
    public int search(String name) {
    	for (int i = 0; i < this.assignments.size(); i++) {
    		if (this.assignments.get(i).getTitle().equals(name))
    			return i;
    	}
    	return -1;
    }
}
