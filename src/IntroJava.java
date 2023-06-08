import java.util.Scanner;
import Utilitario.Utility;

public class IntroJava {
    public static void main(String[] args) throws InterruptedException {

        Utility u = new Utility();
        // * * * 
        // *   *
        // * * * 

        Utility.showLoadingBarra();

        
        int sizeFigure = Utility.getNumeroPositivo("Ingrese el tamaño de la figura: ");

        for (int f = 1; f <= sizeFigure; f++) {
            for (int c = 1; c <= sizeFigure; c++) {
                if (f == 1 || c==1 || c == sizeFigure || f == sizeFigure) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");


            

        }





        // explicacionHerencia();

    }

    private static void explicacionHerencia() {
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