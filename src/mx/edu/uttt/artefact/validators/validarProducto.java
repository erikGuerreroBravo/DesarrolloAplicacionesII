/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.uttt.artefact.validators;
import mx.edu.uttt.artefact.domain.Productos;
/**
 *
 * @author Programer
 */
public abstract class validarProducto {

    private static boolean respuesta = false;
    
    public static boolean validarInstancia(Object obj)
    {
        if(obj instanceof Productos )
        {
            respuesta = true;
        }
        return respuesta;
    }
    
}
