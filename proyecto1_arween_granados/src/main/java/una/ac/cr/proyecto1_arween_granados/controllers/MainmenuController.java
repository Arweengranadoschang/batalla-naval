/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package una.ac.cr.proyecto1_arween_granados.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author henry
 */
public class MainmenuController implements Initializable {

    @FXML
    private AnchorPane root;
    @FXML
    private ImageView imageBackground;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        imageBackground.fitHeightProperty().bind(root.heightProperty());
        imageBackground.fitWidthProperty().bind(root.widthProperty());
    }    
    
}
