package PanelFrame;
//pp528-529 gridlayoutframe

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;



public class WeatherTemp extends JFrame implements ActionListener 
{
	protected static final String[][] weather = {
										{"Light", "Heavy", "Scattered", "Possible"}, 
										{"Thunderstorms", "Rain", "Tornados", "Blizzards"}
										};
	
	protected static final String[] towns = {"Helena", "Ekalaka", "Great Falls", "Townsend", "Billings", "Bozeman"};			
	
	private final JButton[] buttons; 
	private static final String[] names = {"Weatherman John", "What's my Local?", "Weatherbot-3000", "Witch Doctor Hal", "CloudWatcher Carl", "Meteorologist Sue"}; 
	private final Container container;			// 
	private final GridLayout gridLayout1;		// 
	
	
	
	
	public WeatherTemp()		//constructor 
	{
		super("Select a Button");
		gridLayout1 = new GridLayout(3, 8, 5, 5); 	
		container = getContentPane();
		setLayout(gridLayout1);
		buttons = new JButton[names.length];
		
		
		for (int count = 0; count < names.length; count++)
		{
			buttons[count] = new JButton(names[count]);
			buttons[count].addActionListener(this);
			add(buttons[count]);		// adds buttons to jframe - JH
		}
	}
		// handle button events. Add event to each button selection - JH
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		
		if (event.getSource() == buttons[0]) // if 1 is selected - JH
					{	
						JOptionPane.showMessageDialog(null, weather[0][0] + " " + weather[1][0] + " in " + towns[0] + " this weekend.");
				}				
		
		
		if (event.getSource() == buttons[1]) // if 2 is selected
					{
			WeatherInfo wethinfo = new WeatherInfo();
				
			//JOptionPane.showMessageDialog(null, weather[0][1] + " " + weather[1][1] + " in " + towns[1] + " this evening.");
				
			JOptionPane.showMessageDialog(null,"%s's forcast is: ", + WeatherInfo.setMytown(mytown) + weather[0][1] + " " + weather[1][1] + " this evening.");
			
			
					}	
							
		
		if (event.getSource() == buttons[2]) // if 3 is selected
			
		{	
			JOptionPane.showMessageDialog(null, weather[0][2] + " " + weather[1][2] + " near " + towns[2] + " until 8:30pm.");
		
					
				for (int c = 0; c < weather.length; c++){
					for (int row = 0; row < weather.length; row++){	
					System.out.println (weather[row][c]);
			
			}
					
		
		if (event.getSource() == buttons[3]) // if 4 is selected
					{
						JOptionPane.showMessageDialog(null, weather[0][0] + " " + weather[1][0] + " around " + towns[3] + " tonight.");
					}
		
		if (event.getSource() == buttons[4]) // if 5 is selected
					{	
						JOptionPane.showMessageDialog(null, weather[0][3] + " " + weather[1][2] + " approaching " + towns[4] + " tomorrow morning.");
					}
		
		if (event.getSource() == buttons[5]) // if 6 is selected
					{
						JOptionPane.showMessageDialog(null, weather[0][0] + " " + weather[1][1] + " circulating " + towns[5] + " this afternoon.");
					}
	{// Set layout
					
		container.setLayout(gridLayout1);
				
				}
			}
		}
	}
}
