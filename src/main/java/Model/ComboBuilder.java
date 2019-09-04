/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author naty9
 */
public class ComboBuilder extends Combo implements IBuilder<Combo>{
    
    ComboBuilder(ArrayList<Producto> productos){
        
        super(productos);
    }
    
    

    @Override
    public Combo build() {
        return new Combo(super.getProductos());
    }

}
