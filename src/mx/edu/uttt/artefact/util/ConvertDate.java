/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.uttt.artefact.util;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Erik Guerrero BRavo Version 1.0.0
 */
public abstract class ConvertDate {
        
    public static String ConvertDate(Date fecha)
    {
         SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
         return  formatDate.format(fecha);
    }
    
    public static String getHoraActual()
    {
        Date horaActual = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("hh:mm:ss");
        return formatDate.format(horaActual);
    }
}
