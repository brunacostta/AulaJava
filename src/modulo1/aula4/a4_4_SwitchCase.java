package modulo1.aula4;

import java.util.Scanner;

public class a4_4_SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=========Cadastro de Streaming==========\n");

        System.out.println("\t 1-Cadastrar filme");
        System.out.println("\t 2-Cadastrar série");
        System.out.println("\t 3-Cadastrar documentário");
        System.out.println("\t 0-Sair");
        System.out.print("\t\nEscolha uma opção do menu:\n");

        int op = Integer.parseInt(sc.nextLine());

        switch (op){
            case 1:
                System.out.print("Digite o nome do filme: ");
                String filme = sc.nextLine();

                System.out.print("Digite a descrição do filme: ");
                String descricao = sc.nextLine();

                System.out.print("Digite o genero do filme: ");
                String genero = sc.nextLine();

                System.out.print("Digite o ano do filme: ");
                String ano = sc.nextLine();

                System.out.printf("\nFilme cadastrada: %s \nDescrição: %s \nGenero: %s \nAno: %s \n", filme, descricao, genero, ano);
                System.out.printf("Cadastro realizado com sucesso!\n");

                break;

            case 2:
                System.out.print("Digite o nome da serie: ");
                String serie = sc.nextLine();

                System.out.print("Digite o ano do lançamento: ");
                String anos = sc.nextLine();

                System.out.print("Digite a produtora: ");
                String produtora = sc.nextLine();

                System.out.printf("\nSérie cadastrada: %s \nAno: %s \nProdutora: %s \n", serie, anos, produtora);
                System.out.printf("Cadastro realizado com sucesso!\n");
                break;

            case 3:
                System.out.print("Digite o nome do documentario: ");
                String documentario = sc.nextLine();

                System.out.print("Digite o ano do lançamento: ");
                String anod = sc.nextLine();

                System.out.print("Digite a produtora: ");
                String produtorad = sc.nextLine();

                System.out.printf("\nDocumentário cadastrada: %s \nAno: %s \nProdutora: %s \n", documentario, anod, produtorad);
                System.out.printf("Cadastro realizado com sucesso!\n");
                break;

            case 0:
                System.out.println("Saindo do programa");
                break;

            default:
                System.out.println("Opcao invalida");
                break;
        }

    }
}
