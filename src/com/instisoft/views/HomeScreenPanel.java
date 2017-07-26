package com.instisoft.views;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.GridLayout;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ResourceBundle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class HomeScreenPanel extends JPanel {

	private static final long serialVersionUID = 1L;

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

}
