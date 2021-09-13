package modulo1.aula3;

import java.util.Scanner;

public class cadastro_produto {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=========Cadastro de produtos==========\n");
        System.out.println("\tOlá Seja Bem-Vinda(o)! \n Digite as informações do produto.\n");
        System.out.print("\tDigite o nome do produto: ");
        String produto = sc.nextLine();
        System.out.print("\tDigite a descrição do produto: ");
        String descricao = sc.nextLine();
        System.out.print("\tDigite o valor do produto: ");
        Double valor = sc.nextDouble();
        System.out.print("\tDigite a a categoria do produto: ");
        String categoria = sc.next();

        System.out.printf("\tO produto %s, da categoria %s, com preço de R$ %f, com a seguinte descrição %s. Foi cadastrado com sucesso!",produto, categoria, valor, descricao);

    }
}
