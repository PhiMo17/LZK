import java.util.ArrayList;
import javax.swing.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f;
		f = new JFrame();
		
		ArrayList<Article> articles = new ArrayList<Article>();
		ArrayList<CartItem> shoppingCart = new ArrayList<CartItem>();
		
		articles.add(new Article(1, "New Silvan Turbo", 7.5, 20));
		articles.add(new Article(2, "Afrim und Bashkim", 6, 20));
		articles.add(new Article(3, "Daniel allein zu Haus", 4.5, 20));
		articles.add(new Article(4, "Call of Duty - Phillips War PC", 30, 20));
		articles.add(new Article(5, "Call of Duty - Phillips War PS4", 40, 20));
		articles.add(new Article(6, "Cybernico 2077 PC", 40, 20));
		articles.add(new Article(7, "Cybernico 2077 PS4", 50, 20));
		
		
		System.out.println(shoppingCart.get(0));
		System.out.println("HalloWelt");
		
		for(Article items : articles) {
			System.out.println(items);
			//System.out.println(items.getArticleName());
			int input = Integer.parseInt(JOptionPane.showInputDialog(f , items.getArticleName() + "\n" + items.getPrice() + "€"));
			if(input > 0) {
				//shoppingCart.add(new CartItem(, input));
				System.out.println("Hallo Welt");
			}
		}
		for(CartItem items: shoppingCart) {
			System.out.println(items.getArticle());
			System.out.println(items.getInCart());
			System.out.println(items.getGross());
		}
		
		
		
		
		
		
		
		
	}
}
