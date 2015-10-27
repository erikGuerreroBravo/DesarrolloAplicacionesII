/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.uttt.artefact.domain;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Erik Guerrero Bravo version 1.0.0
 */
public class DetalleVenta implements Serializable{
 
    private Date fechaVenta;
    private double total;
    private int cantidad;
    private Productos producto;

    public DetalleVenta(Date fechaVenta, double total, int cantidad, Productos producto) {
        this.fechaVenta = fechaVenta;
        this.total = total;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    
    public DetalleVenta() {
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }
    
    
}
