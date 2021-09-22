//Modulo 2 - Aula 9 - Procedimento, Funções e Métodos
//SRP - Single-Responsability Principle - Principio da responsabilidade única

package modulo2.Aula9;

import java.util.Scanner;

public class a9_1_metodos {
    public static void main(String[] args) {
        //chamando o metodo imprimir_nome e passando dois argumentos do tipo string
        imprimir_nome("Bruna", "Costa");
        String nc = retorna_nome_completo("Bruna", "Costa");
        double taxa = converte_taxa_juro(2);
        System.out.println(taxa);
    }

    // Metodo imprimir_nome - que recebe dois parametros string e tem retorno void
    static void imprimir_nome(String nome, String sobrenome){
        System.out.printf("%s %s \n", nome, sobrenome);
    }

    static String retorna_nome_completo(String nome, String sobrenome){
        String nome_completo = nome + " " + sobrenome;
        return nome_completo;
    }

    static double converte_taxa_juro(int juros_int){
        double juros_double = juros_int;
        double percentual = juros_double/100;
        return percentual;
    }
}
