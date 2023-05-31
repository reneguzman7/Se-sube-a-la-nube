import java.util.Scanner;

public class IntroJava {
    public static void main(String[] args) {
        int a = 0, b=0, c=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el a y b: ");
        a = Integer.parseInt(sc.nextLine());
        // System.out.print("Ingrese el segundo numero: ");
        b = Integer.parseInt(sc.nextLine());

        OperacionPares op = new OperacionPares(a,b);
        op.suma();
        op.resta();
        op.multiplicacion();
        op.division();
        sc.close();

    }

  
}