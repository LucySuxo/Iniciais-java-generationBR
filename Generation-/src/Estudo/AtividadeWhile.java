package Estudo;

import java.util.Scanner;

public class AtividadeWhile {

	public static void main(String[] args) {
		
		/*PROGRAMA DE PESQUISA DE UMA EMPRESA PARA SABER AS CARACTERÍSTICAS PSICOLÓGICAS DOS INDIVÍDUOS DE UMA REGIÃO, 
		150 PESSOAS PARA SEREM ENTREVISTADAS */
		

		int Age,Sex,Behavior,ContPessYougs=0,ContPessYougsCalm=0,ContPessOlds=0,ContPessOldsNerv=0,ContFem=0,ContMas=0,ContOut=0,ContFemCalm=0,ContFemNerv=0,ContFemAgre;
		int ContMasCalm=0,ContMasNerv,ContMasAgre=0,ContOutCalm=0,ContOutNerv,ContOutAgre,i=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nComece a sua pesquisa psicológica!");
			
		while(i>=0 && i<150)  {  //AO DIGITAR "0" O PROGRAMA ENCERRA E MOSTRA O RESULTADO.
			i++;
			
	    System.out.println("\nColoque a idade: ");
    	Age = leia.nextInt();
    	
    	
    	if(Age>0 && Age<18) {
		    ContPessYougs++;
	   }else if(Age>40) {
		   ContPessOlds++;
	   } 
    	
		System.out.println("\nColoque o  sexo:  \n 1- Feminino \n 2- Masculino \n 3- Outros ");
		Sex = leia.nextInt();
		if(Sex==1) {
			       ContFem++;
		} else if(Sex == 2){
			       ContMas++;
		} else if(Sex == 3) {
			       ContOut++;
		}else{
			  System.out.println("\nComando ínvalido, tente novamente!");
		}
		
		System.out.println("\nColoque seu comportamento:  \n 1- Calmo(a) \n 2- Nervoso(a) \n 3- Agressivo(a) ");
		Behavior = leia.nextInt();
		if(Behavior==1) {
		       ContFemCalm = ContFem * 1;
		       ContMasCalm = ContMas * 1;
		       ContOutCalm = ContOut * 1;
		       ContPessYougsCalm = ContPessYougs * 1;
	    } else if(Behavior == 2){
	    	   ContFemNerv = ContFem * 1;
		       ContMasNerv = ContMas * 1;
		       ContOutNerv = ContOut * 1;
		       ContPessOldsNerv = ContPessOlds * 1;
	    } else if(Behavior == 3) {
	    	   ContFemAgre = ContFem * 1;
		       ContMasAgre = ContMas * 1;
		       ContOutAgre = ContOut * 1;
	    }else{
		  System.out.println("\nComando ínvalido, tente novamente!");
	    }
		 
		
		} 
    	
	
		System.out.println("\n-------------------------------------------------");
		System.out.println("\n                   Resultados: ");
		System.out.println("\nNúmero de pessoas calmas: "+(ContMasCalm+ContFemCalm+ContOutCalm));
		System.out.println("\nNúmero de mulheres nervosas: "+ContFemNerv);
		System.out.println("\nNúmero de homens agressivos: "+ContMasAgre); 
		System.out.println("\nNúmero de outros calmos: "+ContOutCalm);
		System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos: "+ContPessOldsNerv);
		System.out.println("\nNúmero de pessoas nervosas com menos de 18 anos: "+ContPessYougsCalm);
	}}

