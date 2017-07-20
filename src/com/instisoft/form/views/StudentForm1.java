package com.instisoft.form.views;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class StudentForm1 extends JPanel {

	private static final long serialVersionUID = 1L;


	private JTextField textField_username;
	private JTextField textField_password;
	private JTextField textField_1;
	private JTextField textField_3;
	private ImageIcon toggleOnIcon = new ImageIcon("resources/toggle_button_ON.png");
	private ImageIcon toggleOffIcon =new ImageIcon("resources/toggle_button_OFF.png");
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_14;
	private JTextField textField;
	private JTextField textField_15;
	private JTextField textField_13;
	
	public StudentForm1() {
		super();
		this.setSize(970, 569);
		this.setBackground(null);
		this.setOpaque(false);
		this.setLayout(null);
		
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setBounds(27, 11, 67, 23);
		this.add(lblFirstName);
		
		textField_username = new JTextField();
		textField_username.setHorizontalAlignment(SwingConstants.LEFT);
		textField_username.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_username.setColumns(10);
		textField_username.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_username.setBounds(27, 36, 200, 30);
		this.add(textField_username);
		
		
		JLabel lblEmail = new JLabel("Email Id");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblEmail.setBounds(27, 344, 67, 23);
		this.add(lblEmail);
		
		textField_password = new JTextField();
		textField_password.setHorizontalAlignment(SwingConstants.LEFT);
		textField_password.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_password.setColumns(10);
		textField_password.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_password.setBounds(27, 367, 200, 30);
		this.add(textField_password);
		
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_1.setBounds(258, 36, 200, 30);
		this.add(textField_1);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblLastName.setBounds(258, 11, 67, 23);
		this.add(lblLastName);
		
		JLabel lblContactNumber = new JLabel("Primary Contact number");
		lblContactNumber.setForeground(Color.WHITE);
		lblContactNumber.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblContactNumber.setBounds(27, 278, 157, 23);
		this.add(lblContactNumber);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_3.setBounds(27, 303, 200, 30);
		this.add(textField_3);
		
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
		
		JToggleButton tglbtnGender = new JToggleButton("MALE");
		tglbtnGender.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		tglbtnGender.setForeground(new Color(102, 255, 153));
		tglbtnGender.setHorizontalAlignment(SwingConstants.LEADING);
		tglbtnGender.setBounds(315, 93, 157, 40);
		tglbtnGender.setFocusable(false);
		tglbtnGender.setContentAreaFilled(false);
		tglbtnGender.setOpaque(false);
		tglbtnGender.setBorderPainted(false);
		tglbtnGender.setIcon(toggleOnIcon);
		tglbtnGender.addItemListener((event)->{
			
			if(tglbtnGender.isSelected()){
				tglbtnGender.setText("FEMALE");
				tglbtnGender.setIcon(toggleOffIcon);
			}
			else{
				tglbtnGender.setText("MALE");
				tglbtnGender.setIcon(toggleOnIcon);
			}
		});
		tglbtnGender.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.add(tglbtnGender);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblGender.setBounds(247, 103, 58, 23);
		this.add(lblGender);
		
		JLabel lblDob = new JLabel("Date of Birth");
		lblDob.setForeground(Color.WHITE);
		lblDob.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblDob.setBounds(27, 77, 89, 23);
		this.add(lblDob);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_4.setBounds(27, 100, 200, 30);
		this.add(textField_4);
		
		JToggleButton toggleButton = new JToggleButton("OFF");
		
		toggleButton.setHorizontalAlignment(SwingConstants.LEADING);
		toggleButton.setForeground(new Color(102, 255, 153));
		toggleButton.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		toggleButton.setFocusable(false);
		toggleButton.setContentAreaFilled(false);
		toggleButton.setOpaque(false);
		toggleButton.setBorderPainted(false);
		toggleButton.setBounds(719, 32, 126, 35);
		toggleButton.setIcon(toggleOffIcon);
		toggleButton.addItemListener((event)->{
			
			if(toggleButton.isSelected()){
				toggleButton.setText("ON");
				toggleButton.setIcon(toggleOnIcon);
			}
			else{
				toggleButton.setText("OFF");
				toggleButton.setIcon(toggleOffIcon);
			}
		});
		toggleButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.add(toggleButton);
		
		JLabel lblTwoStepAuthentication = new JLabel("Two Step Authentication");
		lblTwoStepAuthentication.setForeground(Color.WHITE);
		lblTwoStepAuthentication.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTwoStepAuthentication.setBounds(1009, 543, 154, 23);
		this.add(lblTwoStepAuthentication);
		
		
		
		JLabel lblFathersName = new JLabel("Father's Name");
		lblFathersName.setForeground(Color.WHITE);
		lblFathersName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblFathersName.setBounds(27, 412, 100, 23);
		this.add(lblFathersName);
		
		JLabel lblFathersContact = new JLabel("Father's Contact number");
		lblFathersContact.setForeground(Color.WHITE);
		lblFathersContact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblFathersContact.setBounds(496, 412, 157, 23);
		this.add(lblFathersContact);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.LEFT);
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_6.setColumns(10);
		textField_6.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_6.setBounds(27, 435, 228, 30);
		this.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.LEFT);
		textField_7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_7.setColumns(10);
		textField_7.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_7.setBounds(496, 435, 200, 30);
		this.add(textField_7);
		
		JLabel lblSecondaryEmailId = new JLabel("Secondary Email Id");
		lblSecondaryEmailId.setForeground(Color.WHITE);
		lblSecondaryEmailId.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSecondaryEmailId.setBounds(247, 344, 126, 23);
		this.add(lblSecondaryEmailId);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.LEFT);
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_8.setColumns(10);
		textField_8.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_8.setBounds(247, 367, 200, 30);
		this.add(textField_8);
		
		JLabel lblSecondaryContactNumber = new JLabel("Secondary Contact number");
		lblSecondaryContactNumber.setForeground(Color.WHITE);
		lblSecondaryContactNumber.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSecondaryContactNumber.setBounds(247, 278, 167, 23);
		this.add(lblSecondaryContactNumber);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.LEFT);
		textField_9.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_9.setColumns(10);
		textField_9.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_9.setBounds(247, 303, 200, 30);
		this.add(textField_9);
		
		JLabel lblMothersName = new JLabel("Mother's Name");
		lblMothersName.setForeground(Color.WHITE);
		lblMothersName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMothersName.setBounds(27, 482, 100, 23);
		this.add(lblMothersName);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.LEFT);
		textField_10.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_10.setColumns(10);
		textField_10.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_10.setBounds(27, 505, 228, 30);
		this.add(textField_10);
		
		JLabel lblMothersContactNumber = new JLabel("Mother's Contact number");
		lblMothersContactNumber.setForeground(Color.WHITE);
		lblMothersContactNumber.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMothersContactNumber.setBounds(496, 482, 157, 23);
		this.add(lblMothersContactNumber);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.LEFT);
		textField_11.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_11.setColumns(10);
		textField_11.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_11.setBounds(496, 505, 200, 30);
		this.add(textField_11);
		
		JLabel lblFathersEmailId = new JLabel("Father's Email id");
		lblFathersEmailId.setForeground(Color.WHITE);
		lblFathersEmailId.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblFathersEmailId.setBounds(272, 412, 109, 23);
		this.add(lblFathersEmailId);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.LEFT);
		textField_12.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_12.setColumns(10);
		textField_12.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_12.setBounds(272, 435, 200, 30);
		this.add(textField_12);
		
		JLabel lblAddress = new JLabel("House Location");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblAddress.setBounds(27, 151, 100, 23);
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
		textArea.setBorder(new EmptyBorder(10, 10, 10, 10));
		textArea.setAlignmentX(TextArea.LEFT_ALIGNMENT);
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
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
		
		JLabel lblMothersEmailId_1 = new JLabel("Mother's Email id");
		lblMothersEmailId_1.setForeground(Color.WHITE);
		lblMothersEmailId_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMothersEmailId_1.setBounds(272, 482, 109, 23);
		this.add(lblMothersEmailId_1);
		
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.LEFT);
		textField_15.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_15.setColumns(10);
		textField_15.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_15.setBounds(272, 505, 200, 30);
		this.add(textField_15);
		
		JLabel lblAutoGeneratedStudent = new JLabel("Auto generated Student Id");
		lblAutoGeneratedStudent.setForeground(Color.WHITE);
		lblAutoGeneratedStudent.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblAutoGeneratedStudent.setBounds(496, 11, 157, 23);
		this.add(lblAutoGeneratedStudent);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setHorizontalAlignment(SwingConstants.LEFT);
		textField_13.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_13.setColumns(10);
		textField_13.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_13.setBounds(495, 36, 200, 30);
		this.add(textField_13);
		
		JLabel lblCustomizeStudentId = new JLabel("Customize Student Id");
		lblCustomizeStudentId.setForeground(Color.WHITE);
		lblCustomizeStudentId.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCustomizeStudentId.setBounds(719, 11, 134, 23);
		this.add(lblCustomizeStudentId);
	}

}
