package pctExercicio2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite uma palavra");
		String txt = sc.nextLine();
		String invertida = new StringBuilder(txt).reverse().toString();
		System.out.println(invertida);
	sc.close();
	}
}