package br.com.fiap;

import br.com.fiap.model.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField textFieldNome;
    @FXML private TextField textFieldEmail;
    @FXML private PasswordField passwordField;
    @FXML private ChoiceBox<String> choiceBoxPerfil;

    public void salvar(){
        var usuario = new Usuario(
                textFieldNome.getText(), 
                textFieldEmail.getText(), 
                passwordField.getText(), 
                choiceBoxPerfil.getValue()
            );
        System.out.println(usuario);
    }

}