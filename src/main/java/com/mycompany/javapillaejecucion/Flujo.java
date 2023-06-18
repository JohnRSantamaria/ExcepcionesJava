/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapillaejecucion;

/**
 *
 * @author ResetStoreX
 */
public class Flujo {

    public static void main(String[] args) {
        System.out.println("Inicio main");
        try {
            metodo1();
        } catch (MiExcepcion e) {
            e.printStackTrace();
        }
        System.out.println("Fin Main");
    }   
               
    private static void metodo1() throws MiExcepcion{
        System.out.println("Inicio metodo 1");
        
        metodo2();
        System.out.println("Fin del metodo 1");
    }           
    private static void metodo2() throws MiExcepcion{
        System.out.println("Inicio metodo 2");
               
        System.out.println("Fin del metodo 2");
    }           
}
