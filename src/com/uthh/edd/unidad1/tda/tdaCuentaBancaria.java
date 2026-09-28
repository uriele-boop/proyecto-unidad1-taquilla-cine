/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad1.tda;

/**
 *
 * @author mi pc
 */
public class tdaCuentaBancaria {
     private float Saldo;
    private String NumCuenta;
    private String Titular;
    
    //Constructores 
    //Constructor por default
    public tdaCuentaBancaria(){
        Saldo=0.0f;
        NumCuenta="****************";
        Titular="Desconocido";        
    }
    
    //constructor con parametros 
    public tdaCuentaBancaria(String titular, String cuenta, float saldo){
        if(saldo>=0){
            Saldo=saldo;
        }else{
            Saldo=0.0f;    
        }
        NumCuenta=cuenta;
        Titular=titular;
    }
    
    //constructor copia 
    public tdaCuentaBancaria(tdaCuentaBancaria copia){
        Saldo=copia.Saldo;
        NumCuenta=copia.NumCuenta;
        Titular=copia.Titular;
    }
    
    //constructor en caso de que solo se tenga el num de cuenta y el nombre del titular
    public tdaCuentaBancaria(String titular, String cuenta){
        Saldo=0.0f;
        NumCuenta=cuenta;
        Titular=titular;
    }
    
    /*Propiedades(Saldo solo la propiedad get pero la llamaremos Consulta Saldo )
    Titular get 
    num de cuenta get 
    */
    
    public String getTitular(){
        return Titular;
    }
    
    public String getNumCuenta(){
        return NumCuenta;
    }
    
    //funciones 
    public boolean Depositar(float cantidad){
        if(cantidad<=0){
            return false;
        }
        Saldo=Saldo+cantidad;
        return true;
    }
    
    public boolean Retirar(float cantidad){
        if(cantidad <=0){
            return false;
        }
        
        if(cantidad>Saldo){
            return false;
        }
        Saldo-=cantidad;
        return true;
    }
    
    public float ConsultarSaldo(){
        return Saldo;
    }
}
