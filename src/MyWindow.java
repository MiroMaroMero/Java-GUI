import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.*;
import javax.swing.table.TableModel;

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
	
	JSpinner wprowadz;
	JSpinner wprowadz1;
	JTextField wprowadz2;
	
	JButton dodaj;
	JButton wyzeruj;
	JButton wypelnij;
	JButton zapiszz;
	
	String data[][]={{"0","0","0","0","0"},    
			{"0","0","0","0","0"},  
			{"0","0","0","0","0"},
			{"0","0","0","0","0"},
			{"0","0","0","0","0"}}; 

	String column[]={"1","2","3","4","5"};
	
	static JTable jt;      //-----------------------------------------TABELA        
	JScrollPane sp;
	
	JTextArea textSpace;
	
	JLabel obl;
	JComboBox operacje1;
	JButton Oblicz;
	
	public MyWindow() {
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(new Dimension(800,600));
		this.setTitle("MarkoSoft Aplikacja v0.1.0");
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
		
		zapisz.addActionListener(this);
		drukuj.addActionListener(this);
		wyjscie.addActionListener(this);
		zerowanie.addActionListener(this);
		sumuj.addActionListener(this);
		x.addActionListener(this);
		Min.addActionListener(this);
		Max.addActionListener(this);
		pomoc.addActionListener(this);
		info.addActionListener(this);
		
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
		JPanel przerwa = new JPanel();
		
		p1.setPreferredSize(new Dimension(100,75));
		p2.setPreferredSize(new Dimension(100,225));
		p3.setPreferredSize(new Dimension(20,100));
		p4.setPreferredSize(new Dimension(150,100));
		//p5.setPreferredSize(new Dimension(100,100));
		przerwa.setPreferredSize(new Dimension(100,50));
		
		//p1.setBackground(Color.red);
		//p2.setBackground(Color.black);
		//p3.setBackground(Color.blue);
		//p4.setBackground(Color.orange);
		//p5.setBackground(Color.yellow);
		
		p5.setLayout(new BorderLayout());

		jt=new JTable(data,column);      //-----------------------------------------TABELA        
		sp=new JScrollPane(jt);  
		
		p5.add(sp,BorderLayout.EAST);
		p5.add(przerwa,BorderLayout.NORTH);
		
		
		JPanel operacje = new JPanel();
		
		operacje.setLayout(new GridLayout(4,1,0,10));
		
		dodaj = new JButton("Dodaj");
		wyzeruj = new JButton("Wyzeruj");
		wypelnij = new JButton("Wypelnij");
		zapiszz = new JButton("Zapisz");
		
		dodaj.addActionListener(this);
		wyzeruj.addActionListener(this);
		wypelnij.addActionListener(this);
		zapiszz.addActionListener(this);
		
		operacje.add(dodaj);
		operacje.add(wypelnij);
		operacje.add(wyzeruj);
		operacje.add(zapiszz);
		
		p4.add(operacje);
		
		primaryConcent.add(p1,BorderLayout.NORTH);
		primaryConcent.add(p2,BorderLayout.SOUTH);
		primaryConcent.add(p3,BorderLayout.WEST);
		primaryConcent.add(p4,BorderLayout.EAST);
		primaryConcent.add(p5,BorderLayout.CENTER);
		
		p1.setLayout(new BorderLayout());
		p2.setLayout(new BorderLayout());
		
		JPanel p6 = new JPanel();
		JPanel p7 = new JPanel();
		JPanel p8 = new JPanel();
		JPanel p9 = new JPanel();
		JPanel p10 = new JPanel();
		
		JPanel p11 = new JPanel();
		JPanel p12 = new JPanel();
		JPanel p13 = new JPanel();
		
		//p6.setPreferredSize(new Dimension(10,60));
		p7.setPreferredSize(new Dimension(10,10));
		p8.setPreferredSize(new Dimension(10,10));
		p9.setPreferredSize(new Dimension(10,10));
		p10.setPreferredSize(new Dimension(10,10));
		
		//p11.setPreferredSize(new Dimension(800,20));
		//p12.setPreferredSize(new Dimension(30,30));
		//p13.setPreferredSize(new Dimension(200,30));
		
		//JPanel panelTest = new JPanel();
		JLabel wprowadzLiczbe = new JLabel("Wprowadz liczbe"); //-------------------------------WPROWADZANIE GURNE
		JLabel numerWiersza = new JLabel("Numer Wiersza"); //--------------------------------Z WYBOREM KOMURKI
		JLabel numerKolumny = new JLabel("Numer Kolumny");
		
		SpinnerModel wartosc1 = new SpinnerNumberModel(1,1,5,1);
		SpinnerModel wartosc2 = new SpinnerNumberModel(1,1,5,1);
		
		//String[] wpr1 = {"1", "2", "3", "4", "5"};
		//String[] wpr2 = {"1", "2", "3", "4", "5"};
		
		wprowadz = new JSpinner(wartosc1);
		wprowadz1 = new JSpinner(wartosc2);
		wprowadz2 = new JTextField();
				
		//wprowadzLiczbe.setPreferredSize(new Dimension(100,25));
		wprowadz.setPreferredSize(new Dimension(120,25));
		wprowadz1.setPreferredSize(new Dimension(120,25));
		wprowadz2.setPreferredSize(new Dimension(120,25));
		
		//p6.setBackground(Color.pink);
		//p7.setBackground(Color.yellow);
		//p8.setBackground(Color.gray);
		//p9.setBackground(Color.lightGray);
		//p10.setBackground(Color.cyan);
		
		String[] operacje2 = {"Suma elementów", "Średnia elementów", "Wartość Max i Min"}; //-------------OPCJE KLAWISZA OBLICZ
		
		obl = new JLabel("Obliczenia");
		operacje1 = new JComboBox(operacje2);
		Oblicz = new JButton("Oblicz");
		
		Oblicz.addActionListener(this);
		
		p6.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		
		p6.add(obl);
		p6.add(operacje1);
		p6.add(Oblicz);
		
		textSpace = new JTextArea("Wyniki");
		JLabel ptext = new JLabel("Wyniki obliczeń");
		
		textSpace.setPreferredSize(new Dimension(750,120));
		
		//ptext.add(textSpace);
		//p10.add(ptext);
		
		p10.add(ptext,BorderLayout.NORTH);
		p10.add(textSpace);
		
		//p11.setBackground(Color.whit);
		//p12.setBackground(Color.white);
		//p13.setBackground(Color.LIGHT_GRAY);
		
		p12.setLayout(new FlowLayout(FlowLayout.CENTER,20,15));
		
		p12.add(numerKolumny,FlowLayout.LEFT);
		p12.add(wprowadz,FlowLayout.CENTER);
		p12.add(numerWiersza,FlowLayout.LEFT);
		p12.add(wprowadz1,FlowLayout.CENTER);
		p12.add(wprowadzLiczbe,FlowLayout.LEFT);
		p12.add(wprowadz2,FlowLayout.CENTER);
		
		
		p1.add(p11,BorderLayout.NORTH);
		p1.add(p12,BorderLayout.CENTER);
		//p1.add(p13,BorderLayout.EAST);
		
		p2.add(p6,BorderLayout.NORTH);
		p2.add(p7,BorderLayout.SOUTH);
		p2.add(p8,BorderLayout.WEST);
		p2.add(p9,BorderLayout.EAST);
		p2.add(p10,BorderLayout.CENTER);
		
		this.setJMenuBar(menuBar);
		this.add(tolBar, BorderLayout.NORTH);
		this.add(pasekStatus, BorderLayout.SOUTH);
		this.add(primaryConcent,BorderLayout.CENTER);
		//this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==pomoc)
		{
			new DialogPomoc();
		}
		else if(e.getSource()==info)
		{
			new DialogInfo();
		}
		else if(e.getSource()==dodaj)
		{
			System.out.println("Dziala dodawanie");

			int x = ((Integer) wprowadz1.getValue())-1;
			int y = ((Integer) wprowadz.getValue())-1;
			int zaw2;
			String zaw = wprowadz2.getText();
			
			if(zaw == null || zaw.equals(""))
			{
				System.out.println("Nic nie wpisano");
			}
			else
			{
				try
				{
					
					zaw2 = Integer.parseInt(zaw);
					jt.setValueAt(zaw,x,y);
					
				}
				catch (NumberFormatException epp)
				{
					System.out.print("To nie liczba!");
					JOptionPane.showMessageDialog(this, "Podana wartość nie jest liczb!");
				}
			}
			
			
			
			//jt.setValueAt(zaw,x,y);
			
			//int zaw = Integer.parseInt(wprowadz2.getText()); // ----------------------- Z String na Int
		}
		else if(e.getSource()==wyzeruj  || e.getSource()==zerowanie)
		{
			for(int i=0;i<5;i++)
			{
				for(int f=0;f<5;f++)
				{
					jt.setValueAt("0", i, f);
				}
			}
		}
		else if(e.getSource()==wypelnij)
		{
			
			//int x = ((Integer) wprowadz1.getValue())-1;
			//int y = ((Integer) wprowadz.getValue())-1;
			int zaw2;
			String zaw = wprowadz2.getText();
			
			if(zaw == null || zaw.equals(""))
			{
				System.out.println("Nic nie wpisano");
			}
			else
			{
				try
				{
					
					zaw2 = Integer.parseInt(zaw);
					
					for(int i=0;i<5;i++)
					{
						for(int f=0;f<5;f++)
						{
							jt.setValueAt(zaw, i, f);
						}
					}
					
				}
				catch (NumberFormatException epp)
				{
					System.out.print("To nie liczba!");
					JOptionPane.showMessageDialog(this, "Podana wartość nie jest liczb!");
				}
			}
			
			
		}
		else if(e.getSource()==zapiszz)
		{
			
		}
		else if(e.getSource()==sumuj || (e.getSource()==x || e.getSource()==Oblicz) && operacje1.getSelectedItem()=="Suma elementów")
		{
			String test;
			int suma=0;
			
			for(int i=0;i<5;i++)
			{
				for(int f=0;f<5;f++)
				{
					test = String.valueOf(jt.getValueAt(i, f));
					
					suma += Integer.parseInt(test);
				}
			}
			
			textSpace.setText("Suma komurek w tabeli wynosi: " + Integer.toString(suma));
		}
		else if(e.getSource()==Min)
		{
			
			String test;
			int suma=0;
			
			test = String.valueOf(jt.getValueAt(0, 0));
			suma = Integer.parseInt(test);
			
			for(int i=0;i<5;i++)
			{
				for(int f=0;f<5;f++)
				{
					test = String.valueOf(jt.getValueAt(i, f));
					
					if(Integer.parseInt(test)<suma)
					{
						suma = Integer.parseInt(test);
					}
				}
			}
			
			textSpace.setText("Wartość minimalna wynosi: " + Integer.toString(suma));
		}
		else if(e.getSource()==Max)
		{
			String test;
			int suma=0;
			
			test = String.valueOf(jt.getValueAt(0, 0));
			suma = Integer.parseInt(test);
			
			for(int i=0;i<5;i++)
			{
				for(int f=0;f<5;f++)
				{
					test = String.valueOf(jt.getValueAt(i, f));
					
					if(Integer.parseInt(test)>suma)
					{
						suma = Integer.parseInt(test);
					}
				}
			}
			
			textSpace.setText("Wartość maksymalna wynosi: " + Integer.toString(suma));
		}
		else if((e.getSource()==x || e.getSource()==Oblicz) && operacje1.getSelectedItem()=="Wartość Max i Min")
		{
			String test,Maxx,Minn;
			int suma=0;
			
			test = String.valueOf(jt.getValueAt(0, 0));
			suma = Integer.parseInt(test);
			
			for(int i=0;i<5;i++)
			{
				for(int f=0;f<5;f++)
				{
					test = String.valueOf(jt.getValueAt(i, f));
					
					if(Integer.parseInt(test)>suma)
					{
						suma = Integer.parseInt(test);
					}
				}
			}
			
			//textSpace.setText("Wartość maksymalna wynosi: " + Integer.toString(suma));
			
			Maxx = Integer.toString(suma);
			
			test = String.valueOf(jt.getValueAt(0, 0));
			suma = Integer.parseInt(test);
			
			for(int i=0;i<5;i++)
			{
				for(int f=0;f<5;f++)
				{
					test = String.valueOf(jt.getValueAt(i, f));
					
					if(Integer.parseInt(test)<suma)
					{
						suma = Integer.parseInt(test);
					}
				}
			}
			
			Minn = Integer.toString(suma);
			
			textSpace.setText("Wartość minimalna wynosi: " + Minn + "\nWartość maksymalna wynosi: " + Maxx);
		}
		else if((e.getSource()==x || e.getSource()==Oblicz) && operacje1.getSelectedItem()=="Średnia elementów")
		{
			String test,Maxx,Minn;
			int suma=0;
			
			test = String.valueOf(jt.getValueAt(0, 0));
			suma = Integer.parseInt(test);
			int liczba=0;
			
			for(int i=0;i<5;i++)
			{
				for(int f=0;f<5;f++)
				{
					test = String.valueOf(jt.getValueAt(i, f));
					
					if(Integer.parseInt(test)==0)
					{
						
					}
					else
					{
						liczba++;
						suma += Integer.parseInt(test);
					}
				}
			}
			
			if(liczba!=0)
			{
				suma = suma/liczba;
				textSpace.setText("Średnia wartośc wynosi: " + Integer.toString(suma));
			}
			else
			{
				textSpace.setText("Nie dziele przez zero!");
			}
			
			
			
		}
		else if(e.getSource()==wyjscie)
		{
			System.exit(getDefaultCloseOperation());
		}
		
	}

}
