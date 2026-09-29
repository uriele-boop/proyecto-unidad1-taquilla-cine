/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad1.proyecto;

/**
 *
 * autor: Angel Uriel Espinoza Alvarado
 */
public class tdaBoletoVip extends tdaBoletoCine {
    // Atributo del tda que va ayudarnos a hacer el costo adicional
    private double accesoVip;

    // Constructor que reutiliza la inicializacion de la clase base con super(...)
    public tdaBoletoVip(String folio, String cliente, int edad, String pelicula, int cantBoletos, double precioBoleto, double accesoVip) {
        super(folio, cliente, edad, pelicula, cantBoletos, precioBoleto);
        this.accesoVip = accesoVip;
    }

    // Polimorfismo: sobreescribe el calculo final sumando el costo del beneficio VIP
    @Override
    public double calcularTotal() {
        return super.calcularTotal() + this.accesoVip;
    }

    // Metodo de acceso para el valor del beneficio VIP
    public double getAccesoVip() {
        return accesoVip;
    }
}
