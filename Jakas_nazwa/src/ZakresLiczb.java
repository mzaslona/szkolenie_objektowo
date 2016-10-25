
public class ZakresLiczb {

	public static void main(String[] args) {
		byte a = 120;
		a += 20;
		
//		byte b+= 20;
		short s = -32000; s -= 1000;
		int i = 2000000000; i =2*i;
		char c = 50;
		int j = '9';
		System.out.println(a);
		System.out.println(s);
		System.out.println(i);
		System.out.println(c);
		System.out.println(j);
		
		float f= 1.0000001F; 
		float g=f;
		g+=1;
//		System.out.println(g);
		g-=1;
		System.out.println(f);
		System.out.println(g);
		
	}

}