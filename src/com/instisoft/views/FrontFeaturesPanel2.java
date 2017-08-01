package com.instisoft.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.geom.RoundRectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.TableColumnModel;

import org.jdesktop.swingx.border.DropShadowBorder;

import com.instisoft.table.views.Table;
import com.instisoft.table.views.Toggle;

class RoundedBorder extends AbstractBorder {

public RoundedBorder(Color c, int g) {
    color = c;
    gap = g;
}

@Override
public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
    super.paintBorder(c, g, x, y, width, height);
    Graphics2D g2d;
    if (g instanceof Graphics2D) {
        g2d = (Graphics2D) g;
        g2d.setColor(color);
        System.out.println(x + y);
        /*g2d.draw(new Line2D.Double((double)x, (double)y + 10, (double)x + 3, (double)y + 3));
        g2d.draw(new Line2D.Double((double)x + 3, (double)y + 3, (double)x + 10, (double)y));
        g2d.draw(new Line2D.Double((double)x + 10, (double)y, (double)x + 30, (double)y));
        g2d.draw(new Line2D.Double((double)x + 30, (double)y, (double)x + 33, (double)y + 2));
        g2d.draw(new Line2D.Double((double)x + 33, (double)y + 2, (double)x + 36, (double)y + 8));
        g2d.draw(new Line2D.Double((double)x + 36, (double)y + 8, (double)x + 36, (double)y + 28));
        g2d.draw(new Line2D.Double((double)x + 36, (double)y + 28, (double)x + 34, (double)y + 31));
        g2d.draw(new Line2D.Double((double)x + 34, (double)y + 31, (double)x + 32, (double)y + 33));
        g2d.draw(new Line2D.Double((double)x + 32, (double)y + 33, (double)x + 6, (double)y + 33));
        g2d.draw(new Line2D.Double((double)x + 6, (double)y + 33, (double)x + 3, (double)y + 31));
        g2d.draw(new Line2D.Double((double)x + 3, (double)y + 31, (double)x, (double)y + 27));
        g2d.draw(new Line2D.Double((double)x, (double)y + 27, (double)x, (double)y + 10));*/
        g2d.draw(new RoundRectangle2D.Double(x, y, width - 1, height - 1, gap, gap));
    }
}

@Override
public Insets getBorderInsets(Component c) {
    return (getBorderInsets(c, new Insets(gap, gap, gap, gap)));
}

@Override
public Insets getBorderInsets(Component c, Insets insets) {
    insets.left = insets.top = insets.right = insets.bottom = gap;
    return insets;
}

@Override
public boolean isBorderOpaque() {
    return true;
}

// Variable declarations
private final Color color;
private final int gap;
}

public class FrontFeaturesPanel2 extends JPanel {

	
	private static final long serialVersionUID = 1L;
	
	private static JPanel contentPane;
	
	private JLabel lblFacultyName;
	
	
	private Timer nameAnim;
	
	// ANIMATION INITIALIZATION BLOCK
	{
		nameAnim = new Timer(600, (event)->{
			lblFacultyName.setVisible(!lblFacultyName.isVisible());
		});
	}
	
	public FrontFeaturesPanel2() {
		
		super(true);

		setSize(1116*2, 450);
//		setLocation(-1118, 0); //temporary
		setBackground(null);
		setOpaque(false);
		setLayout(null);
		
		
		
//		===============================  OTHER HALF COMPONENTS  ====================================
		
		JPanel Messagespanel = new JPanel();
		Messagespanel.setBounds(0, 40, 550, 180);
		Messagespanel.setBackground(null);
		Messagespanel.setOpaque(false);
		Messagespanel.setLayout(new BorderLayout());
		add(Messagespanel);
		
		JLabel lblMessages = new JLabel("Messages");
		lblMessages.setForeground(Color.WHITE);
		lblMessages.setFont(new Font("Footlight MT Light", Font.BOLD, 22));
		lblMessages.setBounds(0, 0, 550, 40);
		lblMessages.setBackground(new Color(66, 122, 203));
		lblMessages.setOpaque(true);
		lblMessages.setHorizontalAlignment(JLabel.CENTER);
		lblMessages.setVerticalAlignment(JLabel.CENTER);
		
		
	    LineBorder line = new LineBorder(Color.WHITE, 1, true); // color, thickness, rounded
	    lblMessages.setBorder(line);
	    add(lblMessages);
	    
	  
	    String MessagesColumnNames[] = {"Message", "Date", "Time"};
		
		Object[][] data = {
				//{"a","a","a","a","a","a","a","a","a"}
				};
		
		final Toggle isEditable = new Toggle(false);
		
		Table MessagesTable = new Table(MessagesColumnNames, data, isEditable);
		TableColumnModel MessagesModel = MessagesTable.getColumnModel();
		MessagesModel.getColumn(0).setPreferredWidth(15);     
		MessagesModel.getColumn(1).setPreferredWidth(100);    
		MessagesModel.getColumn(2).setPreferredWidth(25);
	    Messagespanel.add(MessagesTable.getScrollPane(),BorderLayout.CENTER); 
	    MessagesTable.getHeader().setBackground(Color.WHITE);
	    MessagesTable.getHeader().setForeground(new Color(66, 122, 203));
	    
	    String EventsColumnNames[] = {"S No.", "Name", "Date", "Venue", "Time"};
		
	    JPanel Eventspanel = new JPanel();
	    Eventspanel.setBounds(2, 270, 550, 180);
	    Eventspanel.setBackground(null);
	    Eventspanel.setOpaque(false);
	    Eventspanel.setLayout(new BorderLayout());
	    add(Eventspanel);
	    
	    	    Table Eventstable = new Table(EventsColumnNames, data, isEditable);
	    	    TableColumnModel EventsModel = Eventstable.getColumnModel();
	    	    EventsModel.getColumn(0).setPreferredWidth(15);     
	    	    EventsModel.getColumn(1).setPreferredWidth(100);    
	    	    EventsModel.getColumn(2).setPreferredWidth(30);
	    	    EventsModel.getColumn(3).setPreferredWidth(100);
	    	    EventsModel.getColumn(4).setPreferredWidth(25);
	    	    Eventspanel.add(Eventstable.getScrollPane(),BorderLayout.CENTER); 
	    	    
	    	    JLabel lblEvents = new JLabel("Recent Events");
	    	    lblEvents.setBounds(0, 230, 550, 40);
	    	    add(lblEvents);
	    	    lblEvents.setForeground(Color.WHITE);
	    	    lblEvents.setFont(new Font("Footlight MT Light", Font.BOLD, 22));
	    	    lblEvents.setBackground(new Color(66, 122, 203));
	    	    lblEvents.setOpaque(true);
	    	    lblEvents.setHorizontalAlignment(JLabel.CENTER);
	    	    lblEvents.setVerticalAlignment(JLabel.CENTER);
	    	    lblEvents.setBorder(line);
	    	    Eventstable.getHeader().setBackground(Color.WHITE);
	    		Eventstable.getHeader().setForeground(new Color(66, 122, 203));
		
		String FacultyColumnNames[] = {"S No.", "Faculty Name", "Status (P/A)"};
		
	    JPanel Facultypanel = new JPanel();
	    Facultypanel.setBounds(562, 40, 548, 410);
	    Facultypanel.setBackground(null);
	    Facultypanel.setOpaque(false);
	    Facultypanel.setLayout(new BorderLayout());
	    add(Facultypanel);
	    
	    	    Table Facultytable = new Table(FacultyColumnNames, data, isEditable);
	    	    TableColumnModel FacultyModel = Facultytable.getColumnModel();
	    	    FacultyModel.getColumn(0).setPreferredWidth(2);     
	    	    FacultyModel.getColumn(1).setPreferredWidth(100);    
	    	    FacultyModel.getColumn(2).setPreferredWidth(25);
	    	    Facultypanel.add(Facultytable.getScrollPane(),BorderLayout.CENTER); 
	    	    
	    	    JLabel lblFaculty = new JLabel("Faculty Avail Today");
	    	    lblFaculty.setBounds(560, 0, 550, 40);
	    	    add(lblFaculty);
	    	    lblFaculty.setForeground(Color.WHITE);
	    	    lblFaculty.setFont(new Font("Footlight MT Light", Font.BOLD, 22));
	    	    lblFaculty.setBackground(new Color(66, 122, 203));
	    	    lblFaculty.setOpaque(true);
	    	    lblFaculty.setHorizontalAlignment(JLabel.CENTER);
	    	    lblFaculty.setVerticalAlignment(JLabel.CENTER);
	    	    lblFaculty.setBorder(line);
		Facultytable.getHeader().setBackground(Color.WHITE);
		Facultytable.getHeader().setForeground(new Color(66, 122, 203));
		
		
//		===============================  RIGHT HALF COMPONENTS  ====================================
		DropShadowBorder shadowBorder = new DropShadowBorder();
		shadowBorder.setShadowColor(Color.WHITE);
		shadowBorder.setShadowOpacity(0.7f);
		shadowBorder.setShadowSize(10);
		shadowBorder.setShowLeftShadow(true);
		shadowBorder.setShowRightShadow(true);
		shadowBorder.setShowBottomShadow(true);
		shadowBorder.setShowTopShadow(true);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBounds(this.getWidth()/2 + 54, 0, 325, 450);
//		leftPanel.setBounds(54, 0, 325, 450);  //for designing
		leftPanel.setBackground(Color.GRAY);
		leftPanel.setLayout(null);
		add(leftPanel);
		
		JLabel lblIcon = new JLabel(new ImageIcon("resources/icon_lecturer.png"));
		lblIcon.setVerticalAlignment(SwingConstants.TOP);
		lblIcon.setBounds(16, 11, 293, 195);
		lblIcon.setOpaque(false);
		leftPanel.add(lblIcon);
		
		JLabel lblBestFaculty = new JLabel("Best Faculty Performance");
		lblBestFaculty.setForeground(Color.WHITE);
		lblBestFaculty.setBorder(new MatteBorder(0, 0, 1, 0, Color.WHITE));
		lblBestFaculty.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBestFaculty.setHorizontalAlignment(SwingConstants.CENTER);
		lblBestFaculty.setBounds(16, 235, 293, 32);
		leftPanel.add(lblBestFaculty);
		
		JLabel lblAttendance = new JLabel("Attendance");
		lblAttendance.setForeground(Color.WHITE);
		lblAttendance.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblAttendance.setBounds(20, 296, 122, 20);
		leftPanel.add(lblAttendance);
		
		JLabel lblCurrentStudents = new JLabel("Current Students");
		lblCurrentStudents.setForeground(Color.WHITE);
		lblCurrentStudents.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCurrentStudents.setBounds(20, 334, 122, 20);
		leftPanel.add(lblCurrentStudents);
		
		JLabel lblLecturesThisMonth = new JLabel("Lectures this month");
		lblLecturesThisMonth.setForeground(Color.WHITE);
		lblLecturesThisMonth.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblLecturesThisMonth.setBounds(20, 373, 122, 20);
		leftPanel.add(lblLecturesThisMonth);
		
		JLabel label = new JLabel(":");
		label.setForeground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(155, 292, 23, 25);
		leftPanel.add(label);
		
		JLabel label_1 = new JLabel(":");
		label_1.setForeground(Color.WHITE);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(155, 330, 23, 25);
		leftPanel.add(label_1);
		
		JLabel label_2 = new JLabel(":");
		label_2.setForeground(Color.WHITE);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(155, 369, 23, 25);
		leftPanel.add(label_2);
		
		JLabel lbl_AttendanceValue = new JLabel("200/245");
		lbl_AttendanceValue.setForeground(Color.WHITE);
		lbl_AttendanceValue.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbl_AttendanceValue.setBounds(207, 296, 103, 20);
		leftPanel.add(lbl_AttendanceValue);
		
		JLabel lbl_CurrentStudentValue = new JLabel("112");
		lbl_CurrentStudentValue.setForeground(Color.WHITE);
		lbl_CurrentStudentValue.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbl_CurrentStudentValue.setBounds(207, 335, 103, 20);
		leftPanel.add(lbl_CurrentStudentValue);
		
		JLabel lbl_LecturesValue = new JLabel("43");
		lbl_LecturesValue.setForeground(Color.WHITE);
		lbl_LecturesValue.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbl_LecturesValue.setBounds(207, 374, 103, 20);
		leftPanel.add(lbl_LecturesValue);
		
		lblFacultyName = new JLabel("Amit Srivastava");
		lblFacultyName.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		lblFacultyName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacultyName.setBounds(54, 407, 221, 32);
		lblFacultyName.setForeground(new Color(0, 255, 0));
		leftPanel.add(lblFacultyName);
		
		// FOR FACULTY NAME BLINK ANIMATION
		nameAnim.start();
		
		JPanel rightPanel = new JPanel();
		rightPanel.setBounds(this.getWidth()/2 + 440, 0, 600, 450);
//		rightPanel.setBounds(440, 0, 600, 450);  //for designing
		rightPanel.setBackground(Color.LIGHT_GRAY);
		rightPanel.setLayout(null);
		add(rightPanel);
		
		JLabel lblPerformanceStat = new JLabel("Performance Statistics");
		lblPerformanceStat.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerformanceStat.setForeground(Color.WHITE);
		lblPerformanceStat.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPerformanceStat.setBorder(new MatteBorder(0, 0, 1, 0, Color.WHITE));
		lblPerformanceStat.setBounds(36, 11, 526, 36);
		rightPanel.add(lblPerformanceStat);
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
					frame.setBounds(100, 100, 1400, 550);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.getContentPane().setLayout(null);
					frame.setBackground(Color.GRAY);
					
					contentPane = new JPanel();
					contentPane.setBackground(SystemColor.windowBorder);
					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
					contentPane.setLayout(null);
					contentPane.add(new FrontFeaturesPanel2());
					frame.setContentPane(contentPane);
					
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
}
