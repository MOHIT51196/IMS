package com.instisoft.graph.views;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class LineChart {
	
	private static JFreeChart createChart(DefaultCategoryDataset dataset){
		JFreeChart chart = ChartFactory.createLineChart(
				"Institute Sales",
				"X Axis",
				"Y Axis",
				dataset,
				PlotOrientation.VERTICAL,
				true, true, false
				);
		
		return chart;
	}
	
	
	private static DefaultCategoryDataset createDataset( ) {
	      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
	      dataset.addValue( 15 , "sales" , "2000" );
	      dataset.addValue( 30 , "sales" , "2004" );
	      dataset.addValue( 60 , "sales" ,  "2008" );
	      dataset.addValue( 120 , "sales" , "2012" );
	      dataset.addValue( 240 , "sales" , "2016" );
	      dataset.addValue( 300 , "sales" , "2017" );
	      return dataset;
	   }

	public static JPanel createChartPanel( ) {
	      JFreeChart chart = createChart(createDataset());  
	      return new ChartPanel( chart ); 
	   }

}
