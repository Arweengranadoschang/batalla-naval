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
public class dificultadesController implements Initializable {

    @FXML
    private AnchorPane fondo_dificultades;
    @FXML
    private ImageView imagen_dificultades;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        imagen_dificultades.fitHeightProperty().bind(fondo_dificultades.heightProperty());
        imagen_dificultades.fitWidthProperty().bind(fondo_dificultades.widthProperty());
    }    

    @FXML
    private void switchToModos(ActionEvent event)throws IOException {
        App.setRoot("modos");
    
    }
    
}
