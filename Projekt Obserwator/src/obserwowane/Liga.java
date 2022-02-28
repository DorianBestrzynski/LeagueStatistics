package obserwowane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import symulacja.Dru�yna;
import obserwatorzy.Obserwator;
import obserwowane.ObiektObserwowany;

public class Liga implements ObiektObserwowany {
	ArrayList <Dru�yna> zespo�y = new ArrayList<Dru�yna>();
	
	ComparatorTabela C = new ComparatorTabela();
	
	
	ArrayList<Obserwator> Obserwatorzy = new ArrayList<Obserwator>();


	
	public Liga ()
	{
		zespo�y.add(new Dru�yna ("�l�sk Wroc�aw",0,0,0,0,0,0,0,0,0,0));
		zespo�y.add(new Dru�yna ("Legia Warszawa",0,0,0,0,0,0,0,0,0,0));
		zespo�y.add(new Dru�yna ("Lechia Gda�sk",0,0,0,0,0,0,0,0,0,0));
		zespo�y.add(new Dru�yna ("Pogo� Szczecin",0,0,0,0,0,0,0,0,0,0));
		zespo�y.add(new Dru�yna ("Lech Pozna�",0,0,0,0,0,0,0,0,0,0));
		zespo�y.add(new Dru�yna ("Piast Gliwice",0,0,0,0,0,0,0,0,0,0));
		zespo�y.add(new Dru�yna ("Cracovia Krak�w",0,0,0,0,0,0,0,0,0,0));
		zespo�y.add(new Dru�yna ("Rak�w Cz�stochowa",0,0,0,0,0,0,0,0,0,0));


	}

	public void symulujPierwszaRunda ()
	{	Random r = new Random();
		
		for (int i = 0 ; i<zespo�y.size() ; i++)
		{
			for (int j = i + 1 ; j<zespo�y.size() ; j++)
			{
				int tmp1 = r.nextInt(5);
				int tmp2 = r.nextInt(5);
				
				zespo�y.get(i).setBramkiStrzeloneUSiebie(tmp1); 
				zespo�y.get(j).setBramkiStrzeloneNaWyje�dzie(tmp2);
				
				zespo�y.get(j).setBramkiStraconeNaWyje�dzie(tmp1);
				zespo�y.get(i).setBramkiStraconeUSiebie(tmp2);
				
				
				if (tmp1>tmp2)
				{
					zespo�y.get(i).setZwyci�stwaUSiebie(1);
					zespo�y.get(j).setPora�kiNaWyjezdzie(1);
				}	
				else if (tmp1==tmp2)
				{
					zespo�y.get(i).setRemisyUSiebie(1);
					zespo�y.get(j).setRemisyNaWyjezdzie(1);
							
				}
				else
				{
					zespo�y.get(i).setPora�kiUSiebie(1);
					zespo�y.get(j).setZwyci�stwaNaWyjezdzie(1);
						
					
				}
				
			}
			 
			
		}
		
}

	
	public void symulujDrugaRunda ()
	{	Random r = new Random();
	
		
		for (int i=zespo�y.size()-1; i>=0;i--)
		{
			for (int j = i - 1 ; j>=0 ; j--)
			{
				int tmp1 = r.nextInt(5);
				int tmp2 = r.nextInt(5);
				
				zespo�y.get(i).setBramkiStrzeloneUSiebie(tmp1); 
				zespo�y.get(j).setBramkiStrzeloneNaWyje�dzie(tmp2);
				
				zespo�y.get(j).setBramkiStraconeNaWyje�dzie(tmp1);
				zespo�y.get(i).setBramkiStraconeUSiebie(tmp2);
				
				
				if (tmp1>tmp2)
				{
					zespo�y.get(i).setZwyci�stwaUSiebie(1);
					zespo�y.get(j).setPora�kiNaWyjezdzie(1);
				}	
				else if (tmp1==tmp2)
				{
					zespo�y.get(i).setRemisyUSiebie(1);
					zespo�y.get(j).setRemisyNaWyjezdzie(1);
							
				}
				else
				{
					zespo�y.get(i).setPora�kiUSiebie(1);
					zespo�y.get(j).setZwyci�stwaNaWyjezdzie(1);
						
					
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
	public void usu�Obserwatora(Obserwator obserwator) 
	{
		Obserwatorzy.remove(obserwator);
	}

	/*Powiadamamy wszystkich obserwator�w o zmianie stanu obiektu obserwowanego 
	 */
	@Override
	public void powiadomObserwatora() 
	{
		Collections.sort(zespo�y, C);
		for(int i = 0; i<Obserwatorzy.size(); i++) 
		Obserwatorzy.get(i).aktualizujDane(zespo�y );
	}
	
	
	public ArrayList<Dru�yna> getZespo�y() {
		return zespo�y;
	}


	public void setZespo�y(ArrayList<Dru�yna> zespo�y) {
		this.zespo�y = zespo�y;
	}
	class ComparatorTabela implements Comparator<Dru�yna>
	{
	public int compare(Dru�yna d1, Dru�yna d2)
	{
	if (((d1.getZwyci�stwaUSiebie() + d1.getZwyci�stwaNaWyjezdzie())*3) + (d1.getRemisyNaWyjezdzie() + d1.getRemisyUSiebie()) > ((d2.getZwyci�stwaUSiebie() + d2.getZwyci�stwaNaWyjezdzie())*3) + (d2.getRemisyNaWyjezdzie() + d2.getRemisyUSiebie()) ) return -1;
	if (((d1.getZwyci�stwaUSiebie() + d1.getZwyci�stwaNaWyjezdzie())*3) + (d1.getRemisyNaWyjezdzie() + d1.getRemisyUSiebie()) <((d2.getZwyci�stwaUSiebie() + d2.getZwyci�stwaNaWyjezdzie())*3) + (d2.getRemisyNaWyjezdzie() + d2.getRemisyUSiebie()) ) return 1;
	return 0;
	}
	}


}
