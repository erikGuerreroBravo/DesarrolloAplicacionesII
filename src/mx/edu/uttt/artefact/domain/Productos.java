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
public class Productos implements Serializable{
    
    private int id;
    private String  nombre;
    private String  descripcion;
    private String  skuProducto;
    private String  precio;
    private String  fechaCaducidad;
    private String  identificadorLote;
    private int cantidad;

    public Productos(int id, String nombre, String descripcion, String skuProducto, String precio, String fechaCaducidad, String identificadorLote, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.skuProducto = skuProducto;
        this.precio = precio;
        this.fechaCaducidad = fechaCaducidad;
        this.identificadorLote = identificadorLote;
        this.cantidad = cantidad;
    }
    
    public Productos(int id, String nombre, String descripcion, String skuProducto, String precio, String fechaCaducidad, String identificadorLote) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.skuProducto = skuProducto;
        this.precio = precio;
        this.fechaCaducidad = fechaCaducidad;
        this.identificadorLote = identificadorLote;
    }

    public Productos(String skuProducto) {
        this.skuProducto = skuProducto;
    }

    public Productos() {
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the skuProducto
     */
    public String getSkuProducto() {
        return skuProducto;
    }

    /**
     * @param skuProducto the skuProducto to set
     */
    public void setSkuProducto(String skuProducto) {
        this.skuProducto = skuProducto;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * @return the fechaCaducidad
     */
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * @param fechaCaducidad the fechaCaducidad to set
     */
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * @return the identificadorLote
     */
    public String getIdentificadorLote() {
        return identificadorLote;
    }

    /**
     * @param identificadorLote the identificadorLote to set
     */
    public void setIdentificadorLote(String identificadorLote) {
        this.identificadorLote = identificadorLote;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
