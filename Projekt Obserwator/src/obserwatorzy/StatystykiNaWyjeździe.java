package obserwatorzy;

import java.util.ArrayList;




import packageMain.Wyœwietl;
import inneStatystyki.Punkty;

import obserwowane.ObiektObserwowany;
import symulacja.Dru¿yna;
//Trzeci obserwator 
public class StatystykiNaWyjeŸdzie implements Obserwator, Punkty {
	ArrayList<Dru¿yna> tabela = new ArrayList <Dru¿yna>() ; 
	private String nazwaDru¿yny;
	private int miejsceWTabeli;
	private int zwyciêstwaNaWyjezdzie;
	private int remisyNaWyjezdzie;
	private int pora¿kiNaWyjezdzie;
	private int bramkiStrzeloneNaWyje¿dzie;
	private int bramkiStraconeNaWyje¿dzie;
	
	
	private ObiektObserwowany statystyki;
	
	public StatystykiNaWyjeŸdzie(ObiektObserwowany statystyki) {
		
		this.statystyki = statystyki;
		
		this.statystyki.dodajObserwatora(this);
	}
	
	
	public int obliczMeczeNaWyjezdzie ()
	{
		return (zwyciêstwaNaWyjezdzie+pora¿kiNaWyjezdzie+remisyNaWyjezdzie);
		
	}
	
	public int liczPunkty()
	{
		return (zwyciêstwaNaWyjezdzie*3+remisyNaWyjezdzie);
	}
	public void aktualizujDane(ArrayList<Dru¿yna> arr)
	 {
		tabela.addAll(arr); 
	 }
	
	public void WybierzDru¿ynê(String dru¿yna) {
		for(int i = 0 ; i<tabela.size();i++) {
			if(tabela.get(i).getNazwaDru¿yny().equals(dru¿yna)) {
				nazwaDru¿yny = tabela.get(i).getNazwaDru¿yny() ;
				
				 zwyciêstwaNaWyjezdzie = tabela.get(i).getZwyciêstwaNaWyjezdzie() ; 
				 
				 remisyNaWyjezdzie = tabela.get(i).getRemisyNaWyjezdzie() ; 
				 miejsceWTabeli=i+1;
				 pora¿kiNaWyjezdzie = tabela.get(i).getPora¿kiNaWyjezdzie();
				
				 bramkiStraconeNaWyje¿dzie = tabela.get(i).getBramkiStraconeNaWyje¿dzie();
				
				 bramkiStrzeloneNaWyje¿dzie = tabela.get(i).getBramkiStrzeloneNaWyje¿dzie();
				
				
			}
				
	}
	Wyœwietl.wyswietl("\n" + nazwaDru¿yny + "| Miejsce w tabeli: "+ miejsceWTabeli + "| Rozegrane mecze na wyjezdzie: " + obliczMeczeNaWyjezdzie() + "| Punkty na wyjezdzie: " + liczPunkty() +
				"| Bramki strzelone na wyjezdzie: "+ bramkiStrzeloneNaWyje¿dzie + "| Bramki stracone na wyjezdzie: " + bramkiStraconeNaWyje¿dzie + "\n");
	}

	
	
	
	
	

	

	
}
