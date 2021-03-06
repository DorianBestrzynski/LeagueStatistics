 package obserwatorzy;

import java.util.ArrayList;



import gui.Widok_GUI;
import java.util.Collections;
import java.util.Comparator;

import packageMain.Wyświetl;
import inneStatystyki.Punkty;
import obserwowane.ObiektObserwowany;
import symulacja.Drużyna;

public class ProsteStatystyki implements Obserwator, Punkty {
	
	ArrayList<Drużyna> tabela = new ArrayList <Drużyna>() ; 
	
	
	
	private String nazwaDrużyny;
	private int miejsceWTabeli;
	private int zwycięstwaUSiebie;
	private int zwycięstwaNaWyjezdzie;
	private int remisyUSiebie;
	private int remisyNaWyjezdzie;

	    
//własny obiekt obserwowany 
private ObiektObserwowany statystyki;
	
	public ProsteStatystyki(ObiektObserwowany statystyki) {
		
		this.statystyki = statystyki;
		
		this.statystyki.dodajObserwatora(this);
	}
	
	
	
	public int liczPunkty ()
	{
		return ((zwycięstwaNaWyjezdzie+zwycięstwaUSiebie)*3+(remisyNaWyjezdzie+remisyUSiebie));
	}
	
	// Przechwytujemy przekzany stan obiektu obserwowanego i reagujemy wyświetlając proste statystyki
	
	@Override
	public void aktualizujDane(ArrayList<Drużyna> arr)
 {
	tabela.addAll(arr); 
 }	
	
	public void wyswietlTabele()
	{
     for (int i = 0 ; i<tabela.size();i++) {
		 nazwaDrużyny = tabela.get(i).getNazwaDrużyny() ;
		 zwycięstwaUSiebie = tabela.get(i).getZwycięstwaUSiebie() ; 
		 zwycięstwaNaWyjezdzie = tabela.get(i).getZwycięstwaNaWyjezdzie() ; 
		 remisyUSiebie = tabela.get(i).getRemisyUSiebie() ; 
		 remisyNaWyjezdzie = tabela.get(i).getRemisyNaWyjezdzie() ; 
		 miejsceWTabeli=i+1;
		 Wyświetl.wyswietl(nazwaDrużyny + "| Miejsce w tabeli: "+ Integer.toString(miejsceWTabeli) + "| Punkty: " + Integer.toString(liczPunkty()) + "\n");
	}
		
 }
	
	
	


	


}
