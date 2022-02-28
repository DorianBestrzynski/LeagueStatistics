package gui;

import javax.swing.JFrame;




import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;

import packageMain.Wyœwietl;
import obserwatorzy.ProsteStatystyki;
import obserwatorzy.Z³o¿oneStatystyki;
import obserwowane.Liga;

import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import obserwatorzy.*;
public class Widok_GUI 
{
	private JFrame ramka;
	private JPanel panel;
	private static JTextArea wyswietlanie;
	private JButton btnPokazTabele;
	private JLabel naglowek;
	private JLabel naglowek2;
	private JButton btnZlozoneStatystki;
	private JButton btnMeczeUSiebie;
	private JButton btnMeczeNaWyjezdzie;
	private JPanel panel_1;
	private JMenuBar menuBar;
	private JMenu menuZespolow;
	private JList listaZespolow;
	private Liga liga;
	
	
	public Widok_GUI()
	{
		//Tworzymy obiekt obserwowany
		this.liga = new Liga();
		
		liga.symulujPierwszaRunda();
		liga.symulujDrugaRunda();
		
		ramka = new JFrame("Statystyki ligi");
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.setResizable(false);
		ramka.setSize(594, 622);
		ramka.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(169, 64, 409, 506);
		ramka.getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		wyswietlanie = new JTextArea();
		wyswietlanie.setWrapStyleWord(true);
		wyswietlanie.setEditable(false);
		wyswietlanie.setFont(new Font("Calibri", Font.PLAIN, 16));
		wyswietlanie.setLineWrap(true);
				
		JScrollPane scrollPane = new JScrollPane(wyswietlanie);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scrollPane);
		
		btnPokazTabele = new JButton("Poka\u017C tabel\u0119");
		btnPokazTabele.addActionListener(new Action1());
		
		btnPokazTabele.setBounds(10, 179, 149, 23);
		ramka.getContentPane().add(btnPokazTabele);
		
		naglowek = new JLabel("Wybierz opcj\u0119, kt\u00F3r\u0105 chcesz zobaczy\u0107.");
		naglowek.setFont(new Font("Dialog", Font.PLAIN, 20));
		naglowek.setBounds(123, 11, 350, 42);
		ramka.getContentPane().add(naglowek);
		
		naglowek2 = new JLabel("<html>Statystyki wybranej<br>dru¿yny:" );
		naglowek2.setHorizontalAlignment(SwingConstants.LEFT);
		naglowek2.setFont(new Font("Dialog", Font.PLAIN, 15));
		naglowek2.setBounds(10, 213, 149, 55);
		ramka.getContentPane().add(naglowek2);
		
		
		btnZlozoneStatystki = new JButton("Z\u0142o\u017Cone");
		btnZlozoneStatystki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (listaZespolow.getSelectedIndex() == -1)
				{
					menuBar.setBackground(Color.RED);
				}
				else 
				{
					menuBar.setBackground(Color.white);
				Z³o¿oneStatystyki s = new Z³o¿oneStatystyki(liga);
				liga.powiadomObserwatora();
				s.WybierzDru¿ynê((String) listaZespolow.getSelectedValue());
				}
			}
		});
		btnZlozoneStatystki.setBounds(10, 303, 149, 23);
		ramka.getContentPane().add(btnZlozoneStatystki);
		
		btnMeczeUSiebie = new JButton("Mecze u siebie");
		btnMeczeUSiebie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (listaZespolow.getSelectedIndex() == -1)
				{
					menuBar.setBackground(Color.RED);
				}
				else 
				{
					//Tworzymy pierwszego obserwatora i wi¹¿emy go z obiektem obserwowanym
				Statystyki_U_Siebie s = new Statystyki_U_Siebie(liga);
				liga.powiadomObserwatora();
				s.WybierzDru¿ynê((String) listaZespolow.getSelectedValue());
				}
			}
		});
		btnMeczeUSiebie.setBounds(10, 337, 149, 23);
		ramka.getContentPane().add(btnMeczeUSiebie);
		
		btnMeczeNaWyjezdzie = new JButton("Mecze na wyjezdzie");
		btnMeczeNaWyjezdzie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (listaZespolow.getSelectedIndex() == -1)
				{
					menuBar.setBackground(Color.RED);
				}
				else 
				{
					StatystykiNaWyjeŸdzie s = new StatystykiNaWyjeŸdzie(liga);
					liga.powiadomObserwatora();
					s.WybierzDru¿ynê((String) listaZespolow.getSelectedValue());
				}
			}
		});
		btnMeczeNaWyjezdzie.setBounds(10, 371, 149, 23);
		ramka.getContentPane().add(btnMeczeNaWyjezdzie);
		
		panel_1 = new JPanel();
		panel_1.setBounds(10, 263, 149, 29);
		ramka.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		panel_1.add(menuBar);
		
		
		
		menuZespolow = new JMenu("Wybierz zespó³");
		menuBar.add(menuZespolow);
		
		String [] s = new String[16];
		for (int i = 0; i < liga.getZespo³y().size(); i++)
		{
			s[i] = liga.getZespo³y().get(i).getNazwaDru¿yny();
		}
		listaZespolow = new JList(s);
		listaZespolow.setBackground(Color.WHITE);
		listaZespolow.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) 
			{
				menuZespolow.setText((String) (listaZespolow.getSelectedValue()));
			}
		});
		
		
		
		listaZespolow.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		menuZespolow.add(listaZespolow);
		
		JButton btnWyczy = new JButton("Wyczy\u015B\u0107");
		btnWyczy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				wyczysc();
			}
		});
		btnWyczy.setBounds(10, 404, 149, 21);
		ramka.getContentPane().add(btnWyczy);
		
		ramka.setVisible(true);
	
		
		
	}
	public static void wyswietlDane(String s)
	{
		wyswietlanie.append(s);
	}
	
	public void wyczysc()
	{
		wyswietlanie.setText(" ");
	}
	
	class Action1 implements ActionListener{
	
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			wyczysc();
			ProsteStatystyki p = new ProsteStatystyki(liga);
			liga.powiadomObserwatora();
			p.wyswietlTabele();
			
		}
	
	
}	
}

