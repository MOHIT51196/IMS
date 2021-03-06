package com.instisoft.form.views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FacultyForm2 extends JPanel {

	private static final long serialVersionUID = 1L;


	private JTextField textField_username;
	private JTextField textField_1;
//	private ImageIcon addIcon = new ImageIcon("resources/icon_add.png");
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_14;
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_Salary;
	private JComboBox<String> comboPaymentStatus;
	
	
	
	public FacultyForm2() {
		this.setSize(970, 569);
		this.setBackground(null);
		this.setOpaque(false);
		this.setLayout(null);
		
		
		JLabel lblFirstName = new JLabel("Institution Name");
		lblFirstName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setBounds(27, 11, 100, 23);
		this.add(lblFirstName);
		
		textField_username = new JTextField();
		textField_username.setHorizontalAlignment(SwingConstants.LEFT);
		textField_username.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_username.setColumns(10);
		textField_username.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_username.setBounds(27, 36, 200, 30);
		this.add(textField_username);
		
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_1.setBounds(256, 36, 200, 30);
		this.add(textField_1);
		
		JLabel lblLastName = new JLabel("Program / Subject");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblLastName.setBounds(256, 11, 119, 23);
		this.add(lblLastName);
		
		JCheckBox checkBox = new JCheckBox("Use as username");
		checkBox.setOpaque(false);
		checkBox.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox.setForeground(Color.WHITE);
		checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		checkBox.setContentAreaFilled(false);
		checkBox.setBorderPainted(false);
		checkBox.setFocusable(false);
		checkBox.setBounds(1025, 581, 138, 30);
		this.add(checkBox);
		
		JLabel lblTwoStepAuthentication = new JLabel("Two Step Authentication");
		lblTwoStepAuthentication.setForeground(Color.WHITE);
		lblTwoStepAuthentication.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTwoStepAuthentication.setBounds(1009, 543, 154, 23);
		this.add(lblTwoStepAuthentication);
		
		JLabel lblAddress = new JLabel("Institution Location");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblAddress.setBounds(27, 151, 109, 23);
		this.add(lblAddress);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setForeground(Color.WHITE);
		lblCity.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCity.setBounds(335, 145, 43, 23);
		this.add(lblCity);
		
		JLabel lblState = new JLabel("State");
		lblState.setForeground(Color.WHITE);
		lblState.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblState.setBounds(530, 145, 43, 23);
		this.add(lblState);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setForeground(Color.WHITE);
		lblCountry.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCountry.setBounds(530, 212, 67, 23);
		this.add(lblCountry);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_2.setBounds(335, 171, 167, 30);
		this.add(textField_2);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.LEFT);
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_5.setBounds(335, 235, 167, 30);
		this.add(textField_5);
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.LEFT);
		textField_14.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_14.setColumns(10);
		textField_14.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_14.setBounds(529, 235, 167, 30);
		this.add(textField_14);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(27, 174, 286, 93);
		this.add(textArea);
		
		JLabel lblPincode = new JLabel("PinCode");
		lblPincode.setForeground(Color.WHITE);
		lblPincode.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPincode.setBounds(335, 212, 58, 23);
		this.add(lblPincode);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField.setBounds(529, 171, 167, 30);
		this.add(textField);
		
		JLabel lblAutoGeneratedStudent = new JLabel("Branch / Stream ( if any )");
		lblAutoGeneratedStudent.setForeground(Color.WHITE);
		lblAutoGeneratedStudent.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblAutoGeneratedStudent.setBounds(496, 11, 176, 23);
		this.add(lblAutoGeneratedStudent);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_4.setBounds(496, 36, 200, 30);
		add(textField_4);
		
		JLabel lblStartYear = new JLabel("Pass Year");
		lblStartYear.setForeground(Color.WHITE);
		lblStartYear.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblStartYear.setBounds(27, 79, 73, 23);
		add(lblStartYear);
		
		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.LEFT);
		textField_16.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_16.setColumns(10);
		textField_16.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_16.setBounds(27, 102, 200, 30);
		add(textField_16);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setForeground(Color.WHITE);
		lblStatus.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblStatus.setBounds(272, 77, 49, 23);
		add(lblStatus);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.LEFT);
		textField_17.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_17.setColumns(10);
		textField_17.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_17.setBounds(272, 102, 200, 30);
		add(textField_17);
		
		
		JLabel lblPaymentStatus = new JLabel("Set Faculty Status");
		lblPaymentStatus.setForeground(Color.WHITE);
		lblPaymentStatus.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPaymentStatus.setBounds(27, 328, 145, 23);
		add(lblPaymentStatus);
		
		comboPaymentStatus = new JComboBox<>(new String[]{"Permanent","Temporary","Training"});
		comboPaymentStatus.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboPaymentStatus.setBorder(new EmptyBorder(0, 10, 0, 10));
		comboPaymentStatus.setBounds(27, 352, 200, 30);
		add(comboPaymentStatus);
		
		JLabel lblMothersName = new JLabel("Monthly Salary");
		lblMothersName.setForeground(Color.WHITE);
		lblMothersName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMothersName.setBounds(335, 328, 100, 23);
		this.add(lblMothersName);
		
		textField_Salary = new JTextField();
		textField_Salary.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Salary.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Salary.setColumns(10);
		textField_Salary.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Salary.setBounds(335, 352, 228, 30);
		this.add(textField_Salary);
		
	}
}
