/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad1.arreglos;

import com.uthh.edd.unidad1.tda.tdaCuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author mi pc
 */
public class arreglos {
     
    public void ejemplo(){
        //declaracion de los arreglos 
        int[] calificaciones={8,7,9,10,6,8,8};
        
        //declaramos el arreglo
        tdaCuentaBancaria[] cuentas;
        //inicializando el arreglo
        cuentas= new tdaCuentaBancaria[4];
        
        //acceso a los elemntos 
        //cuentas[0]=new tdaCuentaBancaria("Luis alberto", "552233664411",5000.00f);
        
        //capturamos nuestras cuentas con un ciclo
        
        for(tdaCuentaBancaria cliente:cuentas){
            
            Scanner lectura= new Scanner(System.in);
            System.out.println("Captura el Nombre del cliente");
            String nombre= lectura.nextLine();
            System.out.println("Captura Numero de cuenta");
            String cuenta= lectura.nextLine();
            System.out.println("Captura el Saldo inicial");
            float saldo= Float.parseFloat(lectura.nextLine());
            cliente= new tdaCuentaBancaria(nombre, cuenta, saldo);
        }
        

        int contador=1;
        System.out.println("Las calificaciones de jose luis son ...");
        for(int cal:calificaciones){
            System.out.println("Calificacion "+ contador + ": "+cal);
            contador++;
        }
    }
    
}
