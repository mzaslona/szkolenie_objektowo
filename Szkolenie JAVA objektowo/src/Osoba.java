
public abstract class Osoba {
	String imie, nazwisko;
	int wiek;
	int wzrost;
	private int waga;
	Plec plec;

	public Osoba(String imie, String nazwisko, int wiek, int wzrost, int waga, Plec plec) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
		this.wzrost = wzrost;
		this.waga = waga;
	}

	boolean pelnoletnia() {
		return wiek >= 18;
	}

	boolean gigant() {
		return wzrost > 180;
	}

	int pobierzWag�() {
		return waga;
	}
	// c
}
