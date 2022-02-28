package obserwowane;
import obserwatorzy.*;
//Metody wspólne dla obiektów obserwowanych // 

public interface ObiektObserwowany {

	  public void dodajObserwatora(Obserwator obserwator);
      public void usuñObserwatora(Obserwator obserwator);
      public void powiadomObserwatora();   
}
