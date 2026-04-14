package finalProject;

import javax.swing.*;
import javax.swing.border.*;

public class AssignmentManagerFE {
	private static AssignmentManager backend;
	
	//this one just needs to be a member
	//so that it can be set to visible
	private static JLabel addGrade2Label; 
	
	private static JTextField addTitleField, addCourseField, addGradeField, addGrade2Field;
	private static JTextField removeTitleField;
	
	private static JComboBox<SortType> displaySort;
	private static JComboBox<String> addType;
	private static JComboBox<Month> addMonth;
	private static JComboBox<Integer> addDay, addYear;
	
	private static JTextArea output;
	public static void main(String[] args) {
		JFrame frame = new JFrame("Assignment Manager");
		frame.setSize(480,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		////ADD PANEL STUFF
		
		JPanel addPanel = new JPanel(null);
		addPanel.setBounds(10, 10, 200, 270);
		addPanel.setBorder(new TitledBorder("Add"));
		frame.add(addPanel);
		
		//add title
		JLabel addTitleLabel = new JLabel("Title:");
		addTitleLabel.setBounds(20,60,50,30);
		addPanel.add(addTitleLabel);
		
		addTitleField = new JTextField();
		addTitleField.setBounds(70,60,120,30);
		addPanel.add(addTitleField);
		
		//add course
		JLabel addCourseLabel = new JLabel("Course:");
		addCourseLabel.setBounds(20,90,50,30);
		addPanel.add(addCourseLabel);
		
		addCourseField = new JTextField();
		addCourseField.setBounds(70,90,120,30);
		addPanel.add(addCourseField);
		
		//add date
		JLabel addDateLabel = new JLabel("Due Date:");
		addDateLabel.setBounds(20,120,70,30);
		addPanel.add(addDateLabel);
		
		addMonth = new JComboBox<Month>(Month.values());
		addMonth.setBounds(80,120,50,30);
		addPanel.add(addMonth);
		
		Integer[] tempDays = new Integer[31];
		for (int i = 0; i < 31; i++) {
			tempDays[i] = i+1;
		}
		
		addDay = new JComboBox<>(tempDays);
		addDay.setBounds(130,120,50,30);
		addPanel.add(addDay);
		
		Integer[] tempYears = new Integer[21];
		for (int i = 0; i < 21; i++) {
			tempYears[i] = 2020+i;
		}
		
		addYear = new JComboBox<>(tempYears);
		addYear.setBounds(80,150,100,30);
		addPanel.add(addYear);
		
		//add type (assignment or test
		
		String[] tempType = {"Assignment", "Quiz"};
		addType = new JComboBox<>(tempType);
		addType.setBounds(50,20,100,30);
		addPanel.add(addType);
		
		//add grade
		
		JLabel addGradeLabel = new JLabel("Grade:");
		addGradeLabel.setBounds(20,190, 50, 30);
		addPanel.add(addGradeLabel);
		
		addGradeField = new JTextField();
		addGradeField.setBounds(70, 190, 50, 30);
		addPanel.add(addGradeField);
		
		//da button
		JButton addButton = new JButton("Add/Update");
		addButton.setBounds(50, 230, 100, 30);
		addPanel.add(addButton);
		
		//these two components below are only visible when adding a quiz
		addGrade2Label = new JLabel("/");
		addGrade2Label.setBounds(125,190,20, 30);
		addGrade2Label.setVisible(false);
		addPanel.add(addGrade2Label);
		
		addGrade2Field = new JTextField();
		addGrade2Field.setBounds(140, 190, 50, 30);
		addGrade2Field.setVisible(false);
		addPanel.add(addGrade2Field);
		
		////MANAGE PANEL STUFF
			
		JPanel removePanel = new JPanel(null);
		removePanel.setBounds(250, 10, 200, 100);
		removePanel.setBorder(new TitledBorder("Remove"));
		frame.add(removePanel);
		
		//manage title
		JLabel removeTitleLabel = new JLabel("Title:");
		removeTitleLabel.setBounds(20,20,50,30);
		removePanel.add(removeTitleLabel);
		
		removeTitleField = new JTextField();
		removeTitleField.setBounds(70,20,120,30);
		removePanel.add(removeTitleField);	
		
		//manage remove
		JButton removeButton = new JButton("Remove");
		removeButton.setBounds(50, 60, 100, 30);
		removePanel.add(removeButton);
		
		////MANAGE PANEL STUFF
	
		JPanel sortPanel = new JPanel(null);
		sortPanel.setBounds(250, 120, 200, 100);
		sortPanel.setBorder(new TitledBorder("Manage"));
		frame.add(sortPanel);
		
		//sort type 
		displaySort = new JComboBox<SortType>(SortType.values());
		displaySort.setBounds(20,20,160, 30);
		sortPanel.add(displaySort);
		
		//da button
		JButton sortButton = new JButton("Sort");
		sortButton.setBounds(50, 60, 100, 30);
		sortPanel.add(sortButton);
		
		////ACTUAL BIG DISPLAY AREA
		output = new JTextArea();
		output.setBounds(10, 290, 440, 200);
		frame.add(output);
		
		
		
		
		frame.setVisible(true);
		
		//function/button stuff
		addType.addActionListener(e -> updateType());
	}
	
	private static void updateType() {
		if (addType.getSelectedItem().equals("Assignment")) {
			addGrade2Field.setVisible(false);
			addGrade2Label.setVisible(false);
		} else {
			addGrade2Field.setVisible(true);
			addGrade2Label.setVisible(true);
		}
	}
}