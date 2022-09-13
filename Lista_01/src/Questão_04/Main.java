package Questão_04;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float num;
		float quadrado;
		
		System.out.println("Digite um numero real: ");
		num = sc.nextFloat();
		
		quadrado = num * num;
		
		System.out.println("O quadrado do numero: " + num + " eh: " + quadrado);
		
		
		
		sc.close();
	}

}
