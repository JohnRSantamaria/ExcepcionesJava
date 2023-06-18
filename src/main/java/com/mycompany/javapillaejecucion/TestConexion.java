/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapillaejecucion;

/**
 *
 * @author ResetStoreX
 */
public class TestConexion {
    public static void main(String[] args) {
        Conexion con = new Conexion();
        
        try {
            con.leerDatos();            
        } catch (IllegalStateException ex) {
            ex.printStackTrace();
        }
    }
}
