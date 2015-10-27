/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.uttt.artefact.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Erik Guerrero Bravo Version 1.0.0
 */
public class Venta implements Serializable{

    private int id;
    private String numeroVenta;
    private Date fechaVenta;
    private String status;
    private List<DetalleVenta> detalleVenta;
    private Cliente cliente;

    public Venta(String numeroVenta, Date fechaVenta, List<DetalleVenta> detalleVenta, Cliente cliente) {
        this.numeroVenta = numeroVenta;
        this.fechaVenta = fechaVenta;
        this.detalleVenta = detalleVenta;
        this.cliente = cliente;
    }

    public Venta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(String numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<DetalleVenta> getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(List<DetalleVenta> detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    
}
