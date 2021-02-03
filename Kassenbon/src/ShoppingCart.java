
public class ShoppingCart {
	private int id;
	private String Artikelname;
	private double Preis;
	private int	InCard;
	private double Gross;
	
	public ShoppingCart(int id, String Artikelname, double Preis, int InCard, double gross) {
		this.id = id;
		this.Artikelname = Artikelname;
		this.Preis = Preis;
		this.InCard = InCard;
		this.Gross = Gross;
		
	}

	public double getGross() {
		return Gross;
	}

	public void setGross(double gross) {
		Gross = Preis * InCard;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArtikelname() {
		return Artikelname;
	}

	public void setArtikelname(String artikelname) {
		Artikelname = artikelname;
	}

	public double getPreis() {
		return Preis;
	}

	public void setPreis(double preis) {
		Preis = preis;
	}

	public int getInCard() {
		return InCard;
	}

	public void setInCard(int inCard) {
		InCard = inCard;
	}
	
	
	
}
