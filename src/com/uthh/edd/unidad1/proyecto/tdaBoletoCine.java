/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad1.proyecto;

public class tdaBoletoCine {
    
    // Atributos privados
    private final String folio;
    private String cliente;
    private int edad;
    private String pelicula;
    private int cantBoletos;
    private double precioBoleto;
    
    // Constructor para inicializar los datos capturados en el formulario
    public tdaBoletoCine(String folio, String cliente, int edad, String pelicula, int cantBoletos, double precioBoleto) {
        this.folio = folio;
        this.cliente = cliente;
        this.edad = edad;
        this.pelicula = pelicula;
        this.cantBoletos = cantBoletos;
        this.precioBoleto = precioBoleto;
    }

    // Valida que el cliente tenga la edad segun la clasificacion de la pelicula
    public boolean validarEdad(char clasificacion) {
        if (clasificacion == 'A') {
            return true;
        }
        if (clasificacion == 'B' && this.edad >= 12) {
            return true;
        }
        if (clasificacion == 'C' && this.edad >= 18) {
            return true;
        }
        return false;
    }

    // Valida que la cantidad de boletos este en el rango permitido
    public boolean validarCantidadBoletos() {
        if (this.cantBoletos >= 1 && this.cantBoletos <= 10) {
            return true;
        }
        return false;
    }

    // Calcula el costo de los boletos
    public double calcularSubtotal() {
        return this.cantBoletos * this.precioBoleto;
    }
    //Metodo recursivo
    // Descuento $10 acumulativos por entrada si compra 3 o mas boletos
    public double calcularDescuentoRecursivo(int n) {
        //  si no alcanza el minimo de 3 entradas, no aplica descuento
        if (this.cantBoletos < 3) {
            return 0.0;
        }
        
        // CASO BASE: cuando se terminaron de contabilizar los boletos
        if (n <= 0) {
            return 0.0;
        }
        
        // CONDICION DE AVANCE: descuento del boleto actual ($10) + calculo de las entradas restantes (n - 1)
        return 10.0 + calcularDescuentoRecursivo(n - 1);
    }

    // Retorna el total a pagar aplicando el descuento si es que cumple con lo requerido
    public double calcularTotal() {
        return calcularSubtotal() - calcularDescuentoRecursivo(this.cantBoletos);
    }

    // Getters para consular la informacion
    public String getFolio() {
        return folio;
    }

    public String getCliente() {
        return cliente;
    }

    public int getEdad() {
        return edad;
    }

    public String getPelicula() {
        return pelicula;
    }

    public int getCantBoletos() {
        return cantBoletos;
    }

    public double getPrecioBoleto() {
        return precioBoleto;
    }
}
