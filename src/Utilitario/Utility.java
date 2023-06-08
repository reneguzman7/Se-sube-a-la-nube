package Utilitario;

import java.text.Format;
import java.util.Scanner;

public class Utility {

    private static final int delay = 200;

    static Scanner sc = new Scanner(System.in);

        public static int getNumeroPositivo(String Label){
        int numero;

        System.out.println(Label);
        do{
            numero = Integer.parseInt(sc.nextLine());
        }while (numero < 0);
        sc.close();

        return numero;       
    }

        public static void showLoadingBarra() throws InterruptedException{
            char[] barra = new char[20];
            String str = "";
            
            for (int i = 0; i < 20; i++) 
                str += " ";

            for (int i = 0; i < 20; i++) {
                
                str = str + "#" + str.substring(i, str.length());

                System.out.print(String.format("\r [%s] %3d %% ", str, i));

                Thread.sleep(delay);
            }
        }
            
        

        public static void showLoading() throws InterruptedException { // posiciones en el array
            String strChar = "\\|/-"; // [ \ | / - |]
            for (int i = 0; i < 101; i++) {         
                System.out.print(String.format("\r %s %d %% ", strChar.charAt(i % strChar.length()), i));
                Thread.sleep(delay);
            }
        }
}
