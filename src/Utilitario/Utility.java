package Utilitario;

import java.util.Scanner;

public class Utility {
        public int getNumeroPositivo(String Label){
        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.println(Label);
        do{
            numero = sc.nextInt();
        }while (numero < 0);
        sc.close();

        return numero;       
    }
}
