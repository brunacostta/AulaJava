package modulo2.Aula9;

import java.util.Scanner;

public class a9_pratica_ex1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cabecalho();
        double n1 = ler_double();
        double n2 = ler_double();
        double s1 = soma(n1, n2);
        System.out.printf("O resultado da soma de %.2f com %.2f é: %.2f\n", n1, n2, s1);
        double s2 = subtracao(n1, n2);
        System.out.printf("O resultado da subtração de %.2f com %.2f é: %.2f\n", n1, n2, s2);
        double m = multiplicacao(n1, n2);
        System.out.printf("O resultado da multiplicação de %.2f com %.2f é: %.2f\n", n1, n2, m);
        double d = divisao(n1, n2);
        System.out.printf("O resultado da divisão de %.2f com %.2f é: %.2f\n", n1, n2, d);

    }
    static void cabecalho(){
        System.out.println("============= Academia - JAVA Métodos ============");
    }
    static double ler_double(){
        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();
        return numero;
    }
    static double soma(double n1, double n2){
        double resultado = n1 + n2;
        return resultado;
    }
    static double subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        return resultado;
    }
    static double multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;
        return resultado;
    }
    static double divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;
        return resultado;
    }
}
