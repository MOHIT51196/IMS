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

public class DueFeesPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	

	/**
	 * Create the frame.
	 */
	public DueFeesPanel() {
	
		setSize( 1118, 569);
		setBackground(null);
		setOpaque(false);
		setLayout(null);
		
		JPanel tablePanel = new JPanel();
		tablePanel.setBounds(0, 0, 1118, 500);
		tablePanel.setLayout(new BorderLayout());
		tablePanel.setBackground(null);
		tablePanel.setOpaque(false);
		add(tablePanel);
		
		String columnNames[] = {"S. No.", "Name", "Student Id", "Program/Course", "Due Amount", "Contact Number", "Email Id"};
		
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
		
		Toggle isEditable = new Toggle(false);
	
		Table table = new Table(columnNames, data, isEditable);
		tableView(table);
	    tablePanel.add(table.getScrollPane(),BorderLayout.CENTER);
		
		JButton edit = new JButton("Edit");
		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isEditable.toggle();
				((DefaultTableModel) table.getModel()).fireTableStructureChanged();
				tableView(table);
			}
		});
		edit.setBounds(10, 511, 160, 35);
		modifyButton(edit);
		add(edit);
		
		JButton btnDelete = new JButton("Delete");
	    btnDelete.setBounds(200, 511, 160, 35);
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
	    btnSortByName.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>();
	    		list.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    btnSortByName.setBounds(388, 511, 160, 35);
	    modifyButton(btnSortByName);
	    add(btnSortByName);
	    
	    JButton btnSortById = new JButton("Sort By Id");
	    btnSortById.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>(25);
	    		list.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    btnSortById.setBounds(578, 511, 160, 35);
	    modifyButton(btnSortById);
	    add(btnSortById);
	    
	    JButton btnSortByCourse = new JButton("Sort By Course");
	    btnSortByCourse.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>(25);
	    		list.add(new RowSorter.SortKey(3, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    btnSortByCourse.setBounds(762, 511, 160, 35);
	    modifyButton(btnSortByCourse);
	    add(btnSortByCourse);
	    
	    JButton btnSortByAmount = new JButton("Sort By Amount");
	    btnSortByAmount.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>(25);
	    		list.add(new RowSorter.SortKey(4, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    btnSortByAmount.setBounds(948, 511, 160, 35);
	    modifyButton(btnSortByAmount);
	    add(btnSortByAmount);
	}
	
	void tableView(JTable table){
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(100);     
	      tcm.getColumn(1).setPreferredWidth(200);    
	      tcm.getColumn(2).setPreferredWidth(150);    
	      tcm.getColumn(3).setPreferredWidth(250);
	      tcm.getColumn(4).setPreferredWidth(150);    
	      tcm.getColumn(5).setPreferredWidth(200);
	      tcm.getColumn(6).setPreferredWidth(300);
	}
	
	void modifyButton(JButton btn){
		btn.setBackground(GUILookAndFeel.getThemeColor());
		btn.setForeground(Color.WHITE);
		btn.setFont(new Font("Tahoma", Font.PLAIN, 16));
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
					contentPane.add(new DueFeesPanel());
					frame.setContentPane(contentPane);
					
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
