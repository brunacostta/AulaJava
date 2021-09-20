package modulo2;

public class aula1_ex4 {
    public static void main(String[] args){

        System.out.println("========== Contador Nrº PRIMOS =============");

        for (int contador=0; contador <= 150; contador++){
            boolean primo = true;
            for (int i = 2; i < contador; i++) {
                if (contador % i == 0) {
                    primo = false;
                }
            }if(primo) {
                System.out.println(contador);
            }
        }
    }
}
