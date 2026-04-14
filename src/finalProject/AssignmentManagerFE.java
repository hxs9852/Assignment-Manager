package finalProject;

import javax.swing.*;
import javax.swing.border.*;

public class AssignmentManagerFE {
	private static AssignmentManager backend;
	
	private static JTextField addTitleField, addCourseField, addGradeField, addGrade2Field;
	private static JTextField manageTitle;
	
	private static JComboBox<SortType> displaySort;
	private static JComboBox<Month> addMonth;
	private static JComboBox<Integer> addDay, addYear;
	
	private static JTextArea output;
	public static void main(String[] args) {
		JFrame frame = new JFrame("Assignment Manager");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		////ADD PANEL STUFF
		
		JPanel addPanel = new JPanel(null);
		addPanel.setBounds(10, 10, 200, 200);
		addPanel.setBorder(new TitledBorder("Add"));
		frame.add(addPanel);
		
		//add title
		JLabel addTitleLabel = new JLabel("Title:");
		addTitleLabel.setBounds(20,20,50,30);
		addPanel.add(addTitleLabel);
		
		addTitleField = new JTextField();
		addTitleField.setBounds(70,20,120,30);
		addPanel.add(addTitleField);
		
		//add course
		JLabel addCourseLabel = new JLabel("Course:");
		addCourseLabel.setBounds(20,50,50,30);
		addPanel.add(addCourseLabel);
		
		addCourseField = new JTextField();
		addCourseField.setBounds(70,50,120,30);
		addPanel.add(addCourseField);
		
		//add date
		JLabel addDateLabel = new JLabel("Due Date:");
		addDateLabel.setBounds(20,80,70,30);
		addPanel.add(addDateLabel);
		
		addMonth = new JComboBox<Month>(Month.values());
		addMonth.setBounds(80,80,50,30);
		addPanel.add(addMonth);
		
		Integer[] tempDays = new Integer[31];
		for (int i = 0; i < 31; i++) {
			tempDays[i] = i+1;
		}
		
		addDay = new JComboBox<>(tempDays);
		addDay.setBounds(130,80,50,30);
		addPanel.add(addDay);
		
		Integer[] tempYears = new Integer[21];
		for (int i = 0; i < 21; i++) {
			tempYears[i] = 2020+i;
		}
		
		addYear = new JComboBox<>(tempYears);
		addYear.setBounds(80,110,100,30);
		addPanel.add(addYear);
		
		
		
		frame.setVisible(true);
	}
}