/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;
/**
 *
 * @author derec
 */
public class Combo {
    private ArrayList<Producto> productos;
    
    public Combo(ArrayList<Producto> pro){
        this.productos = pro;
    }

    public void setProductos(ArrayList<Producto> pro){
        this.productos = pro;
    }
    public ArrayList<Producto> getProductos(){
        return this.productos ;
    }
}
