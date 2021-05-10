import java.text.DecimalFormat;
import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<CartItem> cartItems;
	private double 	totalGross;
	private double 	totalNet;
	private double 	totalTaxes;
	private int 	totalItems;
	private double 	discount;
	private double discountPercent = 0.05;
	
	DecimalFormat df = new DecimalFormat(".00");
	
	public ShoppingCart(ArrayList<CartItem> cartItems) {
		
		this.cartItems = cartItems;
		
		sumTotalForAllItems(cartItems);
		applyDiscount();
	}

	private void applyDiscount() {
		this.discount = 0;
		if(this.totalItems > 3) {
			this.discount 	= totalGross * discountPercent;
		}
	}

	private void sumTotalForAllItems(ArrayList<CartItem> cartItems) {
		for(CartItem items: cartItems) {
			//Reference "https://stackoverflow.com/questions/16242733/sum-all-the-elements-java-arraylist"
			this.totalGross += items.getGross();
			this.totalNet 	+= items.getNet();
			this.totalTaxes += items.getTaxes();
			this.totalItems += items.getInCart();
			items.getArticle().reduceStock(totalItems);
		}
	}
	
	public void printBill() {
		System.out.println("Article\t\t\tPrice");
		System.out.println("_____________________________");
		for(CartItem items: cartItems) {
			System.out.println(items.getArticle().getArticleName() + "\n" + 
					items.getInCart() + " pcs. @ " + df.format(items.getArticle().getPrice()) + "€\t\t" + df.format(items.getGross()) + "€\n");
		}
		
		System.out.println("VAT.%:\t\t\t19"
				+ "\nNet:\t\t\t" 	+ df.format(totalNet) 	+ "€" 
				+ "\nVAT.:\t\t\t" 	+ df.format(totalTaxes)	+ "€"
				+ "\nGross:\t\t\t" 	+ df.format(totalGross) + "€");
		
		if(this.totalItems > 3) {
			System.out.println("_____________________________");
			System.out.println("Discount %:\t\t" + discountPercent * 100
				+ "\nDiscount:\t\t" + df.format(discount)			+ "€"
				+ "\nGross:\t\t\t"	+ df.format(totalGross * (1-discountPercent)) 	+ "€");
		}
	}
	
}
