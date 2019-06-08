package photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)

		// 2. create a variable of type "Component" that will hold your image
		Component e = createImage("https://pm1.narvii.com/6785/91db4d628d84bf03db40c80697a3f76c26658678v2_hq.jpg");
		// 3. use the "createImage()" method below to initialize your Component
		Component q = createImage("https://preview.redd.it/n7nzlqww88w21.jpg?width=897&auto=webp&s=17b827c35f1fda65eae7db26b92c77675a292f2a");
		// 4. add the image to the quiz window
		quizWindow.add(e);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String z = JOptionPane.showInputDialog("What is this thing from");
		// 7. print "CORRECT" if the user gave the right answer
		if(z.contentEquals("Roblox")) {
			JOptionPane.showMessageDialog(null, "ok.");
		}
		
		else{ JOptionPane.showMessageDialog(null, "no.");}
		
		quizWindow.remove(e);
		quizWindow.add(q);
		quizWindow.pack();
		// 8. print "INCORRECT" if the answer is wrong
String x = JOptionPane.showInputDialog("Does this keep you living?");
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
if(x.contentEquals("YES")) {
	JOptionPane.showMessageDialog(null, "Mk Good.");
}

else { JOptionPane.showMessageDialog(null, "Shame..... This is the Peak of evoulution.");}
		// 10. find another image and create it (might take more than one line
		// of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
