package Estudo;

import java.util.Scanner;

public class AtividadeMatriz {

	public static void main(String[] args) {
		
         Scanner ler = new Scanner(System.in);
        
         int [][] numbers = new int[3][3];
         
         int linha, coluna, contMaior=0;
         
         for(linha=0;linha < 3; linha++){
        	 for(coluna=0;coluna<3;coluna++) {
        		 System.out.println("\nEntre com um número: ");
        		 numbers[linha][coluna] =ler.nextInt();
        		 
        		 if(numbers[linha][coluna] > 10) {
        			 contMaior++;
        		 }
        	 }
         }
         System.out.println("\nQuantidade de números maiores que dez: "+contMaior);
         
         
	}

}
