import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame implements KeyListener {
	JFrame frame=new JFrame();
	JLabel label;
	ImageIcon image;
	MyFrame(){
		image=new ImageIcon("../imgs/falcon9.png");
		label=new JLabel();
		label.setBounds(0,0,100,100);
		label.setOpaque(true);
		label.setIcon(image);


		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.add(label);
		frame.addKeyListener(this);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	@Override
	public void keyTyped(KeyEvent e){
		//keyTyped = Invoked when a key is TYPED. USES KEYCHAR, char output
		switch(e.getKeyChar()){
			case 'a':
				label.setLocation(label.getX()-10,label.getY());
				break;
			case 'w':
				label.setLocation(label.getX(),label.getY()-10);
				break;
			case 's':
				label.setLocation(label.getX(),label.getY()+10);
				break;
			case 'd':
				label.setLocation(label.getX()+10,label.getY());
				break;
			default:
				break;
		}
	}
	@Override
	public void keyPressed(KeyEvent e){
		// Invoked when a physical key is PRESSED DOWN. USES KEYCODE, int output
		switch(e.getKeyCode()){
			case 65:
				label.setLocation(label.getX()-10,label.getY());
				break;
			case 87:
				label.setLocation(label.getX(),label.getY()-10);
				break;
			case 83:
				label.setLocation(label.getX(),label.getY()+10);
				break;
			case 68:
				label.setLocation(label.getX()+10,label.getY());
				break;
		}
	}
	@Override
	public void keyReleased(KeyEvent e){
		// Called whenever a button is released
		System.out.println("You released key char: " + e.getKeyChar());//Get the char of key pressed
        System.out.println("You released key code: " + e.getKeyCode());//Get the code of key pressed
        System.out.println("------------------------");
	}
}
