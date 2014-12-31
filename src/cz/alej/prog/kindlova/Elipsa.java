package cz.alej.prog.kindlova;

public class Elipsa {

	private static boolean vElipse(double x, double y, int a, int b) {
		return 1 >= (x*x)/(a*a) + (y*y)/(b*b) ; // a = hlavni poloosa, b = vedlejsi poloosa
	}

	public static void kresli(int a, int b) {
		for (int y = -b; y <= b; y++) {
			for (int x = -a; x <= a; x++) {
					if (vElipse(x, y, a, b)){System.out.printf("X");}
					else {System.out.printf(" ");}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int a =	Integer.parseInt(args[0]);
		int b =	Integer.parseInt(args[1]);
		
		System.out.println();
		
		kresli(a, b);
		
		System.out.println();
	}
}
