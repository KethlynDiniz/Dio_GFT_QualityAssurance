/*Desafio
O gerente de uma loja resolveu aplicar descontos em todos os seus produtos! 
A tarefa é calcular a Porcentagem de Desconto aplicada a esses produtos. 
*/

import java.util.Scanner;


public class Desconto {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
		
	    int M = input.nextInt();
	    int D = input.nextInt();
	    
	    int desconto = 100-((D*100)/M);
	    
	    System.out.println("O desconto foi de " + desconto + "%");
	    
	}

}
