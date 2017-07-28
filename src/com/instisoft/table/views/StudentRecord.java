package com.instisoft.table.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import com.instisoft.utils.GUILookAndFeel;

import java.awt.GridLayout;
import java.awt.ScrollPane;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.RowSorter;
import javax.swing.ScrollPaneConstants;
import javax.swing.SortOrder;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class StudentRecord extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private static JPanel contentPane;
	private JTextField textField_Name;
	private JTextField textField_Id;
	private JTextField textField_Fname;
	private JTextField textField_Gender;
	private JTextField textField_Email;
	private JTextField textField_Contact;
	private JTextField textField_Semail;
	private JTextField textField_Scontact;
	private JTextField textField_Institute;
	private JTextField textField_DOB;
	private JTextField textField_DOJ;
	private JTextField textField_Fcontact;
	private JTextField textField_Femail;
	private JTextField textField_Mcontact;
	private JTextField textField_Memail;
	private JTextField textField_Status;
	private JTextField textField_PassYear;
	private JTextField textField_Stream;
	private JTextField textField_Course;
	private JTextField textField_Mname;

	/**
	 * Create the panel.
	 */
	public StudentRecord() {

		setSize(1118, 569);
		setBackground(null);
		setOpaque(false);
		setLayout(new GridLayout(0, 2, 10, 0));
		
		JPanel LeftPanel = new JPanel();
		LeftPanel.setLayout(null);
		LeftPanel.setBackground(null);
		LeftPanel.setOpaque(false);
		add(LeftPanel);
		
		JPanel detailsPanel = new JPanel();
		detailsPanel.setLayout(null);
		detailsPanel.setBackground(null);
		detailsPanel.setOpaque(false);
		add(detailsPanel);
		
		JPanel tablePanel = new JPanel();
		tablePanel.setLocation(0, 0);
		tablePanel.setLayout(new BorderLayout());
		tablePanel.setBackground(null);
		tablePanel.setOpaque(false);
		tablePanel.setSize(554, 500);
		LeftPanel.add(tablePanel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	    tabbedPane.setBounds(0, 0, 554, 500);
	    detailsPanel.add(tabbedPane);
	    
	    JPanel PersonalPanel = new JPanel();
	    PersonalPanel.setLayout(null);
	    tabbedPane.addTab("Personal Details", null, PersonalPanel, null);
		
	    JPanel ParentsPanel = new JPanel();
		ParentsPanel.setLayout(null);
		tabbedPane.addTab("Parents' Details", null, ParentsPanel, null);
	    
	    /*JPanel ScrollBackground = new JPanel();
	    ScrollBackground.setLayout(null);
	    ScrollBackground.setBackground(null);
	    ScrollBackground.setOpaque(false);
	    ScrollBackground.setSize(1554, 1500);
	    ScrollBackground.setLayout(null);
	    ScrollBackground.setBorder(LineBorder.createBlackLineBorder());
	    ScrollBackground.scrollRectToVisible(getBounds());*/
	    //detailsPanel.add(ScrollBackground);

	   
	    
	    //JScrollPane s = new JScrollPane(ScrollBackground, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	    //s.setBounds(0, 0, 554, 500);
	    //detailsPanel.add(s);
        /*scroll_pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); //SETTING SCHEME FOR HORIZONTAL BAR
        scroll_pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll_pane.setBounds(0, 0, 554, 500);
        detailsPanel.add(scroll_pane);*/
		
/*		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setSize(554, 500);
		ScrollBackground.add(scrollPane);*/
		
		String columnNames[] = {"S. No.", "Name", "Student Id", "Course"};
		
		Object[][] data = {
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"44.", "Anmol Arora", "012", "Java"},
				{"16.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"17.", "Anmol Arora", "012", "Java"},
				{"51.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"14.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"},
				{"1.", "Anmol Arora", "012", "Java"}
				};
		
		Toggle isEditable = new Toggle(false);
		
		Table table = new Table(columnNames, data, isEditable);
		tableView(table);
		tablePanel.add(table.getScrollPane(),BorderLayout.CENTER);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 13, 120, 25);
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		PersonalPanel.add(lblName);
		
		textField_Name = new JTextField();
		textField_Name.setText((String) table.getValueAt(0, 1));
		textField_Name.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Name.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Name.setColumns(10);
		textField_Name.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Name.setBounds(140, 11, 150, 30);
		textField_Name.setEditable(false);
		PersonalPanel.add(textField_Name);
		
		JLabel lblId = new JLabel("Student Id");
		lblId.setBounds(300, 13, 75, 25);
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		PersonalPanel.add(lblId);
		
		textField_Id = new JTextField();
		textField_Id.setText((String) table.getValueAt(0, 2));
		textField_Id.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Id.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Id.setColumns(10);
		textField_Id.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Id.setBounds(385, 11, 100, 30);
		textField_Id.setEditable(false);
		PersonalPanel.add(textField_Id);
		
		 /*JScrollPane scroll = new JScrollPane();
		    //scroll.setBounds(0, 0, 554, 500);
		    scroll.setViewportView(ScrollBackground);
		    detailsPanel.add(scroll, BorderLayout.CENTER);*/
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(300, 54, 75, 25);
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		PersonalPanel.add(lblGender);
		
		textField_Gender = new JTextField();
		textField_Gender.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Gender.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Gender.setColumns(10);
		textField_Gender.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Gender.setBounds(385, 52, 100, 30);
		textField_Gender.setEditable(false);
		PersonalPanel.add(textField_Gender);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 136, 75, 25);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		PersonalPanel.add(lblEmail);
		
		textField_Email = new JTextField();
		textField_Email.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Email.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Email.setColumns(10);
		textField_Email.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Email.setBounds(140, 134, 345, 30);
		textField_Email.setEditable(false);
		PersonalPanel.add(textField_Email);
		
		JLabel lblSemail = new JLabel("Secondary Email");
		lblSemail.setBounds(10, 177, 100, 25);
		lblSemail.setForeground(Color.WHITE);
		lblSemail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		PersonalPanel.add(lblSemail);
		
		textField_Semail = new JTextField();
		textField_Semail.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Semail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Semail.setColumns(10);
		textField_Semail.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Semail.setBounds(140, 175, 345, 30);
		textField_Semail.setEditable(false);
		PersonalPanel.add(textField_Semail);
		
		JLabel lblScontact = new JLabel("Secondary Contact");
		lblScontact.setBounds(10, 95, 120, 25);
		lblScontact.setForeground(Color.WHITE);
		lblScontact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		PersonalPanel.add(lblScontact);
		
		textField_Scontact = new JTextField();
		textField_Scontact.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Scontact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Scontact.setColumns(10);
		textField_Scontact.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Scontact.setBounds(140, 93, 152, 30);
		textField_Scontact.setEditable(false);
		PersonalPanel.add(textField_Scontact);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setBounds(10, 54, 75, 25);
		lblContact.setForeground(Color.WHITE);
		lblContact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		PersonalPanel.add(lblContact);
		
		textField_Contact = new JTextField();
		textField_Contact.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Contact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Contact.setColumns(10);
		textField_Contact.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Contact.setBounds(140, 52, 152, 30);
		textField_Contact.setEditable(false);
		PersonalPanel.add(textField_Contact);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 216, 75, 25);
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		PersonalPanel.add(lblAddress);
		
		JTextArea textArea_Address = new JTextArea();
		textArea_Address.setBounds(140, 216, 345, 60);
		textArea_Address.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textArea_Address.setBorder(new EmptyBorder(0, 10, 0, 10));
		textArea_Address.setEditable(false);
		PersonalPanel.add(textArea_Address);
		
		JLabel lblDOB = new JLabel("DOB");
		lblDOB.setBounds(300, 95, 75, 25);
		lblDOB.setForeground(Color.WHITE);
		lblDOB.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		PersonalPanel.add(lblDOB);
		
		textField_DOB = new JTextField();
		textField_DOB.setHorizontalAlignment(SwingConstants.LEFT);
		textField_DOB.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_DOB.setColumns(10);
		textField_DOB.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_DOB.setBounds(385, 93, 100, 30);
		textField_DOB.setEditable(false);
		PersonalPanel.add(textField_DOB);
		
		JLabel lblDOJ = new JLabel("DOJ");
		lblDOJ.setBounds(300, 289, 75, 25);
		lblDOJ.setForeground(Color.WHITE);
		lblDOJ.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		PersonalPanel.add(lblDOJ);
		
		textField_DOJ = new JTextField();
		textField_DOJ.setHorizontalAlignment(SwingConstants.LEFT);
		textField_DOJ.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_DOJ.setColumns(10);
		textField_DOJ.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_DOJ.setBounds(385, 287, 100, 30);
		textField_DOJ.setEditable(false);
		PersonalPanel.add(textField_DOJ);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(10, 289, 75, 25);
		lblCourse.setForeground(Color.WHITE);
		lblCourse.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		PersonalPanel.add(lblCourse);
		
		textField_Course = new JTextField();
		textField_Course.setText((String) table.getValueAt(0, 3));
		textField_Course.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Course.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Course.setColumns(10);
		textField_Course.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Course.setBounds(140, 287, 150, 30);
		textField_Course.setEditable(false);
		PersonalPanel.add(textField_Course);
		
		JLabel lblMName = new JLabel("Mother's Name");
		lblMName.setBounds(10, 13, 120, 25);
		lblMName.setForeground(Color.WHITE);
		lblMName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ParentsPanel.add(lblMName);
		
		textField_Mname = new JTextField();
		textField_Mname.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Mname.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Mname.setColumns(10);
		textField_Mname.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Mname.setBounds(140, 11, 150, 30);
		textField_Mname.setEditable(false);
		ParentsPanel.add(textField_Mname);
		
		JLabel lblFName = new JLabel("Father's Name");
		lblFName.setBounds(10, 137, 100, 25);
		lblFName.setForeground(Color.WHITE);
		lblFName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ParentsPanel.add(lblFName);
		
		textField_Fname = new JTextField();
		textField_Fname.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Fname.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Fname.setColumns(10);
		textField_Fname.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Fname.setBounds(140, 135, 150, 30);
		textField_Fname.setEditable(false);
		ParentsPanel.add(textField_Fname);
		
		JLabel lblFcontact = new JLabel("Father's Contact");
		lblFcontact.setBounds(10, 178, 120, 25);
		lblFcontact.setForeground(Color.WHITE);
		lblFcontact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ParentsPanel.add(lblFcontact);
		
		textField_Fcontact = new JTextField();
		textField_Fcontact.setText((String) table.getValueAt(0, 3));
		textField_Fcontact.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Fcontact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Fcontact.setColumns(10);
		textField_Fcontact.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Fcontact.setBounds(140, 176, 150, 30);
		textField_Fcontact.setEditable(false);
		ParentsPanel.add(textField_Fcontact);
		
		JLabel lblFemail = new JLabel("Father's Email");
		lblFemail.setBounds(10, 219, 120, 25);
		lblFemail.setForeground(Color.WHITE);
		lblFemail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ParentsPanel.add(lblFemail);
		
		textField_Femail = new JTextField();
		textField_Femail.setText((String) table.getValueAt(0, 3));
		textField_Femail.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Femail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Femail.setColumns(10);
		textField_Femail.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Femail.setBounds(140, 217, 371, 30);
		textField_Femail.setEditable(false);
		ParentsPanel.add(textField_Femail);
		
		JLabel lblMcontact = new JLabel("Mother's Contact");
		lblMcontact.setBounds(10, 55, 120, 25);
		lblMcontact.setForeground(Color.WHITE);
		lblMcontact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ParentsPanel.add(lblMcontact);
		
		textField_Mcontact = new JTextField();
		textField_Mcontact.setText((String) table.getValueAt(0, 3));
		textField_Mcontact.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Mcontact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Mcontact.setColumns(10);
		textField_Mcontact.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Mcontact.setBounds(140, 53, 150, 30);
		textField_Mcontact.setEditable(false);
		ParentsPanel.add(textField_Mcontact);
		
		JLabel lblMemail = new JLabel("Mother's Email");
		lblMemail.setBounds(10, 96, 120, 25);
		lblMemail.setForeground(Color.WHITE);
		lblMemail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		ParentsPanel.add(lblMemail);
		
		textField_Memail = new JTextField();
		textField_Memail.setText((String) table.getValueAt(0, 3));
		textField_Memail.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Memail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Memail.setColumns(10);
		textField_Memail.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Memail.setBounds(140, 94, 371, 30);
		textField_Memail.setEditable(false);
		ParentsPanel.add(textField_Memail);
		
		JPanel InstitutePanel = new JPanel();
		InstitutePanel.setLayout(null);
		tabbedPane.addTab("Institute Details", null, InstitutePanel, null);
		
		JLabel lblInstitute = new JLabel("Institute");
		lblInstitute.setBounds(10, 13, 75, 25);
		lblInstitute.setForeground(Color.WHITE);
		lblInstitute.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		InstitutePanel.add(lblInstitute);
		
		textField_Institute = new JTextField();
		textField_Institute.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Institute.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Institute.setColumns(10);
		textField_Institute.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Institute.setBounds(135, 11, 345, 30);
		textField_Institute.setEditable(false);
		InstitutePanel.add(textField_Institute);
		
		JLabel lblStream = new JLabel("Stream");
		lblStream.setBounds(10, 54, 75, 25);
		lblStream.setForeground(Color.WHITE);
		lblStream.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		InstitutePanel.add(lblStream);
		
			textField_Stream = new JTextField();
			textField_Stream.setText((String) table.getValueAt(0, 3));
			textField_Stream.setHorizontalAlignment(SwingConstants.LEFT);
			textField_Stream.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			textField_Stream.setColumns(10);
			textField_Stream.setBorder(new EmptyBorder(0, 10, 0, 10));
			textField_Stream.setBounds(135, 52, 150, 30);
			textField_Stream.setEditable(false);
			InstitutePanel.add(textField_Stream);
			
			JLabel lblPassYear = new JLabel("Pass Year");
			lblPassYear.setBounds(295, 54, 75, 25);
			lblPassYear.setForeground(Color.WHITE);
			lblPassYear.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			InstitutePanel.add(lblPassYear);
			
			textField_PassYear = new JTextField();
			textField_PassYear.setText((String) table.getValueAt(0, 3));
			textField_PassYear.setHorizontalAlignment(SwingConstants.LEFT);
			textField_PassYear.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			textField_PassYear.setColumns(10);
			textField_PassYear.setBorder(new EmptyBorder(0, 10, 0, 10));
			textField_PassYear.setBounds(380, 52, 100, 30);
			textField_PassYear.setEditable(false);
			InstitutePanel.add(textField_PassYear);
			
			JLabel lblStatus = new JLabel("Status");
			lblStatus.setBounds(10, 95, 75, 25);
			lblStatus.setForeground(Color.WHITE);
			lblStatus.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			InstitutePanel.add(lblStatus);
			
			textField_Status = new JTextField();
			textField_Status.setText((String) table.getValueAt(0, 3));
			textField_Status.setHorizontalAlignment(SwingConstants.LEFT);
			textField_Status.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			textField_Status.setColumns(10);
			textField_Status.setBorder(new EmptyBorder(0, 10, 0, 10));
			textField_Status.setBounds(135, 93, 150, 30);
			textField_Status.setEditable(false);
			InstitutePanel.add(textField_Status);
			
			JLabel lblIaddress = new JLabel("Institute's Address");
			lblIaddress.setBounds(10, 134, 115, 25);
			lblIaddress.setForeground(Color.WHITE);
			lblIaddress.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			InstitutePanel.add(lblIaddress);
			
			JTextArea textArea_Iaddress = new JTextArea();
			textArea_Iaddress.setBounds(135, 134, 345, 60);
			textArea_Iaddress.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			textArea_Iaddress.setBorder(new EmptyBorder(0, 10, 0, 10));
			textArea_Iaddress.setEditable(false);
			InstitutePanel.add(textArea_Iaddress);
		
	    JButton btnEdit = new JButton("Edit");
	    btnEdit.setSize(150, 35);
	    btnEdit.setLocation(135, 511);
	    btnEdit.addActionListener((event)->{
			((JButton)event.getSource()).setText("Update");
			textField_Id.setEditable(true);
			textField_Name.setEditable(true);
			textField_Fname.setEditable(true);
			textField_Gender.setEditable(true);
			textField_Email.setEditable(true);
			textField_Contact.setEditable(true);
			textField_Scontact.setEditable(true);
			textField_Institute.setEditable(true);
			textField_DOB.setEditable(true);
			textField_DOJ.setEditable(true);
			textField_Fcontact.setEditable(true);
			textField_Femail.setEditable(true);
			textField_Mcontact.setEditable(true);
			textField_Memail.setEditable(true);
			textField_Status.setEditable(true);
			textField_PassYear.setEditable(true);
			textField_Stream.setEditable(true);
			textField_Course.setEditable(true);
			textField_Semail.setEditable(true);
			textField_Mname.setEditable(true);
		});
	    modifyButton(btnEdit);
	    detailsPanel.add(btnEdit);
	    
	    JButton btnSort = new JButton("Sort");
	    btnSort.setSize(150, 35);
	    btnSort.setLocation(200, 511);
	    btnSort.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>(25);
	    		list.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    modifyButton(btnSort);
	    LeftPanel.add(btnSort);
	   
	    
	    JButton btnDelete = new JButton("Delete");
	    btnDelete.setBounds(321, 511, 160, 35);
	    modifyButton(btnDelete);
	    btnDelete.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent arg0){
	        	if(table.getSelectedRow() != -1){
	        		((DefaultTableModel) table.getModel()).removeRow(table.getSelectedRow());
	        	}
	        }
	    });
	    detailsPanel.add(btnDelete);
	}
	
	void tableView(JTable table){
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(100);     
	      tcm.getColumn(1).setPreferredWidth(400);    
	      tcm.getColumn(2).setPreferredWidth(250);    
	      tcm.getColumn(3).setPreferredWidth(300);
	}
	
	void modifyButton(JButton btn){
		btn.setBackground(GUILookAndFeel.getThemeColor());
		btn.setForeground(Color.WHITE);
		btn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		/*btn.setContentAreaFilled(false);
		btn.setOpaque(true);
		btn.setBorderPainted(false);*/
		btn.setFocusPainted(false);

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
					contentPane.add(new StudentRecord());
					frame.setContentPane(contentPane);
					
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
