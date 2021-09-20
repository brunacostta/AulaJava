package modulo2;

public class aula1_ex5 {
    public static void main(String[] args){

        System.out.println("========== VALOR INVESTIMENTO ============");

        double investimento = 5000;
        double juros = 0.02;

        for(double i= 1; i <=24; i++){
           double resultado = investimento * juros;
           investimento += resultado;

           System.out.printf("Mês: %.0f - Valor do investimento: R$ %.2f\n",i,investimento);
        }
    }
}
