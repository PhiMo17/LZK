import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Article> articles = new ArrayList<Article>();
		ArrayList<CartItem> cartItems = new ArrayList<CartItem>();
		
		createArticles(articles);
		articlesToCart(articles, cartItems, sc);
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

	
	private static void articlesToCart(ArrayList<Article> articles, ArrayList<CartItem> cartItems, Scanner sc) {
		System.out.println("Which item would you like to add to your shopping Cart?");
		for(Article article:articles) {
			System.out.println(articles.indexOf(article) + " " + article.getArticleName() + "\t" + article.getPrice());
		}
		System.out.println("\nPlease enter the id of the item you wish to buy, followed by the quantity.\nAn empty input will bring you to the Chekcout.\n");
		while(true) {
			String articleId = sc.nextLine();
			if(articleId.isEmpty()) {
				break;
			}
			String articleQty = sc.nextLine();
			if(articleQty.isEmpty()) {
				break;
			}
			
			cartItems.add(new CartItem(articles.get(Integer.parseInt(articleId)), Integer.parseInt(articleQty)));
		}
	}
	
	private static void restockItems(ArrayList<Article> articles) {
		System.out.println("\nHello Dennis,following items need to be restocked:");
		for(Article article : articles) {
			article.restockItem();
		}
	}


}
