package cz.alej.prog.kindlova;

public class Seq {

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			// System.out.printf("%s ", args[i]);
		}

		if (args.length == 0) {
			System.out.printf("\nNeni to posloupnost.\n");
			return;
		}

		int konec = Integer.parseInt(args[0]);

		if (args.length == 1) {
			System.out.printf(
					"\nZadal jste cislo %d, budu tisknout radu od 1 do %d.\n",
					konec, konec);

			System.out.printf("\n");

			for (int a = 1; a <= konec; a++) {
				System.out.printf("%d ", a);
			}

			System.out.printf("\n");

			return;
		}

		int konec2 = Integer.parseInt(args[1]);

		if (args.length == 2) {
			System.out
					.printf("\nZadal jste cisla %d a %d, budu tisknout radu od %d do %d.\n",
							konec, konec2, konec, konec2);

			System.out.printf("\n");

			for (int b = konec; b <= konec2; b++) {

				System.out.printf("%d ", b);

			}

			System.out.printf("\n");

			return;

		}

		int konec3 = Integer.parseInt(args[2]);

		if (args.length == 3) {

			System.out
					.printf("\nZadal jste cisla %d, %d a %d, budu tisknout aritmetickou posloupnost od %d do %d s diferenci %d.\n",
							konec, konec2, konec3, konec, konec3, konec2);

			System.out.printf("\n");

			if (konec2 > 0) {
				for (int a = konec; a <= konec3; a += konec2) {

					System.out.printf("%d ", a);

				}
			} else if (konec2 == 0) {
				System.out.printf("Nepocitam.");
			} else {
				for (int a = konec; a >= konec3; a = a + konec2) {

					System.out.printf("%d ", a);
				}
			}

			System.out.printf("\n");

			return;
		}
	}
}
