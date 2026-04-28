package pctExercicio3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("digite um numero");
		String numerodouser = sc.nextLine();
		
		int numcaracteres = numerodouser.length();
		System.out.println("numero de caracteres" + numcaracteres);
		
		for (int i = 0; i < numcaracteres; i++){
            char caracteres = numerodouser.charAt(i);
            
            if (caracteres == '1'){
                numero++;
            	}		
            }
		System.out.println("numero de 1's " + numero);
		sc.close();
		
		}
	}