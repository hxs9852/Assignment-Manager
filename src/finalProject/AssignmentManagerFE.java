package finalProject;

import javax.swing.*;
import javax.swing.border.*;

public class AssignmentManagerFE {
	private static AssignmentManager backend;
	
	private static JTextField addTitleField, addCourseField, addDayField, addMonthField, addYearField, addGradeField, addGrade2Field;
	private static JTextField manageTitle;
	private static JComboBox<SortType> addType, displaySort;
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
		
		//add course
		JLabel addDateLabel = new JLabel("Due Date:   -  -  ");
		addDateLabel.setBounds(20,80,70,30);
		addPanel.add(addDateLabel);
		
		//i want to replace this with a jcombobox of months and integers and stuff
		
		frame.setVisible(true);
	}
}