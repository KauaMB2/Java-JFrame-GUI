import java.awt.Font;
import java.awt.Color;
import javax.swing.BorderFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	boolean isFaceVisible=false;
	public MyFrame(){
		ImageIcon icon1=new ImageIcon("../imgs/point.png");
		ImageIcon icon2=new ImageIcon("../imgs/face.png");

		label=new JLabel();
		label.setIcon(icon2);
		label.setBounds(200,160,150,150);
		label.setVisible(false);

		button=new JButton();
		button.setBounds(200,100,200,70);//(x,y,Width,Height)
		button.addActionListener(this);//Add Action Listener in the botton
		button.setText("I'm a button!");//Set the button text
		button.setFocusable(false);//Focus on the botton after clock it
		button.setIcon(icon1);//Set a icon in the botton
		button.setHorizontalTextPosition(JButton.CENTER);//Set label horizontal position (LEFT,CENTER,RIGHT)
		button.setVerticalTextPosition(JButton.CENTER);//Set label vertical position (LEFT,CENTER,RIGHT)
		button.setFont(new Font("Comic Sans",Font.BOLD,25));//Set font
		button.setIconTextGap(-15);//Set the gap
		button.setForeground(Color.cyan);//Set the color of the lyrics
		button.setBackground(Color.lightGray);//Set the background color
		button.setBorder(BorderFactory.createEtchedBorder());//Set a border
		button.setEnabled(true);//Set if the button is or not enable to click

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setResizable(false);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}
	@Override// Override a function inside JFrame
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==button){
			System.out.println("POO");
			isFaceVisible=!isFaceVisible;
			label.setVisible(isFaceVisible);
		}
	}
}