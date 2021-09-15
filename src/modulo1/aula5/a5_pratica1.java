package modulo1.aula5;

import java.util.Scanner;

public class a5_pratica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=========Cadastro de clientes==========\n");

        System.out.println("\t 1-Cadastrar cliente");
        System.out.println("\t 2-Cadastrar listar");
        System.out.println("\t 0-Sair");
        System.out.print("\t\nEscolha uma opção do menu:\n");


        int op = sc.nextInt();
        sc.nextLine();

        switch (op) {
            case 1:

                boolean invalido = true;
                String nome = "";
                do {
                    System.out.print("Digite o nome do cliente: ");
                    nome = sc.nextLine();
                    if (nome.length() < 3) {
                        System.out.println("O nome deve ter mais que 3 caracteres");
                        System.out.println("Digite novamente o nome");
                    } else {
                        invalido = false;
                    }
                }while (invalido);

                invalido = true;

                String sobrenome = "";
                do {
                    System.out.print("Digite sobrenome do cliente: ");
                    sobrenome = sc.nextLine();
                    if (sobrenome.length() < 3) {
                        System.out.println("O nome deve ter mais que 3 caracteres");
                        System.out.println("Digite novamente o nome");
                    } else {
                        invalido = false;
                    }
                }while (invalido);

                invalido = true;

                String rg = "";
                do {
                    System.out.print("Digite o RG do cliente: ");
                    rg = sc.nextLine();
                    if (rg.length() < 3) {
                        System.out.println("O RG deve ter mais que 4 caracteres");
                        System.out.println("Digite novamente o RG");
                    } else {
                        invalido = false;
                    }
                }while (invalido);

                invalido = true;

                String cpf = "";
                do {
                    System.out.print("Digite o CPF do cliente: ");
                    cpf = sc.nextLine();
                    if (cpf.length() < 11) {
                        System.out.println("O CPF deve ter mais que 11 caracteres");
                        System.out.println("Digite novamente o cpf");
                    } else {
                        invalido = false;
                    }
                }while (invalido);

                System.out.printf("Nome: %s \nSobrenome: %s \nRG: %s \nCPF: %s\n", nome, sobrenome, rg, cpf);

                System.out.printf("Cadastro realizado com sucesso!\n");

                break;

            case 2:
                System.out.println("Cliente sendo listado.");
                break;

            case 0:
                System.out.println("Saindo ...");
                break;

            default:
                System.out.println("Opcao invalida");
                break;
        }
    }
}



