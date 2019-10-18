/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.controlador;

import java.io.Serializable;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Michael Cardenas
 * clase Controlador Bean de la vista del formulario 1
 * con alcance mientras la peticion este viva
 */
@Named(value = "formularioUno")
@RequestScoped
public class FormularioUno implements Serializable{

    /**
     * atributo que guarda el nombre que escriba en la caja de texto
     */
    private String  nombre;
    
    /**
     * atributo que guarda la edad que escriba en la caja de texto
     */
    private byte edad;
    
    /**
     * atributo que guarda el correo que escriba en la caja de texto
     */
    private String correo;
    
    /**
     * atributo que guarda el celular que escriba en la caja de texto
     */
    private long celular;
    
    /**
     * atributo que guarda la fecha que escriba en la caja de texto
     */
    private Date fecha;
    
    /**
     * atributo que guarda el sueldo que escriba en la caja de texto
     */
    private double sueldo;
    
    /**
     * Creates a new instance of FormularioUno
     * constructor de la clase vacio
     */
    public FormularioUno() {
    }
    
    /**
     * metodo que dirige a la pagiina del formulario dos
     * @return el nombre del formulario dos
     */
    public String redireccionar(){
        return "formularioDos";
    }
            

     /**
     * metodos publicos para acceder a los atributos encapsulados
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    } 
}
