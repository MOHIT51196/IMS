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

public class DDueFeesTablePanel extends JPanel {
	
	
	private static final long serialVersionUID = 1L;
	
	private static JPanel contentPane;
	private JTextField textField_Id;
	private JTextField textField_Name;
	private JTextField textField_Cname;
	private JTextField textField_DueAmount;
	private JTextField textField_Contact;
	private JTextField textField_Email;
	
	/**
	 * Create the panel.
	 */
	public DDueFeesTablePanel() {
		
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
		
		String columnNames[] = {"S. No.", "Name", "Due Amount"};
		
		Object[][] data = {
				{"1.", "Anmol Raj", "6000"},
				{"1.", "Anmol Raj", "6000"},
				{"1.", "Anmol Raj", "6000"},
				{"1.", "Anmol Raj", "6000"},
				{"1.", "Anmol Raj", "6000"},
				{"1.", "Anmol Raj", "6000"},
				{"1.", "Anmol Raj", "6000"},
				{"1.", "Anmol Raj", "6000"},
				{"1.", "Anmol Raj", "6000"},
				{"1.", "Anmol Raj", "6000"},
				{"1.", "Anmol Raj", "6000"},
				{"1.", "Anmol Raj", "6000"},
				{"1.", "Anmol Raj", "6000"},
				{"1.", "Anmol Raj", "6000"},
				{"1.", "Anmol Raj", "6000"},
				{"1.", "Anmol Raj", "6000"},
				{"1.", "Anmol Raj", "6000"},
				{"1.", "Anmol Raj", "6000"},
				{"1.", "Anmol Raj", "6000"},
				{"1.", "Anmol Raj", "6000"}
		};
		
		Toggle isEditable = new Toggle(false);
		
		Table table = new Table(columnNames, data, isEditable);
		tableView(table);
		tablePanel.add(table.getScrollPane(),BorderLayout.CENTER);
		
		JLabel lblId = new JLabel("Student Id");
		lblId.setBounds(25, 50, 100, 25);
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblId);
		
		textField_Id = new JTextField();
		textField_Id.setText((String) table.getValueAt(0, 1));
		textField_Id.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Id.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Id.setColumns(10);
		textField_Id.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Id.setBounds(135, 48, 100, 30);
		textField_Id.setEditable(false);
		detailsPanel.add(textField_Id);
		
		JLabel lblName = new JLabel("Student Name");
		lblName.setBounds(25, 91, 100, 25);
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblName);
		
		textField_Name = new JTextField();
		textField_Name.setText((String) table.getValueAt(0, 1));
		textField_Name.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Name.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Name.setColumns(10);
		textField_Name.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Name.setBounds(135, 89, 367, 30);
		textField_Name.setEditable(false);
		detailsPanel.add(textField_Name);
		
		JLabel lblCname = new JLabel("Course Name");
		lblCname.setBounds(25, 132, 100, 25);
		lblCname.setForeground(Color.WHITE);
		lblCname.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblCname);
		
		textField_Cname = new JTextField();
		textField_Cname.setText((String) table.getValueAt(0, 1));
		textField_Cname.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Cname.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Cname.setColumns(10);
		textField_Cname.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Cname.setBounds(135, 130, 150, 30);
		textField_Cname.setEditable(false);
		detailsPanel.add(textField_Cname);
		
		JLabel lblDueAmount = new JLabel("Due Amount");
		lblDueAmount.setBounds(295, 50, 90, 25);
		lblDueAmount.setForeground(Color.WHITE);
		lblDueAmount.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblDueAmount);
		
		textField_DueAmount = new JTextField();
		textField_DueAmount.setText((String) table.getValueAt(0, 1));
		textField_DueAmount.setHorizontalAlignment(SwingConstants.LEFT);
		textField_DueAmount.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_DueAmount.setColumns(10);
		textField_DueAmount.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_DueAmount.setBounds(394, 48, 150, 30);
		textField_DueAmount.setEditable(false);
		detailsPanel.add(textField_DueAmount);
		
		JLabel lblContact = new JLabel("Contact Number");
		lblContact.setBounds(295, 132, 100, 25);
		lblContact.setForeground(Color.WHITE);
		lblContact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblContact);
		
		textField_Contact = new JTextField();
		textField_Contact.setText((String) table.getValueAt(0, 1));
		textField_Contact.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Contact.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Contact.setColumns(10);
		textField_Contact.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Contact.setBounds(405, 130, 139, 30);
		textField_Contact.setEditable(false);
		detailsPanel.add(textField_Contact);
		
		JLabel lblEmail = new JLabel("Email ID");
		lblEmail.setBounds(25, 173, 100, 25);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblEmail);
		
		textField_Email = new JTextField();
		textField_Email.setText((String) table.getValueAt(0, 1));
		textField_Email.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Email.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Email.setColumns(10);
		textField_Email.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Email.setBounds(135, 171, 150, 30);
		textField_Email.setEditable(false);
		detailsPanel.add(textField_Email);
		
		JButton btnEdit = new JButton("Edit");
	    btnEdit.setSize(150, 35);
	    btnEdit.setLocation(135, 511);
	    btnEdit.addActionListener((event)->{
			((JButton)event.getSource()).setText("Update");
			textField_Id.setEditable(true);
			textField_Name.setEditable(true);
			textField_Cname.setEditable(true);
			textField_DueAmount.setEditable(true);
			textField_Contact.setEditable(true);
			textField_Email.setEditable(true);
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
						contentPane.add(new DDueFeesTablePanel());
						frame.setContentPane(contentPane);
						
						
						frame.setVisible(true);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		
	}

}
