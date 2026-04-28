package pctExercicio2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("digite uma palavra");
		
		String user = sc.nextLine();

        String userlower = user.toLowerCase();
        
        String reverse = new StringBuilder(userlower).reverse().toString();
        if (userlower.equals(reverse)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        sc.close();
    }
}