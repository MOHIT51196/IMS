package com.instisoft.form.views;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;



public class AdmissionFormPanel extends JPanel {

	
	private static final long serialVersionUID = 1L;
	
	private JButton btnNext, btnBack, btnReset, btnSubmit;
	
	private StudentForm1 studentForm1;
	private StudentForm2 studentForm2;
	
	
	public AdmissionFormPanel() {
		
		setSize(970, 569);
		setBackground(null);
		setOpaque(false);
		setLayout(null);
		
		studentForm1 = new StudentForm1();
		studentForm1.setBounds(0, 0, 970, 569);
		add(studentForm1);
		
		studentForm2 = new StudentForm2();
		studentForm2.setVisible(false);
		add(studentForm2);
			
		
		btnNext = new JButton("Next");
		btnNext.setBounds(764, 511, 185, 40);
		btnNext.setBackground(new Color(102, 255, 153));		
		btnNext.setForeground(Color.WHITE);
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNext.setFocusPainted(false);
		
//		APPLYING C.O.B
		btnNext.setContentAreaFilled(false);
		btnNext.setOpaque(true);
		btnNext.setBorderPainted(false);
//		btnNext.setBorder(new RoundedBorder(50));
		btnNext.addActionListener((event)->{
			((JButton)event.getSource()).setVisible(false);
			btnBack.setVisible(true);
			studentForm1.setVisible(false);
			studentForm2.setVisible(true);
		});
		studentForm1.add(btnNext);
		
		btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(102, 255, 153));
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReset.setFocusPainted(false);
		
//		APPLYING C.O.B
		btnReset.setContentAreaFilled(false);
		btnReset.setOpaque(true);
		btnReset.setBorderPainted(false);
//		btnReset.setBorder(new RoundedBorder(50));
		btnReset.setBounds(40, 430, 185, 40);
		studentForm2.add(btnReset);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(new Color(102, 255, 153));
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSubmit.setFocusPainted(false);
		
//		APPLYING C.O.B
		btnSubmit.setContentAreaFilled(false);
		btnSubmit.setOpaque(true);
		btnSubmit.setBorderPainted(false);
//		btnSubmit.setBorder(new RoundedBorder(50));
		btnSubmit.setBounds(277, 430, 185, 40);
		studentForm2.add(btnSubmit);
		
		btnBack = new JButton("Back");
		
		btnBack.setBackground(new Color(102, 255, 153));
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBack.setFocusPainted(false);
		
//		APPLYING C.O.B
		btnBack.setContentAreaFilled(false);
		btnBack.setOpaque(true);
		btnBack.setBorderPainted(false);
//		btnBack.setBorder(new RoundedBorder(50));
		btnBack.setBounds(764, 511, 185, 40);
		btnBack.addActionListener((event)->{
			((JButton)event.getSource()).setVisible(false);
			btnNext.setVisible(true);
			studentForm2.setVisible(false);
			studentForm1.setVisible(true);
		});
		
		studentForm2.add(btnBack);
		
		
	}
	
}
