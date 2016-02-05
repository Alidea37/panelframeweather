/*
package PanelFrame;
// fig 12.45 PanelFrame.java p530
// using a JPanel to help lay out components

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelFrame extends JFrame
{
	private final JPanel buttonJPanel;
	private final JButton[] buttons;
	
	// no argument constructor
	public PanelFrame()
	{
		super("Panel Demo");
		buttons = new JButton[5];
		buttonJPanel = new JPanel();
		buttonJPanel.setLayout(new GridLayout(1, buttons.length));
		//getbuttonJPanel().setBackground(Color.GREEN);
		// create and add buttons
		for (int count = 0; count < buttons.length; count++)
		{
			buttons[count] = new JButton("Button " + (count + 1));
			buttonJPanel.add(buttons[count]); // add button to panel
		}
	
		add(buttonJPanel, BorderLayout.SOUTH); // add panel to JFrame
	}

	private JPanel getbuttonJPanel() {
		// TODO Auto-generated method stub
		return buttonJPanel;
	}
}
**/