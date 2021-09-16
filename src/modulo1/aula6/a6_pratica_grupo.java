package modulo1.aula6;

import java.util.Scanner;

public class a6_pratica_grupo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================== Cadastro de Devs ================= ");
        System.out.println("================== Digite o numero correspondente à opção desejada ================= ");
        System.out.println("1 - Cadastrar Dev ");
        System.out.println("2 - Cadastrar Linguagem ");
        System.out.println("0 - Sair ");

        int escolha = sc.nextInt();
        sc.nextLine();

        switch (escolha) {
            case 1:
                boolean invalido = true;
                do {
                    System.out.println("Digite o nome do desenvolvedor: ");
                    String nome = sc.nextLine();
                    if (nome.length() < 3) {
                        System.out.println("O nome deve ter, no minimo, três (3) caracteres. ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);

                invalido = true;
                do {
                    System.out.println("Digite o sobrenome do desenvolvedor ");
                    String sobrenome = sc.nextLine();
                    if (sobrenome.length() < 3) {
                        System.out.println("O sobrenome deve ter, no minimo, três (3) caracteres. ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);

                invalido = true;
                while (invalido) {
                    System.out.println("Digite a senioridade do desenvolvedor: ");
                    String senioridade = sc.nextLine();
                    if (senioridade.length() < 3) {
                        System.out.println("A senioridade deve ter no mínimo, 3 dígitos.  ");
                    } else {
                        invalido = false;
                    }
                }
                while (invalido) ;

                invalido = true;
                do {
                    System.out.println("Digite a idade do dev: ");
                    int idade = sc.nextInt();
                    if (idade < 1) {
                        System.out.println("Idade invalida. Insira a sua idade novamente.  ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);

                System.out.printf("Parabens, o dev foi cadastrado com sucesso!");
                break;

            case 2:
                invalido = true;
                do {
                    System.out.println("Digite o nome da linguagem ");
                    String nomeLing = sc.nextLine();
                    if (nomeLing.length() < 3) {
                        System.out.println("O nome da linguagem deve ter, no minimo, três (3) caracteres. ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);

                invalido = true;
                do {
                    System.out.println("Digite a descricao da linguagem ");
                    String descricao = sc.nextLine();
                    if (descricao.length() < 3) {
                        System.out.println("A descricao da linguagem deve ter, no minimo, três (3) caracteres. ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);

                invalido = true;
                System.out.println("================== Escolha a aplicacao a ser cadastrada ================= ");
                System.out.println("1 - Front-End ");
                System.out.println("2 - Back-End ");
                System.out.println("3 - Mobile ");

                int opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Opcao escolhida: Front-End. ");
                        System.out.printf("Parabens, a linguagem foi cadastrado com sucesso!");
                        break;
                    case 2:
                        System.out.println("Opcao escolhida: Back-End. ");
                        System.out.printf("Parabens, a linguagem foi cadastrado com sucesso!");
                        break;
                    case 3:
                        System.out.println("Opcao escolhida: Mobile. ");
                        System.out.printf("Parabens, a linguagem foi cadastrado com sucesso!");
                        break;

                    default:
                        System.out.println("Opcao invalida. Digite uma opcao valida. ");
                        opcao = sc.nextInt();
                        do{
                            if (opcao > 3) {
                                System.out.println("Digite novamente: ");
                                opcao = sc.nextInt();
                                sc.nextLine();
                            } else {
                                System.out.println("Cadastro realizado com sucesso!");
                                invalido = false;
                            }
                        }while (invalido);

                            System.out.printf("Parabens, a linguagem foi cadastrado!");
                        }
                        break;
            case 0:
                System.out.println("Saindo do programa...");
                break;

            default:
              System.out.println("Opcao invalida. ");
              break;
        }
    }
}

