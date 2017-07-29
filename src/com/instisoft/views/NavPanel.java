package com.instisoft.views;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import com.instisoft.settings.views.SettingsFrame;
import com.instisoft.user.views.MainFrame;

public class NavPanel extends JPanel {

	
	private static final long serialVersionUID = 1L;
	
	private JPanel menuPanel;
	private DashBoard dashBoard;
	private SettingsFrame settingsFrame;
	
	private JButton btnHome;
	private JButton but2;
	private JButton but3;
	private JToggleButton btnSwitchView;
	private JButton btnSettings;
	private JButton btnLogout;
	
	public NavPanel(JFrame masterFrame) {

		
		setLayout(null);
		setSize(80, DashBoard.getMaxPreferredHeight());
		setBackground(null);
		setOpaque(false);
		
		if(masterFrame instanceof DashBoard){
			dashBoard = ((DashBoard)masterFrame);
		}
		
//		JButton btnCross = new JButton(new ImageIcon("resources/cross_button.png"));
//		btnCross.setBounds(51, 0, 25, 25);
//		btnCross.setFocusable(false);
//		btnCross.setContentAreaFilled(false);
//		btnCross.setOpaque(false);
//		btnCross.setBorderPainted(false);
//		btnCross.setCursor(new Cursor(Cursor.HAND_CURSOR));
//		btnCross.addActionListener((event)->{
//			this.setVisible(false);
//			dashBoard.getBtnShowNav().setVisible(true);
//		});
		
//		add(btnCross);		// Strict Navigation ON
		
		menuPanel = new JPanel();
		menuPanel.setLayout(new GridLayout(10, 1, 0, 18));
		menuPanel.setBounds(0, 0, 42, 666);
		menuPanel.setForeground(new Color(0, 0, 0));
		menuPanel.setBackground(Color.BLACK);
		menuPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menuPanel.setBorder(new EmptyBorder(10, 0, 10, 0));
		add(menuPanel);

		settingsFrame = new SettingsFrame(dashBoard);
		settingsFrame.setVisible(false);

		
		btnHome = new JButton(new ImageIcon("resources/icon_home.png"));
		setNavStyle(btnHome);
		btnHome.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
		btnHome.addActionListener((event)->{
			dashBoard.renderPanel("Welcome to DashBoard", dashBoard.getHomeScreenPanel());;
		});
		menuPanel.add(btnHome);
		
		Arrays.asList(but2, but3).forEach((button)->{
			button = new JButton(new ImageIcon("resources/icon_settings.png"));
			setNavStyle(button);
			
			button.addActionListener((event)->{
				
			});
			
			menuPanel.add(button);
		});
		
		btnSwitchView = new JToggleButton(new ImageIcon("resources/icon_switch.png"));
		setNavStyle(btnSwitchView);
//		butSwitchView.addItemListener((event)->{
//			
//			DashBoard dashBoard = null;
//			if(masterFrame instanceof DashBoard){
//				dashBoard = (DashBoard)masterFrame;
//				int maxWidth = dashBoard.getContentPane().getWidth();
////				int maxheight = dashBoard.getContentPane().getHeight();
//				
//				if(((JToggleButton)event.getSource()).isSelected()){
//
//					dashBoard.getLblInstisoft().setLocation(2, 11);
//					dashBoard.getSidePanel().setLocation(maxWidth - dashBoard.getSidePanel().getWidth(), 0);
//					dashBoard.getLblHeader().setLocation(maxWidth - (234 + dashBoard.getLblHeader().getWidth()), 25);
//					dashBoard.getLblHeader().setHorizontalAlignment(SwingConstants.TRAILING);
//					dashBoard.getContainerPane().setLocation(maxWidth - (234 + dashBoard.getContainerPane().getWidth()), 98);
//					
////					((JToggleButton)event.getSource()).getRootPane().setLocation(maxWidth - this.getWidth(), 60);
//				}
//				else{
//					dashBoard.getLblInstisoft().setLocation(1198, 11);
//					dashBoard.getLblHeader().setLocation(234, 25);
//					dashBoard.getLblHeader().setHorizontalAlignment(SwingConstants.LEADING);
//					dashBoard.getContainerPane().setLocation(234, 98);
//					dashBoard.getSidePanel().setLocation(0,0);
//					
////					((JToggleButton)event.getSource()).getRootPane().setLocation(0, 60);
//				}
//				
//				dashBoard.revalidate();
//				dashBoard.repaint();
//				
//			}
//			
//		});
		menuPanel.add(btnSwitchView);
		
		btnSettings = new JButton(new ImageIcon("resources/icon_settings.png"));
		setNavStyle(btnSettings);
		btnSettings.addActionListener((event)->{
			settingsFrame.setVisible(true);
		});
		menuPanel.add(btnSettings);
		
		btnLogout = new JButton(new ImageIcon("resources/icon_logout.png"));
		setNavStyle(btnLogout);
		btnLogout.addActionListener((event)->{
			masterFrame.dispose();
			new MainFrame();
		});
		menuPanel.add(btnLogout);
		
		setVisible(true);
	}
	
	

	private void setNavStyle(JButton button){
		button.setContentAreaFilled(false);
		button.setOpaque(false);
//		button.setBorder(new MatteBorder(0, 0, 1, 0, Color.WHITE));
		button.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
	}
	
	private void setNavStyle(JToggleButton button){
		button.setContentAreaFilled(false);
		button.setOpaque(false);
//		button.setBorder(new MatteBorder(0, 0, 1, 0, Color.WHITE));
		button.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
	}

}
