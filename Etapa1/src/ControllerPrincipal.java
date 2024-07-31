import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class ControllerPrincipal extends Custos {
    
    

    @FXML
    private RadioButton ButtonAr;

    @FXML
    private RadioButton ButtonCurtina;

    @FXML
    private RadioButton ButtonLampadas;

    @FXML
    private RadioButton ButtonTV;

    @FXML
    private ComboBox<String> ComboBox;

    @FXML
    private Button buttonCalcular;

    @FXML
    private Button buttonLimpar;

    @FXML
    private Label label;

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
    void botaoArSelecionados(ActionEvent event) {
        textAr.setDisable(!ButtonAr.isSelected());
    }

    @FXML
    void botaoCurtinaSelecionados(ActionEvent event) {
        textCurtinas.setDisable(!ButtonCurtina.isSelected());
    }

    @FXML
    void botaoLampadasSelecionados(ActionEvent event) {
        textLampadas.setDisable(!ButtonLampadas.isSelected());
    }

    @FXML
    void botaoTvSelecionados(ActionEvent event) {
        textTV.setDisable(!ButtonTV.isSelected());
    }

    @FXML
    void botaoCalcularClicado(ActionEvent event) {
        // Suponha que os valores dos TextField são números inteiros
        int qtdLampadas = textLampadas.getText().isEmpty() ? 0 : Integer.parseInt(textLampadas.getText());
        int qtdArCondicionados = textAr.getText().isEmpty() ? 0 : Integer.parseInt(textAr.getText());
        int qtdCortinasAutomaticas = textCurtinas.getText().isEmpty() ? 0 : Integer.parseInt(textCurtinas.getText());
        int qtdTVs = textTV.getText().isEmpty() ? 0 : Integer.parseInt(textTV.getText());

        resultado.setText("Custo de Instalação: R$ " + calcularCustoInst(qtdLampadas, qtdArCondicionados, qtdCortinasAutomaticas, qtdTVs)
        + "\nCusto de Manutenção anual: R$" + calcularCustoManu(qtdLampadas, qtdArCondicionados, qtdCortinasAutomaticas, qtdTVs));
    }

    @FXML
    void botaoLimparClicado(ActionEvent event) {
        textAr.clear();
        textCurtinas.clear();
        textLampadas.clear();
        textTV.clear();

        this.qtdArCondicionados = 0;
        this.qtdCortinasAutomaticas = 0;
        this.qtdLampadas = 0;
        this.qtdTVs = 0;

        // Desabilita os TextFields novamente
        textAr.setDisable(true);
        textCurtinas.setDisable(true);
        textLampadas.setDisable(true);
        textTV.setDisable(true);

        //Limpar Label resultados:
        resultado.setText("resultado");
    }

    @FXML
    public void initialize() {
        ComboBox.getItems().addAll(
            "Acre", "Tocantins", "Maranhão", "Bahia", "Rondônia", "Goiás", 
            "Minas Gerais", "Paraná", "São Paulo", "Mato Grosso do Sul", 
            "Mato Grosso", "Alagoas", "Piauí", "Amazonas", "Rio de Janeiro", "Pará", "outros"
        );

        // Inicialmente, desabilita todos os TextFields
        textAr.setDisable(true);
        textCurtinas.setDisable(true);
        textLampadas.setDisable(true);
        textTV.setDisable(true);

        // Adiciona listeners aos RadioButtons para habilitar os TextFields
        ButtonAr.setOnAction(this::botaoArSelecionados);
        ButtonCurtina.setOnAction(this::botaoCurtinaSelecionados);
        ButtonLampadas.setOnAction(this::botaoLampadasSelecionados);
        ButtonTV.setOnAction(this::botaoTvSelecionados);
    }
}
