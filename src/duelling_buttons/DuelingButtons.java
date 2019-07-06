package duelling_buttons;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DuelingButtons implements ActionListener {

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();

	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);

	JFrame frame = new JFrame();
	JFrame frame2 = new JFrame();
	JPanel panel = new JPanel();

	public void run() {

				 
		 frame.add(panel);
		 frame.setVisible(true);
		 leftButton.setText("dont klick me   >:C");
		 rightButton.setText(" KLICK MEH pl0x plo0x pl0x D; ");
		 
		 leftButton.addActionListener(this);
		 rightButton.addActionListener(this);
	
		 panel.add(leftButton);
		 panel.add(rightButton);
		 
		 

		 frame.pack();
				 
		 	  frame.setTitle("buttons mad, but actually buttons sad");

		 
		 
		// 1. @Add the panel to the frame
       
		// 2. @Make the frame visible

		// 3. @Set the text of the leftButton to "Click me!"

		// 4. @Set the text of the rightButton to "Click me!"

		// 5. @Add an action listener to the leftButton

		// 6. @Add an action listener to the rightButton

		// 7. @Add the rightButton to the panel
		 
		// 8. @Add the leftButton to the panel

		// 9. Pack the frame

		// 10. Set the title of the frame to "Demanding Buttons"

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		if(buttonPressed == leftButton){
			rightButton.setText("nu dont click me");
		rightButton.setPreferredSize(BIG);
		leftButton.setText("click u");
		leftButton.setPreferredSize(SMALL);
		//JOptionPane.showMessageDialog(null, "(Left button): OMAE A WAE MO SHINDERI!!! *left button EPICLY CHILL rushed up to u and destroyed u * (Right button): u should chos3 me pl0x pl0x pl0x *right button then awkwardly dabs and everyone looks at him with a weird face");
		}
		else  if(buttonPressed == rightButton){
			leftButton.setText("donut click me");
		leftButton.setPreferredSize(BIG);
		rightButton.setText("click u");
		rightButton.setPreferredSize(SMALL);
		//JOptionPane.showMessageDialog(null, "(Right Button): HA GET REKT N00BS IM DE BEST BUTTON.. CUZ IT WAS I.. K0N0 DI0 DA!.. *left button awakens star platinum and tells it to go EPICLY wreck DI0* *right button does de same* (Star Platinum): ORA! (The World): MUDA! ZAWARDO! *star platinum then moves durring time stop and defeats DI0.. EPICLY");
		}
		
	
		
		
		
			
		/* If the buttonPressed was the leftButton.... */
		// Set the text of the rightButton to "No, click Me!"
		// Set the PREFERRED size of the rightButton to BIG
		// Set the text of the leftButton to "Click Me!"
		// Set the PREFERRED size of the leftButton to SMALL

		/* If the buttonPressed was the rightButton, do the opposite. */

		frame.pack();
	}
}
