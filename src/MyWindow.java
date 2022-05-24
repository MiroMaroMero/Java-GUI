import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyWindow extends JFrame implements ActionListener{

	JFrame ramka;
	JMenuBar menuBar;
	JToolBar tolBar;
	
	JButton zapisz;
	JButton drukuj;
	JButton wyjscie;
	JButton zerowanie;
	JButton sumuj;
	JButton x;
	JButton Min;
	JButton Max;
	JButton pomoc;
	JButton info;
	
	JPanel pasekStatus;
	JPanel panel1, panel2;
	JPanel panel3, panel4, panel5, panel6;
	JPanel primaryConcent;
	
	JLabel informacja;
	JLabel status;
	
	JTextField infoText;
	JTextField statText;
	
	ImageIcon iz, id, iw, ize, is, ix, iM, iMa, ip, ii;
	
	public MyWindow() {
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(new Dimension(600,400));
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		pasekStatus = new JPanel();
		pasekStatus.setLayout(new BorderLayout());
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		panel1.setPreferredSize(new Dimension(250,25));
		panel2.setPreferredSize(new Dimension(250,25));
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.blue);
		
		panel1.setLayout(new BorderLayout());
		panel2.setLayout(new BorderLayout());
		
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		panel6 = new JPanel();
		
		//panel3.setPreferredSize(new Dimension(150,25));
		//panel4.setPreferredSize(new Dimension(150,25));
		//panel5.setPreferredSize(new Dimension(150,25));
		//panel6.setPreferredSize(new Dimension(150,25));
		
		panel3.setBackground(Color.lightGray);
		panel4.setBackground(Color.lightGray);
		panel5.setBackground(Color.lightGray);
		panel6.setBackground(Color.lightGray);
		
		informacja = new JLabel("Informacja: ");
		status = new JLabel("Status: ");
		infoText = new JTextField();
		statText = new JTextField();
		
		infoText.setText("Status Aplikacji");
		statText.setText("ON");
		
		infoText.setBounds(0,0,150,25);
		//infoText.setHorizontalAlignment(JTextField.LEFT);
		statText.setBounds(0,0,150,25);
		//statText.setHorizontalAlignment(JTextField.LEFT);
		
		panel3.add(informacja);
		panel4.add(infoText);
		panel5.add(status);
		panel6.add(statText);
		
		panel4.setLayout(new BorderLayout());
		panel6.setLayout(new BorderLayout());
		
		panel1.add(panel3,BorderLayout.WEST);
		panel1.add(panel4,BorderLayout.CENTER);
		panel2.add(panel5,BorderLayout.WEST);
		panel2.add(panel6,BorderLayout.CENTER);
		
		pasekStatus.setBackground(Color.lightGray);
		
		pasekStatus.add(panel1,BorderLayout.WEST);
		pasekStatus.add(panel2,BorderLayout.EAST);
		
		
		
		menuBar = new JMenuBar();
		
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu widok = new JMenu("Info");
		JMenu obliczenia = new JMenu("Info");
		JMenu help = new JMenu("Info");
		
		iz = new ImageIcon("Ikony\\Zapis.png");
		id = new ImageIcon("Ikony\\Drukarka.png");
		iw = new ImageIcon("Ikony\\Wyjscie.png");
		is = new ImageIcon("Ikony\\Suma.png");
		ize = new ImageIcon("Ikony\\Zerowanie.png");
		ix = new ImageIcon("Ikony\\x.png");
		iM = new ImageIcon("Ikony\\Max.png");
		iMa = new ImageIcon("Ikony\\Min.png");
		ip = new ImageIcon("Ikony\\Help.png");
		ii = new ImageIcon("Ikony\\Info.png");
		
		zapisz = new JButton(iz);
		drukuj = new JButton(id);
		wyjscie = new JButton(iw);
		zerowanie = new JButton(ize);
		sumuj = new JButton(is);
		x = new JButton(ix);
		Min = new JButton(iMa);
		Max = new JButton(iM);
		pomoc = new JButton(ip);
		info = new JButton(ii);
		
		tolBar = new JToolBar("Pasek narzedziowy");
		
		tolBar.add(zapisz);
		tolBar.add(drukuj);
		tolBar.add(wyjscie);
		tolBar.add(zerowanie);
		tolBar.add(sumuj);
		tolBar.add(x);
		tolBar.add(Min);
		tolBar.add(Max);
		tolBar.add(pomoc);
		tolBar.add(info);
		
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(widok);
		menuBar.add(obliczenia);
		menuBar.add(help);
		
		primaryConcent = new JPanel();
		
		primaryConcent.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		
		p1.setPreferredSize(new Dimension(100,100));
		p2.setPreferredSize(new Dimension(100,100));
		p3.setPreferredSize(new Dimension(100,100));
		p4.setPreferredSize(new Dimension(100,100));
		p5.setPreferredSize(new Dimension(100,100));
		
		p1.setBackground(Color.red);
		p2.setBackground(Color.black);
		p3.setBackground(Color.blue);
		p4.setBackground(Color.orange);
		p5.setBackground(Color.yellow);
		
		primaryConcent.add(p1,BorderLayout.NORTH);
		primaryConcent.add(p2,BorderLayout.SOUTH);
		primaryConcent.add(p3,BorderLayout.WEST);
		primaryConcent.add(p4,BorderLayout.EAST);
		primaryConcent.add(p5,BorderLayout.CENTER);
		
		this.setJMenuBar(menuBar);
		this.add(tolBar, BorderLayout.NORTH);
		this.add(pasekStatus, BorderLayout.SOUTH);
		this.add(primaryConcent,BorderLayout.CENTER);
		//this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
