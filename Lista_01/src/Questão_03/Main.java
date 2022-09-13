package Questão_03;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int soma;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = sc.nextInt();
		System.out.println("Digite o primeiro numero: ");
		num2 = sc.nextInt();
		System.out.println("Digite o primeiro numero: ");
		num3 = sc.nextInt();
		
		soma = num1 + num2 +  num3;
				
		System.out.println("Soma dos tres numeros: " + soma);
		
		sc.close();
	}

}
