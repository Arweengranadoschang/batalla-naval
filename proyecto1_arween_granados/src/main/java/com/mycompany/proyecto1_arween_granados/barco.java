/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_arween_granados;

import javafx.scene.shape.Rectangle;

/**
 *
 * @author Estudiante UNA
 */
public class barco extends Rectangle {
    
    public int tamano;
    public boolean horizontal= true;
    
    
    public barco(int _tamano){
    
        this.tamano= _tamano;
   
    
    }
    
    public void cambiar_orientacion(){
       horizontal=!horizontal;
              
}
       
    
}
