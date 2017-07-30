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

public class FacultyFormPanel extends JPanel {


	private static final long serialVersionUID = 1L;
	
	private JButton btnNext, btnBack, btnReset, btnSubmit;
	
	private FacultyForm1 facultyForm1;
	private FacultyForm2 facultyForm2;
	
	
	public FacultyFormPanel() {
		
		setSize(970, 569);
		setBackground(null);
		setOpaque(false);
		setLayout(null);
		
		facultyForm1 = new FacultyForm1();
		facultyForm1.setBounds(0, 0, 970, 569);
		add(facultyForm1);
		
		facultyForm2 = new FacultyForm2();
		facultyForm2.setVisible(false);
		add(facultyForm2);
			
		
		btnNext = new JButton("Next");
		btnNext.setBounds(764, 511, 185, 40);
		btnNext.setBackground(GUILookAndFeel.getThemeColor());		
		btnNext.setForeground(Color.WHITE);
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNext.setFocusPainted(false);
		btnNext.addActionListener((event)->{
			((JButton)event.getSource()).setVisible(false);
			btnBack.setVisible(true);
			facultyForm1.setVisible(false);
			facultyForm2.setVisible(true);
		});
		facultyForm1.add(btnNext);
		
		btnReset = new JButton("Reset");
		btnReset.setBackground(GUILookAndFeel.getThemeColor());
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReset.setFocusPainted(false);
		btnReset.setBounds(40, 510, 185, 40);
		facultyForm2.add(btnReset);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(GUILookAndFeel.getThemeColor());
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSubmit.setFocusPainted(false);
		btnSubmit.setBounds(277, 510, 185, 40);
		facultyForm2.add(btnSubmit);
		
		btnBack = new JButton("Back");
		
		btnBack.setBackground(GUILookAndFeel.getThemeColor());
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBack.setFocusPainted(false);

		btnBack.setBounds(764, 511, 185, 40);
		btnBack.addActionListener((event)->{
			((JButton)event.getSource()).setVisible(false);
			btnNext.setVisible(true);
			facultyForm2.setVisible(false);
			facultyForm1.setVisible(true);
		});
		
		facultyForm2.add(btnBack);
		
		
		
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
					contentPane.add(new FacultyFormPanel());
					frame.setContentPane(contentPane);
					
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
