/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.proyecto1_arween_granados.controllers;

import com.mycompany.proyecto1_arween_granados.App;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DialogPane;
import java.io.IOException;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;




/**
 * FXML Controller class
 *
 * @author Estudiante UNA
 */
public class menuController implements Initializable {

    @FXML
    private Button boton_inicio;
    @FXML
    private AnchorPane fondo;
    @FXML
    private ImageView imagen_fondo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        imagen_fondo.fitHeightProperty().bind(fondo.heightProperty());
        imagen_fondo.fitWidthProperty().bind(fondo.widthProperty());
    }    

    @FXML
    private void switchToDificultades(ActionEvent event)throws IOException {
        App.setRoot("dificultades");
    }

    @FXML
    private void acerca_de(ActionEvent event) {
     
   Alert informacion = new Alert(AlertType.INFORMATION);
   
   informacion.setTitle("informacion");
   
   informacion.setContentText("curso: Programacion 2 "+"Estudiante: Arween Granados "+"ciclo 1 año 2025");
   
   
   DialogPane dialogpane= informacion.getDialogPane();
  
   dialogpane.setPrefSize(400,250);
   
   
   informacion.showAndWait();
   
        
        
        
    }

    @FXML
    private void salir(ActionEvent event) {
        System.exit(0);
    }

    
}
