import javax.swing.*;
import java.awt.*;


public class ProgressBarDemo{
	JFrame frame=new JFrame("ProgressBar");
	JProgressBar bar=new JProgressBar(0,100);//(Max,Min)

	public ProgressBarDemo(){
		bar.setValue(0);//Set a value in the progressbar
		bar.setBounds(0,0,420,50);//(posX,poxY,width,height)
		bar.setStringPainted(true);//Enable or not the string in the progressbar
		bar.setFont(new Font("MV Boli",Font.BOLD,25));//set the font of text in progressbar
		bar.setForeground(Color.green);//Set the color of progressbar
		bar.setBackground(Color.black);//Set the progressbar background color

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.add(bar);
		frame.setSize(420,420);
		frame.setResizable(false);
		frame.setVisible(true);
		fill();
	}
	public void fill(){
		int counter=0;
		while(counter<=100){
			bar.setValue(counter);//Set a value in the progressbar
			try{
				Thread.sleep(100);//milliseconds
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			counter+=1;
		}
		bar.setString("Done! :)");//Set a string in the progressbar
	}
}