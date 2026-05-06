
package tecnicaprueba;

import VISTA.Main;
import java.util.Scanner;

/**
 *
 * @author ANGEL
 */
public class TecnicaPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido a la tienda de prueba: ");
        System.out.println("Escoge una opcion: ");
        System.out.println("1. Menu principal ");
        System.out.println("2. Salir ");
        int op= new Scanner(System.in).nextInt();
        if (op == 1){
            Main main = new Main();
            main.iniciar();
        } else{
            System.out.println("Hasta luego, vuelve pronto!!!");
        }
    }

}
