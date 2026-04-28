package pctExercicio4;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Arthur";
		System.out.println("nome em ordem correta");
		for (int i = 0; i <nome.length();i++) {
			System.out.println(nome.charAt(i));
		}
		System.out.println("nome em ordem inversa");
		for (int i = nome.length() - 1; i >= 0; i--) {
			System.out.println(nome.charAt(i));
		}
	}
}
