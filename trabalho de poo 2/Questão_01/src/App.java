/*Faça um programa que execute as operações básicas de uma calculadora.
Leia dois valores numéricos e um símbolo; caso o símbolo seja um dos
relacionados a seguir efetue a operação correspondente com os valores
digitados pelo usuário; caso contrário, digite a mensagem “Operador
inválido!”. Símbolos: + soma, - subtração, * multiplicação, / divisão.
Atenção para a divisão por 0.
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        char sinal;
        double resultado;

        System.out.print("Digite o primeiro numero: ");
        num1 = sc.nextDouble();
        System.out.print("Digite o segundo numero: ");
        num2 = sc.nextDouble();
        System.out.print("\n[*] = multiplicação [/] = divisão\n[+] = soma [-] = subtração\nDigite o operador logico: ");
        sinal = sc.next().charAt(0);

        if(sinal == '*'){
            resultado = num1 * num2;
            System.out.println(resultado);
        }
        if(sinal == '/'){
            resultado = num1 / num2;
            System.out.println(resultado);
        }
        if(sinal == '+'){
            resultado = num1 + num2;
            System.out.println(resultado);
        }
        if(sinal == '-'){
            resultado = num1 - num2;
            System.out.println(resultado);
        }else{
            System.out.println("Operado invalido!!!!");
        }




        sc.close();
    }
}