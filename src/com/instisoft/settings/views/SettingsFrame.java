package com.instisoft.settings.views;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.instisoft.views.DashBoard;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class SettingsFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Email;
	private JTextField textField_ContactNo;
	private JTextField textField_Password;
	private JTextField textField_Font;
	private JTextField textField_Theme;
	private JLabel lblFont;
	private JLabel lblTheme;
	private JLabel lbl2stepLoginAuthentication;
	private JButton btnChangeEmail;
	private JButton btnChangeContact;
	private JButton btnChangePassword;
	private JButton btnChangeFont;
	private JButton btnChangeTheme;
	private ImageIcon toggleOnIcon = new ImageIcon("resources/toggle_button_ON.png");
	private ImageIcon toggleOffIcon =new ImageIcon("resources/toggle_button_OFF.png");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SettingsFrame frame = new SettingsFrame(new DashBoard());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SettingsFrame(JFrame masterFrame) {
		super("Settings");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		getContentPane().setLayout(null);
		setBackground(null);
		setLocationRelativeTo(masterFrame);
		setResizable(false);
		
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color( 18, 30, 49));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(96, 67, 450, 300);
		panel.setVisible(false);
		panel.setLayout(null);
		contentPane.add(panel);
		
		JButton btnSaveChanges = new JButton("Save Changes");
		btnSaveChanges.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSaveChanges.setForeground(new Color( 18, 30, 49));
		btnSaveChanges.setBounds(246, 423, 146, 37);
		contentPane.add(btnSaveChanges);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmail.setForeground(Color.LIGHT_GRAY);
		lblEmail.setBounds(150, 16, 46, 14);
		contentPane.add(lblEmail);
		
		textField_Email = new JTextField();
		textField_Email.setBounds(246, 10, 146, 30);
		textField_Email.setEditable(false);
		contentPane.add(textField_Email);
		textField_Email.setColumns(10);
		
		textField_ContactNo = new JTextField();
		textField_ContactNo.setBounds(246, 51, 146, 30);
		textField_ContactNo.setEditable(false);
		contentPane.add(textField_ContactNo);
		textField_ContactNo.setColumns(10);
		
		textField_Password = new JTextField();
		textField_Password.setBounds(246, 92, 146, 30);
		textField_Password.setEditable(false);
		contentPane.add(textField_Password);
		textField_Password.setColumns(10);
		
		JLabel lblContactNo = new JLabel("Contact No. :");
		lblContactNo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblContactNo.setForeground(Color.LIGHT_GRAY);
		lblContactNo.setBounds(150, 57, 96, 14);
		contentPane.add(lblContactNo);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setForeground(Color.LIGHT_GRAY);
		lblPassword.setBounds(150, 100, 86, 14);
		contentPane.add(lblPassword);
		
		textField_Font = new JTextField();
		textField_Font.setBounds(246, 133, 146, 30);
		textField_Font.setEditable(false);
		contentPane.add(textField_Font);
		textField_Font.setColumns(10);
		
		textField_Theme = new JTextField();
		textField_Theme.setBounds(246, 174, 146, 30);
		textField_Theme.setEditable(false);
		contentPane.add(textField_Theme);
		textField_Theme.setColumns(10);
		
		JButton btnResetDefault = new JButton("Reset Default");
		btnResetDefault.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnResetDefault.setBounds(246, 375, 146, 37);
		btnResetDefault.setForeground(new Color( 18, 30, 49));
		contentPane.add(btnResetDefault);
		
		lblFont = new JLabel("Font :");
		lblFont.setForeground(Color.LIGHT_GRAY);
		lblFont.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFont.setBounds(150, 141, 46, 14);
		contentPane.add(lblFont);
		
		lblTheme = new JLabel("Theme :");
		lblTheme.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTheme.setForeground(Color.LIGHT_GRAY);
		lblTheme.setBounds(150, 182, 86, 14);
		contentPane.add(lblTheme);
		
		lbl2stepLoginAuthentication = new JLabel("        2-Step Login Authentication");
		lbl2stepLoginAuthentication.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl2stepLoginAuthentication.setForeground(Color.LIGHT_GRAY);
		lbl2stepLoginAuthentication.setBounds(150, 283, 242, 19);
		contentPane.add(lbl2stepLoginAuthentication);
		
		btnChangeEmail = new JButton("Change..");
		btnChangeEmail.setBounds(402, 14, 89, 23);
		//btnChangeEmail.setForeground(new Color( 18, 30, 49));
		contentPane.add(btnChangeEmail);
		btnChangeEmail.addActionListener((event)->{
			panel.setVisible(true);
			panel.add(new ChangeEmailPanel());
			//contentPane.add(new ChangeEmailPanel());
		});
		
		btnChangeContact = new JButton("Change..");
		btnChangeContact.setBounds(402, 55, 89, 23);
		//btnChangeContact.setForeground(new Color( 18, 30, 49));
		contentPane.add(btnChangeContact);
		
		
		btnChangePassword = new JButton("Change..");
		btnChangePassword.setBounds(402, 98, 89, 23);
		//btnChangePassword.setForeground(new Color( 18, 30, 49));
		contentPane.add(btnChangePassword);
		
		btnChangeFont = new JButton("Change..");
		btnChangeFont.setBounds(402, 137, 89, 23);
		//btnChangeFont.setForeground(new Color( 18, 30, 49));
		contentPane.add(btnChangeFont);
		
		btnChangeTheme = new JButton("Change..");
		btnChangeTheme.setBounds(402, 178, 89, 23);
		//btnChangeTheme.setForeground(new Color( 18, 30, 49));
		contentPane.add(btnChangeTheme);
		
		JToggleButton toggleButton = new JToggleButton();
		toggleButton.setForeground(Color.WHITE);
		toggleButton.setHorizontalAlignment(SwingConstants.LEADING);
		toggleButton.setBounds(400, 272, 157, 40);
		toggleButton.setFocusable(false);
		toggleButton.setContentAreaFilled(false);
		toggleButton.setOpaque(false);
		toggleButton.setBorderPainted(false);
		toggleButton.setIcon(toggleOnIcon);
		toggleButton.addItemListener((event)->{
			
			if(toggleButton.isSelected()){
				toggleButton.setIcon(toggleOffIcon);
			}
			else{
				toggleButton.setIcon(toggleOnIcon);
			}
		});
		toggleButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		getContentPane().add(toggleButton);
		
		
		
	}
}
