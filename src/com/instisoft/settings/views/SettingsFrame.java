package com.instisoft.settings.views;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.instisoft.views.DashBoard;

public class SettingsFrame extends JFrame {

	private JPanel contentPane;

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
		setLayout(null);
		setBackground(null);
		setLocationRelativeTo(masterFrame);
		setResizable(false);
		
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color( 18, 30, 49));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		
	}

}
