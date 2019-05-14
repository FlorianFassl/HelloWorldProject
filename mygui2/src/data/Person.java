package data;

import java.util.ArrayList;

public class Person {
	
	private static ArrayList<Person> liste = new ArrayList<Person>();

public static ArrayList<Person> getListe() {
		return liste;
	}
	public static void setListe(ArrayList<Person> liste) {
		Person.liste = liste;
	}
private String vorname;
public String getVorname() {
	return vorname;
}
public void setVorname(String vorname) {
	this.vorname = vorname;
}
public String getNachname() {
	return nachname;
}
public void setNachname(String nachname) {
	this.nachname = nachname;
}
public String getPlz() {
	return plz;
}
public void setPlz(String plz) {
	this.plz = plz;
}
public String getOrt() {
	return ort;
}
public void setOrt(String ort) {
	this.ort = ort;
}
public String getStrasse() {
	return strasse;
}
public void setStrasse(String strasse) {
	this.strasse = strasse;
}
public String getHausnummer() {
	return hausnummer;
}
public void setHausnummer(String hausnummer) {
	this.hausnummer = hausnummer;
}
private String nachname;
private String plz;
private String ort;
private String strasse;
private String hausnummer;


public String toString() {
	return getNachname() + "," + getVorname();
}
}
