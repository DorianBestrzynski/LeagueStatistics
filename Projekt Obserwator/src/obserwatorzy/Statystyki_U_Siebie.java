package obserwatorzy;
import java.util.ArrayList;




import packageMain.Wy�wietl;
import inneStatystyki.Punkty;
//drugi obserwator

import obserwowane.ObiektObserwowany;
import symulacja.Dru�yna;
public class Statystyki_U_Siebie implements Obserwator , Punkty {
	ArrayList<Dru�yna> tabela = new ArrayList <Dru�yna>() ; 

		private String nazwaDru�yny;
		private int miejsceWTabeli;
		private int zwyci�stwaUSiebie;
		private int remisyUSiebie ; 
		private int pora�kiUSiebie;
		private int bramkiStrzeloneUSiebie;
		private int bramkiStraconeUSiebie;
		
		private ObiektObserwowany statystyki;
		
		public Statystyki_U_Siebie(ObiektObserwowany statystyki) {
			
			this.statystyki = statystyki;
			
			this.statystyki.dodajObserwatora(this);
		}
		
		
		public int obliczMeczeUSiebie ()
		{
			return (zwyci�stwaUSiebie+pora�kiUSiebie+remisyUSiebie);
			
		}
		
		public int liczPunkty()
		{
			return (zwyci�stwaUSiebie*3+remisyUSiebie);
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
					
					 remisyUSiebie = tabela.get(i).getRemisyUSiebie() ; 
					 
					 miejsceWTabeli=i+1;
					
					 pora�kiUSiebie = tabela.get(i).getPora�kiUSiebie();
					
					 bramkiStraconeUSiebie = tabela.get(i).getBramkiStraconeUSiebie() ; 
					
					 bramkiStrzeloneUSiebie = tabela.get(i).getBramkiStrzeloneUSiebie();
					
				}
					
		}
		Wy�wietl.wyswietl("\n" + nazwaDru�yny + "| Miejsce w tabeli: "+ miejsceWTabeli + "| Rozegrane mecze u siebie: " + obliczMeczeUSiebie() + "| Punkty u siebie: " + liczPunkty() +
					"| Bramki strzelone u siebie: "+ bramkiStrzeloneUSiebie + "| Bramki stracone u siebie: " + bramkiStraconeUSiebie  + "\n" );
		}
	
	


		
	
		
		
	}

	


