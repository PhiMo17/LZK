import java.util.ArrayList;

import javax.swing.*;

public class Artikel {
	private int id;
	private String Artikelname;
	private double Preis;
	private int Bestand;
	
	public Artikel(int id, String Artikelname, double Preis, int Bestand) {
		this.id = id;
		this.Artikelname = Artikelname;
		this.Preis = Preis;
		this.Bestand = Bestand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArtikelname() {
		return Artikelname;
	}

	public void setArtikelname(String artikelname) {
		Artikelname = artikelname;
	}

	public double getPreis() {
		return Preis;
	}

	public void setPreis(double preis) {
		Preis = preis;
	}

	public int getBestand() {
		return Bestand;
	}

	public void setBestand(int bestand) {
		Bestand = bestand;
	}
	/*public void returnArtikelListe() {
		JFrame f;
		f = new JFrame();
		int input = Integer.parseInt(JOptionPane.showInputDialog(f , Artikelname + "\n" + Preis + "€"));
	}*/
}
