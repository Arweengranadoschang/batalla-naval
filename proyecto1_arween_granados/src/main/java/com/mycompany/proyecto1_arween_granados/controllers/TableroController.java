/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.proyecto1_arween_granados.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;




/**
 * FXML Controller class
 *
 * @author Estudiante UNA
 */
public class TableroController implements Initializable {

    @FXML
    private Pane contenedor_barcos;
    @FXML
    private GridPane tablero;

    private double posicion_x,posicion_y;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        for(Node nodo:contenedor_barcos.getChildren()){
        if(nodo instanceof Rectangle){
        mover_barco((Rectangle)nodo);
        }
        
        }
    }    
    
    private void mover_barco(Rectangle barco){
        
    barco.setOnMousePressed(event ->{
        
    posicion_x=event.getX();
    posicion_y=event.getY();
    });
    
    barco.setOnMouseDragged(event ->{
        
    barco.setLayoutX(event.getSceneX() - posicion_x);
    barco.setLayoutY(event.getSceneY() - posicion_y);
    });
    
    barco.setOnMouseReleased(event ->{
        
    int columna= (int) ((event.getSceneX()- tablero.getLayoutX())/100);
    int fila= (int) ((event.getSceneY()-tablero.getLayoutY())/30);
    
    if(columna >= 0 && columna <9 && fila >=0 && fila<9){
    
    tablero.getChildren().remove(barco);
    tablero.add(barco, columna, fila);
    };
  
    });
    

    
    };
}
