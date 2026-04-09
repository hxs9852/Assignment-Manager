package finalProject

import javax.swing.*;

public class AssignmentManagerFE {
	private static AssignmentManager backend;
	
	private static JTextField addTitle, addCourse, addDay, addMonth, addYear, addGrade, addGrade2;
	private static JTextField manageTitle;
	private static JComboBox addType, displaySort;
	private static JTextArea output;
	public static void main(String[] args) {
		JFrame frame = new JFrame("Assignment Manager");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JPanel addPanel = new JPanel(null);
		addPanel.setBounds(10, 10, 100, 100);
		addPanel.setBorder(new TitledBorder("Add"));
		frame.add(addPanel);
		
		frame.setVisible(true);
	}
}