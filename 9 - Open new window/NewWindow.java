import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class NewWindow implements ActionListener{
	JFrame frame=new JFrame();
	JLabel label=new JLabel("Hello World in the Second Window");
	JButton myOtherButton=new JButton("Go to First Window");
	public NewWindow(){
		myOtherButton.setBounds(100,160,200,40);
		myOtherButton.setFocusable(false);
		myOtherButton.addActionListener(this);

		frame.add(label);
		frame.add(myOtherButton);
		label.setBounds(0,0,420,50);
		label.setFont(new Font("MV Boli",Font.PLAIN,25));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);

		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==myOtherButton){
			frame.dispose();//Close the frame window
			LaunchPage firstWindow=new LaunchPage();//Call the method to open the new window
		}
	}
}