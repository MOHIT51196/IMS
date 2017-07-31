package com.instisoft.distributed.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import com.instisoft.table.views.Table;
import com.instisoft.table.views.Toggle;

public class DFacultyTablePanel extends JPanel {
	
	
	private static final long serialVersionUID = 1L;
	
	private static JPanel contentPane;
	private JTextField textField_Id;
	private JTextField textField_Fname;
	private JTextField textField_Gender;
	private JTextField textField_Email;
	private JTextField textField_Semail;
	private JTextField textField_Contact;
	private JTextField textField_Scontact;
	private JTextArea textArea_Address;
	private JTextField textField_Institute;
	private JTextField textField_DOB;
	private JTextField textField_DOJ;
	private JTextField textField_Salary;
	private JTextField textField_Batch;
	private JTextField textField_Status;
	
	/**
	 * Create the panel.
	 */
	public DFacultyTablePanel() {
		
		setSize(1118, 569);
		setBackground(null);
		setOpaque(false);
		setLayout(new GridLayout(0, 2, 10, 0));
		
		JPanel leftPanel = new JPanel();
		leftPanel.setLayout(null);
		leftPanel.setBackground(null);
		leftPanel.setOpaque(false);
		add(leftPanel);
		
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
		leftPanel.add(tablePanel);
		
		String columnNames[] = {"S. No.", "Faculty Name", "Faculty Id"};
		
		Object[][] data = {
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"},
				{"1.", "Anmol Raj Arora", "012"}
		};
		
		Toggle isEditable = new Toggle(false);
		
		Table table = new Table(columnNames, data, isEditable);
		tableView(table);
		tablePanel.add(table.getScrollPane(),BorderLayout.CENTER);
		
		JLabel lblId = new JLabel("Faculty Id");
		lblId.setBounds(321, 13, 100, 25);
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblId);
		
		textField_Id = new JTextField();
		textField_Id.setText((String) table.getValueAt(0, 1));
		textField_Id.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Id.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Id.setColumns(10);
		textField_Id.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Id.setBounds(394, 11, 150, 30);
		textField_Id.setEditable(false);
		detailsPanel.add(textField_Id);
		
		JLabel lblFname = new JLabel("Faculty Name");
		lblFname.setBounds(10, 13, 100, 25);
		lblFname.setForeground(Color.WHITE);
		lblFname.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblFname);
		
		textField_Fname = new JTextField();
		textField_Fname.setText((String) table.getValueAt(0, 1));
		textField_Fname.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Fname.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Fname.setColumns(10);
		textField_Fname.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Fname.setBounds(135, 11, 150, 30);
		textField_Fname.setEditable(false);
		detailsPanel.add(textField_Fname);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(321, 51, 100, 25);
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblGender);
		
		textField_Gender = new JTextField();
		textField_Gender.setText((String) table.getValueAt(0, 1));
		textField_Gender.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Gender.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Gender.setColumns(10);
		textField_Gender.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Gender.setBounds(394, 49, 150, 30);
		textField_Gender.setEditable(false);
		detailsPanel.add(textField_Gender);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 130, 75, 25);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblEmail);
		
		textField_Email = new JTextField();
		textField_Email.setText((String) table.getValueAt(0, 1));
		textField_Email.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Email.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Email.setColumns(10);
		textField_Email.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Email.setBounds(135, 128, 409, 30);
		textField_Email.setEditable(false);
		detailsPanel.add(textField_Email);
		
		JLabel lblSemail = new JLabel("Secondary Email");
		lblSemail.setBounds(10, 171, 100, 25);
		lblSemail.setForeground(Color.WHITE);
		lblSemail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblSemail);
		
		textField_Semail = new JTextField();
		textField_Semail.setText((String) table.getValueAt(0, 1));
		textField_Semail.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Semail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Semail.setColumns(10);
		textField_Semail.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Semail.setBounds(135, 169, 409, 30);
		textField_Semail.setEditable(false);
		detailsPanel.add(textField_Semail);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setBounds(10, 51, 100, 25);
		lblContact.setForeground(Color.WHITE);
		lblContact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblContact);
		
		textField_Contact = new JTextField();
		textField_Contact.setText((String) table.getValueAt(0, 1));
		textField_Contact.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Contact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Contact.setColumns(10);
		textField_Contact.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Contact.setBounds(135, 49, 150, 30);
		textField_Contact.setEditable(false);
		detailsPanel.add(textField_Contact);
		
		JLabel lblScontact = new JLabel("Secondary Contact");
		lblScontact.setBounds(10, 89, 115, 25);
		lblScontact.setForeground(Color.WHITE);
		lblScontact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblScontact);
		
		textField_Scontact = new JTextField();
		textField_Scontact.setText((String) table.getValueAt(0, 1));
		textField_Scontact.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Scontact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Scontact.setColumns(10);
		textField_Scontact.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Scontact.setBounds(135, 87, 150, 30);
		textField_Scontact.setEditable(false);
		detailsPanel.add(textField_Scontact);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 210, 100, 25);
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblAddress);
		
		textArea_Address = new JTextArea();
		textArea_Address.setText((String) table.getValueAt(0, 1));
		textArea_Address.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textArea_Address.setColumns(10);
		textArea_Address.setBorder(new EmptyBorder(0, 10, 0, 10));
		textArea_Address.setBounds(135, 210, 409, 60);
		textArea_Address.setEditable(false);
		detailsPanel.add(textArea_Address);
		
		JLabel lblInstitute = new JLabel("Institute");
		lblInstitute.setBounds(10, 283, 75, 25);
		lblInstitute.setForeground(Color.WHITE);
		lblInstitute.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblInstitute);
		
		textField_Institute = new JTextField();
		textField_Institute.setText((String) table.getValueAt(0, 1));
		textField_Institute.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Institute.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Institute.setColumns(10);
		textField_Institute.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Institute.setBounds(135, 281, 409, 30);
		textField_Institute.setEditable(false);
		detailsPanel.add(textField_Institute);
		
		JLabel lblDOB = new JLabel("DOB");
		lblDOB.setBounds(321, 87, 75, 25);
		lblDOB.setForeground(Color.WHITE);
		lblDOB.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblDOB);
		
		textField_DOB = new JTextField();
		textField_DOB.setText((String) table.getValueAt(0, 1));
		textField_DOB.setHorizontalAlignment(SwingConstants.LEFT);
		textField_DOB.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_DOB.setColumns(10);
		textField_DOB.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_DOB.setBounds(394, 87, 150, 30);
		textField_DOB.setEditable(false);
		detailsPanel.add(textField_DOB);
		
		JLabel lblDOJ = new JLabel("DOJ");
		lblDOJ.setBounds(321, 365, 75, 25);
		lblDOJ.setForeground(Color.WHITE);
		lblDOJ.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblDOJ);
		
		textField_DOJ = new JTextField();
		textField_DOJ.setText((String) table.getValueAt(0, 1));
		textField_DOJ.setHorizontalAlignment(SwingConstants.LEFT);
		textField_DOJ.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_DOJ.setColumns(10);
		textField_DOJ.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_DOJ.setBounds(394, 363, 150, 30);
		textField_DOJ.setEditable(false);
		detailsPanel.add(textField_DOJ);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setBounds(321, 324, 75, 25);
		lblSalary.setForeground(Color.WHITE);
		lblSalary.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblSalary);
		
		textField_Salary = new JTextField();
		textField_Salary.setText((String) table.getValueAt(0, 1));
		textField_Salary.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Salary.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Salary.setColumns(10);
		textField_Salary.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Salary.setBounds(394, 322, 150, 30);
		textField_Salary.setEditable(false);
		detailsPanel.add(textField_Salary);
		
		JLabel lblBatch = new JLabel("Batch");
		lblBatch.setBounds(10, 324, 75, 25);
		lblBatch.setForeground(Color.WHITE);
		lblBatch.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblBatch);
		
		textField_Batch = new JTextField();
		textField_Batch.setText((String) table.getValueAt(0, 1));
		textField_Batch.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Batch.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Batch.setColumns(10);
		textField_Batch.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Batch.setBounds(135, 322, 150, 30);
		textField_Batch.setEditable(false);
		detailsPanel.add(textField_Batch);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(10, 365, 75, 25);
		lblStatus.setForeground(Color.WHITE);
		lblStatus.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblStatus);
		
		textField_Status = new JTextField();
		textField_Status.setText((String) table.getValueAt(0, 1));
		textField_Status.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Status.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Status.setColumns(10);
		textField_Status.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Status.setBounds(135, 363, 150, 30);
		textField_Status.setEditable(false);
		detailsPanel.add(textField_Status);
		
		JButton btnEdit = new JButton("Edit");
	    btnEdit.setSize(150, 35);
	    btnEdit.setLocation(135, 511);
	    btnEdit.addActionListener((event)->{
			((JButton)event.getSource()).setText("Update");
			textField_Id.setEditable(true);
			textField_Fname.setEditable(true);
			textField_Gender.setEditable(true);
			textField_Email.setEditable(true);
			textField_Semail.setEditable(true);
			textField_Contact.setEditable(true);
			textField_Scontact.setEditable(true);
			textArea_Address.setEditable(true);
			textField_Institute.setEditable(true);
			textField_DOB.setEditable(true);
			textField_DOJ.setEditable(true);
			textField_Salary.setEditable(true);
			textField_Batch.setEditable(true);
			textField_Status.setEditable(true);
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
	    leftPanel.add(btnSort);
	   
	    
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
	}
	
	void modifyButton(JButton btn){
		btn.setBackground(new Color(102, 255, 153));
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
						contentPane.add(new DFacultyTablePanel());
						frame.setContentPane(contentPane);
						
						
						frame.setVisible(true);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		
	}

}
