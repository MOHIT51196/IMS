package com.instisoft.graph.views;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class XYChart {

	 private static XYDataset createDataset( ) {
	      final XYSeries jan = new XYSeries( "January" );          
	      jan.add( 1.0 , 1.0 );          
	      jan.add( 2.0 , 4.0 );          
	      jan.add( 3.0 , 3.0 ); 
	      jan.add( 5.0 , 6.0 ); 
	      
	      final XYSeries may = new XYSeries( "May" );          
	      may.add( 1.0 , 4.0 );          
	      may.add( 2.0 , 5.0 );          
	      may.add( 3.0 , 6.0 );  
	      may.add( 5.0 , 5.0 );
	      
	      final XYSeries sept = new XYSeries( "September" );          
	      sept.add( 1.0 , 2.0 ); 
	      sept.add( 3.0 , 4.0 );          
	      sept.add( 4.0 , 5.0 );          
	      sept.add( 5.0 , 4.0 );          
	      
	      final XYSeriesCollection dataset = new XYSeriesCollection( );          
	      dataset.addSeries( jan );          
	      dataset.addSeries( may );          
	      dataset.addSeries( sept );
	      return dataset;
	   }
	
	private static JFreeChart createChart(XYDataset dataset){
		return ChartFactory.createXYLineChart(
				"Mobile Sales",
				"X Axis",
				"Y Axis",
				dataset,
				PlotOrientation.VERTICAL,
				true, true, false
				);
	}
	
	public static JPanel createChartPanel( ) {
	      JFreeChart chart = createChart(createDataset());  
	      return new ChartPanel( chart ); 
	}
}
