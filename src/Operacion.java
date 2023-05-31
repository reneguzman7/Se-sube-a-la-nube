public class Operacion {
    public Operacion() {
        System.out.println("Operacion lista para trabajar..........");
    }

      /**
     * <b>division</b> Metodo que realiza la division de dos numeros
     * @param a: numero entero
     * @param b: numero entero
     */
    public void division(int a, int b) {
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
     * @param a: numero entero
     * @param b: numero entero
     */
    public void multiplicacion(int a, int b) {
        int c;
        c= a * b;
        System.out.println("La multiplicacion es: " + c);
    }

    /**
     * <b>resta</b> Metodo que realiza la resta de dos numeros
     * @param a: numero entero
     * @param b: numero entero
     */
    public void resta(int a, int b) {
        int c;
        c= a - b;
        System.out.println("La resta es: " + c);
    }

    /**
     * <b>suma</b> Metodo que realiza la suma de dos numeros
     * @param a: numero entero
     * @param b: numero entero
     */
    public void suma(int a, int b) {
        int c;
        c= a+b;
        System.out.println("La suma es: " + c);
    }






}
