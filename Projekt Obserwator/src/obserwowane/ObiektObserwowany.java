package obserwowane;
import obserwatorzy.*;
//Metody wsp�lne dla obiekt�w obserwowanych // 

public interface ObiektObserwowany {

	  public void dodajObserwatora(Obserwator obserwator);
      public void usu�Obserwatora(Obserwator obserwator);
      public void powiadomObserwatora();   
}
