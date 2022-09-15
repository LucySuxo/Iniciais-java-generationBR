package Estudo;

import java.util.Scanner;

public class Atividade2 {

public static void main(String[] args) {
		
	    //PROGRAMA QUE IDENTIFICA O MAIOR NÚMERO ENTRE TRÊS DIGITADOS.
		
		int w, y, z;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o 1º número: ");
		w = leia.nextInt();
		System.out.println("\nDigite o 2º número: ");
		y = leia.nextInt();
		System.out.println("\nDigite o 3º número: ");
		z = leia.nextInt();
		
		if (w<=y && y<=z) {
			System.out.println("\nO maior número é: "+z);
		}else if (z<=y && y<=w) {
			System.out.println("\nO maior número é: "+w);
		}else if (w<=z && z<=y) {
			System.out.println("\nO maior número é: "+y);
		}
		
	}

}
