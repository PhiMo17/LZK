import java.util.ArrayList;
import javax.swing.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f;
		f = new JFrame();
		
		ArrayList<Article> articles = new ArrayList<Article>();
		ArrayList<CartItem> cartItems = new ArrayList<CartItem>();
		//Create a aricles(plural) class containing the AL articles?
		//This may also be more in line with the SLA principle.
		//It would also negate the need for another loop around lines 29-33
		//I could also implement the restock method in there eliminating most of lines 40-
		
		
		articles.add(new Article(1, "New Silvan Turbo", 7.5, 20));
		articles.add(new Article(2, "Afrim und Bashkim", 6, 20));
		articles.add(new Article(3, "Daniel allein zu Haus", 4.5, 20));
		articles.add(new Article(4, "Call of Duty - Phillips War PC", 30, 20));
		articles.add(new Article(5, "Call of Duty - Phillips War PS4", 40, 20));
		articles.add(new Article(6, "Cybernico 2077 PC", 40, 20));
		articles.add(new Article(7, "Cybernico 2077 PS4", 50, 20));
		
		
		for(Article article : articles) {
			int input = Integer.parseInt(JOptionPane.showInputDialog(f , article.getArticleName() + "\n" + article.getPrice() + "€"));		
			if(input > 0) {
				cartItems.add(new CartItem(article, input));				
			}
			article.setStock(input);
		}
		ShoppingCart shoppingCart = new ShoppingCart(cartItems);
		shoppingCart.returnBill();
		
		System.out.println("\nHello Dennis,following items need to be restocked:");
		for(Article article : articles) {
			article.restock();
		}
	}
}
