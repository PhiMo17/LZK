
public class CartItem {

	private Article article;
	private int inCart;
	private double gross;
	private double taxes;
	private double net;
	
	public CartItem(Article article, int inCart) throws Exception {
		this.article = article;
		this.inCart = inCart;
		this.gross = inCart * article.getPrice();
		this.net = gross / 1.19;
		this.taxes = net * 0.19;
		
		/*if(inCart > article.getStock()) {
			throw new Exception("Not enough items in stock.");
		}*/
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
