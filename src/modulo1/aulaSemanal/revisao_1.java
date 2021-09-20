package modulo1.aulaSemanal;

public class revisao_1 {
    public static void main(String[] args){
        String nome = "";
        int numero = 10;
        //byte,short, long
        //float, double = 0.0
        //if else if esl
        int contador = 0;
        while (contador <= 10){
            System.out.println(contador);
            contador = contador + 1;
            //contadot += 1;
            //contador ++;
        }
        System.out.println(contador);

        String nome1 = "";
        String sobrenome = "";
        byte idade = 0;
        double altura = 1.82;

        System.out.printf(
                // %s== String
                // %d== valores inteiros - int, byte, short, long
                // %f== ponto flutuante - float, double
                "O nome é %s, o sobrenome %s e a idade %d e altura %.2f",
                nome1, sobrenome, idade, altura
        );

    }
}
