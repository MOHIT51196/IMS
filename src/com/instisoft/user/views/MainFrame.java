package com.instisoft.user.views;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ResourceBundle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField txtBdbjd;
	private JTextField textField_1;
	private JPasswordField textField_2;
	private JTextField textField;
	
	private final static String TITLE = ResourceBundle.getBundle("config").getString("project_title");

	public MainFrame() {
		super("Welcome to " + TITLE);
		this.setIconImage(new ImageIcon(ResourceBundle.getBundle("config").getString("logo_icon")).getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		this.setSize(650, 500);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.windowBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				try {
					new SignupFrame((JFrame)((JButton)e.getSource()).getTopLevelAncestor());
				} catch (IOException err) {
					err.printStackTrace();
				}
			}
			
		});
		
//		APPLYING C.O.B
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBackground(new Color(102, 255, 153));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(95, 30, 185, 40);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Log In");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				try {
					new LoginFrame((JFrame)((JButton)e.getSource()).getTopLevelAncestor());
				} catch (IOException err) {
					err.printStackTrace();
				}
			}
		});
		button.setContentAreaFilled(false);
		button.setOpaque(true);
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setBackground(new Color(102, 255, 153));
		button.setForeground(Color.WHITE);
		button.setBounds(355, 30, 185, 40);
		contentPane.add(button);
		
		JLabel lblSignUpFor = new JLabel("Sign Up as Guest");
		lblSignUpFor.setForeground(Color.WHITE);
		lblSignUpFor.setFont(new Font("Trebuchet MS", Font.PLAIN, 24));
		lblSignUpFor.setHorizontalAlignment(JLabel.CENTER);
		lblSignUpFor.setVerticalAlignment(JLabel.CENTER);
		lblSignUpFor.setBounds(180, 81, 271, 52);
		contentPane.add(lblSignUpFor);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setBounds(68, 134, 74, 23);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setBounds(340, 134, 74, 23);
		contentPane.add(lblLastName);
		
		JLabel lblEmailAddress = new JLabel("Username");
		lblEmailAddress.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblEmailAddress.setForeground(Color.WHITE);
		lblEmailAddress.setBounds(68, 207, 67, 23);
		contentPane.add(lblEmailAddress);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(68, 280, 74, 23);
		contentPane.add(lblPassword);
		
		txtBdbjd = new JTextField();
		txtBdbjd.setHorizontalAlignment(SwingConstants.LEFT);
		txtBdbjd.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtBdbjd.setBorder(new EmptyBorder(0, 10, 0, 10));
		txtBdbjd.setBounds(68, 154, 240, 30);
		contentPane.add(txtBdbjd);
		txtBdbjd.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_1.setBounds(68, 229, 512, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JPasswordField();
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_2.setBounds(68, 302, 512, 30);
		contentPane.add(textField_2);
		
		JButton button_1 = new JButton("GET STARTED");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		button_1.setForeground(Color.WHITE);
		button_1.setContentAreaFilled(false);
		button_1.setOpaque(true);
		button_1.setFocusPainted(false);
		button_1.setBorderPainted(false);
		button_1.setBackground(new Color(102, 255, 153));
		button_1.setBounds(68, 382, 512, 45);
		button_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(button_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField.setBounds(340, 154, 240, 30);
		contentPane.add(textField);
		
		this.setVisible(true);
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("Alive at console.......");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
