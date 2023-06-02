import java.util.Arrays;
import java.util.Scanner;

public class IntroJava {
    public static void main(String[] args) {

        Mujer m = new Mujer('M');
        Hombre h = new Hombre('H');
        
        // h.sexo = 'H';
        // m.sexo = 'M';

        m.setNombre("Ana");
        h.setNombre("Ronny");
        m.setEdad(0);
        h.setEdad(0);

       
        System.out.println(m.getNombre() + " sexo "+ m.getSexo());
        System.out.println(h.getNombre() + " sexo "+ h.getSexo());
        m.setEdad(20);
        h.setEdad(20);
        m.decirEdad();
        h.decirEdad();

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