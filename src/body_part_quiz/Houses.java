

package body_part_quiz;



import org.jointheleague.graphical.robot.Robot;

public class Houses {

static Robot z = new Robot();	

static int s = 60;		
static int m = 120;
static int l = 250;

static void drawhouse(){
	z.setPenColor(255,90,2);
	z.move(m);		
	z.turn(90);		
	z.move(25);		
	z.turn(90);
	z.move(m);
	z.turn(-90);
	z.setPenColor(55,147,36);
	z.move(10);		
}

static void drawPointy() {
	z.setPenColor(66,131,237);
	z.turn(-90);
	z.move(s);		
	z.turn(45);	
	z.move(25);		
	z.turn(90);
	z.move(25);
	z.turn(45);
	z.move(s);
	z.turn(-90);
	z.setPenColor(55,147,36);
	z.move(10);
    z.turn(-90);
		
}

static void drawhous() {
	z.setPenColor(244,66,209);
	z.move(l);		
	z.turn(90);		
	z.move(25);		
	z.turn(90);
	z.move(l);
	z.turn(-90);
	z.setPenColor(55,147,36);
	z.move(10);	
	z.turn(-90);
		
}
	
	public static void main(String[] args) {
		


	
z.setX(0);
z.penDown();
z.setSpeed(999999999);


for (int i = 0; i < 999999999; i++) {
drawhouse();
drawPointy();
drawhous();

	}
}
}