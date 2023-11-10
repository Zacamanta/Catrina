/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import com.google.gson.Gson;
import java.util.List;

/**
 *
 * @author omar_
 */
public class Cuenta {

    private String producto;
    private String cuenta;
    private String clabe;
    private String moneda;
    private Cliente cliente;
    private List<Datos> movimientos;
    private List<Datos> movimientosOp;

    public Cuenta deserializar(String json) {
        Cuenta deserializado = new Cuenta();

        try {

            deserializado = new Gson().fromJson(json, Cuenta.class);
        } catch (Exception ex) {
            System.err.print("Ocurrió un error: " + ex.getMessage());
        }

        return deserializado;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Datos> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Datos> movimientos) {
        this.movimientos = movimientos;
    }

    public List<Datos> getMovimientosOp() {
        return movimientosOp;
    }

    public void setMovimientosOp(List<Datos> movimientosOp) {
        this.movimientosOp = movimientosOp;
    }

}
