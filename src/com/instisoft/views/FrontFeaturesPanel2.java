package com.instisoft.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.TableColumnModel;

import com.instisoft.table.views.Table;
import com.instisoft.table.views.Toggle;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;

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

	private static JPanel contentPane;
	
	/**
	 * Create the panel.
	 */
	public FrontFeaturesPanel2() {
		
		super(true);

		setSize(1118, 450);
		setBackground(null);
		setOpaque(false);
		setLayout(null);
		
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
		//lblNewLabel.setBorder(new RoundedBorder(Color.BLUE, 50));
	    //JLabel label = new JLabel("<html>Stack<br/>Overflow</html>");
	    LineBorder line = new LineBorder(Color.black, 5, true); // color, thickness, rounded
	    lblMessages.setBorder(line);
	    add(lblMessages);
	    
	    /*JLabel lblNewLabel_1 = new JLabel("No Messages !!");
	    lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
	    lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
	    lblNewLabel_1.setVerticalAlignment(JLabel.CENTER);
	    //lblNewLabel_1.setOpaque(true);
	    lblNewLabel_1.setBounds(2, 34, 546, 186);
	    panel.add(lblNewLabel_1);*/

		//panel.add(lblNewLabel);
	    
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
	    
	    String EventsColumnNames[] = {"S. No.", "Name", "Date", "Venue", "Time", "Description", "Status"};
		
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
	    	    EventsModel.getColumn(2).setPreferredWidth(25);
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
		
		String FacultyColumnNames[] = {"S.No.", "Faculty Name", "Status (P/A)"};
		
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
