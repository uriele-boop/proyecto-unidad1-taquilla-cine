/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad1.recursividad;

/**
 *
 * @author mi pc
 */
public class recursividad {
    public int factorial(int f){
        //caso base 
        if(f==0){
            return 1;
        }
        saludo();
        System.out.println("va de ida con la llamada "+ f);
        //caso recursivo
        int r=f*factorial(f-1);
        System.out.println("va de vuelta con la llamada : "+f);
        return r;
        
    }
    //int[] x={10,10,5,10};
    public int sumarArr(int[] arr,int i){
        if(i==arr.length){
            return 0;
        }
        int res=arr[i]+sumarArr(arr,i+1);
        return res;
    }
    
    public static void saludo(){
        System.out.println("Hola");
    }
}
