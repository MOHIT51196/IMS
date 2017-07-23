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

public class HolidaySchedulePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	

	/**
	 * Create the frame.
	 */
	public HolidaySchedulePanel() {
	
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
		
		String columnNames[] = {"S. No.", "Holiday Name", "Date", "Description"};
		
		Object[][] data = {
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"},
				{"1.", "Independence Day", "15/08/2017", "National Holiday"}
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
		edit.setBounds(366, 523, 160, 35);
		modifyButton(edit);
		add(edit);
		
		JButton btnDelete = new JButton("Delete");
	    btnDelete.setBounds(559, 523, 160, 35);
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
	    btnSortByName.setBounds(757, 523, 160, 35);
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
	    btnSortByDate.setBounds(948, 523, 160, 35);
	    modifyButton(btnSortByDate);
	    add(btnSortByDate);
	    
	}
	
	void tableView(JTable table){
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(30);     
	      tcm.getColumn(1).setPreferredWidth(250);    
	      tcm.getColumn(2).setPreferredWidth(100);    
	      tcm.getColumn(3).setPreferredWidth(500);
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
					contentPane.add(new HolidaySchedulePanel());
					frame.setContentPane(contentPane);
					
					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
