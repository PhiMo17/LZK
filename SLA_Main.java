import java.util.ArrayList;
import javax.swing.*;
import java.util.Scanner;

public class SLA_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f;
		f = new JFrame();
		
		
		ArrayList<Artikel> ArtikelAL = new ArrayList<Artikel>();
		ArrayList<ShoppingCart> shoppingCart = new ArrayList<ShoppingCart>();
		
		ArtikelAL.add(new Artikel(1, "New Silvan Turbo", 7.5, 20));
		ArtikelAL.add(new Artikel(2, "Afrim und Bashkim", 6, 20));
		ArtikelAL.add(new Artikel(3, "Daniel allein zu Haus", 4.5, 20));
		ArtikelAL.add(new Artikel(4, "Call of Duty - Phillips War PC", 30, 20));
		ArtikelAL.add(new Artikel(5, "Call of Duty - Phillips War PS4", 40, 20));
		ArtikelAL.add(new Artikel(6, "Cybernico 2077 PC", 40, 20));
		ArtikelAL.add(new Artikel(7, "Cybernico 2077 PS4", 50, 20));
	
		ShoppingCart.Begrüßung();
		
		System.out.println("\nArtikel:");
		for(Artikel artikel: ArtikelAL) {
			System.out.println(artikel.getArtikelname() +" "+ artikel.getPreis() +"€");
		}
		
		for(Artikel artikel: ArtikelAL) {
			int input = Integer.parseInt(JOptionPane.showInputDialog(f , artikel.getArtikelname() + "\n" + artikel.getPreis() + "€"));
			if(input > 0) {
				shoppingCart.add(new ShoppingCart(artikel.getId(), artikel.getArtikelname(), artikel.getPreis(), input));
			}
		}
		for(ShoppingCart shoppingCartitem: shoppingCart) {
			System.out.println(shoppingCartitem.getArtikelname() + "\n" + shoppingCartitem.getInCard()+" Stk." +"\n Preis: " + shoppingCartitem.getPreis() + "\n Netto: " + shoppingCartitem.getNet() + "\n Mwst: " + shoppingCartitem.getMwSt() + "\n Brutto: " + shoppingCartitem.getGross());
		}
	}
}