package PanelFrame;
// fig 12.46 Panel Demo.Java p. 530-531
// testing PanelFrame
import javax.swing.JFrame;

public class PanelDemo extends JFrame {

	public static void main(String[] args) {
		
		//WeatherInfo wethInfo = new WeatherInfo();
		
		/*
		PanelFrame panelFrame = new PanelFrame();
		panelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		panelFrame.setSize(450, 200);
		panelFrame.setVisible(true);
	**/
		WeatherTemp weatherTemp = new WeatherTemp();
		weatherTemp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		weatherTemp.setSize(450, 200);
		weatherTemp.setVisible(true);
	

	}

}
