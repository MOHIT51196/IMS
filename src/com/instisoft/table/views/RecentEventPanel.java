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

import com.instisoft.table.views.Table;
import com.instisoft.table.views.Toggle;
import com.instisoft.utils.GUILookAndFeel;

public class RecentEventPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	

	/**
	 * Create the frame.
	 */
	public RecentEventPanel() {
	
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
		
		String columnNames[] = {"S. No.", "Name", "Date", "Venue", "Time", "Description", "Status"};
		
		Object[][] data = {
				{"2.", "Demo For Java", "11/8/2017", "Budi", "2:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Aemo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Cancelled"},
				{"1.", "Zemo For Java", "11/8/2017", "Cudi", "112:00", "Demostration for what is java and why it is so popular", "Postponed"},
				{"1.", "Bemo For Java", "11/8/2017", "Sudi", "42:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Rudi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"},
				{"1.", "Demo For Java", "11/8/2017", "Audi", "12:00", "Demostration for what is java and why it is so popular", "Completed"}
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
		edit.setBounds(10, 521, 160, 35);
		modifyButton(edit);
		add(edit);
		
		JButton btnDelete = new JButton("Delete");
	    btnDelete.setBounds(199, 523, 160, 35);
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
	    btnSortByName.setBounds(385, 523, 160, 35);
	    modifyButton(btnSortByName);
	    add(btnSortByName);
	    
	    JButton btnSortByDate = new JButton("Sort By Date");
	    btnSortByDate.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>(25);
	    		list.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    btnSortByDate.setBounds(574, 523, 160, 35);
	    modifyButton(btnSortByDate);
	    add(btnSortByDate);
	    
	    JButton btnSortByVenue = new JButton("Sort By Venue");
	    btnSortByVenue.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>(25);
	    		list.add(new RowSorter.SortKey(3, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    btnSortByVenue.setBounds(762, 523, 160, 35);
	    modifyButton(btnSortByVenue);
	    add(btnSortByVenue);
	    
	    JButton btnSortByStatus = new JButton("Sort By Status");
	    btnSortByStatus.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>(25);
	    		list.add(new RowSorter.SortKey(6, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    btnSortByStatus.setBounds(948, 523, 160, 35);
	    modifyButton(btnSortByStatus);
	    add(btnSortByStatus);
	}
	
	void tableView(JTable table){
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(100);     
	      tcm.getColumn(1).setPreferredWidth(250);    
	      tcm.getColumn(2).setPreferredWidth(100);    
	      tcm.getColumn(3).setPreferredWidth(250);
	      tcm.getColumn(4).setPreferredWidth(150);    
	      tcm.getColumn(5).setPreferredWidth(350);
	      tcm.getColumn(6).setPreferredWidth(150);
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
					contentPane.add(new RecentEventPanel());
					frame.setContentPane(contentPane);
					
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

