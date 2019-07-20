package cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {

	JButton Cutene = new JButton();
	JButton Cuten = new JButton();
	JButton Cute = new JButton();

	public void run(){

		Cutene.addActionListener(this);
		Cuten.addActionListener(this);
		Cute.addActionListener(this);
		
		
		JFrame Cuteness = new JFrame();	
		JPanel Cutenes = new JPanel();
		Cuteness.setVisible(true);

		Cuteness.setTitle("UwU on dem");			
		Cutene.setText("Duckies");
		Cuten.setText("Froggy");
		Cute.setText("Fluffy Unicorny");

		Cuteness.add(Cutenes);
		Cutenes.add(Cutene);
		Cutenes.add(Cuten);
		Cutenes.add(Cute);

		Cuteness.pack();
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e){
			e.printStackTrace();}


	}


	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();

		if(buttonPressed == Cutene){
			showDuck();}
		
		if(buttonPressed == Cuten){
			showFroggy();}

		if(buttonPressed == Cute){
			showFlufflyUnicorns();}
	}






	void showDuck() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");

	}
	void showFroggy() {
		playVideo("https://www.youtube.com/watch?v=Z7wfSkhwtwA");
	}
void showFlufflyUnicorns() {
playVideo("https://www.youtube.com/watch?v=-sCJZ1pzyNM");
}
}











