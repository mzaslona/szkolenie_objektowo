import java.util.ArrayList;

public class OsobaMain {

	public static void main(String[] args) {

		Kobieta mama = new Kobieta("Halina", "Kowalska", 34, 150, 70);
		Men tato = new Men("Jan", "Kowalski", 35, 210, 210);
		Osoba corka = new Kobieta("Bo¿ena", "Kowalska", 5, 120, 20);
		Osoba syn = new Men("W³adzio", "Kowalski", 25, 210, 160);

		System.out.println(tato.pelnoletnia());
		System.out.println(corka.pelnoletnia());
		System.out.println(tato.gigant());
		System.out.println(corka.gigant());

		ArrayList<Osoba> dzieci = new ArrayList<>();
		dzieci.add(corka);
		dzieci.add(syn);

		Rodzina kowalscy = new Rodzina(mama, tato, dzieci);

		Rodzina kowalscyBezDzieci = new Rodzina(mama, tato);
		// Rodzina kowalscyBezDzieciIMamy = new Rodzina(tato);

		// int lacznaWagaRodziny = kowalscy.lacznaWaga();
		// int lacznaWagaRodziny = kowalscyBezDzieci.lacznaWaga();

		System.out.println("kowalscy " + kowalscy.lacznaWaga());
		System.out.println("Kobieta gigant " + mama.gigant());
		System.out.println("Facet gigant " + tato.gigant());
		System.out.println("kowalscyBezDzieci " + kowalscyBezDzieci.lacznaWaga());
		// System.out.println("kowalscyBezDzieciIMamy " +
		// kowalscyBezDzieciIMamy.lacznaWaga());
	}
	// c
}
