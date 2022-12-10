import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame implements ActionListener{
	JFrame frame=new JFrame();
	JComboBox comboBox;

	public MyFrame(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		String[] animals={"dog","cat","bird"};
		// okay, if you need to store a primitive data types ie. int, you need to use the wrapper class Integer with uppercase
        // like this: Integer[] numbers = {5,1,23,89}; OR Double[] numbers = {2.3,4.8,7.4};
        // String is a wrapper class! String is list of char's

		comboBox=new JComboBox(animals);
		comboBox.addActionListener(this);
		comboBox.setEditable(true);//Set if the combobox is editable or not
		System.out.println(comboBox.getItemCount());//Return the number of items in comboBox
		comboBox.addItem("horse");//add "horse" in the end of the comboBox
		comboBox.insertItemAt("pig",0);//Add the "pig" content in the zero index
		System.out.println(comboBox.getItemCount());//Return the number of items in comboBox
		comboBox.removeItem("cat");//Remove the item whith the "cat" contant
		comboBox.removeItemAt(0);//Remove the item with the index zero
		// comboBox.removeAllItems();//Remove All items

		frame.add(comboBox);
		frame.pack();//Set the width and height according the size o content
		frame.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==comboBox){
			System.out.println(comboBox.getSelectedItem());//Print the selected item in the terminal
		}
	}
}