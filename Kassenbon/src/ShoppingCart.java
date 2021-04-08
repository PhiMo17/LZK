
public class ShoppingCart {
	private int id;
	private String Artikelname;
	private double Preis;
	private int	InCard;
	private double Gross;
	protected double Net;
	protected double MwSt;
	
	public ShoppingCart(int id, String artikelname, double preis, int inCard) {
		this.id = id;
		this.Artikelname = artikelname;
		this.Preis = preis;
		this.InCard = inCard;		
	}

	public double getMwSt() {
		return MwSt;
	}

	public void setMwSt(double mwSt) {
		MwSt = Net * 0.19;
	}

	public double getNet() {
		return Net;
	}

	public void setNet(double net) {
		Net = Gross / 1.19;
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
	
	
	
	static void Begrüßung() {
		System.out.println("Spieleladen Vinke\n\nDennis Vinke\nNilay-Benli-Straße\n30489 Niklashausen");
	}
	
}
