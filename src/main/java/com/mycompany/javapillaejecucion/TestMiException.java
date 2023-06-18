/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapillaejecucion;


/**
 *
 * @author ResetStoreX
 */
public class TestMiException {
    public static void main(String[] args) throws  Exception  {
        
        /*
        Cuenta cuenta = new Cuenta();
        try {
            cuenta.deposita();
        } catch (MiExcepcion ex) {
           ex.printStackTrace();
        }
        */
        
        try (Conexion con = new Conexion()){
                con.leerDatos();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
        
    }
          
}
