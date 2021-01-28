
public class Artikel {
	//private int id;
	private String Artikelname;
	private int Preis;
	private int Bestand;
	
	public Artikel(/*int id,*/ String Artikelname, int Preis, int Bestand) {
		//this.id = id;
		this.Artikelname = Artikelname;
		this.Preis = Preis;
		this.Bestand = Bestand;
	}

	/*public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}*/

	public String getArtikelname() {
		return Artikelname;
	}

	public void setArtikelname(String artikelname) {
		Artikelname = artikelname;
	}

	public int getPreis() {
		return Preis;
	}

	public void setPreis(int preis) {
		Preis = preis;
	}

	public int getBestand() {
		return Bestand;
	}

	public void setBestand(int bestand) {
		Bestand = bestand;
	}
	
	
}
