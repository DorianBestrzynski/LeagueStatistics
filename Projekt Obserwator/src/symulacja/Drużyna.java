package symulacja;

import java.util.ArrayList;

public class Dru�yna {

	private String nazwaDru�yny;
	private int zwyci�stwaUSiebie;
	private int zwyci�stwaNaWyjezdzie;
	private int remisyUSiebie;
	private int remisyNaWyjezdzie;
	private int pora�kiUSiebie;
	private int pora�kiNaWyjezdzie;;
	private int bramkiStrzeloneUSiebie;
	private int bramkiStrzeloneNaWyje�dzie;
	@Override
	public String toString() {
		return "Dru�yna [nazwaDru�yny=" + nazwaDru�yny + ", zwyci�stwaUSiebie=" + zwyci�stwaUSiebie
				+ ", zwyci�stwaNaWyjezdzie=" + zwyci�stwaNaWyjezdzie + ", remisyUSiebie=" + remisyUSiebie
				+ ", remisyNaWyjezdzie=" + remisyNaWyjezdzie + ", pora�kiUSiebie=" + pora�kiUSiebie
				+ ", pora�kiNaWyjezdzie=" + pora�kiNaWyjezdzie + ", bramkiStrzeloneUSiebie=" + bramkiStrzeloneUSiebie
				+ ", bramkiStrzeloneNaWyje�dzie=" + bramkiStrzeloneNaWyje�dzie + ", bramkiStraconeUSiebie="
				+ bramkiStraconeUSiebie + ", bramkiStraconeNaWyje�dzie=" + bramkiStraconeNaWyje�dzie + "]";
	}


	private int bramkiStraconeUSiebie;
	private int bramkiStraconeNaWyje�dzie;
	private ArrayList <Dru�yna> konkurencja;
	
	public Dru�yna(String nazwaDru�yny, int zwyci�stwaUSiebie, int zwyci�stwaNaWyjezdzie, int remisyUSiebie,
			int remisyNaWyjezdzie, int pora�kiUSiebie, int pora�kiNaWyjezdzie, int bramkiStrzeloneUSiebie,
			int bramkiStrzeloneNaWyje�dzie, int bramkiStraconeUSiebie, int bramkiStraconeNaWyje�dzie) {

		this.nazwaDru�yny = nazwaDru�yny;
		this.zwyci�stwaUSiebie = zwyci�stwaUSiebie;
		this.zwyci�stwaNaWyjezdzie = zwyci�stwaNaWyjezdzie;
		this.remisyUSiebie = remisyUSiebie;
		this.remisyNaWyjezdzie = remisyNaWyjezdzie;
		this.pora�kiUSiebie = pora�kiUSiebie;
		this.pora�kiNaWyjezdzie = pora�kiNaWyjezdzie;
		this.bramkiStrzeloneUSiebie = bramkiStrzeloneUSiebie;
		this.bramkiStrzeloneNaWyje�dzie = bramkiStrzeloneNaWyje�dzie;
		this.bramkiStraconeUSiebie = bramkiStraconeUSiebie;
		this.bramkiStraconeNaWyje�dzie = bramkiStraconeNaWyje�dzie;
	}


	public ArrayList<Dru�yna> getKonkurencja() {
		return konkurencja;
	}


	public void setKonkurencja(ArrayList<Dru�yna> konkurencja) {
		this.konkurencja = konkurencja;
	}


	public String getNazwaDru�yny() {
		return nazwaDru�yny;
	}


	public void setNazwaDru�yny(String nazwaDru�yny) {
		this.nazwaDru�yny = nazwaDru�yny;
	}


	public int getZwyci�stwaUSiebie() {
		return zwyci�stwaUSiebie;
	}


	public void setZwyci�stwaUSiebie(int zwyci�stwaUSiebie) {
		this.zwyci�stwaUSiebie += zwyci�stwaUSiebie;
	}


	public int getZwyci�stwaNaWyjezdzie() {
		return zwyci�stwaNaWyjezdzie;
	}


	public void setZwyci�stwaNaWyjezdzie(int zwyci�stwaNaWyjezdzie) {
		this.zwyci�stwaNaWyjezdzie += zwyci�stwaNaWyjezdzie;
	}


	public int getRemisyUSiebie() {
		return remisyUSiebie;
	}


	public void setRemisyUSiebie(int remisyUSiebie) {
		this.remisyUSiebie += remisyUSiebie;
	}


	public int getRemisyNaWyjezdzie() {
		return remisyNaWyjezdzie;
	}


	public void setRemisyNaWyjezdzie(int remisyNaWyjezdzie) {
		this.remisyNaWyjezdzie += remisyNaWyjezdzie;
	}


	public int getPora�kiUSiebie() {
		return pora�kiUSiebie;
	}


	public void setPora�kiUSiebie(int pora�kiUSiebie) {
		this.pora�kiUSiebie += pora�kiUSiebie;
	}


	public int getPora�kiNaWyjezdzie() {
		return pora�kiNaWyjezdzie;
	}


	public void setPora�kiNaWyjezdzie(int pora�kiNaWyjezdzie) {
		this.pora�kiNaWyjezdzie += pora�kiNaWyjezdzie;
	}


	public int getBramkiStrzeloneUSiebie() {
		return bramkiStrzeloneUSiebie;
	}


	public void setBramkiStrzeloneUSiebie(int bramkiStrzeloneUSiebie) {
		this.bramkiStrzeloneUSiebie += bramkiStrzeloneUSiebie;
	}


	public int getBramkiStrzeloneNaWyje�dzie() {
		return bramkiStrzeloneNaWyje�dzie;
	}


	public void setBramkiStrzeloneNaWyje�dzie(int bramkiStrzeloneNaWyje�dzie) {
		this.bramkiStrzeloneNaWyje�dzie += bramkiStrzeloneNaWyje�dzie;
	}


	public int getBramkiStraconeUSiebie() {
		return bramkiStraconeUSiebie;
	}


	public void setBramkiStraconeUSiebie(int bramkiStraconeUSiebie) {
		this.bramkiStraconeUSiebie += bramkiStraconeUSiebie;
	}


	public int getBramkiStraconeNaWyje�dzie() {
		return bramkiStraconeNaWyje�dzie;
	}


	public void setBramkiStraconeNaWyje�dzie(int bramkiStraconeNaWyje�dzie) {
		this.bramkiStraconeNaWyje�dzie += bramkiStraconeNaWyje�dzie;
	}
	
	
	
	
	
	
}

