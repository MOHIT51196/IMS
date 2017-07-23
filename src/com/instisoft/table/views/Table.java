package com.instisoft.table.views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

public class Table extends JTable {

	private static final long serialVersionUID = 1L;
	
	private Toggle editable;
	private JScrollPane scrollPane;
	private JTableHeader header;
	private TableModel model;
	
	  
	//for 2dObject Array input
	public Table(String[] header, Object[][] data, Toggle editable) {
		this.editable = editable;
	   
	    generateModel(header, data);
	    
	    setModel(model);
	    setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
	    
	    generateHeader();
	    
	    setScrollPane();
	    
	}

	public Table(String[] header, int rowCount, Toggle editable) {
		this.editable = editable;
	   
	    generateModel(header, rowCount);
	    
	    setModel(model);
	    setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
	    
	    generateHeader();
	    
	    setScrollPane();
	    
	}
	
	
	private void setScrollPane(){
		scrollPane = new JScrollPane();
	    scrollPane.setViewportView(this);
	}
	
	private void generateHeader(){
		header = this.getTableHeader();
	    header.setBackground(new Color(102, 255, 153));
	    header.setForeground(Color.WHITE);
	    header.setFont(new Font("Tahoma", Font.PLAIN, 16));
	}
	
	//for 2dObject Array input
	public void generateModel(String[] header, Object[][] data){
		model = new DefaultTableModel(data, header){
		    
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column)
		    {
		      return false;//This causes all cells to be not editable
		    }
		};
	}
	
	public void generateModel(String[] header, int rowCount){
		model = new DefaultTableModel(header, rowCount){
		    
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column)
		    {
		      return false;//This causes all cells to be not editable
		    }
		};
	}
	
	
	public Toggle getEditable() {
		return editable;
	}


	public JScrollPane getScrollPane() {
		return scrollPane;
	}


	public JTableHeader getHeader() {
		return header;
	}

	
	public boolean isCellEditable(int row, int column)
    {
        return editable.getVal(); //request current value
    }

}
