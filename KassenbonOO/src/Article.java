import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Article {

	private int id;
	private String articleName;
	private double price;
	private int stock;
	private JTextField jText;
	
	public Article(int id, String name, double price, int stock) {
		this.id = id;
		this.articleName = name;
		this.price = price;
		this.stock = stock;
		this.jText = new JTextField(2);
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
	
	public JTextField getjText() {
		return jText;
	}
	
	public void restockItem() {
		if(stock < 5) {
			System.out.println(articleName + " has to be reordered.\nCurrent stock: " + stock + "\n");
			int yesNo = JOptionPane.showConfirmDialog(null, "Do you want to restock?", "Restock", JOptionPane.YES_NO_OPTION);
			if(yesNo == JOptionPane.YES_OPTION) {
				JFrame f;
				f = new JFrame();
				int restock = -1;
				while(restock < 0) {
					restock = Integer.parseInt(JOptionPane.showInputDialog(f , "How many items do you want to reorder?\nCurrent Stock" + stock, "Restock"));
					if(restock < 0) {
						System.out.println("Please enter a viable number.\n(Positive number)");
					}					
				}	
				this.stock += restock;
			}
		}
	}
}
