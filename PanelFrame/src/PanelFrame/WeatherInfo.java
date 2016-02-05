package PanelFrame;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class WeatherInfo {
	
	protected static String mytown;
	
	protected WeatherInfo() {
	
	}
	protected static void setMytown(String mytown) {
		WeatherInfo.mytown = mytown;
	}
	protected static String getMyTown() {
	
		
	String mytown = JOptionPane.showInputDialog("Enter the name of your town.");
	
	String message = String.format("%s sounds like a nice place", mytown);
	
	
	JOptionPane.showMessageDialog(null,  message);
	
		
		return mytown;
		
}}
	