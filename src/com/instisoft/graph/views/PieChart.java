package com.instisoft.graph.views;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;


public class PieChart {

	private static PieDataset createDataset( ) {
	      DefaultPieDataset dataset = new DefaultPieDataset();
	      dataset.setValue( "January" , new Double( 20 ));  
	      dataset.setValue( "Februray" , new Double( 20 ) );   
	      dataset.setValue( "March" , new Double( 40 ) );    
	      dataset.setValue( "April" , new Double( 10 ) );  
	      return dataset;         
	   }
	   
	   private static JFreeChart createChart( PieDataset dataset ) {
	      JFreeChart chart = ChartFactory.createPieChart(      
	         "Institute Sales",   // chart title 
	         dataset,          // data    
	         true,             // include legend   
	         true, 
	         false);
	     

	      return chart;
	   }
	   
	   public static JPanel createChartPanel( ) {
	      JFreeChart chart = createChart(createDataset( ) ); 
	      return new ChartPanel( chart ); 
	   }
}
