/**
 * @date 30.mayo.2k23
 * @author: reneguzman7
 * @description: primer programa en java
 */
import java.util.Scanner;

/**
 * @description: mi prime clase
 */
public class App {

    
    public static void main(String[] args) throws Exception {
        int nroSigno = 5;
        String strDelimitador = ",";
        String strFrutas = "coco,banana,piña,manzana,pera,frutilla,sandia";
        Scanner sc = new Scanner(strFrutas);
        
        usoScanner(strDelimitador, sc);
        
        secuenciaSigno(nroSigno);
        secuenciaSignoAlterna(nroSigno);
        
        
    }
    /**
     * <b>usoScanner</b>: indica como usar la libreria Scanner
     * @param strDelimitador: caracteres para hacer la segmentacion
     * @param sc: listado de frutas
     */
    public static void usoScanner(String strDelimitador, Scanner sc) {

        sc.useDelimiter(strDelimitador);
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
        sc.close();
    }
    /**
     * <b>secuenciaSigno</b>: imprime una secuencia de signos
     * @param nroSigno; cantidad de signos
     */
    public static void secuenciaSigno(int nroSigno) {
        for (int i = 0; i < nroSigno; i++) {
            System.out.print("+ ");
        }
        System.out.println("");
    }
    /**
     * <b>secuenciaSignoAlterna</b>: imprime una secuencia de signos
     * @param nroSigno
     */
    public static void secuenciaSignoAlterna(int nroSigno) {
        for (int i = 0; i < nroSigno; i++) {
            if (i % 2 == 0) 
                System.out.print(" + ");    
                
            else
                System.out.print(" - ");
        }
    } 
}
