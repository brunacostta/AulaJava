package modulo1.aula4;

import java.util.Scanner;

public class cadastro_idade {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=========Cadastro de Clientes==========\n");

        System.out.print("\tDigite o nome e o sobrenome do cliente: ");
        String cliente = sc.nextLine();

        System.out.print("\tDigite a idade do cliente: ");
        int idade = sc.nextInt();

        if(idade >= 18){
            System.out.printf("\tO(A) cliente %s com %s anos de idade, foi inserido com sucesso.",cliente, idade);
        }else{
            System.out.printf("\tO(A) Cliente com %s anos de idade, não pode ser cadastrado, pois não atingiu a idade mínima de 18 anos.", idade);
        }
    }
}