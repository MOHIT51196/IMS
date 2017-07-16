package com.instisoft.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

import com.instisoft.form.views.AdmissionFormPanel;
import com.instisoft.form.views.EventFormPanel;
import com.instisoft.table.views.EventTablePanel;
import com.instisoft.table.views.FeesTablePanel;


public class MenuBar extends JMenuBar {

	private static final long serialVersionUID = 1L;
	
	private Color bgColor;
	
	public MenuBar(JFrame masterFrame) {
		
		bgColor = new Color(169,169,169);
//		setBorder(new EmptyBorder(4, 0, 4, 0));
		setBorderPainted(false);
		setFocusable(false);
		
		UIManager.put("Menu.selectionBackground", Color.WHITE);
		UIManager.put("Menu.selectionForeground", Color.GRAY);
		UIManager.put("Menu.opaque", false);
		UIManager.put("MenuItem.selectionBackground", new Color(169,169,169));
		UIManager.put("MenuItem.selectionForeground", Color.WHITE);
		
//		Panel to add onto masterFrame
		AdmissionFormPanel admissionFormPanel = new AdmissionFormPanel();
		EventFormPanel eventFormPanel = new EventFormPanel();
		FeesTablePanel feesTablePanel = new FeesTablePanel();
		EventTablePanel eventTablePanel = new EventTablePanel();
		
		
		JMenu mnEvents = new JMenu("Events");
		setStyle(mnEvents);
		add(mnEvents);
		
		JMenuItem UpcomingEvents = new JMenuItem("Upcoming Events");
		setItemColor(UpcomingEvents);
		UpcomingEvents.addActionListener((event)->{
			((DashBoard)masterFrame).setHeader("Upcoming Events");
			((DashBoard)masterFrame).showPanel(eventTablePanel);;
			
		});
		mnEvents.add(UpcomingEvents);
		JMenuItem RecentEvents = new JMenuItem("Recent Events");
		setItemColor(RecentEvents);
		mnEvents.add(RecentEvents);
		JMenuItem AddEvents = new JMenuItem("Create New Event");
		setItemColor(AddEvents);
		AddEvents.addActionListener((event)->{
			((DashBoard)masterFrame).setHeader("Create Event");
			((DashBoard)masterFrame).showPanel(eventFormPanel);;
			
		});
		mnEvents.add(AddEvents);
		
		JMenu mnFees = new JMenu("Fees");
		setStyle(mnFees);
		add(mnFees);
		
		JMenuItem DueFees = new JMenuItem("Due Fees");
		setItemColor(DueFees);
		mnFees.add(DueFees);
		JMenuItem FeesCollected = new JMenuItem("Fees Collected");
		setItemColor(FeesCollected);
		FeesCollected.addActionListener((event)->{
			((DashBoard)masterFrame).setHeader("Fee Collection");
			((DashBoard)masterFrame).showPanel(feesTablePanel);
			
		});
		mnFees.add(FeesCollected);
		
		JMenu mnCourses = new JMenu("Courses");
		setStyle(mnCourses);
		add(mnCourses);
		
		JMenuItem currentCources = new JMenuItem("Current Cources");
		setItemColor(currentCources);
		mnCourses.add(currentCources);
		
		JMenuItem addCource = new JMenuItem("Create new Cource");
		setItemColor(addCource);
		mnCourses.add(addCource);
		
		JMenuItem counselBook = new JMenuItem("Counseller's Book");
		setItemColor(counselBook);
		mnCourses.add(counselBook);
		
		
		
		JMenu mnAvail = new JMenu("Availability");
		setStyle(mnAvail);
		add(mnAvail);
		
		
		
		JMenu mnBatches = new JMenu("Batches");
		setStyle(mnBatches);
		add(mnBatches);
		
		JMenuItem currentBatches = new JMenuItem("Batch Batches");
		setItemColor(currentBatches);
		mnBatches.add(currentBatches);
		
		JMenuItem addBatch = new JMenuItem("Create new Batch");
		setItemColor(addBatch);
		mnBatches.add(addBatch);
		
		
		
		JMenu mnAdmission = new JMenu("Admission");
		setStyle(mnAdmission);
		add(mnAdmission);
		
		JMenuItem newAdmission = new JMenuItem("New Admission");
		setItemColor(newAdmission);
		newAdmission.addActionListener((event)->{
			((DashBoard)masterFrame).setHeader("Admission Form");
			((DashBoard)masterFrame).showPanel(admissionFormPanel);
			
		});
		mnAdmission.add(newAdmission);
		
		JMenuItem cancelAdmission = new JMenuItem("Cancel Admission");
		setItemColor(cancelAdmission);
		mnAdmission.add(cancelAdmission);
		
		
		
		JMenu mnStudents = new JMenu("Students Record");
		setStyle(mnStudents);
		add(mnStudents);
		
		
		
		JMenu mnSchedule = new JMenu("Schedule");
		setStyle(mnSchedule);
		add(mnSchedule);
		
		JMenuItem Tests = new JMenuItem("Test Schedule");
		setItemColor(Tests);
		mnSchedule.add(Tests);
		JMenuItem Projects = new JMenuItem("Project Schedule");
		setItemColor(Projects);
		mnSchedule.add(Projects);
		JMenuItem Holidays = new JMenuItem("Holiday Schedule");
		setItemColor(Holidays);
		mnSchedule.add(Holidays);
		JMenuItem TimeTable = new JMenuItem("Faculty Schedule");
		setItemColor(TimeTable);
		mnSchedule.add(TimeTable);
		
		
		
		JMenu mnGraphs = new JMenu("Graphs");
		setStyle(mnGraphs);
		add(mnGraphs);
		
		JMenuItem salesGraphs = new JMenuItem("Sales Graphs");
		setItemColor(salesGraphs);
		mnGraphs.add(salesGraphs);
		
		JMenuItem attendanceGraphs = new JMenuItem("Attendance Graphs");
		setItemColor(attendanceGraphs);
		mnGraphs.add(attendanceGraphs);
		
		JMenuItem targetGraphs = new JMenuItem("Target Graphs");
		setItemColor(targetGraphs);
		mnGraphs.add(targetGraphs);
		
		JMenuItem performanceGraphs = new JMenuItem("Performance Graphs");
		setItemColor(performanceGraphs);
		mnGraphs.add(performanceGraphs);
		
	}
	
	void setItemColor(JMenuItem item){
		item.setForeground(Color.GRAY);
		item.setBackground(Color.WHITE);
	}
	
	void setStyle(JMenu menu){
		menu.setVerticalAlignment(JMenu.CENTER);
		menu.setHorizontalAlignment(JMenu.CENTER);
		menu.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		menu.setBorderPainted(false);
		menu.setForeground(Color.WHITE);
	}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(bgColor);
        g2d.fillRect(0, 0, getWidth() - 1, getHeight() - 1);

    }

}
