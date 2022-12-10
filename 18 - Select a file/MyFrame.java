import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class MyFrame implements ActionListener{
	JFrame frame=new JFrame("Menu Bar");
	JButton button;
	public MyFrame(){
		button=new JButton("Select File");
		button.addActionListener(this);
		button.setBounds(200,100,200,70);//(x,y,Width,Height)

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.add(button);
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==button){
			JFileChooser fileChooser=new JFileChooser();
			fileChooser.setCurrentDirectory(new File("C:\\Users"));// It opens in the selected directory
			//int response=fileChooser.showOpenDialog(null);//Select file to open
			int response=fileChooser.showSaveDialog(null);// "Save" a file
			if(response==JFileChooser.APPROVE_OPTION){
				File file=new File(fileChooser.getSelectedFile().getAbsolutePath());//Get the directoryor file selected
				System.out.println(file);
			}
		}
	}
}