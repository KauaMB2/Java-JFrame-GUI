import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class gui{
	public static void main(String[] args){
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);

		JLabel label1=new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.RED);
		label1.setBounds(0,0,200,200);

		JLabel label2=new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.GREEN);
		label2.setBounds(100,100,200,200);

		JLabel label3=new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.BLUE);
		label3.setBounds(150,150,200,200);

		JLayeredPane layeredPane=new JLayeredPane();
		layeredPane.setBounds(0,0,500,500);
		layeredPane.add(label1,Integer.valueOf(0));//Last image - The number defines which layer the image is
		layeredPane.add(label2,Integer.valueOf(2));//First image - The number defines which layer the image is
		layeredPane.add(label3,Integer.valueOf(1));//Middle image - The number defines which layer the image is

		frame.add(layeredPane);
		frame.setVisible(true);
	}
}