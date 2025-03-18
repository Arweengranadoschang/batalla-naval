package una.ac.cr.proyecto1_arween_granados;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;

public class menu {
    
    public String dificultades;
    
    @FXML
    public void presionarInicio(ActionEvent event) {
    
        System.out.println("el juego a comenzado");     
}
    
    @FXML
    public void presionarDificultad(ActionEvent event) {
    
        System.out.println("el juego a comenzado");    
}
    
    @FXML
    public void presionarSalir(ActionEvent event) {
    
        System.out.println("se esta cerrando el juego"); 
        System.exit(0);   
}
}
