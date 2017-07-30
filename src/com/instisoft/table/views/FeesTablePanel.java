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
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import com.instisoft.utils.GUILookAndFeel;


public class FeesTablePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	private JTextField textField;

	

	/**
	 * Create the frame.
	 */
	public FeesTablePanel() {
	
		setSize( 1118, 569);
		setBackground(null);
		setOpaque(false);
		setLayout(null);
		
		JPanel tablePanel = new JPanel();
		tablePanel.setBounds(0, 0, 1118, 500);
		tablePanel.setLayout(new BorderLayout());
		add(tablePanel);
		
		String columnNames[] = {"S. No.", "Name", "Student Id", "Program/Course", "Amount Paid", "Contact Number", "Email Id"};
		
		Object[][] data = {
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"},
				{"1.", "Anmol Raj", "012", "Advanced Java", "6000", "8588910454", "anmolarora1711@gmail.com"}
				};
		
		final Toggle isEditable = new Toggle(false);
		
		Table table = new Table(columnNames, data, isEditable);
		tableView(table);
	    tablePanel.add(table.getScrollPane(),BorderLayout.CENTER);  
		
		JButton edit = new JButton("Edit");
		edit.setBounds(16, 519, 134, 35);
		modifyButton(edit);
		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.getEditable().toggle();
				((DefaultTableModel) table.getModel()).fireTableStructureChanged();
				tableView(table);
			}
		});
		
		add(edit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(178, 519, 134, 35);
	    modifyButton(btnDelete);
	    btnDelete.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent arg0){
	        	if(table.getSelectedRow() != -1){
	        		((DefaultTableModel) table.getModel()).removeRow(table.getSelectedRow());
	        	}
	        }
	    });
	    add(btnDelete);
	    
	    JButton btnSortByName = new JButton("Sort by Name");
	    btnSortByName.setBounds(341, 519, 134, 35);
	    modifyButton(btnSortByName);
	    btnSortByName.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>();
	    		list.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    
	    add(btnSortByName);
	    
	    JButton btnSortById = new JButton("Sort By Id");
	    btnSortById.setBounds(499, 519, 134, 35);
	    modifyButton(btnSortById);
	    btnSortById.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>();
	    		list.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    
	    add(btnSortById);
	    
	    JButton btnSortByCourse = new JButton("Sort By Course");
	    btnSortByCourse.setFont(new Font("Tahoma", Font.PLAIN, 11));
	    btnSortByCourse.setBounds(658, 519, 134, 35);
	    modifyButton(btnSortByCourse);
	    btnSortByCourse.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>(25);
	    		list.add(new RowSorter.SortKey(3, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    
	    add(btnSortByCourse);
	    
	    JButton btnSortByAmount = new JButton("Sort By Amount");
	    btnSortByAmount.setBounds(815, 519, 134, 35);
	    btnSortByAmount.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>(25);
	    		list.add(new RowSorter.SortKey(4, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    modifyButton(btnSortByAmount);
	    add(btnSortByAmount);
	    
	    JButton btnTotalFees = new JButton("Total Fees");
	    btnTotalFees.setBounds(974, 519, 134, 35);
	    modifyButton(btnTotalFees);
	    add(btnTotalFees);
	    
	    /*JPanel panel_1 = new JPanel();
	    panel_1.setBounds(0, 0, 224, 730);
	    panel_1.setBackground(new Color(102, 255, 153));
	    add(panel_1);
	    panel_1.setLayout(null);
	    
	    textField = new JTextField();
	    textField.setBounds(39, 660, 150, 35);
	    panel_1.add(textField);
	    textField.setColumns(10);
	    textField.setFocusable(false);
	    textField.setEditable(false);
	    
	    JLabel lblNewLabel = new JLabel("Total Fees Collected :");
	    lblNewLabel.setBounds(39, 614, 150, 35);
	    lblNewLabel.setBackground(Color.GRAY);
	    lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalTextPosition(JLabel.CENTER);
	    panel_1.add(lblNewLabel);*/
	
	}
	
	void tableView(JTable table){
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(40);     
	      tcm.getColumn(1).setPreferredWidth(100);    
	      tcm.getColumn(2).setPreferredWidth(70);    
	      tcm.getColumn(3).setPreferredWidth(100);
	      tcm.getColumn(4).setPreferredWidth(70);
	      tcm.getColumn(5).setPreferredWidth(120);
	      tcm.getColumn(6).setPreferredWidth(200);
	      /*table.setBackground(Color.GRAY);*/
	}
	
	void modifyButton(JButton btn){
		btn.setBackground(GUILookAndFeel.getThemeColor());
		btn.setForeground(Color.WHITE);
		btn.setFont(new Font("Tahoma", Font.PLAIN, 14));
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
					
					JPanel contentPane = new JPanel();
					contentPane.setBackground(SystemColor.windowBorder);
					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
					contentPane.setLayout(null);
					contentPane.add(new FeesTablePanel());
					frame.setContentPane(contentPane);
					
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
