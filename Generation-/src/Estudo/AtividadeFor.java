package Estudo;

import java.util.Scanner;

public class AtividadeFor {

	public static void main(String[] args) {
		
		// PROGRAMA QUE LÊ 10 NÚMEROS E INFORMA QUANTOS SÃO PARES E ÍMPARES.

			int number,ContPar=0,ContImpar=0;
			
			Scanner leia = new Scanner(System.in);
			
			for(int i=1;i<11;i++) {
			System.out.println("\nDigite o "+i+"º número: ");
			number = leia.nextInt();
			 if(number % 2 == 0) {
				      ContPar++;
				    	     
			}else if(number % 2 != 0){
				      ContImpar++; 
			}
			}
			System.out.println("\n-----------------------------------");
			System.out.println("\nQuantidade de números pares: "+ContPar);
			System.out.println("\nQuantidade de números ímpares: "+ContImpar);
		}  

	}