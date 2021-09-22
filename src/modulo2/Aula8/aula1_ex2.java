package modulo2.Aula8;

public class aula1_ex2 {
    public static void main(String[] args) {

        System.out.println("================= ARMAZENANDO NOME - FOR ===========================");

        String nome = "Bruna";
        String sobrenome = "Bittencourt";
        int contador = 0;

        for (contador=1; contador <= 10; contador++){
            System.out.printf("\n%d. Meu nome é: %s %s", contador, nome, sobrenome);
        }
    }
}
