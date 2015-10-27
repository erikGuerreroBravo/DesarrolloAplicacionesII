/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.uttt.artefact.validators;

import java.lang.reflect.Field;

/**
 *
 * @author Erik Guerrero Bravo Version 1.0.0
 */
public abstract class validator {
    
    public static boolean ValidarObjectNull(Object obj)
    {
        boolean respuesta = false;
        
        if(!obj.getClass().getPackage().toString().equals(obj.getClass().getName()))
        {
            System.out.println("La instancia es:" + obj.getClass().getPackage());
            System.out.println("La instancia es:" + obj.getClass().getName());
        }
        if(Object.class.isInstance(obj) )
        {
           
          if(!obj.getClass().getTypeName().equals("") )
          { 
            System.out.println("La instancia es:" + obj.getClass().getName());
            respuesta = true;  
          }
         
        }
         return respuesta;
    }

   

}
