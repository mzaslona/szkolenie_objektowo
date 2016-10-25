
public class OsobaMain {

	public static void main(String[] args) {
		Osoba tato = new Osoba();
		tato.imie = "Jan";
		tato.nazwisko = "Kowalski";
		tato.wiek = 35;
		tato.wzrost =150;
		tato.waga = 120;

		Osoba mama = new Osoba();
		mama.imie = "Julia";
		mama.nazwisko = "Kowalska";
		mama.wiek = 40;
		mama.wzrost = 150;
		mama.waga = 60;
		
		Osoba corka = new Osoba();
		corka.imie = "Alicja";
		corka.nazwisko = "Kowalska";
		corka.wiek = 10;
		corka.wzrost = 200;
		corka.waga = 30;
		
		System.out.println(tato.pelnoletnia());
		System.out.println(corka.pelnoletnia());
		System.out.println(tato.gigant());
		System.out.println(corka.gigant());
		
		Rodzina rodzina = new Rodzina();
		rodzina.tata = tato;
		rodzina.mama = mama;
		rodzina.dziecko = corka;
		
		int lacznaWagaRodziny = rodzina.lacznaWaga();
			
		System.out.println(rodzina.lacznaWaga());

	}
// c
}
