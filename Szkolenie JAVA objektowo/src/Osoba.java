
public class Osoba {
	String imie, nazwisko;
	int wiek;
	int wzrost;
	private int waga;
	
	
	
	public Osoba(String imie, String nazwisko, int wiek, int wzrost, int waga) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
		this.wzrost = wzrost;
		this.waga = waga;
	}
	
	
	boolean pelnoletnia() {
		return wiek>= 18;
	}
	boolean gigant(){
		return wzrost >180;
	}
	
	int pobierzWagê(){
		return waga;
	}
// c
}


