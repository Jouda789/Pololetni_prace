package cz.alej.prog.kindlova;

public class Elipsa {

	// a = hlavni poloosa, b = vedlejsi poloosa

	private static boolean vElipse(double x, double y, int a, int b) {
		return 1 >= (x*x)/(a*a) + (y*y)/(b*b) ;
	}

	public static void kresli(int a, int b) {
		for (int y = -b; y <= b; y++) {
			for (int x = -a; x <= a; x++) {
				// char znak = vElipse(x, y, a, b)
					if (vElipse(x, y, a, b)){System.out.printf("X");}
					else {System.out.printf(" ");}
				// System.out.printf("%c", znak);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		
		int a =	Integer.parseInt(args[0]);
		int b =	Integer.parseInt(args[1]);
		
		System.out.printf("\n");
		kresli(a, b);
		System.out.printf("\n");
		
		
	}

}
