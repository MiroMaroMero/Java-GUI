import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DialogInfo extends JFrame{

	public DialogInfo() {

		JFrame info = new JFrame();
		
		JDialog dialog = new JDialog(info,"Informacje o autorze",true);
		
		dialog.setLayout(new FlowLayout());
		
		dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		dialog.setSize(new Dimension(400,250));
		dialog.setLocationRelativeTo(null);
		
		dialog.add(new JLabel("Wykonane przez: Marek Śnigurowicz"));
		
		dialog.setVisible(true);
	}

}
