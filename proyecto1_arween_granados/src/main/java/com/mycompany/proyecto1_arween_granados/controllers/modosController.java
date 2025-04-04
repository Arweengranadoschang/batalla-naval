/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.proyecto1_arween_granados.controllers;

import com.mycompany.proyecto1_arween_granados.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Estudiante UNA
 */
public class modosController implements Initializable {

    @FXML
    private AnchorPane fondo_modos;
    @FXML
    private ImageView imagen_modos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        imagen_modos.fitHeightProperty().bind(fondo_modos.heightProperty());
        imagen_modos.fitWidthProperty().bind(fondo_modos.widthProperty());
    }    

    @FXML
    private void switchToTablero(ActionEvent event)throws IOException {
         App.setRoot("tablero");
    }
    
}
