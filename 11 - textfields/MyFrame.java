import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class MyFrame implements ActionListener{
	JFrame frame=new JFrame();
	JTextField textField;
	JButton button;
	JLabel label;
	String textLabel="<html><br><br><br>You Wrote: </html>";// ATENTION: THE TEXT BOX ACCEPT HTML TAGS
	public MyFrame(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		label=new JLabel();
		label.setText(textLabel);
		label.setHorizontalAlignment(JLabel.CENTER);//Set label horizontal position (LEFT,CENTER,RIGHT)
		label.setVerticalAlignment(JLabel.CENTER);//Set label vertical position (TOP,CENTER,BOTTOM)
		label.setForeground(new Color(0x00FF00));//set text-color
		label.setFont(new Font(null,Font.PLAIN,20));//Set the font


		button=new JButton("Submit");
		button.addActionListener(this);

		textField=new JTextField();//Text Box
		textField.setPreferredSize(new Dimension(250,40));//textbox size(X,Y)
		textField.setFont(new Font("Consolas",Font.PLAIN,35));//Font
		textField.setForeground(new Color(0x00FF00));//Color of lyrics
		textField.setBackground(Color.black);//Backgound color
		textField.setCaretColor(Color.red);// Cor do cursor
		textField.setText("Write here");//Set a initial text
		textField.setEditable(true);//Set if the Textbox is editable or not

		frame.add(button);
		frame.add(textField);
		frame.add(label);
		frame.pack();//Set the width and height according the size o content
		frame.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==button){
			System.out.println(textField.getText());
			label.setText(textLabel+textField.getText());
		}
	}
}