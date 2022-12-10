import java.awt.Color;
// import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI{
	public static void main(String[] args){

		ImageIcon icon=new ImageIcon("../imgs/thumbsup.png");
		JLabel label=new JLabel();
		label.setText("Hi");
		label.setIcon(icon);
		//label.setVerticalAlignment(JLabel.BOTTOM);//Set label vertical position (TOP,CENTER,BOTTOM)
		//label.setHorizontalAlignment(JLabel.LEFT);//Set label horizontal position (LEFT,CENTER,RIGHT)
		label.setBounds(0, 100, 140, 120);//(x,y,Width,Height)

		JPanel redPanel=new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0,0,400,250);
		JPanel greenPanel=new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(400,0,400,250);
		JPanel bluePanel=new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(0,250,800,250);

		JFrame gui=new JFrame();
		gui.setTitle("JFrame title is here");//Set the name of the window
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Set what the CloseButton does
		gui.setResizable(false);//Set if the window can be resized or not
		gui.setSize(800,750);//Sets the X-dimension, and Y-dimension
		gui.setVisible(true);//Make frame visible
		ImageIcon image=new ImageIcon("../imgs/logo.png");
		gui.setIconImage(image.getImage());//Set a image for be the GUI Icon
		gui.getContentPane().setBackground(new Color(0xFFFFFF));//Set the background color
		redPanel.add(label);
		gui.add(redPanel);
		gui.add(greenPanel);
		gui.add(bluePanel);
	}
}