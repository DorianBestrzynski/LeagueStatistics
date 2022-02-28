package obserwatorzy;

import java.util.ArrayList;



import java.util.Collections;

import packageMain.Wyœwietl;
import gui.Widok_GUI;
import inneStatystyki.Punkty;
import obserwowane.ObiektObserwowany;
import symulacja.Dru¿yna;
//Czwarty obserwator
public class Z³o¿oneStatystyki implements Obserwator, Punkty {
	ArrayList<Dru¿yna> tabela = new ArrayList <Dru¿yna>() ; 

	private String nazwaDru¿yny;
	private int miejsceWTabeli;
	private int zwyciêstwaUSiebie;
	private int zwyciêstwaNaWyjezdzie;
	private int remisyUSiebie;
	private int remisyNaWyjezdzie;
	private int pora¿kiUSiebie;
	private int pora¿kiNaWyjezdzie;
	private int bramkiStrzeloneUSiebie;
	private int bramkiStrzeloneNaWyje¿dzie;
	private int bramkiStraconeUSiebie;
	private int bramkiStraconeNaWyje¿dzie;
	    
	private ObiektObserwowany statystyki;
	
	public Z³o¿oneStatystyki(ObiektObserwowany statystyki) {
		
		this.statystyki = statystyki;
		
		this.statystyki.dodajObserwatora(this);
	}
	
	
	public int obliczLiczbêMeczów(){
      
      return (zwyciêstwaUSiebie+zwyciêstwaNaWyjezdzie+remisyNaWyjezdzie+remisyUSiebie+pora¿kiNaWyjezdzie+pora¿kiUSiebie);
	}
	
	public int obliczLiczbêStrzelonychBramek() {
		return (bramkiStrzeloneUSiebie+bramkiStrzeloneNaWyje¿dzie);
	}
	
	public int obliczLiczbêStraconychBramek() {
		return (bramkiStraconeNaWyje¿dzie+bramkiStraconeUSiebie);
	}
	
	
	public int obliczBilansBramek() {
		
		return obliczLiczbêStrzelonychBramek()-obliczLiczbêStraconychBramek();
				
	}
	
	public int liczPunkty ()
	{
		return ((zwyciêstwaNaWyjezdzie+zwyciêstwaUSiebie)*3+(remisyNaWyjezdzie+remisyUSiebie));
	}
	public void aktualizujDane(ArrayList<Dru¿yna> arr)
	 {
		tabela.addAll(arr); 
	 }
	
		public void WybierzDru¿ynê(String dru¿yna) {
			for(int i = 0 ; i<tabela.size();i++) {
				if(tabela.get(i).getNazwaDru¿yny().equals(dru¿yna)) {
					nazwaDru¿yny = tabela.get(i).getNazwaDru¿yny() ;
					 zwyciêstwaUSiebie = tabela.get(i).getZwyciêstwaUSiebie() ; 
					 zwyciêstwaNaWyjezdzie = tabela.get(i).getZwyciêstwaNaWyjezdzie() ; 
					 remisyUSiebie = tabela.get(i).getRemisyUSiebie() ; 
					 remisyNaWyjezdzie = tabela.get(i).getRemisyNaWyjezdzie() ; 
					 miejsceWTabeli=i+1;
					 pora¿kiNaWyjezdzie = tabela.get(i).getPora¿kiNaWyjezdzie();
					 pora¿kiUSiebie = tabela.get(i).getPora¿kiUSiebie();
					 bramkiStraconeNaWyje¿dzie = tabela.get(i).getBramkiStraconeNaWyje¿dzie();
					 bramkiStraconeUSiebie = tabela.get(i).getBramkiStraconeUSiebie() ; 
					 bramkiStrzeloneNaWyje¿dzie = tabela.get(i).getBramkiStrzeloneNaWyje¿dzie();
					 bramkiStrzeloneUSiebie = tabela.get(i).getBramkiStrzeloneUSiebie();
					
				}
					
		}
		Wyœwietl.wyswietl("\n" + nazwaDru¿yny + "| Miejsce w tabeli: "+ miejsceWTabeli + "| Rozegrane mecze: " + obliczLiczbêMeczów() + "| Punkty: " + liczPunkty() + "| Bramki strzelone: "
				+ obliczLiczbêStrzelonychBramek() + "| Bramki stracone: " + obliczLiczbêStraconychBramek() + "| Bilans bramek +/-: " + obliczBilansBramek() + "\n");
		}
	
	




}

