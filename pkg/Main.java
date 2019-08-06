package pkg;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int vet[];
		int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
		
		System.out.println("Declare o tamanho do vetor");
		vet = new int[sc.nextInt()];
		
		for(int i = 0; i < vet.length; i++) {
			System.out.println("Insira os números no vetor");
			vet[i] = sc.nextInt();
			if (vet[i] > maior) {
				maior = vet[i];
			}
			if (vet[i] < menor) {
				menor = vet[i];
			}
		}
		System.out.print("Vetor: ");
		for(int j = 0; j < vet.length; j++) {
			System.out.print(vet[j] + " ");
		}
		System.out.println("\nMaior: " + maior + "\nMenor: " + menor);

	}

}
