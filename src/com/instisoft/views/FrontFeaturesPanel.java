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
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		add(panel_4);
		panel_4.setLayout(null);
		
		/*image = ImageIO.read(new File("resources/timetable.jpg"));
		
		@Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters            
	    }*/
		
		//BufferedImage myPicture = ImageIO.read(new File("resources/timetable.jpg"));
		ImageIcon TimeTable = new ImageIcon("resources/timetable.jpg");
		Image scaleTimeTable = TimeTable.getImage().getScaledInstance(300, 220,Image.SCALE_DEFAULT);
		JLabel TimeTableLabel = new JLabel(new ImageIcon(scaleTimeTable));
		TimeTableLabel.setSize(300, 220);
		TimeTableLabel.setLocation(0, 0);
		panel_1.add(TimeTableLabel);
		
		JLabel lbl_1_panel_1 = new JLabel("Faculty");
		lbl_1_panel_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 26));
		lbl_1_panel_1.setBounds(300, 0, 254, 35);
		lbl_1_panel_1.setBackground(SystemColor.windowBorder);
		lbl_1_panel_1.setOpaque(true);
		lbl_1_panel_1.setHorizontalAlignment(JLabel.CENTER);
		lbl_1_panel_1.setVerticalAlignment(JLabel.CENTER);
		lbl_1_panel_1.setForeground(Color.WHITE);
		panel_1.add(lbl_1_panel_1);
		
		JLabel lbl_2_panel_1 = new JLabel("Schedule");
		lbl_2_panel_1.setBounds(300, 35, 254, 35);
		lbl_2_panel_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 26));
		lbl_2_panel_1.setBackground(SystemColor.windowBorder);
		lbl_2_panel_1.setOpaque(true);
		lbl_2_panel_1.setHorizontalAlignment(JLabel.CENTER);
		lbl_2_panel_1.setVerticalAlignment(JLabel.CENTER);
		lbl_2_panel_1.setForeground(Color.WHITE);
		panel_1.add(lbl_2_panel_1);
		
		JLabel lbl_3_panel_1 = new JLabel("A Time-Table");
		lbl_3_panel_1.setBounds(300, 75, 254, 29);
		lbl_3_panel_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_3_panel_1.setBackground(SystemColor.windowBorder);
		lbl_3_panel_1.setOpaque(true);
		lbl_3_panel_1.setHorizontalAlignment(JLabel.CENTER);
		lbl_3_panel_1.setVerticalAlignment(JLabel.CENTER);
		lbl_3_panel_1.setForeground(Color.WHITE);
		panel_1.add(lbl_3_panel_1);
		
		JLabel lbl_4_panel_1 = new JLabel("to coordinate");
		lbl_4_panel_1.setBounds(300, 104, 254, 29);
		lbl_4_panel_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_4_panel_1.setBackground(SystemColor.windowBorder);
		lbl_4_panel_1.setOpaque(true);
		lbl_4_panel_1.setHorizontalAlignment(JLabel.CENTER);
		lbl_4_panel_1.setVerticalAlignment(JLabel.CENTER);
		lbl_4_panel_1.setForeground(Color.WHITE);
		panel_1.add(lbl_4_panel_1);
		
		JLabel lbl_5_panel_1 = new JLabel("your students,");
		lbl_5_panel_1.setBounds(300, 133, 254, 29);
		lbl_5_panel_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_5_panel_1.setBackground(SystemColor.windowBorder);
		lbl_5_panel_1.setOpaque(true);
		lbl_5_panel_1.setHorizontalAlignment(JLabel.CENTER);
		lbl_5_panel_1.setVerticalAlignment(JLabel.CENTER);
		lbl_5_panel_1.setForeground(Color.WHITE);
		panel_1.add(lbl_5_panel_1);
		
		JLabel lbl_6_panel_1 = new JLabel("teachers, rooms");
		lbl_6_panel_1.setBounds(300, 162, 254, 29);
		lbl_6_panel_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_6_panel_1.setBackground(SystemColor.windowBorder);
		lbl_6_panel_1.setOpaque(true);
		lbl_6_panel_1.setHorizontalAlignment(JLabel.CENTER);
		lbl_6_panel_1.setVerticalAlignment(JLabel.CENTER);
		lbl_6_panel_1.setForeground(Color.WHITE);
		panel_1.add(lbl_6_panel_1);
		
		JLabel lbl_7_panel_1 = new JLabel("& time slots");
		lbl_7_panel_1.setBounds(300, 191, 254, 29);
		lbl_7_panel_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_7_panel_1.setBackground(SystemColor.windowBorder);
		lbl_7_panel_1.setOpaque(true);
		lbl_7_panel_1.setHorizontalAlignment(JLabel.CENTER);
		lbl_7_panel_1.setVerticalAlignment(JLabel.CENTER);
		lbl_7_panel_1.setForeground(Color.WHITE);
		panel_1.add(lbl_7_panel_1);
		
		ImageIcon BulkSms = new ImageIcon("resources/bulksms.jpg");
		Image scaleBulkSms = BulkSms.getImage().getScaledInstance(300, 220,Image.SCALE_DEFAULT);
		JLabel BulkSmsLabel = new JLabel(new ImageIcon(scaleBulkSms));
		BulkSmsLabel.setSize(300, 220);
		BulkSmsLabel.setLocation(0, 0);
		panel_2.add(BulkSmsLabel);
		
		JLabel lbl_1_panel_2 = new JLabel("Bulk SMS");
		lbl_1_panel_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 26));
		lbl_1_panel_2.setBounds(300, 0, 254, 35);
		lbl_1_panel_2.setBackground(SystemColor.windowBorder);
		lbl_1_panel_2.setOpaque(true);
		lbl_1_panel_2.setHorizontalAlignment(JLabel.CENTER);
		lbl_1_panel_2.setVerticalAlignment(JLabel.CENTER);
		lbl_1_panel_2.setForeground(Color.WHITE);
		panel_2.add(lbl_1_panel_2);
		
		JLabel lbl_2_panel_2 = new JLabel("Service");
		lbl_2_panel_2.setBounds(300, 35, 254, 35);
		lbl_2_panel_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 26));
		lbl_2_panel_2.setBackground(SystemColor.windowBorder);
		lbl_2_panel_2.setOpaque(true);
		lbl_2_panel_2.setHorizontalAlignment(JLabel.CENTER);
		lbl_2_panel_2.setVerticalAlignment(JLabel.CENTER);
		lbl_2_panel_2.setForeground(Color.WHITE);
		panel_2.add(lbl_2_panel_2);
		
		JLabel lbl_3_panel_2 = new JLabel("A Service");
		lbl_3_panel_2.setBounds(300, 75, 254, 29);
		lbl_3_panel_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_3_panel_2.setBackground(SystemColor.windowBorder);
		lbl_3_panel_2.setOpaque(true);
		lbl_3_panel_2.setHorizontalAlignment(JLabel.CENTER);
		lbl_3_panel_2.setVerticalAlignment(JLabel.CENTER);
		lbl_3_panel_2.setForeground(Color.WHITE);
		panel_2.add(lbl_3_panel_2);
		
		JLabel lbl_4_panel_2 = new JLabel("to send SMS");
		lbl_4_panel_2.setBounds(300, 104, 254, 29);
		lbl_4_panel_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_4_panel_2.setBackground(SystemColor.windowBorder);
		lbl_4_panel_2.setOpaque(true);
		lbl_4_panel_2.setHorizontalAlignment(JLabel.CENTER);
		lbl_4_panel_2.setVerticalAlignment(JLabel.CENTER);
		lbl_4_panel_2.setForeground(Color.WHITE);
		panel_2.add(lbl_4_panel_2);
		
		JLabel lbl_5_panel_2 = new JLabel("to all or");
		lbl_5_panel_2.setBounds(300, 133, 254, 29);
		lbl_5_panel_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_5_panel_2.setBackground(SystemColor.windowBorder);
		lbl_5_panel_2.setOpaque(true);
		lbl_5_panel_2.setHorizontalAlignment(JLabel.CENTER);
		lbl_5_panel_2.setVerticalAlignment(JLabel.CENTER);
		lbl_5_panel_2.setForeground(Color.WHITE);
		panel_2.add(lbl_5_panel_2);
		
		JLabel lbl_6_panel_2 = new JLabel("some of the");
		lbl_6_panel_2.setBounds(300, 162, 254, 29);
		lbl_6_panel_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_6_panel_2.setBackground(SystemColor.windowBorder);
		lbl_6_panel_2.setOpaque(true);
		lbl_6_panel_2.setHorizontalAlignment(JLabel.CENTER);
		lbl_6_panel_2.setVerticalAlignment(JLabel.CENTER);
		lbl_6_panel_2.setForeground(Color.WHITE);
		panel_2.add(lbl_6_panel_2);
		
		JLabel lbl_7_panel_2 = new JLabel("selected students");
		lbl_7_panel_2.setBounds(300, 191, 254, 29);
		lbl_7_panel_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_7_panel_2.setBackground(SystemColor.windowBorder);
		lbl_7_panel_2.setOpaque(true);
		lbl_7_panel_2.setHorizontalAlignment(JLabel.CENTER);
		lbl_7_panel_2.setVerticalAlignment(JLabel.CENTER);
		lbl_7_panel_2.setForeground(Color.WHITE);
		panel_2.add(lbl_7_panel_2);
		
		ImageIcon Attendance = new ImageIcon("resources/attendance.png");
		Image scaleAttendance = Attendance.getImage().getScaledInstance(300, 220,Image.SCALE_DEFAULT);
		JLabel AttendanceLabel = new JLabel(new ImageIcon(scaleAttendance));
		AttendanceLabel.setSize(300, 220);
		AttendanceLabel.setLocation(0, 0);
		panel_3.add(AttendanceLabel);
		
		JLabel lbl_1_panel_3 = new JLabel("Attendance");
		lbl_1_panel_3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 26));
		lbl_1_panel_3.setBounds(300, 0, 254, 35);
		lbl_1_panel_3.setBackground(SystemColor.windowBorder);
		lbl_1_panel_3.setOpaque(true);
		lbl_1_panel_3.setHorizontalAlignment(JLabel.CENTER);
		lbl_1_panel_3.setVerticalAlignment(JLabel.CENTER);
		lbl_1_panel_3.setForeground(Color.WHITE);
		panel_3.add(lbl_1_panel_3);
		
		JLabel lbl_2_panel_3 = new JLabel("Marker");
		lbl_2_panel_3.setBounds(300, 35, 254, 35);
		lbl_2_panel_3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 26));
		lbl_2_panel_3.setBackground(SystemColor.windowBorder);
		lbl_2_panel_3.setOpaque(true);
		lbl_2_panel_3.setHorizontalAlignment(JLabel.CENTER);
		lbl_2_panel_3.setVerticalAlignment(JLabel.CENTER);
		lbl_2_panel_3.setForeground(Color.WHITE);
		panel_3.add(lbl_2_panel_3);
		
		JLabel lbl_3_panel_3 = new JLabel("Manage");
		lbl_3_panel_3.setBounds(300, 75, 254, 29);
		lbl_3_panel_3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_3_panel_3.setBackground(SystemColor.windowBorder);
		lbl_3_panel_3.setOpaque(true);
		lbl_3_panel_3.setHorizontalAlignment(JLabel.CENTER);
		lbl_3_panel_3.setVerticalAlignment(JLabel.CENTER);
		lbl_3_panel_3.setForeground(Color.WHITE);
		panel_3.add(lbl_3_panel_3);
		
		JLabel lbl_4_panel_3 = new JLabel("your studets'");
		lbl_4_panel_3.setBounds(300, 104, 254, 29);
		lbl_4_panel_3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_4_panel_3.setBackground(SystemColor.windowBorder);
		lbl_4_panel_3.setOpaque(true);
		lbl_4_panel_3.setHorizontalAlignment(JLabel.CENTER);
		lbl_4_panel_3.setVerticalAlignment(JLabel.CENTER);
		lbl_4_panel_3.setForeground(Color.WHITE);
		panel_3.add(lbl_4_panel_3);
		
		JLabel lbl_5_panel_3 = new JLabel("or faculty's");
		lbl_5_panel_3.setBounds(300, 133, 254, 29);
		lbl_5_panel_3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_5_panel_3.setBackground(SystemColor.windowBorder);
		lbl_5_panel_3.setOpaque(true);
		lbl_5_panel_3.setHorizontalAlignment(JLabel.CENTER);
		lbl_5_panel_3.setVerticalAlignment(JLabel.CENTER);
		lbl_5_panel_3.setForeground(Color.WHITE);
		panel_3.add(lbl_5_panel_3);
		
		JLabel lbl_6_panel_3 = new JLabel("attendance");
		lbl_6_panel_3.setBounds(300, 162, 254, 29);
		lbl_6_panel_3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_6_panel_3.setBackground(SystemColor.windowBorder);
		lbl_6_panel_3.setOpaque(true);
		lbl_6_panel_3.setHorizontalAlignment(JLabel.CENTER);
		lbl_6_panel_3.setVerticalAlignment(JLabel.CENTER);
		lbl_6_panel_3.setForeground(Color.WHITE);
		panel_3.add(lbl_6_panel_3);
		
		JLabel lbl_7_panel_3 = new JLabel("easily !");
		lbl_7_panel_3.setBounds(300, 191, 254, 29);
		lbl_7_panel_3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_7_panel_3.setBackground(SystemColor.windowBorder);
		lbl_7_panel_3.setOpaque(true);
		lbl_7_panel_3.setHorizontalAlignment(JLabel.CENTER);
		lbl_7_panel_3.setVerticalAlignment(JLabel.CENTER);
		lbl_7_panel_3.setForeground(Color.WHITE);
		panel_3.add(lbl_7_panel_3);
	
		ImageIcon Settings = new ImageIcon("resources/settings.jpg");
		Image scaleSettings = Settings.getImage().getScaledInstance(300, 220,Image.SCALE_DEFAULT);
		JLabel SettingsLabel = new JLabel(new ImageIcon(scaleSettings));
		SettingsLabel.setSize(300, 220);
		SettingsLabel.setLocation(0, 0);
		panel_4.add(SettingsLabel);
		
		JLabel lbl_1_panel_4 = new JLabel("Configure");
		lbl_1_panel_4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 26));
		lbl_1_panel_4.setBounds(300, 0, 254, 35);
		lbl_1_panel_4.setBackground(SystemColor.windowBorder);
		lbl_1_panel_4.setOpaque(true);
		lbl_1_panel_4.setHorizontalAlignment(JLabel.CENTER);
		lbl_1_panel_4.setVerticalAlignment(JLabel.CENTER);
		lbl_1_panel_4.setForeground(Color.WHITE);
		panel_4.add(lbl_1_panel_4);
		
		JLabel lbl_2_panel_4 = new JLabel("Software");
		lbl_2_panel_4.setBounds(300, 35, 254, 35);
		lbl_2_panel_4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 26));
		lbl_2_panel_4.setBackground(SystemColor.windowBorder);
		lbl_2_panel_4.setOpaque(true);
		lbl_2_panel_4.setHorizontalAlignment(JLabel.CENTER);
		lbl_2_panel_4.setVerticalAlignment(JLabel.CENTER);
		lbl_2_panel_4.setForeground(Color.WHITE);
		panel_4.add(lbl_2_panel_4);
		
		JLabel lbl_3_panel_4 = new JLabel("Direct");
		lbl_3_panel_4.setBounds(300, 75, 254, 29);
		lbl_3_panel_4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_3_panel_4.setBackground(SystemColor.windowBorder);
		lbl_3_panel_4.setOpaque(true);
		lbl_3_panel_4.setHorizontalAlignment(JLabel.CENTER);
		lbl_3_panel_4.setVerticalAlignment(JLabel.CENTER);
		lbl_3_panel_4.setForeground(Color.WHITE);
		panel_4.add(lbl_3_panel_4);
		
		JLabel lbl_4_panel_4 = new JLabel("the software");
		lbl_4_panel_4.setBounds(300, 104, 254, 29);
		lbl_4_panel_4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_4_panel_4.setBackground(SystemColor.windowBorder);
		lbl_4_panel_4.setOpaque(true);
		lbl_4_panel_4.setHorizontalAlignment(JLabel.CENTER);
		lbl_4_panel_4.setVerticalAlignment(JLabel.CENTER);
		lbl_4_panel_4.setForeground(Color.WHITE);
		panel_4.add(lbl_4_panel_4);
		
		JLabel lbl_5_panel_4 = new JLabel("in the way");
		lbl_5_panel_4.setBounds(300, 133, 254, 29);
		lbl_5_panel_4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_5_panel_4.setBackground(SystemColor.windowBorder);
		lbl_5_panel_4.setOpaque(true);
		lbl_5_panel_4.setHorizontalAlignment(JLabel.CENTER);
		lbl_5_panel_4.setVerticalAlignment(JLabel.CENTER);
		lbl_5_panel_4.setForeground(Color.WHITE);
		panel_4.add(lbl_5_panel_4);
		
		JLabel lbl_6_panel_4 = new JLabel("you want it");
		lbl_6_panel_4.setBounds(300, 162, 254, 29);
		lbl_6_panel_4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_6_panel_4.setBackground(SystemColor.windowBorder);
		lbl_6_panel_4.setOpaque(true);
		lbl_6_panel_4.setHorizontalAlignment(JLabel.CENTER);
		lbl_6_panel_4.setVerticalAlignment(JLabel.CENTER);
		lbl_6_panel_4.setForeground(Color.WHITE);
		panel_4.add(lbl_6_panel_4);
		
		JLabel lbl_7_panel_4 = new JLabel("to work");
		lbl_7_panel_4.setBounds(300, 191, 254, 29);
		lbl_7_panel_4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		lbl_7_panel_4.setBackground(SystemColor.windowBorder);
		lbl_7_panel_4.setOpaque(true);
		lbl_7_panel_4.setHorizontalAlignment(JLabel.CENTER);
		lbl_7_panel_4.setVerticalAlignment(JLabel.CENTER);
		lbl_7_panel_4.setForeground(Color.WHITE);
		panel_4.add(lbl_7_panel_4);
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
