/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapillaejecucion;

/**
 *
 * @author ResetStoreX
 */
public class Conexion implements AutoCloseable {

   public Conexion() {
       System.out.println("Abriendo conexion");
   }

   public void leerDatos() {
       System.out.println("Recibiendo datos");
       throw new IllegalStateException();
   }

   public void cerrar() {
       System.out.println("Cerrando conexion");
   }

    @Override
    public void close() throws Exception {
        cerrar();
    }

}
