import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class gui{
	public static void main(String[] args){
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,5,50));//(FLowLayout.[LEADING, TRAILING OR CENTER],marginX,marginY)

		JPanel panel=new JPanel();
		panel.setPreferredSize(new Dimension(250,250));
		panel.setBackground(Color.lightGray);
		panel.setLayout(new FlowLayout());

		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));

		frame.add(panel);
		frame.setVisible(true);
	}
}