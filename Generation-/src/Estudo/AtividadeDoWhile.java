package Estudo;

import java.util.Scanner;

public class AtividadeDoWhile {

	public static void main(String[] args) {
		
		/*PROGRAMA QUE LÊ NÚMEROS ATÉ SER DIGITADO O NÚMERO
         ZERO, QUE AO FIM MOSTRA A SOMA DOS NÚMEROS DIGITADOS */
		
		int number,soma=0;
		
		 Scanner leia = new Scanner(System.in);
		 
		 
		 do {
			 System.out.println("\nDigite um número: ");
			 number = leia.nextInt();
			 soma += number;
			
		 }while(number!=0);
		 System.out.println("\nSoma dos números digitados: "+soma);
		 }  

     }


