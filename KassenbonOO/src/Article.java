
public class Article {

	private int id;
	private String articleName;
	private double price;
	private int stock;
	
	public Article(int id, String name, double price, int stock) {
		this.id = id;
		this.articleName = name;
		this.price = price;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock -= stock;
	}
	
	public void restock() {
		if(stock < 5) {
			System.out.println(articleName + " has to be reordered.\nCurrent stock: " + stock + "\n");
		}
	}
}
