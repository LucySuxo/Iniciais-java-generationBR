package Estudo;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeVetor {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		int somaPar=0,contImpar=0;
	
		int[] vetor = new int[6];
		
		for (int i=0; i<6;i++) {
			System.out.println("\nDigite um número: ");
			vetor[i] = ler.nextInt();
			}
		
		System.out.println("\nNúmeros pares digitados: ");
		for(int i=0;i<6;i++) {
			if(vetor[i] % 2 ==0) {
				System.out.println(vetor[i]);
				somaPar += vetor[i];
			}
		}
		
		System.out.println("\nNúmeros ímpares digitados: ");
		for(int i=0;i<6;i++) {
			if(vetor[i] % 2 != 0) {
				System.out.println(vetor[i]);
				contImpar++;
			}
		}
		
		System.out.println("\nSoma dos números pares: "+somaPar);
		System.out.println("\nQuantidade de números ímpares: "+contImpar);
	
	
		ler.close();
		
		

	}

}
