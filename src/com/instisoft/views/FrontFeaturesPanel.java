package com.instisoft.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Font;

public class FrontFeaturesPanel extends JPanel {
	
	private static JPanel contentPane;
	private BufferedImage image;

	/**
	 * Create the panel.
	 * @throws IOException 
	 */
	public FrontFeaturesPanel() throws IOException {
		setSize(1118, 450);
		setBackground(null);
		setOpaque(false);
		setLayout(new GridLayout(2, 2, 10, 10));
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		add(panel_3);
		panel_3.setLayout(null);
		
		/*image = ImageIO.read(new File("resources/timetable.jpg"));
		
		@Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters            
	    }*/
		
		//BufferedImage myPicture = ImageIO.read(new File("resources/timetable.jpg"));
		ImageIcon icon = new ImageIcon("resources/timetable.jpg");
		Image scaleImage = icon.getImage().getScaledInstance(300, 220,Image.SCALE_DEFAULT);
		panel_1.setLayout(null);
		JLabel picLabel = new JLabel(new ImageIcon(scaleImage));
		picLabel.setSize(300, 220);
		picLabel.setLocation(0, 0);
		panel_1.add(picLabel);
		
		JLabel lblNewLabel = new JLabel("Faculty");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(300, 0, 254, 29);
		lblNewLabel.setBackground(SystemColor.windowBorder);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel.setVerticalAlignment(JLabel.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Schedule");
		lblNewLabel_1.setBounds(300, 29, 254, 29);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_1.setBackground(SystemColor.windowBorder);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_1.setVerticalAlignment(JLabel.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("A Time-Table");
		lblNewLabel_2.setBounds(300, 75, 254, 29);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBackground(SystemColor.windowBorder);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2.setVerticalAlignment(JLabel.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("to coordinate");
		lblNewLabel_3.setBounds(300, 104, 254, 29);
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3.setBackground(SystemColor.windowBorder);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_3.setVerticalAlignment(JLabel.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("your students,");
		lblNewLabel_4.setBounds(300, 133, 254, 29);
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_4.setBackground(SystemColor.windowBorder);
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_4.setVerticalAlignment(JLabel.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("teachers, rooms");
		lblNewLabel_5.setBounds(300, 162, 254, 29);
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_5.setBackground(SystemColor.windowBorder);
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_5.setVerticalAlignment(JLabel.CENTER);
		lblNewLabel_5.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("& time slots");
		lblNewLabel_6.setBounds(300, 191, 254, 29);
		lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_6.setBackground(SystemColor.windowBorder);
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_6.setVerticalAlignment(JLabel.CENTER);
		lblNewLabel_6.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_6);
		
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
					
					contentPane = new JPanel();
					contentPane.setBackground(SystemColor.windowBorder);
					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
					contentPane.setLayout(null);
					contentPane.add(new FrontFeaturesPanel());
					frame.setContentPane(contentPane);
					
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
}
}
