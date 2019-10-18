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
import javax.validation.constraints.*;

/**
 *
 * @author Michael Cardenas
 * clase bean controlador del formulario 2
 * con alcance mientras este viva la solicitud
 * se valida los atributos por anotaciones
 */
@Named(value = "formularioDos")
@RequestScoped
public class FormularioDos implements Serializable{
    
    
    /**
     * atributo que guarda el nombre que se digite en la caja de texto
     * se valida que no pueda estar vacia
     * se valida la longitud de caracteres
     */
    @NotNull(message = "No puede estar vacio")
    @Size(min = 5, max = 40, message = "Debe estar entre 5 y 40 letras")
    private String  nombre;
    
    
    /**
     * atributo que guarda la edad que se digite en la caja de texto
     * valida que no pueda estar vacio
     * determina un valor minimo de 18  y maximo de 80
     */
    @NotNull(message = "No puede estar vacio")
    @Min(value = 18,message = "Es mayor de 18 años")@Max(value = 80,message = "Menor a 80 años")
    private byte edad;
    
    
    /**
     * atributo que guarda el correo que se digite en la caja de texto
     * se valida que no pueda estar vacia
     * se valida que lo ingresado corresponda a una secuencia de correo electronico
     */
    @NotNull(message = "No puede estar vacio")
    @Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",message = "No es un correo valido")
    private String correo;
    
    /**
     * atributo que guarda el ceular que se digite en la caja de texto
     * se valida que no pueda estar vacia
     * se valida la longitud maxima de caracteres a ingresar que en este caso son 10
     */
    @NotNull(message = "No puede estar vacio")
    @Size(min = 10, max = 10, message = "solo 10 digitos")
    private String celular;
    
    /**
     * atributo que guarda la fecha que se digite en la caja de texto
     * se valida que no pueda estar vacia
     * se valida que la fecha no sea mayor a la actual
     */
    @NotNull(message = "No puede estar vacio") @Past(message = "la fecha no puede ser mayor a la actual")
    private Date fecha;
    
    
    /**
     * atributo que guarda el sueldo que se digite en la caja de texto
     * se valida que no este vacio
     * que el minimo valor que ingrese sea de 1 
     */
    @NotNull(message = "No puede estar vacio") @Min(value = 1, message = "no puede ser cero")
    private double sueldo;
    
    /**
     * Creates a new instance of FormularioDos
     * Constructor de la clase vacio
     */
    public FormularioDos() {
    }
    
    
    /**
     * metodo que se dirige a la pagina del formulario uno
     * @return el nombre del formulario uno
     */
    public String redireccionar(){
        return"formularioUno";
    }
    
    
    /**
     * metodos publicos para acceder a los atributos provados encapsulados desde otras clases
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
