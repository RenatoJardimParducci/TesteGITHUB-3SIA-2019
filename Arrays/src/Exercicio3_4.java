import java.util.Scanner;

public class Exercicio3_4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int[] vetor = new int[10];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int par = 0;
		int soma = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Informe o "+(i+1)+"o valor -> ");
			vetor[i] = teclado.nextInt();	
			
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
			if(vetor[i] < menor) {
				menor = vetor[i];
			}
			if(vetor[i]%2 == 0) {
				par++;
			}
			
			soma += vetor[i]; //soma = soma + vetor[i]
		}
		
		System.out.println("maior valor -> "+maior);
		System.out.println("menor valor -> "+menor);
		System.out.println("total de pares -> "+par);
		System.out.println("total de ímpares -> "+(vetor.length-par));
		System.out.println("soma dos valores -> "+soma);
		System.out.println("média dos valores -> "+((double)soma/vetor.length));
		teclado.close();
	}

}
