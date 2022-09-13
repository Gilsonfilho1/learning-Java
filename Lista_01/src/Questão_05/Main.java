package Questão_05;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float num;
		float divisao;
		
		System.out.println("Digite um numero real: ");
		num = sc.nextFloat();
		
		divisao = num / 5;
		
		System.out.println("A divisao do numero " + num + " por 5 eh: " + divisao);
		
		sc.close();

	}

}
