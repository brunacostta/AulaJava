package modulo1.aula4;

import java.util.Scanner;

public class a4_1_Produto {

    public static void main(String[] args){

       // boolean verdade = true; //1 - com sinal eletrico - pulso eletrico
       // boolean falso = false; //0 - sem sinal eletrico
       // int sa = (int)10.9999;
        //boolean ve = 1;
        //boolean fa = 0;

        int n1 = 18;
        int n2 = 6;

        if(n1 > n2){
            System.out.println("Maior");
        }else if(n1 < n2){
            System.out.println("Menor");
        }else{
            System.out.printf("Igual");
        }
    }
}
