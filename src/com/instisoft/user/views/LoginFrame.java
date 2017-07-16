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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.instisoft.user.dto.UserDTO;
import com.instisoft.user.helper.UserHelper;
import com.instisoft.views.DashBoard;




public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private BufferedImage loginImage;
	private JTextField textField_username;
	private JPasswordField textField_password;
	private JButton btnLogIn, btnForgotPassword;
	
	private final static String TITLE = ResourceBundle.getBundle("config").getString("project_title");
	
	private UserDTO userDTO;
	private UserHelper userHelper;

	public LoginFrame(JFrame callingFrame) throws IOException {
		super(TITLE + " Login");
		this.setIconImage(new ImageIcon(ResourceBundle.getBundle("config").getString("logo_icon")).getImage());
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(800, 500);
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
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(359, 174, 67, 23);
		contentPane.add(lblUsername);
		
		textField_username = new JTextField();
		textField_username.setHorizontalAlignment(SwingConstants.LEFT);
		textField_username.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_username.setColumns(10);
		textField_username.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_username.setBounds(359, 199, 400, 30);
		contentPane.add(textField_username);
		
		btnLogIn = new JButton("Log In");
		btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setUserFields();
				userHelper = new UserHelper();
				try {
					if(userHelper.doLogin(userDTO)){
						System.out.println("LOGGED IN SUCCESSFULLY");
						((JFrame)((JButton)e.getSource()).getTopLevelAncestor()).dispose();
						new DashBoard();
					}
					else{
						System.out.println("INCORRECT USERNAME or PASSWORD");
					}
				} catch (ClassNotFoundException | SQLException err) {
					
					err.printStackTrace();
				}
			}
		});
		
		
//		APPLYING C.O.B
		btnLogIn.setContentAreaFilled(false);
		btnLogIn.setOpaque(true);
		btnLogIn.setBorderPainted(false);
		btnLogIn.setFocusPainted(false);
		btnLogIn.setBackground(new Color(102, 255, 153));
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setBounds(359, 348, 400, 40);
		
		contentPane.add(btnLogIn);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPassword.setBounds(359, 257, 67, 23);
		contentPane.add(lblPassword);
		
		textField_password = new JPasswordField();
		textField_password.setHorizontalAlignment(SwingConstants.LEFT);
		textField_password.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_password.setColumns(10);
		textField_password.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_password.setBounds(359, 280, 400, 30);
		contentPane.add(textField_password);
		
		
//		Icon for Login Screen
		loginImage = ImageIO.read(this.getClass().getResource("icon_login.png")).getSubimage(0, 0, 250, 250);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 324, 471);
		panel.setBackground(new Color(102, 255, 153));
		panel.add(new JLabel(new ImageIcon(loginImage)));
		contentPane.add(panel);
		
		JLabel lblInstisoft = new JLabel("instiSoft");
		lblInstisoft.setBackground(SystemColor.windowBorder);
		lblInstisoft.setForeground(Color.WHITE);
		lblInstisoft.setHorizontalAlignment(JLabel.CENTER);
		lblInstisoft.setVerticalAlignment(JLabel.CENTER);
		lblInstisoft.setOpaque(true);
		lblInstisoft.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 50));
		lblInstisoft.setBounds(414, 60, 294, 58);
		contentPane.add(lblInstisoft);
		
		btnForgotPassword = new JButton("Forgot password ?");
		btnForgotPassword.setForeground(Color.WHITE);
		btnForgotPassword.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnForgotPassword.setContentAreaFilled(false);
		btnForgotPassword.setOpaque(false);
		btnForgotPassword.setBorderPainted(false);
		btnForgotPassword.setBounds(475, 411, 178, 23);
		btnForgotPassword.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnForgotPassword);
		
//		to be in the end @OverlappingCompenent
		BufferedImage logoImage = ImageIO.read(this.getClass().getResource("logo.png")).getSubimage(0, 0, 426, 530);
		JLabel lblLogo = new JLabel(new ImageIcon(logoImage));
		lblLogo.setBounds(344, 11, 426, 530);
		contentPane.add(lblLogo);
		
		this.setVisible(true);
	}
	
	private void setUserFields(){
		if(textField_password.getPassword() != null && textField_username.getText() != null){
			userDTO.setUsername(textField_username.getText());
			userDTO.setPassword(String.valueOf(textField_password.getPassword()));
		}
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
					LoginFrame frame = new LoginFrame(callingFrame);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
