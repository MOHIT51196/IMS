package com.instisoft.user.views;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.instisoft.user.dto.UserDTO;
import com.instisoft.user.helper.UserHelper;
import com.instisoft.views.DashBoard;



public class SignupFrame extends JFrame {


	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private BufferedImage loginImage;
	private JTextField txtField_firstName;
	private JTextField txtField_email;
	private JTextField txtField_username;
	private JTextField txtField_lastName;
	private JPasswordField txtField_password;
	private JTextField txtField_contact;
	private JTextField txtField_dob;
	private JPasswordField txtField_repassword;
	private JToggleButton tglbtnAuth,tglbtnGender;
	
	private ImageIcon toggleOnIcon = new ImageIcon("resources/toggle_button_ON.png");
	private ImageIcon toggleOffIcon =new ImageIcon("resources/toggle_button_OFF.png");
	private final static String TITLE = ResourceBundle.getBundle("config").getString("project_title");
	
	private UserDTO userDTO;
	private UserHelper userHelper;

	public SignupFrame(JFrame callingFrame) throws IOException {
		
		super(TITLE + " Admin SignUp");
		this.setIconImage(new ImageIcon(ResourceBundle.getBundle("config").getString("logo_icon")).getImage());
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(880, 650);
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
		
//		userDTO object formation
		userDTO = new UserDTO();
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setBounds(314, 117, 67, 23);
		contentPane.add(lblFirstName);
		
		txtField_firstName = new JTextField();
		txtField_firstName.setHorizontalAlignment(SwingConstants.LEFT);
		txtField_firstName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtField_firstName.setColumns(10);
		txtField_firstName.setBorder(new EmptyBorder(0, 10, 0, 10));
		txtField_firstName.setBounds(314, 140, 200, 30);
		contentPane.add(txtField_firstName);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setUserFields();
				userHelper = new UserHelper();
				try {
					if(userHelper.doRegister(userDTO)){
//						extra checking layer
						if(userHelper.doLogin(userDTO)){
							
							System.out.println("REGISTERED SUCCESSFULLY");
							
							new DashBoard();
						}
					}
					else{
						System.out.println("REGISTERY UNSUCCESSFULL");
					}
				} catch (ClassNotFoundException | SQLException err) {
					
					err.printStackTrace();
				}
			}
		});
		
//		APPLYING C.O.B
		btnSignUp.setContentAreaFilled(false);
		btnSignUp.setOpaque(true);
		btnSignUp.setBorderPainted(false);
		btnSignUp.setFocusPainted(false);
		btnSignUp.setBackground(new Color(102, 255, 153));
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setBounds(314, 530, 224, 40);
//		btnSignUp.setBorder(new RoundedBorder(50));
		contentPane.add(btnSignUp);
		
		JLabel lblEmail = new JLabel("Email Id");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblEmail.setBounds(314, 181, 67, 23);
		contentPane.add(lblEmail);
		
		txtField_email = new JTextField();
		txtField_email.setHorizontalAlignment(SwingConstants.LEFT);
		txtField_email.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtField_email.setColumns(10);
		txtField_email.setBorder(new EmptyBorder(0, 10, 0, 10));
		txtField_email.setBounds(314, 203, 320, 30);
		contentPane.add(txtField_email);
		
		
//		Icon for Login Screen
		loginImage = ImageIO.read(this.getClass().getResource("icon_login.png")).getSubimage(0, 0, 250, 250);;
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 280, 620);
		panel.setBackground(new Color(102, 255, 153));
		panel.add(new JLabel(new ImageIcon(loginImage)));
		contentPane.add(panel);
		
		JLabel lblInstisoft = new JLabel("instiSoft");
		lblInstisoft.setBackground(SystemColor.windowBorder);
		lblInstisoft.setOpaque(true);
		lblInstisoft.setForeground(Color.WHITE);
		lblInstisoft.setHorizontalAlignment(JLabel.CENTER);
		lblInstisoft.setVerticalAlignment(JLabel.CENTER);
		lblInstisoft.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 50));
		lblInstisoft.setBounds(420, 34, 294, 58);
		contentPane.add(lblInstisoft);
		
		
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUsername.setBounds(314, 315, 67, 23);
		contentPane.add(lblUsername);
		
		txtField_username = new JTextField();
		txtField_username.setHorizontalAlignment(SwingConstants.LEFT);
		txtField_username.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtField_username.setColumns(10);
		txtField_username.setBorder(new EmptyBorder(0, 10, 0, 10));
		txtField_username.setBounds(314, 339, 200, 30);
		contentPane.add(txtField_username);
		
		
		txtField_lastName = new JTextField();
		txtField_lastName.setHorizontalAlignment(SwingConstants.LEFT);
		txtField_lastName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtField_lastName.setColumns(10);
		txtField_lastName.setBorder(new EmptyBorder(0, 10, 0, 10));
		txtField_lastName.setBounds(586, 140, 200, 30);
		contentPane.add(txtField_lastName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblLastName.setBounds(586, 117, 67, 23);
		contentPane.add(lblLastName);
		
		JCheckBox chckbxUseAsUsername = new JCheckBox("Use as username");
		chckbxUseAsUsername.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxUseAsUsername.setForeground(Color.WHITE);
		chckbxUseAsUsername.setContentAreaFilled(false);
		chckbxUseAsUsername.setOpaque(false);
		chckbxUseAsUsername.setBorderPainted(false);
		chckbxUseAsUsername.setFocusable(false);
		chckbxUseAsUsername.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		chckbxUseAsUsername.setBounds(648, 201, 138, 30);
		contentPane.add(chckbxUseAsUsername);
		
		txtField_password = new JPasswordField();
		txtField_password.setHorizontalAlignment(SwingConstants.LEFT);
		txtField_password.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtField_password.setColumns(10);
		txtField_password.setBorder(new EmptyBorder(0, 10, 0, 10));
		txtField_password.setBounds(314, 410, 200, 30);
		contentPane.add(txtField_password);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPassword.setBounds(314, 385, 67, 23);
		contentPane.add(lblPassword);
		
		JLabel lblContactNumber = new JLabel("Contact number");
		lblContactNumber.setForeground(Color.WHITE);
		lblContactNumber.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblContactNumber.setBounds(314, 244, 100, 23);
		contentPane.add(lblContactNumber);
		
		txtField_contact = new JTextField();
		txtField_contact.setHorizontalAlignment(SwingConstants.LEFT);
		txtField_contact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtField_contact.setColumns(10);
		txtField_contact.setBorder(new EmptyBorder(0, 10, 0, 10));
		txtField_contact.setBounds(314, 265, 320, 30);
		contentPane.add(txtField_contact);
		
		JCheckBox chckbxUseAsUsername1 = new JCheckBox("Use as username");
		chckbxUseAsUsername1.setOpaque(false);
		chckbxUseAsUsername1.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxUseAsUsername1.setForeground(Color.WHITE);
		chckbxUseAsUsername1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		chckbxUseAsUsername1.setContentAreaFilled(false);
		chckbxUseAsUsername1.setBorderPainted(false);
		chckbxUseAsUsername1.setFocusable(false);
		chckbxUseAsUsername1.setBounds(648, 263, 138, 30);
		contentPane.add(chckbxUseAsUsername1);
		
		tglbtnGender = new JToggleButton("MALE");
		tglbtnGender.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		tglbtnGender.setForeground(new Color(102, 255, 153));
		tglbtnGender.setHorizontalAlignment(SwingConstants.LEADING);
		tglbtnGender.setBounds(642, 332, 157, 40);
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
		contentPane.add(tglbtnGender);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblGender.setBounds(586, 342, 58, 23);
		contentPane.add(lblGender);
		
		JLabel lblDob = new JLabel("Date of Birth");
		lblDob.setForeground(Color.WHITE);
		lblDob.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblDob.setBounds(586, 385, 89, 23);
		contentPane.add(lblDob);
		
		txtField_dob = new JTextField();
		txtField_dob.setHorizontalAlignment(SwingConstants.LEFT);
		txtField_dob.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtField_dob.setColumns(10);
		txtField_dob.setBorder(new EmptyBorder(0, 10, 0, 10));
		txtField_dob.setBounds(586, 410, 200, 30);
		contentPane.add(txtField_dob);
		
		JLabel lblConfirmPassword = new JLabel("Confirm password");
		lblConfirmPassword.setForeground(Color.WHITE);
		lblConfirmPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblConfirmPassword.setBounds(314, 459, 119, 23);
		contentPane.add(lblConfirmPassword);
		
		txtField_repassword = new JPasswordField();
		txtField_repassword.setHorizontalAlignment(SwingConstants.LEFT);
		txtField_repassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtField_repassword.setColumns(10);
		txtField_repassword.setBorder(new EmptyBorder(0, 10, 0, 10));
		txtField_repassword.setBounds(314, 482, 200, 30);
		contentPane.add(txtField_repassword);
		
		tglbtnAuth = new JToggleButton("OFF");
		tglbtnAuth.setOpaque(false);
		tglbtnAuth.setHorizontalAlignment(SwingConstants.LEADING);
		tglbtnAuth.setForeground(new Color(102, 255, 153));
		tglbtnAuth.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		tglbtnAuth.setFocusable(false);
		tglbtnAuth.setContentAreaFilled(false);
		tglbtnAuth.setBorderPainted(false);
		tglbtnAuth.setBounds(735, 478, 126, 35);
		tglbtnAuth.setIcon(toggleOffIcon);
		tglbtnAuth.addItemListener((event)->{
			
			if(((JToggleButton)event.getSource()).isSelected()){
				((JToggleButton)event.getSource()).setText("ON");
				((JToggleButton)event.getSource()).setIcon(toggleOnIcon);
			}
			else{
				((JToggleButton)event.getSource()).setText("OFF");
				((JToggleButton)event.getSource()).setIcon(toggleOffIcon);
			}
		});
		tglbtnAuth.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(tglbtnAuth);
		
		JLabel lblTwoStepAuthentication = new JLabel("Two Step Authentication");
		lblTwoStepAuthentication.setForeground(Color.WHITE);
		lblTwoStepAuthentication.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTwoStepAuthentication.setBounds(586, 485, 154, 23);
		contentPane.add(lblTwoStepAuthentication);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(102, 255, 153));
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReset.setFocusPainted(false);
		btnReset.setContentAreaFilled(false);
		btnReset.setOpaque(true);
		btnReset.setBorderPainted(false);
//		btnReset.setBorder(new RoundedBorder(50));
		btnReset.setBackground(new Color(102, 255, 153));
		btnReset.setBounds(575, 530, 224, 40);
		btnReset.addActionListener((event)->{
			txtField_firstName.setText("");
			txtField_lastName.setText("");
			txtField_email.setText("");
			txtField_contact.setText("");
			txtField_username.setText("");
			txtField_password.setText("");
			txtField_repassword.setText("");
			txtField_dob.setText("");
			
			chckbxUseAsUsername.setSelected(false);
			chckbxUseAsUsername1.setSelected(false);
			
			tglbtnGender.setText("MALE");
		});
		
		contentPane.add(btnReset);
		
//		to be in the end @OverlappingCompenent
		BufferedImage logoImage = ImageIO.read(this.getClass().getResource("logo.png")).getSubimage(0, 0, 426, 530);
		JLabel lblLogo = new JLabel(new ImageIcon(logoImage));
		lblLogo.setBounds(339, 11, 447, 581);
		contentPane.add(lblLogo);
		
		this.setVisible(true);
	}
	private void setUserFields(){
		userDTO.setUsername(txtField_username.getText().trim());
		userDTO.setPassword(String.valueOf(txtField_password.getPassword()).trim());
		userDTO.setFirstName(txtField_firstName.getText().trim());
		userDTO.setLastName(txtField_lastName.getText().trim());
		userDTO.setGender(String.valueOf(tglbtnGender.getText().trim().charAt(0)));
		userDTO.setDob(txtField_dob.getText().trim());
		userDTO.setEmail(txtField_email.getText().trim());
		userDTO.setPhone(txtField_contact.getText().trim());
		userDTO.setAuth_status("T");	// just for checking this flag is for email verification of account
		userDTO.setUser_status("A");	// active user
		userDTO.setRole_status("A");	// admin in role
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
					SignupFrame frame = new SignupFrame(callingFrame);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
