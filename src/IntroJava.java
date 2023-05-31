import java.util.Scanner;

public class IntroJava {
    public static void main(String[] args) {
        int a = 0, b=0, c=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el a y b: ");
        a = Integer.parseInt(sc.nextLine());
        // System.out.print("Ingrese el segundo numero: ");
        b = Integer.parseInt(sc.nextLine());

        if ((a % 2 != 0) || (b % 2 != 0)) 
            System.exit(0);
        

        Operacion.suma(a, b);
        Operacion.resta(a, b);
        Operacion.multiplicacion(a, b);
        Operacion.division(a, b);
        
        sc.close();

    }

  
}