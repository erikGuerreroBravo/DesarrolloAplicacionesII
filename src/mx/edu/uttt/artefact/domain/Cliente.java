/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.uttt.artefact.domain;
import java.io.Serializable;

/**
 *
 * @author Erik Guerrero Bravo Version 1.0.0
 */
public class Cliente implements Serializable{
    
   private int id;
   private String RfcCliente;
   private String nombre;
   private String apellidoPaterno;
   private String apellidoMaterno;
   private String edad;
   private String fechaNacimiento;

    public Cliente(int id, String RfcCliente, String nombre, String apellidoPaterno, String apellidoMaterno, String edad, String fechaNacimiento) {
        this.id = id;
        this.RfcCliente = RfcCliente;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Cliente(String RfcCliente) {
        this.RfcCliente = RfcCliente;
    }

   
    
    public Cliente() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the RfcCliente
     */
    public String getRfcCliente() {
        return RfcCliente;
    }

    /**
     * @param RfcCliente the RfcCliente to set
     */
    public void setRfcCliente(String RfcCliente) {
        this.RfcCliente = RfcCliente;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidoPaterno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * @param apellidoPaterno the apellidoPaterno to set
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * @return the apellidoMaterno
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * @param apellidoMaterno the apellidoMaterno to set
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
   
    
}
