package obserwowane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import symulacja.Dru¿yna;
import obserwatorzy.Obserwator;
import obserwowane.ObiektObserwowany;

public class Liga implements ObiektObserwowany {
	ArrayList <Dru¿yna> zespo³y = new ArrayList<Dru¿yna>();
	
	ComparatorTabela C = new ComparatorTabela();
	
	
	ArrayList<Obserwator> Obserwatorzy = new ArrayList<Obserwator>();


	
	public Liga ()
	{
		zespo³y.add(new Dru¿yna ("Œl¹sk Wroc³aw",0,0,0,0,0,0,0,0,0,0));
		zespo³y.add(new Dru¿yna ("Legia Warszawa",0,0,0,0,0,0,0,0,0,0));
		zespo³y.add(new Dru¿yna ("Lechia Gdañsk",0,0,0,0,0,0,0,0,0,0));
		zespo³y.add(new Dru¿yna ("Pogoñ Szczecin",0,0,0,0,0,0,0,0,0,0));
		zespo³y.add(new Dru¿yna ("Lech Poznañ",0,0,0,0,0,0,0,0,0,0));
		zespo³y.add(new Dru¿yna ("Piast Gliwice",0,0,0,0,0,0,0,0,0,0));
		zespo³y.add(new Dru¿yna ("Cracovia Kraków",0,0,0,0,0,0,0,0,0,0));
		zespo³y.add(new Dru¿yna ("Raków Czêstochowa",0,0,0,0,0,0,0,0,0,0));


	}

	public void symulujPierwszaRunda ()
	{	Random r = new Random();
		
		for (int i = 0 ; i<zespo³y.size() ; i++)
		{
			for (int j = i + 1 ; j<zespo³y.size() ; j++)
			{
				int tmp1 = r.nextInt(5);
				int tmp2 = r.nextInt(5);
				
				zespo³y.get(i).setBramkiStrzeloneUSiebie(tmp1); 
				zespo³y.get(j).setBramkiStrzeloneNaWyje¿dzie(tmp2);
				
				zespo³y.get(j).setBramkiStraconeNaWyje¿dzie(tmp1);
				zespo³y.get(i).setBramkiStraconeUSiebie(tmp2);
				
				
				if (tmp1>tmp2)
				{
					zespo³y.get(i).setZwyciêstwaUSiebie(1);
					zespo³y.get(j).setPora¿kiNaWyjezdzie(1);
				}	
				else if (tmp1==tmp2)
				{
					zespo³y.get(i).setRemisyUSiebie(1);
					zespo³y.get(j).setRemisyNaWyjezdzie(1);
							
				}
				else
				{
					zespo³y.get(i).setPora¿kiUSiebie(1);
					zespo³y.get(j).setZwyciêstwaNaWyjezdzie(1);
						
					
				}
				
			}
			 
			
		}
		
}

	
	public void symulujDrugaRunda ()
	{	Random r = new Random();
	
		
		for (int i=zespo³y.size()-1; i>=0;i--)
		{
			for (int j = i - 1 ; j>=0 ; j--)
			{
				int tmp1 = r.nextInt(5);
				int tmp2 = r.nextInt(5);
				
				zespo³y.get(i).setBramkiStrzeloneUSiebie(tmp1); 
				zespo³y.get(j).setBramkiStrzeloneNaWyje¿dzie(tmp2);
				
				zespo³y.get(j).setBramkiStraconeNaWyje¿dzie(tmp1);
				zespo³y.get(i).setBramkiStraconeUSiebie(tmp2);
				
				
				if (tmp1>tmp2)
				{
					zespo³y.get(i).setZwyciêstwaUSiebie(1);
					zespo³y.get(j).setPora¿kiNaWyjezdzie(1);
				}	
				else if (tmp1==tmp2)
				{
					zespo³y.get(i).setRemisyUSiebie(1);
					zespo³y.get(j).setRemisyNaWyjezdzie(1);
							
				}
				else
				{
					zespo³y.get(i).setPora¿kiUSiebie(1);
					zespo³y.get(j).setZwyciêstwaNaWyjezdzie(1);
						
					
				}
				
				
				
				
			}		
		}
		
	}
	@Override
	public void dodajObserwatora(Obserwator obserwator) 
	{	
		Obserwatorzy.add(obserwator);
	}

	@Override
	public void usuñObserwatora(Obserwator obserwator) 
	{
		Obserwatorzy.remove(obserwator);
	}

	/*Powiadamamy wszystkich obserwatorów o zmianie stanu obiektu obserwowanego 
	 */
	@Override
	public void powiadomObserwatora() 
	{
		Collections.sort(zespo³y, C);
		for(int i = 0; i<Obserwatorzy.size(); i++) 
		Obserwatorzy.get(i).aktualizujDane(zespo³y );
	}
	
	
	public ArrayList<Dru¿yna> getZespo³y() {
		return zespo³y;
	}


	public void setZespo³y(ArrayList<Dru¿yna> zespo³y) {
		this.zespo³y = zespo³y;
	}
	class ComparatorTabela implements Comparator<Dru¿yna>
	{
	public int compare(Dru¿yna d1, Dru¿yna d2)
	{
	if (((d1.getZwyciêstwaUSiebie() + d1.getZwyciêstwaNaWyjezdzie())*3) + (d1.getRemisyNaWyjezdzie() + d1.getRemisyUSiebie()) > ((d2.getZwyciêstwaUSiebie() + d2.getZwyciêstwaNaWyjezdzie())*3) + (d2.getRemisyNaWyjezdzie() + d2.getRemisyUSiebie()) ) return -1;
	if (((d1.getZwyciêstwaUSiebie() + d1.getZwyciêstwaNaWyjezdzie())*3) + (d1.getRemisyNaWyjezdzie() + d1.getRemisyUSiebie()) <((d2.getZwyciêstwaUSiebie() + d2.getZwyciêstwaNaWyjezdzie())*3) + (d2.getRemisyNaWyjezdzie() + d2.getRemisyUSiebie()) ) return 1;
	return 0;
	}
	}


}
