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

public class BatchTablePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public BatchTablePanel() {

		setSize( 1118, 569);
		setBackground(null);
		setOpaque(false);
		setLayout(null);
		
		JPanel tablePanel = new JPanel();
		tablePanel.setBounds(0, 0, 1118, 500);
		tablePanel.setLayout(new BorderLayout());
		add(tablePanel);
		
		String columnNames[] = {"Batch Id", "Batch Name", "Course Name", "Category", "Faculty", "Start date", "End Date", "Hours/Class", "Btach Timings"};
		
		Object[][] data = {
				{"b@W10234", "May Evening 5-7", "Java Core", "Advanced",  "Amit Srivastava",  "2017-05-07", "2017-06-18", "2 hr", "05:00 PM"},
				{"b@N11131", "August Morning 10-11", "Advanced Java", "Intermediates", "Amit Srivastava", "2017-08-07", "2017-09-08", "1 hr", "10:00 AM"},
				{"b@B10554", "July Noon 2-5", "English Speaking", "Beginners",  "Amit Srivastava",  "2017-07-05", "2017-12-06", "3 hr", "02:00 PM"},
				{"b@F7880", "July Morning 10-12", "Advanced Physics", "Intermediates", "Amit Srivastava", "2017-07-17", "2017-09-28", "2 hr", "10:00 AM"},
				{"b@W10234", "May Evening 5-7", "Java Core", "Advanced",  "Amit Srivastava",  "2017-05-07", "2017-06-18", "2 hr", "05:00 PM"},
				{"b@N11131", "August Morning 10-11", "Advanced Java", "Intermediates", "Amit Srivastava", "2017-08-07", "2017-09-08", "1 hr", "10:00 AM"},
				{"b@B10554", "July Noon 2-5", "English Speaking", "Beginners",  "Amit Srivastava",  "2017-07-05", "2017-12-06", "3 hr", "02:00 PM"},
				{"b@F7880", "July Morning 10-12", "Advanced Physics", "Intermediates", "Amit Srivastava", "2017-07-17", "2017-09-28", "2 hr", "10:00 AM"},
				{"b@W10234", "May Evening 5-7", "Java Core", "Advanced",  "Amit Srivastava",  "2017-05-07", "2017-06-18", "2 hr", "05:00 PM"},
				{"b@N11131", "August Morning 10-11", "Advanced Java", "Intermediates", "Amit Srivastava", "2017-08-07", "2017-09-08", "1 hr", "10:00 AM"},
				{"b@B10554", "July Noon 2-5", "English Speaking", "Beginners",  "Amit Srivastava",  "2017-07-05", "2017-12-06", "3 hr", "02:00 PM"},
				{"b@F7880", "July Morning 10-12", "Advanced Physics", "Intermediates", "Amit Srivastava", "2017-07-17", "2017-09-28", "2 hr", "10:00 AM"},
				{"b@W10234", "May Evening 5-7", "Java Core", "Advanced",  "Amit Srivastava",  "2017-05-07", "2017-06-18", "2 hr", "05:00 PM"},
				{"b@N11131", "August Morning 10-11", "Advanced Java", "Intermediates", "Amit Srivastava", "2017-08-07", "2017-09-08", "1 hr", "10:00 AM"},
				{"b@B10554", "July Noon 2-5", "English Speaking", "Beginners",  "Amit Srivastava",  "2017-07-05", "2017-12-06", "3 hr", "02:00 PM"},
				{"b@F7880", "July Morning 10-12", "Advanced Physics", "Intermediates", "Amit Srivastava", "2017-07-17", "2017-09-28", "2 hr", "10:00 AM"},
				{"b@W10234", "May Evening 5-7", "Java Core", "Advanced",  "Amit Srivastava",  "2017-05-07", "2017-06-18", "2 hr", "05:00 PM"},
				{"b@N11131", "August Morning 10-11", "Advanced Java", "Intermediates", "Amit Srivastava", "2017-08-07", "2017-09-08", "1 hr", "10:00 AM"},
				{"b@B10554", "July Noon 2-5", "English Speaking", "Beginners",  "Amit Srivastava",  "2017-07-05", "2017-12-06", "3 hr", "02:00 PM"},
				{"b@F7880", "July Morning 10-12", "Advanced Physics", "Intermediates", "Amit Srivastava", "2017-07-17", "2017-09-28", "2 hr", "10:00 AM"},
				{"b@W10234", "May Evening 5-7", "Java Core", "Advanced",  "Amit Srivastava",  "2017-05-07", "2017-06-18", "2 hr", "05:00 PM"},
				{"b@N11131", "August Morning 10-11", "Advanced Java", "Intermediates", "Amit Srivastava", "2017-08-07", "2017-09-08", "1 hr", "10:00 AM"},
				{"b@B10554", "July Noon 2-5", "English Speaking", "Beginners",  "Amit Srivastava",  "2017-07-05", "2017-12-06", "3 hr", "02:00 PM"},
				{"b@F7880", "July Morning 10-12", "Advanced Physics", "Intermediates", "Amit Srivastava", "2017-07-17", "2017-09-28", "2 hr", "10:00 AM"},
				{"b@W10234", "May Evening 5-7", "Java Core", "Advanced",  "Amit Srivastava",  "2017-05-07", "2017-06-18", "2 hr", "05:00 PM"},
				{"b@N11131", "August Morning 10-11", "Advanced Java", "Intermediates", "Amit Srivastava", "2017-08-07", "2017-09-08", "1 hr", "10:00 AM"},
				{"b@B10554", "July Noon 2-5", "English Speaking", "Beginners",  "Amit Srivastava",  "2017-07-05", "2017-12-06", "3 hr", "02:00 PM"},
				{"b@F7880", "July Morning 10-12", "Advanced Physics", "Intermediates", "Amit Srivastava", "2017-07-17", "2017-09-28", "2 hr", "10:00 AM"},
				{"b@W10234", "May Evening 5-7", "Java Core", "Advanced",  "Amit Srivastava",  "2017-05-07", "2017-06-18", "2 hr", "05:00 PM"},
				{"b@N11131", "August Morning 10-11", "Advanced Java", "Intermediates", "Amit Srivastava", "2017-08-07", "2017-09-08", "1 hr", "10:00 AM"},
				{"b@B10554", "July Noon 2-5", "English Speaking", "Beginners",  "Amit Srivastava",  "2017-07-05", "2017-12-06", "3 hr", "02:00 PM"},
				{"b@F7880", "July Morning 10-12", "Advanced Physics", "Intermediates", "Amit Srivastava", "2017-07-17", "2017-09-28", "2 hr", "10:00 AM"},
				{"b@W10234", "May Evening 5-7", "Java Core", "Advanced",  "Amit Srivastava",  "2017-05-07", "2017-06-18", "2 hr", "05:00 PM"},
				{"b@N11131", "August Morning 10-11", "Advanced Java", "Intermediates", "Amit Srivastava", "2017-08-07", "2017-09-08", "1 hr", "10:00 AM"},
				{"b@B10554", "July Noon 2-5", "English Speaking", "Beginners",  "Amit Srivastava",  "2017-07-05", "2017-12-06", "3 hr", "02:00 PM"},
				{"b@F7880", "July Morning 10-12", "Advanced Physics", "Intermediates", "Amit Srivastava", "2017-07-17", "2017-09-28", "2 hr", "10:00 AM"},
				{"b@W10234", "May Evening 5-7", "Java Core", "Advanced",  "Amit Srivastava",  "2017-05-07", "2017-06-18", "2 hr", "05:00 PM"},
				{"b@N11131", "August Morning 10-11", "Advanced Java", "Intermediates", "Amit Srivastava", "2017-08-07", "2017-09-08", "1 hr", "10:00 AM"},
				{"b@B10554", "July Noon 2-5", "English Speaking", "Beginners",  "Amit Srivastava",  "2017-07-05", "2017-12-06", "3 hr", "02:00 PM"},
				{"b@F7880", "July Morning 10-12", "Advanced Physics", "Intermediates", "Amit Srivastava", "2017-07-17", "2017-09-28", "2 hr", "10:00 AM"}
				
				};
		
		final Toggle isEditable = new Toggle(false);
		
		Table table = new Table(columnNames, data, isEditable);
		tableView(table);
	    tablePanel.add(table.getScrollPane(),BorderLayout.CENTER); 
	    
	    JButton edit = new JButton("Edit");
		edit.setBounds(10, 519, 134, 35);
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
		btnDelete.setBounds(165, 519, 134, 35);
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
	    btnSortByName.setBounds(321, 519, 134, 35);
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
	    
	    JButton btnSortByCourse = new JButton("Sort By Course");
	    btnSortByCourse.setBounds(481, 519, 139, 35);
	    modifyButton(btnSortByCourse);
	    btnSortByCourse.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>();
	    		list.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    
	    add(btnSortByCourse);
	    
	    JButton btnSortByCategory = new JButton("Sort By Category");
	    btnSortByCategory.setFont(new Font("Tahoma", Font.PLAIN, 11));
	    btnSortByCategory.setBounds(645, 519, 145, 35);
	    modifyButton(btnSortByCategory);
	    btnSortByCategory.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>(25);
	    		list.add(new RowSorter.SortKey(3, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    
	    add(btnSortByCategory);
	    
	    JButton btnSortByTime = new JButton("Sort By Time");
	    btnSortByTime.setBounds(815, 519, 134, 35);
	    btnSortByTime.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>(25);
	    		list.add(new RowSorter.SortKey(8, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    modifyButton(btnSortByTime);
	    add(btnSortByTime);
	    
	    JButton btnSortByDate = new JButton("Sort By Date");
	    btnSortByDate.setBounds(974, 519, 134, 35);
	    btnSortByDate.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	    		table.setRowSorter(sorter);
	    		List<RowSorter.SortKey> list = new ArrayList<>(25);
	    		list.add(new RowSorter.SortKey(5, SortOrder.ASCENDING));
	    		sorter.setSortKeys(list);
	    	}
	    });
	    modifyButton(btnSortByDate);
	    add(btnSortByDate);
	
	}
	

	void modifyButton(JButton button){
		button.setBackground(GUILookAndFeel.getThemeColor());
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setFocusPainted(false);

	}
	
	void tableView(JTable jtable){
		TableColumnModel tcm = jtable.getColumnModel();
	      tcm.getColumn(0).setPreferredWidth(60);     //Name
	      tcm.getColumn(1).setPreferredWidth(80);    //Title
	      tcm.getColumn(2).setPreferredWidth(100);    //Surname
	      tcm.getColumn(3).setPreferredWidth(60);
	      tcm.getColumn(4).setPreferredWidth(70);
	      tcm.getColumn(5).setPreferredWidth(40);
	      tcm.getColumn(6).setPreferredWidth(50);
	      tcm.getColumn(7).setPreferredWidth(50);
	      tcm.getColumn(8).setPreferredWidth(70);
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
					contentPane.add(new BatchTablePanel());
					frame.setContentPane(contentPane);
					
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
