package obserwatorzy;

import java.util.ArrayList;




import packageMain.Wy�wietl;
import inneStatystyki.Punkty;

import obserwowane.ObiektObserwowany;
import symulacja.Dru�yna;
//Trzeci obserwator 
public class StatystykiNaWyje�dzie implements Obserwator, Punkty {
	ArrayList<Dru�yna> tabela = new ArrayList <Dru�yna>() ; 
	private String nazwaDru�yny;
	private int miejsceWTabeli;
	private int zwyci�stwaNaWyjezdzie;
	private int remisyNaWyjezdzie;
	private int pora�kiNaWyjezdzie;
	private int bramkiStrzeloneNaWyje�dzie;
	private int bramkiStraconeNaWyje�dzie;
	
	
	private ObiektObserwowany statystyki;
	
	public StatystykiNaWyje�dzie(ObiektObserwowany statystyki) {
		
		this.statystyki = statystyki;
		
		this.statystyki.dodajObserwatora(this);
	}
	
	
	public int obliczMeczeNaWyjezdzie ()
	{
		return (zwyci�stwaNaWyjezdzie+pora�kiNaWyjezdzie+remisyNaWyjezdzie);
		
	}
	
	public int liczPunkty()
	{
		return (zwyci�stwaNaWyjezdzie*3+remisyNaWyjezdzie);
	}
	public void aktualizujDane(ArrayList<Dru�yna> arr)
	 {
		tabela.addAll(arr); 
	 }
	
	public void WybierzDru�yn�(String dru�yna) {
		for(int i = 0 ; i<tabela.size();i++) {
			if(tabela.get(i).getNazwaDru�yny().equals(dru�yna)) {
				nazwaDru�yny = tabela.get(i).getNazwaDru�yny() ;
				
				 zwyci�stwaNaWyjezdzie = tabela.get(i).getZwyci�stwaNaWyjezdzie() ; 
				 
				 remisyNaWyjezdzie = tabela.get(i).getRemisyNaWyjezdzie() ; 
				 miejsceWTabeli=i+1;
				 pora�kiNaWyjezdzie = tabela.get(i).getPora�kiNaWyjezdzie();
				
				 bramkiStraconeNaWyje�dzie = tabela.get(i).getBramkiStraconeNaWyje�dzie();
				
				 bramkiStrzeloneNaWyje�dzie = tabela.get(i).getBramkiStrzeloneNaWyje�dzie();
				
				
			}
				
	}
	Wy�wietl.wyswietl("\n" + nazwaDru�yny + "| Miejsce w tabeli: "+ miejsceWTabeli + "| Rozegrane mecze na wyjezdzie: " + obliczMeczeNaWyjezdzie() + "| Punkty na wyjezdzie: " + liczPunkty() +
				"| Bramki strzelone na wyjezdzie: "+ bramkiStrzeloneNaWyje�dzie + "| Bramki stracone na wyjezdzie: " + bramkiStraconeNaWyje�dzie + "\n");
	}

	
	
	
	
	

	

	
}
