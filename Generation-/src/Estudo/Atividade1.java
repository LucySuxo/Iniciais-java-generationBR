package Estudo;

import java.util.Scanner;

public class Atividade1 {

public static void main(String[] args) {
		
		//PROGRAMA QUE SEPARA EM CATEGORIA A IDADE INFORMADA.
		
		int number;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nColoque sua idade: ");
		number = leia.nextInt();
		
		if(number>=0 && number<=9) {
			System.out.println("\nComando inválido");
		}else if(number>=10 && number<=14) {
			System.out.println("\nCategoria: infantil");
		}else if(number>=15 && number<=17) {
			System.out.println("\nCategoria: juvenil");	
		}else if(number>=18 && number<=25) {
			System.out.println("\nCategoria: adulto");
		}else {
			System.out.println("\nComando inválido");
		}
		
	}

}
