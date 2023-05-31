public class OperacionPares {

    private int a, b;

    // Constructor
    public OperacionPares(int a, int b) {
        if ((a % 2 != 0) || (b % 2 != 0)) {
            this.a = 0;
            this.b = 0;
        }else{
            this.a = a;
            this.b = b;
        }


        System.out.println("Operacion lista para trabajar..........");
    }

      /**
     * <b>division</b> Metodo que realiza la division de dos numeros
     */
    public void division() {
        int c;
        if (b > 0){
        c= a / b;
        System.out.println("La division es: " + c);
        } else {
            System.out.println("No se puede dividir por 0");
        }
    }

    /**
     * <b>multiplicacion</b> Metodo que realiza la multiplicacion de dos numeros
     */
    public void multiplicacion() {
        int c;
        c= a * b;
        System.out.println("La multiplicacion es: " + c);
    }

    /**
     * <b>resta</b> Metodo que realiza la resta de dos numeros
     */
    public void resta() {
        int c;
        c= a - b;
        System.out.println("La resta es: " + c);
    }

    /**
     * <b>suma</b> Metodo que realiza la suma de dos numeros
     */
    public void suma() {
        int c;
        c= a+b;
        System.out.println("La suma es: " + c);
    }


}
