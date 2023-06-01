import java.util.Arrays;
import java.util.Scanner;

public class IntroJava {
    public static void main(String[] args) {

        Mujer m = new Mujer();
        Hombre h = new Hombre();

        m.setNombre("Ana");
        h.setNombre("Ronny");

        System.out.println(m.getNombre());
        System.out.println(h.getNombre());



        // var str = Arrays.toString(args);

        // if (!args[0].toString().equalsIgnoreCase("hello world")) {
        //     System.exit(0);
        // }


        // // int a = 0, b=0, c=0;
        // // Scanner sc = new Scanner(System.in);

        // // System.out.print("Ingrese el a y b: ");
        // // a = Integer.parseInt(sc.nextLine());
        // // // System.out.print("Ingrese el segundo numero: ");
        // // b = Integer.parseInt(sc.nextLine());

        // // OperacionPares op = new OperacionPares(a,b);
        // // op.suma();
        // // op.resta();
        // // op.multiplicacion();
        // // op.division();
        // // sc.close();

    }

  
}