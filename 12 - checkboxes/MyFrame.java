import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame implements ActionListener{
	JFrame frame=new JFrame();
	JButton button;
	JCheckBox checkBox;
	ImageIcon xIcon;
	ImageIcon checkIcon;
	public MyFrame(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		xIcon=new ImageIcon("../imgs/close.png");
		checkIcon=new ImageIcon("../imgs/done.png");

		button=new JButton("Submit");
		button.addActionListener(this);

		checkBox=new JCheckBox();
		checkBox.setText("I'm not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
		checkBox.setIcon(xIcon);
		checkBox.setSelectedIcon(checkIcon);

		frame.add(button);
		frame.add(checkBox);
		frame.pack();//Set the width and height according the size o content
		frame.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==button){
			System.out.println(checkBox.isSelected());
		}
	}
}