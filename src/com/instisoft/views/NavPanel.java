package com.instisoft.views;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import com.instisoft.user.views.MainFrame;

public class NavPanel extends JPanel {

	
	private static final long serialVersionUID = 1L;
	
	private JPanel menuPanel;
	
	private JButton but1;
	private JButton but2;
	private JToggleButton butSwitchView;
	private JButton but4;
	private JButton but5;
	private JButton but6;
	private JButton but7;
	
	private JButton butLogout;
	
	public NavPanel(JFrame masterFrame) {

		
		setLayout(null);
		setSize(80, 530);
		setBackground(null);
		setOpaque(false);
		
		JButton btnCross = new JButton(new ImageIcon("resources/cross_button.png"));
		btnCross.setBounds(52, 2, 25, 25);
		btnCross.setFocusable(false);
		btnCross.setContentAreaFilled(false);
		btnCross.setOpaque(false);
		btnCross.setBorderPainted(false);
		btnCross.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCross.addActionListener((event)->{
			this.setVisible(false);
			((DashBoard)masterFrame).getBtnShowNav().setVisible(true);
		});
		
		add(btnCross);
		
		menuPanel = new JPanel();
		menuPanel.setLayout(new GridLayout(8, 1, 0, 0));
		menuPanel.setBounds(0, 30, 50, 500);
		menuPanel.setForeground(new Color(0, 0, 0));
		menuPanel.setBackground(Color.BLACK);
		menuPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(menuPanel);
		
//		but1 = new JButton();
//		but2 = new JButton();
//		but4 = new JButton();
//		but5 = new JButton();
//		but6 = new JButton();
//		but7 = new JButton();
		
		List<JButton> butList = Arrays.asList(but1, but2, but4, but5, but6, but7);
		butList.forEach((button)->{
			button = new JButton("");
			setNavStyle(button);
			
			button.addActionListener((event)->{
				
			});
			menuPanel.add(button);
		});
		
		butSwitchView = new JToggleButton(new ImageIcon("resources/icon_switch.png"));
		setNavStyle(butSwitchView);
		butSwitchView.addItemListener((event)->{
			
			DashBoard dashBoard = null;
			if(masterFrame instanceof DashBoard){
				dashBoard = (DashBoard)masterFrame;
				int maxWidth = dashBoard.getContentPane().getWidth();
//				int maxheight = dashBoard.getContentPane().getHeight();
				
				if(((JToggleButton)event.getSource()).isSelected()){

					dashBoard.getLblInstisoft().setLocation(2, 11);
					dashBoard.getSidePanel().setLocation(maxWidth - dashBoard.getSidePanel().getWidth(), 0);
					dashBoard.getLblHeader().setLocation(maxWidth - (234 + dashBoard.getLblHeader().getWidth()), 25);
					dashBoard.getLblHeader().setHorizontalAlignment(SwingConstants.TRAILING);
					dashBoard.getContainerPane().setLocation(maxWidth - (234 + dashBoard.getContainerPane().getWidth()), 98);
					
//					((JToggleButton)event.getSource()).getRootPane().setLocation(maxWidth - this.getWidth(), 60);
				}
				else{
					dashBoard.getLblInstisoft().setLocation(1198, 11);
					dashBoard.getLblHeader().setLocation(234, 25);
					dashBoard.getLblHeader().setHorizontalAlignment(SwingConstants.LEADING);
					dashBoard.getContainerPane().setLocation(234, 98);
					dashBoard.getSidePanel().setLocation(0,0);
					
//					((JToggleButton)event.getSource()).getRootPane().setLocation(0, 60);
				}
				
				dashBoard.revalidate();
				dashBoard.repaint();
				
			}
			
		});
		menuPanel.add(butSwitchView);
		
		
		butLogout = new JButton(new ImageIcon("resources/icon_logout.png"));
		setNavStyle(butLogout);
		butLogout.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
		butLogout.addActionListener((event)->{
			masterFrame.dispose();
			new MainFrame();
		});
		menuPanel.add(butLogout);
		
		setVisible(false);
	}
	
	

	private void setNavStyle(JButton button){
		button.setContentAreaFilled(false);
		button.setOpaque(false);
		button.setBorder(new MatteBorder(0, 0, 1, 0, Color.WHITE));
	}
	
	private void setNavStyle(JToggleButton button){
		button.setContentAreaFilled(false);
		button.setOpaque(false);
		button.setBorder(new MatteBorder(0, 0, 1, 0, Color.WHITE));
	}

}
