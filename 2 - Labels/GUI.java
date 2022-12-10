import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class GUI{
	public static void main(String[] args){
		ImageIcon imageLabel=new ImageIcon("../imgs/dude.png");
		JLabel label=new JLabel();
		Border border=BorderFactory.createLineBorder(Color.green,5);
		label.setText("Bro, do you even code?");//Set the text
		label.setIcon(imageLabel);//Set a background image for the label
		label.setHorizontalTextPosition(JLabel.CENTER);//Set text horizontal position (LEFT,CENTER,RIGHT)
		label.setVerticalTextPosition(JLabel.TOP);//Set text vertical position (TOP,CENTER,BOTTOM)
		label.setForeground(new Color(0x00FF00));//set text-color
		label.setFont(new Font("MV Boli",Font.PLAIN,20));//Set the font
		label.setIconTextGap(50);//It Shifts the text
		label.setBackground(Color.black);//Set bacground color
		label.setOpaque(true);//Display background color in label
		label.setHorizontalAlignment(JLabel.CENTER);//Set label horizontal position (LEFT,CENTER,RIGHT)
		label.setVerticalAlignment(JLabel.CENTER);//Set label vertical position (TOP,CENTER,BOTTOM)
		//label.setBounds(100,100,350,350);//Set the x and y position and width and height of label  (xPosition,yPosition,xDimension,yPosition)
		label.setBorder(border);

		JFrame gui=new JFrame();
		gui.setTitle("JFrame title is here");//Set the name of the window
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Set what the CloseButton does
		gui.setResizable(true);//Set if the window can be resized or not 
		//gui.setLayout(null);
		//gui.setSize(420,420);//Sets the X-dimension, and Y-dimension
		gui.setVisible(true);//Make frame visible
		gui.add(label);//Add the label in the GUI
		gui.pack();//Set the width and height according the size o content
		

		ImageIcon image=new ImageIcon("../imgs/logo.png");
		gui.setIconImage(image.getImage());//Set a image for be the GUI Icon
		gui.getContentPane().setBackground(new Color(0xFFFFFF));//Set the background color
		
	}
}