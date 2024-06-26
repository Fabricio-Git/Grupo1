import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class ControllerPrincipal {
    @FXML
    private ComboBox<String> ComboBox;

    @FXML
    private Button buttonCalcular;

    @FXML
    private Button buttonLimpar;

    @FXML
    private Label label;

    @FXML
    private RadioButton radioButtonAr;

    @FXML
    private RadioButton radioButtonCurtina;

    @FXML
    private RadioButton radioButtonLampadas;

    @FXML
    private RadioButton radioButtonTV;

    @FXML
    private Label resultado;

    @FXML
    private TextField textAr;

    @FXML
    private TextField textCurtinas;

    @FXML
    private TextField textLampadas;

    @FXML
    private TextField textTV;

    @FXML
    void botaoCalcularClicado(ActionEvent event) {

    }

    @FXML
    void botaoLimparClicado(ActionEvent event) {

    }
    @FXML
    public void initialize() 
    {
        ComboBox.getItems().addAll(
            "Acre", "Tocantins", "Maranhão", "Bahia", "Rondônia", "Goiás", 
            "Minas Gerais", "Paraná", "São Paulo", "Mato Grosso do Sul", 
            "Mato Grosso", "Alagoas", "Piauí", "Amazonas", "Rio de Janeiro", "Pará", "outros"
        );
    }

}

