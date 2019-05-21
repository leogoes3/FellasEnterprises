/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerMenus;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Leonardo
 */
public class FXMLMenuConsultasController implements Initializable {

       @FXML
    private JFXButton conclientes;

    @FXML
    private JFXButton concolaboradores;

    @FXML
    private JFXButton conproduto;

    @FXML
    private JFXButton contipo;

    @FXML
    private Pane pnlconsultas;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
