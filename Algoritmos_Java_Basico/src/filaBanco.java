/*Desafio
Elabore um programa que simule uma fila de atendimento bancário. 
O programa deve ler o nome de 3 pessoas (clientes do banco), armazenando-os em uma fila.
*/

import java.util.Scanner;

public class filaBanco {

	public static void main(String[] args) {
		
    String[] nomesFila = new String[3]; 
	Scanner scan = new Scanner(System.in);
	String nome;
	
		// TODO Auto-generated method stub
	  for (int i = 0; i < nomesFila.length; i++) {
          nome = scan.next();
          nomesFila[i] = nome;
          System.out.println(nomesFila[i] + " - esta na posicao: " + (i + 1));
      }

	}

}
