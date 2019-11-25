package dp_lab2;


  



public class DocumentManager {
  private static DocumentManager instanta = null;
  private static Carte book = null;

  private DocumentManager() {

  }

  public static DocumentManager getInstance() {
    if (instanta == null) {
      instanta = new DocumentManager();
    }
    return instanta;
  }

  public void setBook( Carte book) {
    DocumentManager.book = book;
  }

  public static Carte getBook() {
    return book;
  }
}

