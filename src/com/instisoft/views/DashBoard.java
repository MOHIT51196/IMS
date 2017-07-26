package com.instisoft.views;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.instisoft.utils.GUILookAndFeel;

public class DashBoard extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JPanel sidePanel, containerPane;
	private JLabel lblHeader;

	private final static String TITLE = ResourceBundle.getBundle("config").getString("project_title");
	private MenuBar menuBar;
	private JButton btnShowNav;
	private ArrayList<JPanel> panelList;
	private NavPanel menuNavPanel;
	private JLabel lblInstisoft;
	
	static Desktop desktop = Desktop.getDesktop();
	
	final String FACEBOOK = "facebook";
	final String TWITTER = "twitter";
	final String GOOGLE_PLUS = "googleplus";
	final String YOUTUBE = "youtube";
	
	private static final int MAX_PREFERRED_HEIGHT = 653;
	
	public DashBoard() {
		super(TITLE + " Dashboard");
		this.setIconImage(new ImageIcon(ResourceBundle.getBundle("config").getString("logo_icon")).getImage());
		setSize(700, 450);
		setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.GRAY);
				
		GUILookAndFeel.setGUILookAndFeel();
//		WebLookAndFeel.install();
		
//		for all the panels in the Dashboard
		panelList = new ArrayList<>();
		
		menuBar = new MenuBar(this);
		setJMenuBar(menuBar);
		
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.windowBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		

		lblInstisoft = new JLabel("instiSoft");
		lblInstisoft.setBackground(SystemColor.windowBorder);
		lblInstisoft.setOpaque(true);
		lblInstisoft.setForeground(Color.WHITE);
		lblInstisoft.setHorizontalAlignment(JLabel.CENTER);
		lblInstisoft.setVerticalAlignment(JLabel.CENTER);
		lblInstisoft.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 24));
		lblInstisoft.setBounds(1212, 6, 144, 34);
		contentPane.add(lblInstisoft);
		


		btnShowNav = new JButton(new ImageIcon("resources/side_nav_button.png"));
		btnShowNav.setBounds(0, 160, 30, 30);
		btnShowNav.setFocusable(false);
		btnShowNav.setContentAreaFilled(false);
		btnShowNav.setOpaque(false);
		btnShowNav.setBorderPainted(false);
		btnShowNav.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnShowNav.addActionListener((event)->{
			((JButton)event.getSource()).setVisible(false);
			menuNavPanel.setVisible(true);
		});
		
//		contentPane.add(btnShowNav);		// Strict Navigation ON
		
		menuNavPanel = new NavPanel(this);
		menuNavPanel.setLocation(0, 0);
		menuNavPanel.setVisible(true);		// Strict Navigation ON
		contentPane.add(menuNavPanel);
		
		
		
		sidePanel = new JPanel();
		sidePanel.setBounds(0, 0, 224, 653);
//		sidePanel.setBackground(new Color(102, 255, 153));
		sidePanel.setBackground( new Color( 18, 30, 49)  );
		contentPane.add(sidePanel);
		sidePanel.setLayout(null);
		
		

		containerPane = new JPanel();
		containerPane.setBounds(238, 84, 1118, 569);
		containerPane.setBackground(null);
		containerPane.setOpaque(false);
		containerPane.setLayout(null);
		contentPane.add(containerPane);
		
		lblHeader = new JLabel("Welcome to Dashboard");
		lblHeader.setVerticalAlignment(SwingConstants.CENTER);
		lblHeader.setBackground(null);
		lblHeader.setForeground(Color.WHITE);
		lblHeader.setFont(new Font("Times New Roman", Font.BOLD, 42));
		lblHeader.setOpaque(false);
		lblHeader.setBorder(new EmptyBorder(0, 6, 0, 6));
		lblHeader.setBounds(236, 20, 935, 59);
		contentPane.add(lblHeader);
		
		JPanel bottomBar = new JPanel();
		bottomBar.setBackground(Color.LIGHT_GRAY);
		bottomBar.setBounds(0, 654, 1372, 28);
		contentPane.add(bottomBar);
		bottomBar.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Copyrights \u00A9 2017 | xyz Corporations");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel.setBounds(6, 0, 275, 23);
		bottomBar.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(1197, 0, 144, 28);
		panel.setOpaque(false);
		bottomBar.add(panel);
		panel.setLayout(new GridLayout(0, 4, 5, 0));
		
		JButton btnFB = new JButton();
		setSocialButtonStyle(btnFB, FACEBOOK);
		panel.add(btnFB);
		
		JButton btnTwitter = new JButton();
		setSocialButtonStyle(btnTwitter, TWITTER);
		panel.add(btnTwitter);
		
		JButton btnGoogle = new JButton();
		setSocialButtonStyle(btnGoogle, GOOGLE_PLUS);
		panel.add(btnGoogle);
		
		JButton btnYoutube = new JButton();
		setSocialButtonStyle(btnYoutube, YOUTUBE);
		panel.add(btnYoutube);
		
		
//		to be in the end @OverlappingCompenent
//		BufferedImage logoImage;
//		try {
//			logoImage = ImageIO.read(this.getClass().getResource("logo.png")).getSubimage(0, 0, 426, 530);
//			JLabel lblLogo = new JLabel(new ImageIcon(logoImage));
//			lblLogo.setBounds(358, 0, 860, 684);
//			contentPane.add(lblLogo);
//			
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
		
		
		this.setVisible(true);
	}
	
	
	
	public JButton getBtnShowNav() {
		return btnShowNav;
	}



	public void setBtnShowNav(JButton btnShowNav) {
		this.btnShowNav = btnShowNav;
	}



	public JLabel getLblInstisoft() {
		return lblInstisoft;
	}



	public void setLblInstisoft(JLabel lblInstisoft) {
		this.lblInstisoft = lblInstisoft;
	}



	public JPanel getSidePanel() {
		return sidePanel;
	}




	public void setSidePanel(JPanel sidePanel) {
		this.sidePanel = sidePanel;
	}




	public JPanel getContainerPane() {
		return containerPane;
	}




	public void setContainerPane(JPanel containerPane) {
		this.containerPane = containerPane;
	}




	public JLabel getLblHeader() {
		return lblHeader;
	}




	public void setLblHeader(JLabel lblHeader) {
		this.lblHeader = lblHeader;
	}


	public ArrayList<JPanel> getPanelList() {
		return panelList;
	}



	public void setPanelList(ArrayList<JPanel> panelList) {
		this.panelList = panelList;
	}



	public void setHeader(String title){
		lblHeader.setText(title);
	}
	
	
	public static int getMaxPreferredHeight() {
		return MAX_PREFERRED_HEIGHT;
	}

	private void hideContainerComponents(){
		panelList.forEach((panel)->{
			panel.setVisible(false);
		});
	}
	
	public void showPanel(JPanel panel){
		
		hideContainerComponents();
		
		if(panelList.contains(panel)){
			panel.setVisible(true);
		}
		else{
			addPanel(panel);
		}
	}
	
	public void addPanel(JPanel panel){
		panelList.add(panel);
		containerPane.add(panel);
		repaint();
		
	}
	
	
	public void addToSidePanel(JComponent component){
		sidePanel.add(component);
	}
	
	public void setSocialButtonStyle(JButton button, String socialMediaName){
		button.setIcon(new ImageIcon("resources/icon_" + socialMediaName + ".png"));
		button.setFocusable(false);
		button.setContentAreaFilled(false);
		button.setOpaque(false);
		button.setBorderPainted(false);
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button.addActionListener((event)->{
			try {
				desktop.browse(new URI(ResourceBundle.getBundle("config").getString("link_" + socialMediaName)));
			} 
			catch (IOException | URISyntaxException e) {
				
				e.printStackTrace();
			}
		});
	}
	
	public static void main(String[] args) {
		new DashBoard();
	}
}
