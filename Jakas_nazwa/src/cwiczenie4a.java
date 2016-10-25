import java.util.Scanner;

public class cwiczenie4a {

	public static void main(String[] args) {
		System.out.println("Podaj liczbê");
		Scanner scanner = new Scanner(System.in);
		int liczba1 = scanner.nextInt();
		
		silnia(liczba1);
		System.out.println(silnia(liczba1));
	}	
	
	public static int silnia(int liczba1){
		if (liczba1 == 1){
			return 1;
		}
	return liczba1*silnia(liczba1 -1);
	}
}