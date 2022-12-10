import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class gui{
	public static void main(String[] args){
		//JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.INFORMATION_MESSAGE);
	    // JOptionPane.showMessageDialog(
	    // null,
	    // "This is some useless info",
	    // "title",
	    // JOptionPane.INFORMATION_MESSAGE);
	    // JOptionPane.showMessageDialog(
	    // null,
	    // "This is some useless info",
	    // "title",
	    // JOptionPane.QUESTION_MESSAGE);
	    // JOptionPane.showMessageDialog(
	    // null,
	    // "This is some useless info",
	    // "title",
	    // JOptionPane.WARNING_MESSAGE);
	    // JOptionPane.showMessageDialog(
	    // null,
	    // "This is some useless info",
	    // "title",
	    // JOptionPane.ERROR_MESSAGE);

	    // int answer = JOptionPane.showConfirmDialog(
	    // null,
	    // "bro, do you even code?",
	    // "title",
	    // JOptionPane.YES_NO_CANCEL_OPTION);

	    // String name = JOptionPane.showInputDialog("What is your name?");
	    // System.out.println("Hello " + name);

	    String[] responses = {
        "No, you're awesome!",
        "thank you!",
        "*blush*"
    };

    ImageIcon icon = new ImageIcon("../imgs/smile.png");

    JOptionPane.showOptionDialog(
        null, // parentComponent
        "You are awesome!", // message
        "secret message", // title
        JOptionPane.YES_NO_CANCEL_OPTION, // optionType
        JOptionPane.INFORMATION_MESSAGE, // messageType
        icon, // icon
        responses, // options
        0 // initialValue
    );
	}
}