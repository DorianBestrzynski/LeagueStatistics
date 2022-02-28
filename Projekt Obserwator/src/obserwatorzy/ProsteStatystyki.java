 package obserwatorzy;

import java.util.ArrayList;



import gui.Widok_GUI;
import java.util.Collections;
import java.util.Comparator;

import packageMain.Wyœwietl;
import inneStatystyki.Punkty;
import obserwowane.ObiektObserwowany;
import symulacja.Dru¿yna;

public class ProsteStatystyki implements Obserwator, Punkty {
	
	ArrayList<Dru¿yna> tabela = new ArrayList <Dru¿yna>() ; 
	
	
	
	private String nazwaDru¿yny;
	private int miejsceWTabeli;
	private int zwyciêstwaUSiebie;
	private int zwyciêstwaNaWyjezdzie;
	private int remisyUSiebie;
	private int remisyNaWyjezdzie;

	    
//w³asny obiekt obserwowany 
private ObiektObserwowany statystyki;
	
	public ProsteStatystyki(ObiektObserwowany statystyki) {
		
		this.statystyki = statystyki;
		
		this.statystyki.dodajObserwatora(this);
	}
	
	
	
	public int liczPunkty ()
	{
		return ((zwyciêstwaNaWyjezdzie+zwyciêstwaUSiebie)*3+(remisyNaWyjezdzie+remisyUSiebie));
	}
	
	// Przechwytujemy przekzany stan obiektu obserwowanego i reagujemy wyœwietlaj¹c proste statystyki
	
	@Override
	public void aktualizujDane(ArrayList<Dru¿yna> arr)
 {
	tabela.addAll(arr); 
 }	
	
	public void wyswietlTabele()
	{
     for (int i = 0 ; i<tabela.size();i++) {
		 nazwaDru¿yny = tabela.get(i).getNazwaDru¿yny() ;
		 zwyciêstwaUSiebie = tabela.get(i).getZwyciêstwaUSiebie() ; 
		 zwyciêstwaNaWyjezdzie = tabela.get(i).getZwyciêstwaNaWyjezdzie() ; 
		 remisyUSiebie = tabela.get(i).getRemisyUSiebie() ; 
		 remisyNaWyjezdzie = tabela.get(i).getRemisyNaWyjezdzie() ; 
		 miejsceWTabeli=i+1;
		 Wyœwietl.wyswietl(nazwaDru¿yny + "| Miejsce w tabeli: "+ Integer.toString(miejsceWTabeli) + "| Punkty: " + Integer.toString(liczPunkty()) + "\n");
	}
		
 }
	
	
	


	


}
