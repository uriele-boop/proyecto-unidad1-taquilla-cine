/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd;

/**
 * Práctica: Creacion de un tipo de dato abstracto
 * Materia: Estructura de Datos.
 * Integrantes:
 *  - Ángel Uriel Espinoza Alvarado
 *  - Soto de la Cruz Oscar Abdiel
 * Grado y grupo: 4 C
 */
public class ConsumoVehiculo {
   //Atributos privados
    private double kilometrajeInicial;
    private double kilometrajeFinal;
    private double combustibleInicial;
    private double combustibleFinal;
    private int diasTrabajados;
    
    // Constructores
    // El constructor por defecto
    public ConsumoVehiculo() {
        this.kilometrajeInicial = 0.0;
        this.kilometrajeFinal = 0.0;
        this.combustibleInicial = 0.0;
        this.combustibleFinal = 0.0;
        this.diasTrabajados = 1;
    }

    // Constructor con valores iniciales
    public ConsumoVehiculo(double kilometrajeInicial, double kilometrajeFinal, 
                           double combustibleInicial, double combustibleFinal, 
                           int diasTrabajados) {
        
        // Validar kilometraje inicial
        if (kilometrajeInicial >= 0) {
            this.kilometrajeInicial = kilometrajeInicial;
        } else {
            this.kilometrajeInicial = 0.0;
        }

        // Validar kilometraje final
        if (kilometrajeFinal >= this.kilometrajeInicial) {
            this.kilometrajeFinal = kilometrajeFinal;
        } else {
            this.kilometrajeFinal = this.kilometrajeInicial;
        }

        // Validar combustible inicial
        if (combustibleInicial >= 0) {
            this.combustibleInicial = combustibleInicial;
        } else {
            this.combustibleInicial = 0.0;
        }

        // Validar combustible final
        if (combustibleFinal >= 0) {
            if (combustibleFinal <= this.combustibleInicial) {
                this.combustibleFinal = combustibleFinal;
            } else {
                this.combustibleFinal = 0.0;
            }
        } else {
            this.combustibleFinal = 0.0;
        }

        // Validar días trabajados (entre 1 y 7)
        if (diasTrabajados >= 1) {
            if (diasTrabajados <= 7) {
                this.diasTrabajados = diasTrabajados;
            } else {
                this.diasTrabajados = 1;
            }
        } else {
            this.diasTrabajados = 1;
        }
    }
    // GETTERS (Lectura de valores)

    public double getKilometrajeInicial() {
        return this.kilometrajeInicial;
    }

    public double getKilometrajeFinal() {
        return this.kilometrajeFinal;
    }

    public double getCombustibleInicial() {
        return this.combustibleInicial;
    }

    public double getCombustibleFinal() {
        return this.combustibleFinal;
    }

    public int getDiasTrabajados() {
        return this.diasTrabajados;
    }

    // SETTERS (Modificación con validación)
    public void setKilometrajeInicial(double kilometrajeInicial) {
        if (kilometrajeInicial >= 0) {
            this.kilometrajeInicial = kilometrajeInicial;
        }
    }

    public void setKilometrajeFinal(double kilometrajeFinal) {
        if (kilometrajeFinal >= this.kilometrajeInicial) {
            this.kilometrajeFinal = kilometrajeFinal;
        }
    }

    public void setCombustibleInicial(double combustibleInicial) {
        if (combustibleInicial >= 0) {
            this.combustibleInicial = combustibleInicial;
        }
    }

    public void setCombustibleFinal(double combustibleFinal) {
        if (combustibleFinal >= 0) {
            if (combustibleFinal <= this.combustibleInicial) {
                this.combustibleFinal = combustibleFinal;
            }
        }
    }

    public void setDiasTrabajados(int diasTrabajados) {
        if (diasTrabajados >= 1) {
            if (diasTrabajados <= 7) {
                this.diasTrabajados = diasTrabajados;
            }
        }
    }

    //MÉTODOS DE NEGOCIO (Operaciones del TDA)

    // Distancia recorrida en el día
    public double calcularKilometrosRecorridos() {
        return this.kilometrajeFinal - this.kilometrajeInicial;
    }

    // Gasolina consumida en el día
    public double calcularGasolinaGastada() {
        return this.combustibleInicial - this.combustibleFinal;
    }

    // Eficiencia: kilómetros avanzados por cada litro
    public double calcularRendimiento() {
        double gasolinaGastada = calcularGasolinaGastada();
        if (gasolinaGastada > 0) {
            return calcularKilometrosRecorridos() / gasolinaGastada;
        }
        return 0.0;
    }

    // Gasolina consumida estimada para toda la semana
    public double calcularConsumoSemanal() {
        return calcularGasolinaGastada() * this.diasTrabajados;
    }
}
