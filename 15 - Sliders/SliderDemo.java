import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;


public class SliderDemo implements ChangeListener{
	JFrame frame=new JFrame("Slider Demo");
	JPanel panel;
	JLabel label;
	JSlider slider;

	public SliderDemo(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		panel=new JPanel();
		label=new JLabel();
		slider=new JSlider(10,100,25);//(Max,Min.initialValue)

		slider.setPreferredSize(new Dimension(400,200));//That is the size of slider
		slider.setPaintTicks(false);//Enable the indication lines
		slider.setMinorTickSpacing(10);//Set the space between the indication lines
		slider.setPaintTrack(true);//Enable the indication lines
		slider.setMajorTickSpacing(30);//Set the space between the indication numbers
		slider.setPaintLabels(true);//Enabling the indication numbers
		slider.setFont(new Font("MV Boli",Font.PLAIN,15));
		slider.setOrientation(SwingConstants.HORIZONTAL);//Set if the Orientation is in the X or Y axes[SwingConstants.VERTICAL,SwingConstants.HORIZONTAL]
		slider.addChangeListener(this);

		label.setText("ºC = "+slider.getValue());

		frame.add(slider);
		frame.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
	}
	@Override//Polimorfism
    public void stateChanged(ChangeEvent e) {

        label.setText("°C = " + slider.getValue());
    }
}