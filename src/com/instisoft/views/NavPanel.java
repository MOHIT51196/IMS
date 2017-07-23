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
import javax.swing.border.MatteBorder;

import com.instisoft.user.views.MainFrame;

public class NavPanel extends JPanel {

	
	private static final long serialVersionUID = 1L;
	
	private JButton but1;
	private JButton but2;
	private JButton but3;
	private JButton but4;
	private JButton but5;
	private JButton but6;
	private JButton but7;
	
	private JButton butLogout;
	
	public NavPanel(JFrame masterFrame) {

		setLayout(new GridLayout(8, 1, 0, 0));
		setBounds(0, 60, 50, 500);
		setForeground(new Color(0, 0, 0));
		setBackground(Color.BLACK);
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		
		
		List<JButton> butList = Arrays.asList(but1, but2, but3, but4, but5, but6, but7);
		butList.forEach((button)->{
			button = new JButton("");
			setNavStyle(button);
			
			button.addActionListener((event)->{
				
			});
			add(button);
		});
		
		butLogout = new JButton(new ImageIcon("resources/icon_logout.png"));
		
		setNavStyle(butLogout);
		butLogout.addActionListener((event)->{
			masterFrame.dispose();
			new MainFrame();
		});
		add(butLogout);
		
		setVisible(false);
	}
	
	

	private void setNavStyle(JButton button){
		button.setContentAreaFilled(false);
		button.setOpaque(false);
		button.setBorder(new MatteBorder(0, 0, 1, 0, Color.WHITE));
	}

}
