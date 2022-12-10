import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class MyFrame implements ActionListener{
	JFrame frame=new JFrame("Menu Bar");
	JButton button;
	JLabel label;
	public MyFrame(){
		button=new JButton("Select File");
		button.addActionListener(this);

		label=new JLabel();
		label.setBackground(Color.white);
		label.setText("This is some text :D");
		label.setFont(new Font("MV Boli",Font.PLAIN,100));
		label.setOpaque(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.add(button);
		frame.add(label);
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==button){//If you clicked...
			JColorChooser colorChooser=new JColorChooser();
			Color color=JColorChooser.showDialog(null,"Pick a color... I guess", Color.black);
			label.setForeground(color);//Set text-color
		}
	}
}