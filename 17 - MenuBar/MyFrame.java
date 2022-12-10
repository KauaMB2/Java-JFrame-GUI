import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class MyFrame implements ActionListener{
	JFrame frame=new JFrame("Menu Bar");
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;

	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;

	public MyFrame(){
		menuBar=new JMenuBar();
		fileMenu=new JMenu("File");
		editMenu=new JMenu("Edit");
		helpMenu=new JMenu("Help");

		loadItem=new JMenuItem("Load");
		saveItem=new JMenuItem("Save");
		exitItem=new JMenuItem("Exit");
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		fileMenu.setMnemonic(KeyEvent.VK_F);//Alt+f for file
		editMenu.setMnemonic(KeyEvent.VK_E);//Alt+e for edit
		helpMenu.setMnemonic(KeyEvent.VK_H);//Alt+h for help
		loadItem.setMnemonic(KeyEvent.VK_L);//l for load
		saveItem.setMnemonic(KeyEvent.VK_S);//s for save
		exitItem.setMnemonic(KeyEvent.VK_E);//e for exit
		loadIcon=new ImageIcon("../imgs/pink_folder.png");
		saveIcon=new ImageIcon("../imgs/pink_floppy.png");
		exitIcon=new ImageIcon("../imgs/pink_door.png");
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);

		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);



		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setJMenuBar(menuBar);
		frame.setSize(420,420);
		frame.setResizable(true);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==loadItem){
			System.out.println("You loaded a file");
		}
		if(e.getSource()==saveItem){
			System.out.println("You saved a file");
		}
		if(e.getSource()==exitItem){
			System.exit(0);
		}
	}
}