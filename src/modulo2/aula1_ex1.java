package modulo2;

public class aula1_ex1 {
    public static void main(String[] args){

        System.out.println("================= ARMAZENANDO NOME - WHILE ===========================");

        String nome = "Bruna";
        String sobrenome = "Bittencourt";
        int contador = 0;

        while(contador < 10){
            contador ++;
            System.out.printf("\n%d. Meu nome é: %s %s", contador, nome, sobrenome);
        }
    }
}
