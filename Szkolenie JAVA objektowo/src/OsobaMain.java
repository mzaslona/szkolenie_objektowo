
public class OsobaMain {

	public static void main(String[] args) {
		Osoba tato = new Osoba();
		tato.imie = "Jan";
		tato.nazwisko = "Kowalski";
		tato.wiek = 35;

		Osoba corka = new Osoba();
		corka.imie = "Alicja";
		corka.nazwisko = "Kowalska";
		corka.wiek = 10;
		
		System.out.println(tato.pelnoletnia());
		System.out.println(corka.pelnoletnia());

	}
// c
}
