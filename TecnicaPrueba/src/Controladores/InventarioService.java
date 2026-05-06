
package Controladores;

import Modelo.Producto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ANGEL
 */
public class InventarioService {
    
    Validaciones v= new Validaciones();
    ArrayList<Producto> producto = new ArrayList<>();
    int contadorId = 1;
    
    public void agregar_producto(){
        System.out.println("Ingresa el nombre del producto: ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Ingresa el Precio del producto: ");
        double precio = new Scanner(System.in).nextDouble();
        System.out.println("Ingrese la cantidad del Stock: ");
        int stock = new Scanner(System.in).nextInt();
        
        Producto nuevoPro = new Producto(
        contadorId,nombre,precio,stock
        );
        
        producto.add(nuevoPro);
        
        System.out.println("Producto agregado con exito!!!!");
    }

    
    public void ver_productos(){
        
        for(Producto pro : producto){
            ver(pro);
        }
        
        
    }

    public void ver(Producto pro){
    if(pro != null){
        System.out.printf("ID:  \n Nombre:  \n Precio: \n Stock: ",
                pro.getId(),
                pro.getNombre(),
                pro.getPrecio(),
                pro.getCantidadStock());
    }
}
    public void buscarId(int id){
    for(Producto pro : producto){
        if(id == pro.getId()){
            System.out.println(pro);
            return; 
        }
    }
    System.out.println("Producto no encontrado");
}
    
    
    
}
