package Questão_06;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float temp;
		float fahrenheit;
		
		System.out.println("Digite uma temperatura em Celsius: ");
		temp = sc.nextFloat();
		
		fahrenheit =  (float) ((temp * 9/5) + 32.0);
		
		System.out.println("Essa temperatura em graus Fahrenheit eh: " + fahrenheit);
		
		
		
		
		
		sc.close();

	}

}
