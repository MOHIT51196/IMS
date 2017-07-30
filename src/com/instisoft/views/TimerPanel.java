package com.instisoft.views;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class TimerPanel extends JLabel {


	private static final long serialVersionUID = 1L;

	public TimerPanel() {
		setSize(180, 24);
		setFont(new Font("SansSerif", Font.PLAIN, 13));
		setHorizontalAlignment(SwingConstants.CENTER);
		setVerticalAlignment(SwingConstants.CENTER);
		setForeground(new Color( 18, 30, 49));
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yy  hh:mm:ss");
		
		
		Timer timerThread = new Timer(2000, (event)->{
			setText(formatter.format(LocalDateTime.now()));
		});
		
		timerThread.start();
	}
		
}
