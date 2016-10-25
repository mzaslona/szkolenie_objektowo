import java.util.Scanner;

public class cwiczenie4 {

	public static void main(String[] args) {
		System.out.println("Podaj liczbê");
		Scanner scanner = new Scanner(System.in);
		int liczba1 = scanner.nextInt();
		
		int silnia = 1;
		for (int i = 1; i <= liczba1; i++) {
			silnia = silnia*i;
			
		}
		System.out.println(silnia);
	}

}
