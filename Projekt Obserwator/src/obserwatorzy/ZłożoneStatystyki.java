package obserwatorzy;

import java.util.ArrayList;



import java.util.Collections;

import packageMain.Wy�wietl;
import gui.Widok_GUI;
import inneStatystyki.Punkty;
import obserwowane.ObiektObserwowany;
import symulacja.Dru�yna;
//Czwarty obserwator
public class Z�o�oneStatystyki implements Obserwator, Punkty {
	ArrayList<Dru�yna> tabela = new ArrayList <Dru�yna>() ; 

	private String nazwaDru�yny;
	private int miejsceWTabeli;
	private int zwyci�stwaUSiebie;
	private int zwyci�stwaNaWyjezdzie;
	private int remisyUSiebie;
	private int remisyNaWyjezdzie;
	private int pora�kiUSiebie;
	private int pora�kiNaWyjezdzie;
	private int bramkiStrzeloneUSiebie;
	private int bramkiStrzeloneNaWyje�dzie;
	private int bramkiStraconeUSiebie;
	private int bramkiStraconeNaWyje�dzie;
	    
	private ObiektObserwowany statystyki;
	
	public Z�o�oneStatystyki(ObiektObserwowany statystyki) {
		
		this.statystyki = statystyki;
		
		this.statystyki.dodajObserwatora(this);
	}
	
	
	public int obliczLiczb�Mecz�w(){
      
      return (zwyci�stwaUSiebie+zwyci�stwaNaWyjezdzie+remisyNaWyjezdzie+remisyUSiebie+pora�kiNaWyjezdzie+pora�kiUSiebie);
	}
	
	public int obliczLiczb�StrzelonychBramek() {
		return (bramkiStrzeloneUSiebie+bramkiStrzeloneNaWyje�dzie);
	}
	
	public int obliczLiczb�StraconychBramek() {
		return (bramkiStraconeNaWyje�dzie+bramkiStraconeUSiebie);
	}
	
	
	public int obliczBilansBramek() {
		
		return obliczLiczb�StrzelonychBramek()-obliczLiczb�StraconychBramek();
				
	}
	
	public int liczPunkty ()
	{
		return ((zwyci�stwaNaWyjezdzie+zwyci�stwaUSiebie)*3+(remisyNaWyjezdzie+remisyUSiebie));
	}
	public void aktualizujDane(ArrayList<Dru�yna> arr)
	 {
		tabela.addAll(arr); 
	 }
	
		public void WybierzDru�yn�(String dru�yna) {
			for(int i = 0 ; i<tabela.size();i++) {
				if(tabela.get(i).getNazwaDru�yny().equals(dru�yna)) {
					nazwaDru�yny = tabela.get(i).getNazwaDru�yny() ;
					 zwyci�stwaUSiebie = tabela.get(i).getZwyci�stwaUSiebie() ; 
					 zwyci�stwaNaWyjezdzie = tabela.get(i).getZwyci�stwaNaWyjezdzie() ; 
					 remisyUSiebie = tabela.get(i).getRemisyUSiebie() ; 
					 remisyNaWyjezdzie = tabela.get(i).getRemisyNaWyjezdzie() ; 
					 miejsceWTabeli=i+1;
					 pora�kiNaWyjezdzie = tabela.get(i).getPora�kiNaWyjezdzie();
					 pora�kiUSiebie = tabela.get(i).getPora�kiUSiebie();
					 bramkiStraconeNaWyje�dzie = tabela.get(i).getBramkiStraconeNaWyje�dzie();
					 bramkiStraconeUSiebie = tabela.get(i).getBramkiStraconeUSiebie() ; 
					 bramkiStrzeloneNaWyje�dzie = tabela.get(i).getBramkiStrzeloneNaWyje�dzie();
					 bramkiStrzeloneUSiebie = tabela.get(i).getBramkiStrzeloneUSiebie();
					
				}
					
		}
		Wy�wietl.wyswietl("\n" + nazwaDru�yny + "| Miejsce w tabeli: "+ miejsceWTabeli + "| Rozegrane mecze: " + obliczLiczb�Mecz�w() + "| Punkty: " + liczPunkty() + "| Bramki strzelone: "
				+ obliczLiczb�StrzelonychBramek() + "| Bramki stracone: " + obliczLiczb�StraconychBramek() + "| Bilans bramek +/-: " + obliczBilansBramek() + "\n");
		}
	
	




}

