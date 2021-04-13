import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<CartItem> shoppingCartAL;
	private double totalGross;
	private double totalNet;
	private double totalTaxes;
	private int totalItems;
	private double discount;
	
	public ShoppingCart(ArrayList<CartItem> shoppingCart) {
		this.shoppingCartAL = shoppingCart;
		for(CartItem items: shoppingCart) {
			this.totalGross += items.getGross();
			this.totalNet += items.getNet();
			this.totalTaxes += items.getTaxes();
			this.totalItems += items.getInCart();
		}
		
		//Move the calculation for Net and Taxes over here to reduce lines of code.
		if(totalItems > 3) {
			this.totalGross = totalGross * 0.95;
			this.totalNet = totalNet * 0.95;
			this.totalTaxes = totalTaxes * 0.95;
		}
	}
	
	public void returnBill() {
		System.out.println("");
	}
	
}
