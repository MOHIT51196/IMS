package com.instisoft.form.views;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.instisoft.utils.GUILookAndFeel;



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
		btnNext.setBackground(GUILookAndFeel.getThemeColor());		
		btnNext.setForeground(Color.WHITE);
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNext.setFocusPainted(false);
		btnNext.addActionListener((event)->{
			((JButton)event.getSource()).setVisible(false);
			btnBack.setVisible(true);
			studentForm1.setVisible(false);
			studentForm2.setVisible(true);
		});
		studentForm1.add(btnNext);
		
		btnReset = new JButton("Reset");
		btnReset.setBackground(GUILookAndFeel.getThemeColor());
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReset.setFocusPainted(false);
		btnReset.setBounds(40, 510, 185, 40);
		studentForm2.add(btnReset);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(GUILookAndFeel.getThemeColor());
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSubmit.setFocusPainted(false);
		btnSubmit.setBounds(277, 510, 185, 40);
		studentForm2.add(btnSubmit);
		
		btnBack = new JButton("Back");
		
		btnBack.setBackground(GUILookAndFeel.getThemeColor());
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBack.setFocusPainted(false);

		btnBack.setBounds(764, 511, 185, 40);
		btnBack.addActionListener((event)->{
			((JButton)event.getSource()).setVisible(false);
			btnNext.setVisible(true);
			studentForm2.setVisible(false);
			studentForm1.setVisible(true);
		});
		
		studentForm2.add(btnBack);
		
		
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setBounds(100, 100, 1400, 1000);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.getContentPane().setLayout(null);
					frame.setBackground(Color.GRAY);
					
					JPanel contentPane = new JPanel();
					contentPane.setBackground(SystemColor.windowBorder);
					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
					contentPane.setLayout(null);
					contentPane.add(new AdmissionFormPanel());
					frame.setContentPane(contentPane);
					
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
