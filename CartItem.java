
public class CartItem {

	private Article article;
	private int inCart;
	private double gross;
	private double taxes;
	private double net;
	private double taxrate = 1.19;
	
	public CartItem(Article article, int inCart) {
		this.article = article;
		this.inCart = inCart;
		this.gross = inCart * article.getPrice();
		this.net = gross / taxrate;
		this.taxes = gross - net ;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public int getInCart() {
		return inCart;
	}

	public void setInCart(int inCart) {
		this.inCart = inCart;
	}

	public double getGross() {
		return gross;
	}

	public void setGross(double gross) {
		this.gross = gross;
	}

	public double getTaxes() {
		return taxes;
	}

	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}

	public double getNet() {
		return net;
	}

	public void setNet(double net) {
		this.net = net;
	}
	
}
