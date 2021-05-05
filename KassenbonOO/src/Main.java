import java.util.ArrayList;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f;
		f = new JFrame();
		
		ArrayList<Article> articles = new ArrayList<Article>();
		ArrayList<CartItem> cartItems = new ArrayList<CartItem>();
		
		createArticles(articles);
		articlesToCart(f, articles, cartItems);
		ShoppingCart shoppingCart = new ShoppingCart(cartItems);
		shoppingCart.printBill();
		restockItems(articles);
	}





	private static void createArticles(ArrayList<Article> articles) {
		articles.add(new Article(1, "New Silvan Turbo", 7.5, 20));
		articles.add(new Article(2, "Afrim und Bashkim", 6, 20));
		articles.add(new Article(3, "Daniel allein zu Haus", 4.5, 20));
		articles.add(new Article(4, "Call of Duty - Phillips War PC", 30, 20));
		articles.add(new Article(5, "Call of Duty - Phillips War PS4", 40, 20));
		articles.add(new Article(6, "Cybernico 2077 PC", 40, 20));
		articles.add(new Article(7, "Cybernico 2077 PS4", 50, 20));
	}

	/*private static void articlesToCart(JFrame f, ArrayList<Article> articles, ArrayList<CartItem> cartItems) {
		for(Article article : articles) {
			try {
			int input = Integer.parseInt(JOptionPane.showInputDialog(f , article.getArticleName() + "\n" + article.getPrice() + "€"));
			if(input > 0) {
				cartItems.add(new CartItem(article, input));				
			}
			article.setStock(input);
			}catch(Exception e) {
				
			}
		}
	}*/
	
	private static void articlesToCart(JFrame f, ArrayList<Article> articles, ArrayList<CartItem> cartItems) {
		//creates JPanel to store the information about the products
		JPanel myPanel = new JPanel();
		for(Article article:articles) {
			myPanel.add(new JLabel(article.getArticleName() + "\n " + article.getPrice() + "€"));
			myPanel.add(article.getjText());
			myPanel.add(Box.createHorizontalStrut(5));			
		}
		//Displays the articleName and an input field for the user to enter the desired amount.
		try { 
			int result = JOptionPane.showConfirmDialog(null, myPanel, 
		               "Please enter the desired amount.", JOptionPane.OK_CANCEL_OPTION);
			 //If the OK Button was pressed, the desired items get transfered into the CartItem class
			if(result == JOptionPane.OK_OPTION) {
				for(Article article : articles) {
				//The amount of an item is stored inside the jText variable
					if(Integer.parseInt(article.getjText().getText())>0) {
					cartItems.add(new CartItem(article, Integer.parseInt(article.getjText().getText())));
					}
				}
			}
		}catch(Exception e ){}
	}
	
	private static void restockItems(ArrayList<Article> articles) {
		System.out.println("\nHello Dennis,following items need to be restocked:");
		for(Article article : articles) {
			article.restockItem();
		}
	}


}
