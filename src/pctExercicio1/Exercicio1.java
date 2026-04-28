package pctExercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String palavrauser;
		int vogais = 0;
		
		System.out.println("Digite uma String abaixo:");
		palavrauser = sc.nextLine();
		
		String palavrauserMaiusculo = palavrauser.toUpperCase();
		int numerodeletras = palavrauser.length();
		System.out.println("Sua string deu " + numerodeletras + "caracteres");
		System.out.println("Sua string em maiúsculo " + palavrauserMaiusculo);

		
		for(int i=0 ; i <numerodeletras; i++) {
		char caracteres = palavrauserMaiusculo.charAt(i);
		
		if (caracteres == 'A' || caracteres == 'E' || caracteres == 'I' || caracteres == 'O' || caracteres == 'U'){
		vogais++;
		}
	}	
		System.out.println("Numero de vogais na sua String" + vogais);
		sc.close();
		
			
	}
}
