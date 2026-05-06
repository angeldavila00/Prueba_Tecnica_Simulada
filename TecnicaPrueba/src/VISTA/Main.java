
package VISTA;

import Controladores.InventarioService;
import Controladores.Validaciones;

/**
 *
 * @author ANGEL
 */
public class Main {
    public void iniciar(){
       
        Validaciones v = new Validaciones();
        InventarioService f = new InventarioService();
        int op =0;
        
            
        do {
            op = v.validacion_entero("============================\n1- Registrar producto\n2- Mostrar productos registrados\n3- Buscar por Id \n4- Salir",1, 4);
            switch(op){
                case 1 -> f.agregar_producto();
                case 2 -> f.ver_productos();
                case 3 -> f.buscarId(op);
               
            }
        } while (op != 4);
    }
    

}
