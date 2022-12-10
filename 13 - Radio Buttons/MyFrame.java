import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame implements ActionListener{
	JFrame frame=new JFrame();
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;

	ImageIcon pizzaIcon;
  	ImageIcon hamburgerIcon;
  	ImageIcon hotdogIcon;
	public MyFrame(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		pizzaIcon=new ImageIcon("../imgs/pizza.png");
		hamburgerIcon=new ImageIcon("../imgs/hamburger.png");
		hotdogIcon=new ImageIcon("../imgs/hotdog.png");

		pizzaButton=new JRadioButton("pizza");
		hamburgerButton=new JRadioButton("hamburger");
		hotdogButton=new JRadioButton("hotdog");

		ButtonGroup group=new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);

		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);

		pizzaButton.setIcon(pizzaIcon);
		hamburgerButton.setIcon(hamburgerIcon);
		hotdogButton.setIcon(hotdogIcon);

		frame.add(pizzaButton);
		frame.add(hamburgerButton);
		frame.add(hotdogButton);
		frame.pack();//Set the width and height according the size o content
		frame.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==pizzaButton){
			System.out.println("You ordered pizza!");
		}
		else if(e.getSource()==hamburgerButton){
			System.out.println("You ordered hamburger!");
		}
		else if(e.getSource()==hotdogButton){
			System.out.println("You ordered hotdog!");
		}
	}
}