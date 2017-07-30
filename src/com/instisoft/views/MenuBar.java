package com.instisoft.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

import com.instisoft.form.views.AdmissionFormPanel;
import com.instisoft.form.views.BatchFormPanel;
import com.instisoft.form.views.CourseFormPanel;
import com.instisoft.form.views.EventFormPanel;
import com.instisoft.form.views.FacultyFormPanel;
import com.instisoft.graph.views.GraphPanel;
import com.instisoft.table.views.BatchTablePanel;
import com.instisoft.table.views.CourseTablePanel;
import com.instisoft.table.views.DueFeesPanel;
import com.instisoft.table.views.EventTablePanel;
import com.instisoft.table.views.FacultyTablePanel;
import com.instisoft.table.views.FeesTablePanel;
import com.instisoft.table.views.HolidaySchedulePanel;
import com.instisoft.table.views.ProjectSchedulePanel;
import com.instisoft.table.views.RecentEventPanel;
import com.instisoft.table.views.StudentRecord;
import com.instisoft.table.views.TestSchedulePanel;


public class MenuBar extends JMenuBar {

	private static final long serialVersionUID = 1L;
	private DashBoard dashBoard;
	private Color bgColor;
	
	
	public MenuBar(JFrame masterFrame) {
		
		this.dashBoard = (masterFrame instanceof DashBoard) ? (DashBoard)masterFrame : null;
		
		bgColor = new Color(169,169,169);
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
		RecentEventPanel recentEventPanel = new RecentEventPanel();
		FeesTablePanel feesTablePanel = new FeesTablePanel();
		EventTablePanel eventTablePanel = new EventTablePanel();
		CourseFormPanel courseFormPanel = new CourseFormPanel();
		CourseTablePanel courseTablePanel = CourseTablePanel.newInstance();
		BatchFormPanel batchFormPanel = new BatchFormPanel();
		BatchTablePanel batchTablePanel = BatchTablePanel.newInstance();
		GraphPanel graphPanel = new GraphPanel();
		DueFeesPanel dueFeesPanel = new DueFeesPanel();
		TestSchedulePanel testSchedulePanel = new TestSchedulePanel();
		ProjectSchedulePanel projectSchedulePanel = new ProjectSchedulePanel();
		HolidaySchedulePanel holidaySchedulePanel = new HolidaySchedulePanel();
		StudentRecord studentRecord = new StudentRecord();
		FacultyTablePanel facultyTablePanel = FacultyTablePanel.newInstance();
		FacultyFormPanel facultyFormPanel = new FacultyFormPanel();
		
		
		
		JMenu mnEvents = new JMenu("Events");
		setStyle(mnEvents);
		add(mnEvents);
		
		JMenuItem UpcomingEvents = new JMenuItem("Upcoming Events");
		setItemColor(UpcomingEvents);
		UpcomingEvents.addActionListener((event)->{
			
			dashBoard.renderPanel("Upcoming Events", eventTablePanel);
		
		});
		mnEvents.add(UpcomingEvents);
		JMenuItem RecentEvents = new JMenuItem("Recent Events");
		setItemColor(RecentEvents);
		RecentEvents.addActionListener((event)->{
			
			dashBoard.renderPanel("Recent Events", recentEventPanel);
		
		});
		mnEvents.add(RecentEvents);
		JMenuItem AddEvents = new JMenuItem("Create New Event");
		setItemColor(AddEvents);
		AddEvents.addActionListener((event)->{
			
			dashBoard.renderPanel("Create Event", eventFormPanel);
			
		});
		mnEvents.add(AddEvents);
		
		JMenu mnFees = new JMenu("Fees");
		setStyle(mnFees);
		add(mnFees);
		
		JMenuItem DueFees = new JMenuItem("Due Fees");
		setItemColor(DueFees);
		DueFees.addActionListener((event)->{
			
			dashBoard.renderPanel("Due Fees", dueFeesPanel);
			
		});
		mnFees.add(DueFees);
		JMenuItem FeesCollected = new JMenuItem("Fees Collected");
		setItemColor(FeesCollected);
		FeesCollected.addActionListener((event)->{
			
			dashBoard.renderPanel("Fee Collection", feesTablePanel);
			
		});
		mnFees.add(FeesCollected);
		
		JMenu mnCourses = new JMenu("Courses");
		setStyle(mnCourses);
		add(mnCourses);
		
		JMenuItem currentCources = new JMenuItem("Current Cources");
		setItemColor(currentCources);
		currentCources.addActionListener((event)->{
			
			dashBoard.renderPanel("Current Cources", courseTablePanel);
		
		});
		mnCourses.add(currentCources);
		
		JMenuItem addCource = new JMenuItem("Create new Course");
		setItemColor(addCource);
		addCource.addActionListener((event)->{
			
			dashBoard.renderPanel("Create Course", courseFormPanel);
		
		});
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
		
		JMenuItem currentBatches = new JMenuItem("Current Batches");
		setItemColor(currentBatches);
		currentBatches.addActionListener((event)->{
			dashBoard.renderPanel("Current Batches", batchTablePanel);
		});
		mnBatches.add(currentBatches);
		
		JMenuItem addBatch = new JMenuItem("Create new Batch");
		setItemColor(addBatch);
		addBatch.addActionListener((event)->{
			
			dashBoard.renderPanel("Create Batch", batchFormPanel);
			
		});
		mnBatches.add(addBatch);
		
		JMenu faculty = new JMenu("Faculty");
		setStyle(faculty);
		add(faculty);
		
		JMenuItem facultyList = new JMenuItem("Faculty List");
		setItemColor(facultyList);
		facultyList.addActionListener((event)->{
			
			dashBoard.renderPanel("Current Faculties List", facultyTablePanel);
			
		});
		faculty.add(facultyList);
		
		JMenuItem addFaculty = new JMenuItem("Add new Faculty");
		setItemColor(addFaculty);
		addFaculty.addActionListener((event)->{
			
			dashBoard.renderPanel("Add Faculty", facultyFormPanel);
			
		});
		faculty.add(addFaculty);
		
		
		JMenu mnAdmission = new JMenu("Admission");
		setStyle(mnAdmission);
		add(mnAdmission);
		
		JMenuItem newAdmission = new JMenuItem("New Admission");
		setItemColor(newAdmission);
		newAdmission.addActionListener((event)->{
			
			dashBoard.renderPanel("Admission Form", admissionFormPanel);
			
		});
		mnAdmission.add(newAdmission);
		
		JMenuItem cancelAdmission = new JMenuItem("Cancel Admission");
		setItemColor(cancelAdmission);
		mnAdmission.add(cancelAdmission);
		
		
		
		JMenu mnStudents = new JMenu("Students Record");
		setStyle(mnStudents);
		mnStudents.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent event) {
				
				dashBoard.renderPanel("Student Records", studentRecord);
				
			}
		});
		add(mnStudents);
		
		
		
		JMenu mnSchedule = new JMenu("Schedule");
		setStyle(mnSchedule);
		add(mnSchedule);
		
		JMenuItem Tests = new JMenuItem("Test Schedule");
		setItemColor(Tests);
		Tests.addActionListener((event)->{
			
			dashBoard.renderPanel("Test Schedule", testSchedulePanel);
			
		});
		mnSchedule.add(Tests);
		JMenuItem Projects = new JMenuItem("Project Schedule");
		setItemColor(Projects);
		Projects.addActionListener((event)->{
			
			dashBoard.renderPanel("Project Schedule", projectSchedulePanel);
			
		});
		mnSchedule.add(Projects);
		JMenuItem Holidays = new JMenuItem("Holiday Schedule");
		setItemColor(Holidays);
		Holidays.addActionListener((event)->{
			
			dashBoard.renderPanel("Holiday Schedule", holidaySchedulePanel);
			
		});
		mnSchedule.add(Holidays);
		JMenuItem TimeTable = new JMenuItem("Faculty Schedule");
		setItemColor(TimeTable);
		mnSchedule.add(TimeTable);
		
		
		
		JMenu mnGraphs = new JMenu("Graphs");
		setStyle(mnGraphs);
		add(mnGraphs);
		
		JMenuItem salesGraphs = new JMenuItem("Sales Graphs");
		setItemColor(salesGraphs);
		salesGraphs.addActionListener((event)->{
			
			dashBoard.renderPanel("Sales Graphical Analysis", graphPanel);
			
		});
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
		item.setForeground(Color.WHITE);
//		item.setBackground(Color.WHITE);
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
