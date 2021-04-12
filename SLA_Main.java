import java.util.ArrayList;
import javax.swing.*;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class SLA_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df2 = new DecimalFormat("#.##");
		JFrame f;
		f = new JFrame();
		double grossTotal = 0;
		double netTotal = 0;
		double mwStTotal = 0;	
		
		
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
				if(input > artikel.getBestand()) {
					break;
				}
				shoppingCart.add(new ShoppingCart(artikel.getId(), artikel.getArtikelname(), artikel.getPreis(), input));
			}
		}
		for(ShoppingCart shoppingCartitem: shoppingCart) {
			System.out.println(shoppingCartitem.getArtikelname() + " x " + shoppingCartitem.getInCard()+" Stk." + "\t" + shoppingCartitem.getGross() + "€");
			grossTotal += shoppingCartitem.getGross();
			netTotal += shoppingCartitem.getNet();
			mwStTotal += shoppingCartitem.getMwSt();
		}
		System.out.println(df2.format(grossTotal) + "€\n" + df2.format(netTotal) + "€\n" + df2.format(mwStTotal) + "€");
		
	}
}