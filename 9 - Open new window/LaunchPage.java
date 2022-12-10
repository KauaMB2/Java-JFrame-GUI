import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class LaunchPage implements ActionListener{
	JFrame frame=new JFrame();
	JLabel label=new JLabel("Hello World in the First Window");
	JButton myButton=new JButton("Go to Second Window");
	public LaunchPage(){
		frame.add(label);
		label.setBounds(0,0,420,50);
		label.setFont(new Font("MV Boli",Font.PLAIN,25));
		myButton.setBounds(100,160,200,40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);

		frame.add(myButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==myButton){
			frame.dispose();//Close the frame window
			NewWindow secondWindow=new NewWindow();//Call the method to open the new window
		}
	}
}