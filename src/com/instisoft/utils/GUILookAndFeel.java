package com.instisoft.utils;

import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class GUILookAndFeel {

	private static Color themeColor;
	
	static{
		
//		themeColor = new Color(102, 255, 153);	//Green Color
		themeColor = new Color( 18, 30, 49);	//dark Theme Color
		
	}
	
	private GUILookAndFeel(){}
	
	public static void setGUILookAndFeel(){
		
		try {
			
//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
			LookAndFeelInfo[] lafArray = UIManager.getInstalledLookAndFeels();
			

//			UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
			
//			=================== SUBSTANCE DARK THEME =================
//			SubstanceLookAndFeel.setSkin(new GraphiteGoldSkin());
//			SubstanceLookAndFeel.setSkin("org.pushingpixels.substance.api.skin.GraphiteGoldSkin");
////			-Dswing.defaultlaf=org.pushingpixels.substance.api.skin.SubstanceGraphiteGoldLookAndFeel
//			UIManager.setLookAndFeel(new SubstanceGraphiteGoldLookAndFeel());
//			UIManager.setLookAndFeel("org.pushingpixels.substance.api.skin.SubstanceGraphiteGoldLookAndFeel");
//			==========================================================
			
			for( LookAndFeelInfo laf : lafArray){
				if("Nimbus".equalsIgnoreCase(laf.getName())){

					UIManager.setLookAndFeel(laf.getClassName());

				}
			}
//			==================== MY THEME =====================
//			UIManager.put("nimbusBase", new Color(169,169,169));
//			UIManager.put("nimbusBlueGrey", new Color(102, 255, 153));
//			UIManager.put("control", Color.BLUE);
//			UIManager.put("textText", Color.BLACK);
//			===================================================
			
//			================= DARK THEME =======================
			
			UIManager.put( "control", new Color( 128, 128, 128) );
//			  UIManager.put( "info", new Color(128,128,128) );
			  UIManager.put( "nimbusBase", new Color( 18, 30, 49) );
			  UIManager.put( "nimbusAlertYellow", new Color( 248, 187, 0) );
			  UIManager.put( "nimbusDisabledText", new Color( 128, 128, 128) );
			  UIManager.put( "nimbusFocus", new Color(115,164,209) );
			  UIManager.put( "nimbusGreen", new Color(176,179,50) );
			  UIManager.put( "nimbusInfoBlue", new Color( 66, 139, 221) );
			  UIManager.put( "nimbusLightBackground", new Color( 18, 30, 49) );
//			  UIManager.put( "nimbusOrange", new Color(191,98,4) );
			  UIManager.put( "nimbusRed", new Color(169,46,34) );
//			  UIManager.put( "nimbusSelectedText", new Color( 255, 255, 255) );
			  UIManager.put( "nimbusSelectionBackground", new Color( 104, 93, 156) );
			  UIManager.put( "text", new Color( 230, 230, 230) );
			
//			====================================================
			
		} 
		catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException err) {
			
			err.printStackTrace();
		}
		
	}
	
	public static Color getThemeColor(){
		return themeColor;
	}
}
