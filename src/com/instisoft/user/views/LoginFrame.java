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
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.instisoft.user.dto.MailDTO;
import com.instisoft.user.dto.UserDTO;
import com.instisoft.user.helper.UserHelper;
import com.instisoft.utils.GUILookAndFeel;
import com.instisoft.utils.MailingService;
import com.instisoft.utils.MailingTemplate;
import com.instisoft.views.DashBoard;




public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private BufferedImage loginImage;
	private JTextField textField_username;
	private JPasswordField textField_password;
	private JButton btnLogIn, btnForgotPassword;
	private JLabel lblLogo ;
	private final BufferedImage logoImage =  ImageIO.read(this.getClass().getResource("logo.png")).getSubimage(0, 0, 426, 530);;
	private final static String TITLE = ResourceBundle.getBundle("config").getString("project_title");
	
	private UserDTO userDTO;
	private UserHelper userHelper;
	private final String FORGET_PASSWORD_MSG = ResourceBundle.getBundle("message_bundle").getString("recovery_password_msg");
	private final String CONFIRM_MAIL_MSG = ResourceBundle.getBundle("message_bundle").getString("confirm_mail_msg");
	
	{
		userDTO = new UserDTO();
		userHelper = new UserHelper();
	}

	public LoginFrame(JFrame callingFrame) throws IOException {
		super(TITLE + " Login");
		this.setIconImage(new ImageIcon(ResourceBundle.getBundle("config").getString("logo_icon")).getImage());
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(810, 500); 
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
		

		GUILookAndFeel.setGUILookAndFeel();
//		WebLookAndFeel.install();
		
//		Icon for Login Screen
		loginImage = ImageIO.read(this.getClass().getResource("icon_login.png")).getSubimage(0, 0, 250, 250);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 324, 471);
		panel.setBackground(GUILookAndFeel.getThemeColor());
		panel.add(new JLabel(new ImageIcon(loginImage)));
		contentPane.add(panel);
		
		JPanel formPanel = new JPanel();
		formPanel.setBounds(325, 0, 958, 471); 
		formPanel.setLayout(null);
		formPanel.setOpaque(false);
		contentPane.add(formPanel);
		
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(40, 174, 67, 23);
		formPanel.add(lblUsername);
		
		textField_username = new JTextField();
		textField_username.setHorizontalAlignment(SwingConstants.LEFT);
		textField_username.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_username.setColumns(10);
		textField_username.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_username.setBounds(40, 199, 400, 30);
		formPanel.add(textField_username);
		
		btnLogIn = new JButton("Log In");
		btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setFields();
				
				try {
					if(userHelper.doLogin(userDTO)){
						System.out.println("LOGGED IN SUCCESSFULLY");
						
						new DashBoard();
						DashBoard.setUserDTO(userDTO);
						
						((JFrame)((JButton)e.getSource()).getTopLevelAncestor()).dispose();
						callingFrame.dispose();
					}
					else{
						System.out.println("INCORRECT USERNAME or PASSWORD");
					}
				} catch (ClassNotFoundException | SQLException err) {
					
					err.printStackTrace();
				}
			}
		});
		btnLogIn.setFocusPainted(false);
		btnLogIn.setBackground(GUILookAndFeel.getThemeColor());
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setBounds(40, 348, 400, 40);
		
		formPanel.add(btnLogIn);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPassword.setBounds(40, 257, 67, 23);
		formPanel.add(lblPassword);
		
		textField_password = new JPasswordField();
		textField_password.setHorizontalAlignment(SwingConstants.LEFT);
		textField_password.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_password.setColumns(10);
		textField_password.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_password.setBounds(40, 280, 400, 30);
		formPanel.add(textField_password);
		
		
		JLabel lblInstisoft = new JLabel("instiSoft");
		lblInstisoft.setBackground(SystemColor.windowBorder);
		lblInstisoft.setForeground(Color.WHITE);
		lblInstisoft.setHorizontalAlignment(JLabel.CENTER);
		lblInstisoft.setVerticalAlignment(JLabel.CENTER);
		lblInstisoft.setOpaque(true);
		lblInstisoft.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 50));
		lblInstisoft.setBounds(80, 78, 294, 59);
		formPanel.add(lblInstisoft);
		
		btnForgotPassword = new JButton("Forgot password ?");
		btnForgotPassword.setForeground(Color.WHITE);
		btnForgotPassword.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnForgotPassword.setContentAreaFilled(false);
		btnForgotPassword.setOpaque(false);
		btnForgotPassword.setBorderPainted(false);
		btnForgotPassword.setBounds(145, 411, 178, 23);
		btnForgotPassword.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnForgotPassword.addActionListener((event)->{
			formPanel.setLocation(formPanel.getX() - (formPanel.getWidth()/2), formPanel.getY());
			lblLogo.setVisible(false);
		});
		formPanel.add(btnForgotPassword);
		
		JTextArea textArea_Recovery = new JTextArea(FORGET_PASSWORD_MSG);
		textArea_Recovery.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textArea_Recovery.setForeground(Color.WHITE);
		textArea_Recovery.setBackground(SystemColor.windowBorder);
		textArea_Recovery.setBorder(null);
		textArea_Recovery.setOpaque(false);
		textArea_Recovery.setBounds(530, 61, 388, 59);
		textArea_Recovery.setWrapStyleWord(true);
		textArea_Recovery.setLineWrap(true);
		formPanel.add(textArea_Recovery);
		
		JTextArea textArea_ConfirmMail = new JTextArea(CONFIRM_MAIL_MSG);
		textArea_ConfirmMail.setBounds(568, 186, 279, 50);
		textArea_ConfirmMail.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		textArea_ConfirmMail.setForeground(Color.WHITE);
		textArea_ConfirmMail.setBackground(SystemColor.windowBorder);
		textArea_ConfirmMail.setBorder(null);
		textArea_ConfirmMail.setOpaque(false);
		textArea_ConfirmMail.setWrapStyleWord(true);
		textArea_ConfirmMail.setLineWrap(true);
		formPanel.add(textArea_ConfirmMail);
		
		JRadioButton rdbtnYes = new JRadioButton("YES");
		rdbtnYes.setSelected(true);
		rdbtnYes.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		rdbtnYes.setBounds(605, 244, 82, 23);
		rdbtnYes.setContentAreaFilled(false);
		rdbtnYes.setOpaque(false);
		rdbtnYes.setBorderPainted(false);
		rdbtnYes.setForeground(Color.WHITE);
		rdbtnYes.setActionCommand("Y");
		formPanel.add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("NO");
		rdbtnNo.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		rdbtnNo.setBounds(727, 244, 82, 23);
		rdbtnNo.setContentAreaFilled(false);
		rdbtnNo.setOpaque(false);
		rdbtnNo.setBorderPainted(false);
		rdbtnNo.setForeground(Color.WHITE);
		rdbtnNo.setActionCommand("N");
		formPanel.add(rdbtnNo);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnYes);
		buttonGroup.add(rdbtnNo);
		
		
		JButton btnAccept = new JButton("accept");
		btnAccept.setForeground(Color.WHITE);
		btnAccept.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAccept.setFocusPainted(false);
		btnAccept.setBackground(new Color(18, 30, 49));
		btnAccept.setBounds(557, 366, 143, 40);
		btnAccept.addActionListener((event)->{
			
			
			if(buttonGroup.getSelection().getActionCommand().equalsIgnoreCase("Y")){
				
				try {
					userDTO.setUsername(textField_username.getText());
					
					if(userHelper.doRecovery(userDTO)){
						sendMail();
					}
					
				} catch (ClassNotFoundException | SQLException e) {
					
					e.printStackTrace();
				}
				
				
			}
			
			formPanel.setLocation(formPanel.getX() + (formPanel.getWidth()/2), formPanel.getY());
			lblLogo.setVisible(true);
		});
		formPanel.add(btnAccept);
		
		JButton btnBack = new JButton("cancel");
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBack.setFocusPainted(false);
		btnBack.setBackground(new Color(18, 30, 49));
		btnBack.setBounds(748, 366, 143, 40);
		btnBack.addActionListener((event)->{
			formPanel.setLocation(formPanel.getX() + (formPanel.getWidth()/2), formPanel.getY());
			lblLogo.setVisible(true);
		});
		formPanel.add(btnBack);
		
//		to be in the end @OverlappingCompenent
		
		lblLogo = new JLabel(new ImageIcon(logoImage));
		lblLogo.setBounds(344, 11, 426, 530);
		contentPane.add(lblLogo);
		
		
		
		this.setVisible(true);
	}
	
	private void setFields(){
		if(textField_password.getPassword() != null && textField_username.getText() != null){
			userDTO.setUsername(textField_username.getText());
			userDTO.setPassword(String.valueOf(textField_password.getPassword()));
		}
	}
	
	private void sendMail(){
		
		MailDTO mailDTO = new MailDTO();
		
		mailDTO.setName(userDTO.getFirstName());
		mailDTO.setMailId(userDTO.getEmail());
		mailDTO.setUsername(userDTO.getUsername());
		
		MailingTemplate template = MailingTemplate.getInstance(mailDTO);
		mailDTO.setSubject(template.getResetPasswordSubject());
		mailDTO.setMailContent(template.getResetPasswordTemplate());
		
		MailingService mailingService = MailingService.getInstance();
		if(mailingService.launchShareActivity(mailDTO)){
			System.out.println("Mail sent");
		}else{
			System.out.println("Mailing failure");
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
