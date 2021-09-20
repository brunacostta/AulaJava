package modulo1.aulaSemanal;

import java.util.Scanner;

public class revisao_ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("================= CADASTRO DE USUÁRIOS ===========================");

        for(int usuario=1; usuario < 5; usuario++) {
            System.out.printf("Digite o nome do usuário: \n");
            String nome = sc.next();
            System.out.printf("Digite o seu sobrenome: \n");
            String sobrenome = sc.next();

            System.out.printf("\tUsuario %d. %s %s \n", usuario, nome, sobrenome);
        }

        System.out.println("\tCadastro realizado com sucesso!");
    }
}
