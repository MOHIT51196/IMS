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
import javax.swing.JTextArea;

public class DEventTablePanel extends JPanel {
	
	
	private static final long serialVersionUID = 1L;
	
	private static JPanel contentPane;
	private JTextField textField_Name;
	private JTextField textField_Date;
	private JTextField textField_Venue;
	private JTextField textField_Time;
	
	/**
	 * Create the panel.
	 */
	public DEventTablePanel() {
		
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
		
		String columnNames[] = {"S. No.", "Event Name", "Date"};
		
		Object[][] data = {
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"},
				{"1.", "Java Seminar", "2017/08/01"}
		};
		
		Toggle isEditable = new Toggle(false);
		
		Table table = new Table(columnNames, data, isEditable);
		tableView(table);
		tablePanel.add(table.getScrollPane(),BorderLayout.CENTER);
		
		JLabel lblName = new JLabel("Event Name");
		lblName.setBounds(25, 50, 100, 25);
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblName);
		
		textField_Name = new JTextField();
		textField_Name.setText((String) table.getValueAt(0, 1));
		textField_Name.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Name.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Name.setColumns(10);
		textField_Name.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Name.setBounds(135, 48, 286, 30);
		textField_Name.setEditable(false);
		detailsPanel.add(textField_Name);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(25, 91, 100, 25);
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblDate);
		
		textField_Date = new JTextField();
		textField_Date.setText((String) table.getValueAt(0, 1));
		textField_Date.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Date.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Date.setColumns(10);
		textField_Date.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Date.setBounds(135, 89, 150, 30);
		textField_Date.setEditable(false);
		detailsPanel.add(textField_Date);
		
		JLabel lblVenue = new JLabel("Venue");
		lblVenue.setBounds(25, 132, 90, 25);
		lblVenue.setForeground(Color.WHITE);
		lblVenue.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblVenue);
		
		textField_Venue = new JTextField();
		textField_Venue.setText((String) table.getValueAt(0, 1));
		textField_Venue.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Venue.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Venue.setColumns(10);
		textField_Venue.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Venue.setBounds(135, 130, 286, 30);
		textField_Venue.setEditable(false);
		detailsPanel.add(textField_Venue);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(321, 91, 100, 25);
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblTime);
		
		textField_Time = new JTextField();
		textField_Time.setText((String) table.getValueAt(0, 1));
		textField_Time.setHorizontalAlignment(SwingConstants.LEFT);
		textField_Time.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_Time.setColumns(10);
		textField_Time.setBorder(new EmptyBorder(0, 10, 0, 10));
		textField_Time.setBounds(394, 89, 150, 30);
		textField_Time.setEditable(false);
		detailsPanel.add(textField_Time);
		
		JLabel lblDesc = new JLabel("Description");
		lblDesc.setBounds(25, 171, 100, 25);
		lblDesc.setForeground(Color.WHITE);
		lblDesc.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		detailsPanel.add(lblDesc);
		
		JTextArea textArea_Desc = new JTextArea();
		textArea_Desc.setBounds(135, 171, 286, 90);
		textArea_Desc.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textArea_Desc.setBorder(new EmptyBorder(0, 10, 0, 10));
		textArea_Desc.setEditable(false);
	    detailsPanel.add(textArea_Desc);
		
		JButton btnEdit = new JButton("Edit");
	    btnEdit.setSize(150, 35);
	    btnEdit.setLocation(135, 511);
	    btnEdit.addActionListener((event)->{
			((JButton)event.getSource()).setText("Update");
			textField_Name.setEditable(true);
			textField_Date.setEditable(true);
			textField_Venue.setEditable(true);
			textField_Time.setEditable(true);
			textArea_Desc.setEditable(true);
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
						contentPane.add(new DEventTablePanel());
						frame.setContentPane(contentPane);
						
						
						frame.setVisible(true);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		
	}
}
