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

        public static void showLoadingBarra(int sizeBarra) throws InterruptedException{
            char[] barra = new char[sizeBarra];         
            float porcentaje = (float)100/(float)sizeBarra;
            for (int i = 0; i < sizeBarra; i++) 
                barra[i] = ' ';

            for (int i = 0; i <= sizeBarra; i++) {
                if(i < sizeBarra-1)
                    barra[i] = '#';
                StringBuilder sbBarra = new StringBuilder("").append(barra);
                System.out.print(String.format("\r [%s] %3.0f %% ", sbBarra, i*porcentaje));

                Thread.sleep(delay);
            }
        }
            
        
        // UNA LINEA
        public static void showLoading() throws InterruptedException { // posiciones en el array
            String strChar = "\\|/-"; // [ \ | / - |]
            for (int i = 0; i < 101; i++) {         
                System.out.print(String.format("\r %s %d %% ", strChar.charAt(i % strChar.length()), i));
                Thread.sleep(delay);
            }
        }
}
