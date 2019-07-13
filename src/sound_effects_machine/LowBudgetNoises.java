package sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class LowBudgetNoises implements ActionListener {


	JButton oGod = new JButton();
	JButton NiceWord = new JButton();
	JButton oof = new JButton();
	JButton GiornoGiovanna = new JButton();


     public void run() {

    	 
JFrame Kono = new JFrame();
JPanel Suba = new JPanel();     


Kono.add(Suba);
Kono.setVisible(true);



oGod.setText("OH GOD");
NiceWord.setText("Not Bad Word");
oof.setText("RobloxGuy125 pwned (YOU)");
GiornoGiovanna.setText("Gang-Star");



oGod.addActionListener(this);
NiceWord.addActionListener(this);
oof.addActionListener(this);
GiornoGiovanna.addActionListener(this);


Suba.add(oGod);
Suba.add(NiceWord);
Suba.add(oof);
Suba.add(GiornoGiovanna);

Kono.pack();
Kono.setTitle("Kono Requiem-Da");
     }
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
    
}    


public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	
	if(buttonPressed == oGod){
	playSound("oGod.wav");}
	
	if(buttonPressed == NiceWord){
		playSound("NiceWord.wav");}

	if(buttonPressed == oof){
		playSound("oof.wav");}
	
	if(buttonPressed == GiornoGiovanna){
		playSound("GiornoGIovanna.wav");}
}
}


