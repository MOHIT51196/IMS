package com.instisoft.table.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import com.instisoft.utils.GUILookAndFeel;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.SwingConstants;

public class StudentRecord extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private static JPanel contentPane;
	private JTextField textField_name;
	private JTextField textField_id;
	private JTextField textField_fname;
	private JTextField textField_gender;
	private JTextField textField_email;
	private JTextField textField_contact;
	private JTextField textField_address;
	private JTextField textField_institute;
	private JTextField textField_DOB;
	private JTextField textField_DOJ;
	private JTextField textField_Course;

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
		tablePanel.setLayout(new BorderLayout());
		tablePanel.setBackground(null);
		tablePanel.setOpaque(false);
		tablePanel.setSize(554, 500);
		LeftPanel.add(tablePanel);
		
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
		lblName.setBounds(25, 50, 50, 25);
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblName);
		
		textField_name = new JTextField();
		textField_name.setText((String) table.getValueAt(0, 1));
		textField_name.setHorizontalAlignment(SwingConstants.LEFT);
		textField_name.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_name.setColumns(10);
		textField_name.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_name.setBounds(135, 48, 150, 30);
		textField_name.setEditable(false);
		detailsPanel.add(textField_name);
		
		JLabel lblId = new JLabel("Student Id");
		lblId.setBounds(321, 50, 75, 25);
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblId);
		
		textField_id = new JTextField();
		textField_id.setText((String) table.getValueAt(0, 2));
		textField_id.setHorizontalAlignment(SwingConstants.LEFT);
		textField_id.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_id.setColumns(10);
		textField_id.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_id.setBounds(406, 48, 100, 30);
		textField_id.setEditable(false);
		detailsPanel.add(textField_id);
		
		JLabel lblFName = new JLabel("Father's Name");
		lblFName.setBounds(25, 91, 100, 25);
		lblFName.setForeground(Color.WHITE);
		lblFName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblFName);
		
		textField_fname = new JTextField();
		textField_fname.setHorizontalAlignment(SwingConstants.LEFT);
		textField_fname.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_fname.setColumns(10);
		textField_fname.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_fname.setBounds(135, 89, 150, 30);
		textField_fname.setEditable(false);
		detailsPanel.add(textField_fname);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(321, 91, 75, 25);
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblGender);
		
		textField_gender = new JTextField();
		textField_gender.setHorizontalAlignment(SwingConstants.LEFT);
		textField_gender.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_gender.setColumns(10);
		textField_gender.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_gender.setBounds(406, 89, 100, 30);
		textField_gender.setEditable(false);
		detailsPanel.add(textField_gender);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(25, 132, 75, 25);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblEmail);
		
		textField_email = new JTextField();
		textField_email.setHorizontalAlignment(SwingConstants.LEFT);
		textField_email.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_email.setColumns(10);
		textField_email.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_email.setBounds(135, 130, 371, 30);
		textField_email.setEditable(false);
		detailsPanel.add(textField_email);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setBounds(25, 173, 75, 25);
		lblContact.setForeground(Color.WHITE);
		lblContact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblContact);
		
		textField_contact = new JTextField();
		textField_contact.setHorizontalAlignment(SwingConstants.LEFT);
		textField_contact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_contact.setColumns(10);
		textField_contact.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_contact.setBounds(135, 171, 152, 30);
		textField_contact.setEditable(false);
		detailsPanel.add(textField_contact);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(25, 214, 75, 25);
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblAddress);
		
		textField_address = new JTextField();
		textField_address.setHorizontalAlignment(SwingConstants.LEFT);
		textField_address.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_address.setColumns(10);
		textField_address.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_address.setBounds(135, 212, 371, 30);
		textField_address.setEditable(false);
		detailsPanel.add(textField_address);
		
		JLabel lblInstitute = new JLabel("Institute");
		lblInstitute.setBounds(25, 255, 75, 25);
		lblInstitute.setForeground(Color.WHITE);
		lblInstitute.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblInstitute);
		
		textField_institute = new JTextField();
		textField_institute.setHorizontalAlignment(SwingConstants.LEFT);
		textField_institute.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_institute.setColumns(10);
		textField_institute.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_institute.setBounds(135, 253, 371, 30);
		textField_institute.setEditable(false);
		detailsPanel.add(textField_institute);
		
		JLabel lblDOB = new JLabel("DOB");
		lblDOB.setBounds(321, 173, 75, 25);
		lblDOB.setForeground(Color.WHITE);
		lblDOB.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblDOB);
		
		textField_DOB = new JTextField();
		textField_DOB.setHorizontalAlignment(SwingConstants.LEFT);
		textField_DOB.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_DOB.setColumns(10);
		textField_DOB.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_DOB.setBounds(406, 171, 100, 30);
		textField_DOB.setEditable(false);
		detailsPanel.add(textField_DOB);
		
		JLabel lblDOJ = new JLabel("DOJ");
		lblDOJ.setBounds(321, 296, 75, 25);
		lblDOJ.setForeground(Color.WHITE);
		lblDOJ.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblDOJ);
		
		textField_DOJ = new JTextField();
		textField_DOJ.setHorizontalAlignment(SwingConstants.LEFT);
		textField_DOJ.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_DOJ.setColumns(10);
		textField_DOJ.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_DOJ.setBounds(406, 294, 100, 30);
		textField_DOJ.setEditable(false);
		detailsPanel.add(textField_DOJ);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(25, 296, 75, 25);
		lblCourse.setForeground(Color.WHITE);
		lblCourse.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblCourse);
		
		textField_Course = new JTextField();
		textField_Course.setText((String) table.getValueAt(0, 3));
		textField_Course.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Course.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Course.setColumns(10);
		textField_Course.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Course.setBounds(135, 294, 150, 30);
		textField_Course.setEditable(false);
		detailsPanel.add(textField_Course);
	    
	    JButton btnEdit = new JButton("Edit");
	    btnEdit.setSize(150, 35);
	    btnEdit.setLocation(135, 511);
	    btnEdit.addActionListener((event)->{
			((JButton)event.getSource()).setText("Update");
			textField_id.setEditable(true);
			textField_name.setEditable(true);
			textField_fname.setEditable(true);
			textField_gender.setEditable(true);
			textField_email.setEditable(true);
			textField_contact.setEditable(true);
			textField_address.setEditable(true);
			textField_institute.setEditable(true);
			textField_DOB.setEditable(true);
			textField_DOJ.setEditable(true);
			textField_Course.setEditable(true);
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
		tcm.getColumn(0).setPreferredWidth(80);     
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
