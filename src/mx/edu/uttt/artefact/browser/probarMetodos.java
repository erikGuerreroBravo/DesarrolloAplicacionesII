/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.uttt.artefact.browser;
import javax.swing.JOptionPane;
import mx.edu.uttt.artefact.domain.*;
import mx.edu.uttt.artefact.validators.validarProducto;
import mx.edu.uttt.artefact.validators.validator;
/**
 *
 * @author Erik Guerrero Bravo Version 1.0.0
 */
public class probarMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Productos producto = new Productos();
        validator.ValidarObjectNull("proveedores");
        
        if(validarProducto.validarInstancia(producto))
        {
            JOptionPane.showMessageDialog(null,"La instancia  es correcta");
        }
        
    }
    
}
