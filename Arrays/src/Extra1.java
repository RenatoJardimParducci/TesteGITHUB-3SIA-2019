import java.util.Random;

public class Extra1 {

	public static void main(String[] args) {

		Random gerador = new Random();
		int[] v = new int[10];
		int aux;

		// preencher e imprimir os valores
		System.out.println("antes da ordenação");
		for (int i = 0; i < v.length; i++) {
			v[i] = gerador.nextInt(5 * v.length);
			System.out.print(v[i] + " ");
		}

		// ordenação
		for (int cont = 0; cont < v.length; cont++) {
			for (int i = 0; i < v.length - 1; i++) {
				if (v[i] > v[i + 1]) {
					aux = v[i];
					v[i] = v[i + 1];
					v[i + 1] = aux;
				}
			}
		}

		// impressão após a ordenação
		System.out.println("\n\ndepois a ordenação");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
	}

}
