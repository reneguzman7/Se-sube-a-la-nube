import java.util.ArrayList;
import java.util.Scanner;

import Utilitario.ArrayString;
import Utilitario.Utility;

public class IntroJava {
    public static void main(String[] args) throws InterruptedException {

        Utility u = new Utility();
        // * * * 
        // *   *
        // * * * 

        // Utility.showLoadingBarra(30);

        
        // int sizeFigure = Utility.getNumeroPositivo("Ingrese el tamaño de la figura: ");

        // for (int f = 1; f <= sizeFigure; f++) {
        //     for (int c = 1; c <= sizeFigure; c++) {
        //         if (f == 1 || c==1 || c == sizeFigure || f == sizeFigure) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print(" ");
        //         }

        //     }
        //     System.out.println("");
        // }

        ArrayString a = new ArrayString();
        a.ArraysFull();

        ArrayList<Mujer> listaMujeres = new ArrayList<>();

        Mujer m1 = new Mujer('F',"Karen");
        Mujer m2 = new Mujer('F',"Nahomy");
        Mujer m3 = new Mujer('F',"Sara");

        // System.out.println(m1.getNombre());
        // System.out.println(m2.getNombre());
        // System.out.println(m3.getNombre());

        listaMujeres.add(m1);
        listaMujeres.add(m2);
        listaMujeres.add(m3);
        listaMujeres.add(new Mujer('F', "Ana"));
        m3.setNombre("Sarita");

        for (Mujer mujer : listaMujeres) {
            System.out.println(mujer.getNombre());
        }


        // explicacionHerencia();

    }

    private static void explicacionHerencia() {
        Mujer m = new Mujer('M', null);
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