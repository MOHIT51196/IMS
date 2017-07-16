package com.instisoft.form.views;
import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.instisoft.user.views.MainFrame;



public class AdmissionFormFrame extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnNext, btnBack, btnReset, btnSubmit;
	private StudentForm1 studentForm1;
	private StudentForm2 studentForm2;
	
	private final static String TITLE = ResourceBundle.getBundle("config").getString("project_title");
	private JLabel lblStudentsAdmissionForm;
	

	
	public AdmissionFormFrame(JFrame callingFrame) throws IOException {
		
		super(TITLE + " Admission Form");
		this.setIconImage(new ImageIcon(ResourceBundle.getBundle("config").getString("logo_icon")).getImage());
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(1200, 700);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.windowBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				callingFrame.setVisible(true);
			}
		});
		
		
		JPanel sidePanel = new JPanel();
		sidePanel.setBounds(0, 0, 224, 671);
		sidePanel.setBackground(new Color(102, 255, 153));
		contentPane.add(sidePanel);
		
		
		JPanel formPanel = new JPanel();
		formPanel.setBounds(223, 102, 970, 569);
		formPanel.setBackground(null);
		formPanel.setOpaque(false);
		formPanel.setLayout(null);
		
		studentForm1 = new StudentForm1();
		studentForm1.setBounds(0, 0, 970, 569);
		formPanel.add(studentForm1);
		
		studentForm2 = new StudentForm2();
		studentForm2.setVisible(false);
		formPanel.add(studentForm2);
			
		
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
		
		contentPane.add(formPanel);
		
		
		
		JLabel lblInstisoft = new JLabel("instiSoft");
		lblInstisoft.setBackground(SystemColor.windowBorder);
		lblInstisoft.setOpaque(true);
		lblInstisoft.setForeground(Color.WHITE);
		lblInstisoft.setHorizontalAlignment(JLabel.CENTER);
		lblInstisoft.setVerticalAlignment(JLabel.CENTER);
		lblInstisoft.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 28));
		lblInstisoft.setBounds(1030, 11, 154, 34);
		contentPane.add(lblInstisoft);
		
		
		lblStudentsAdmissionForm = new JLabel("Student's Admission Form");
		lblStudentsAdmissionForm.setVerticalAlignment(SwingConstants.CENTER);
		lblStudentsAdmissionForm.setBackground(null);
		lblStudentsAdmissionForm.setForeground(Color.WHITE);
		lblStudentsAdmissionForm.setFont(new Font("Times New Roman", Font.BOLD, 42));
		lblStudentsAdmissionForm.setOpaque(false);
		lblStudentsAdmissionForm.setBounds(247, 25, 492, 66);
		contentPane.add(lblStudentsAdmissionForm);
		
		
//		to be in the end @OverlappingCompenent
		BufferedImage logoImage = ImageIO.read(this.getClass().getResource("logo.png")).getSubimage(0, 0, 426, 530);
		JLabel lblLogo = new JLabel(new ImageIcon(logoImage));
		lblLogo.setBounds(339, 0, 758, 613);
		contentPane.add(lblLogo);
		
        
		this.setVisible(true);
	}
	
	
	/**
	 * Launch the application.
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame callingFrame = new MainFrame();
					callingFrame.setVisible(false);
					AdmissionFormFrame frame = new AdmissionFormFrame(callingFrame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
