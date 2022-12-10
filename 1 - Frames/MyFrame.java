import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame{
	public MyFrame(){
		//JFrame is a GUI window to add components to
		JFrame frame=new JFrame();
		frame.setTitle("JFrame title is here");//Set the name of the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Set what the CloseButton does
		frame.setResizable(false);//Set if the window can be resized or not 
		frame.setSize(420,420);//Sets the X-dimension, and Y-dimension
		frame.setVisible(true);//Make frame visible

		ImageIcon image=new ImageIcon("../imgs/logo.png");
		frame.setIconImage(image.getImage());//Set a image for be the GUI Icon
		frame.getContentPane().setBackground(new Color(0xFFFFFF));//Set the background color
	}
}