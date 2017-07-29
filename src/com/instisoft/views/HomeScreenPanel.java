package com.instisoft.views;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ResourceBundle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class HomeScreenPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private FrontFeaturesPanel featuresPanel;
	private JPanel socialLinkPanel;
	
	static Desktop desktop = Desktop.getDesktop();
	
	final String FACEBOOK = "facebook";
	final String TWITTER = "twitter";
	final String GOOGLE_PLUS = "googleplus";
	final String YOUTUBE = "youtube";
	
	
	public HomeScreenPanel() {

		setSize(1118, 550);
		setLayout(null);
		setBackground(null);
		setOpaque(false);
		
		// FRONT FACE PANEL
		featuresPanel = new FrontFeaturesPanel();
		featuresPanel.setLocation(0, 40);
		add(featuresPanel);
		
		// SOCIAL LINKS PANEL
		socialLinkPanel = new JPanel();
		socialLinkPanel.setBounds(912, 510, 200, 40);
		socialLinkPanel.setOpaque(false);
		socialLinkPanel.setLayout(new GridLayout(0, 4, 5, 0));
		add(socialLinkPanel);
		
		JButton btnFB = new JButton();
		setSocialButtonStyle(btnFB, FACEBOOK);
		socialLinkPanel.add(btnFB);
		
		JButton btnTwitter = new JButton();
		setSocialButtonStyle(btnTwitter, TWITTER);
		socialLinkPanel.add(btnTwitter);
		
		JButton btnGoogle = new JButton();
		setSocialButtonStyle(btnGoogle, GOOGLE_PLUS);
		socialLinkPanel.add(btnGoogle);
		
		JButton btnYoutube = new JButton();
		setSocialButtonStyle(btnYoutube, YOUTUBE);
		socialLinkPanel.add(btnYoutube);
		
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
	
	public void renderHome(){
		
		socialLinkPanel.setVisible(true);
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
					contentPane.add(new HomeScreenPanel());
					frame.setContentPane(contentPane);
					
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}

}
