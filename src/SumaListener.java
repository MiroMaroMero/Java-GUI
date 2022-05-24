import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.TableModel;

public class SumaListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		int suma = 0;
		TableModel model = MyWindow.jt.getModel();
		for(int i=0; i<5; i++) {
			for(int j=0; j<5;j++) {
				suma = suma + (int)model.getValueAt(i, j);
			}
		}
		//MyWindow.tex.setText("Suma element�w w tablicy wynosi: " + suma);
	}

}