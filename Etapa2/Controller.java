import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;

public class Controller{
    /*Todos os métodos estão no final*/

    @FXML
    private Button buttonAdicionar;

    @FXML
    private Button buttonCalcular;

    @FXML
    private Button buttonGarantia;

    @FXML
    private Button buttonLimpar;

    @FXML
    private RadioButton radioButtonAr;

    @FXML
    private RadioButton radioButtonAssistente;

    @FXML
    private RadioButton radioButtonCameras;

    @FXML
    private RadioButton radioButtonCortina;

    @FXML
    private RadioButton radioButtonIrrigacao;

    @FXML
    private RadioButton radioButtonLampadas;

    @FXML
    private RadioButton radioButtonSeguranca;

    @FXML
    private RadioButton radioButtonSom;

    @FXML
    private RadioButton radioButtonTV;

    @FXML
    private TableView<Dispositivos> Table;

    @FXML    
    private TableColumn<Dispositivos, String> TableAparelhos;

    @FXML    
    private TableColumn<Dispositivos, Float> TableEconomia;

    @FXML    
    private TableColumn<Dispositivos, Float> TablePreço;

    @FXML    
    private TableColumn<Dispositivos, Integer> TableUnidades;

    @FXML
    private TextField textAr;

    @FXML
    private TextField textAssistente;

    @FXML
    private TextField textCameras;

    @FXML
    private TextField textCurtinas;

    @FXML
    private TextField textIrrigacao;

    @FXML
    private TextField textLampadas;

    @FXML
    private TextField textSeguranca;

    @FXML
    private TextField textSom;

    @FXML
    private TextField textTV;

    //Tabela
    private ObservableList<Dispositivos> dispositivos = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        // Inicialmente desativa todos os TextFields
        desativarTudo();

        // Adiciona listeners para cada RadioButton e TextField
        habilitar(radioButtonAr, textAr);
        habilitar(radioButtonAssistente, textAssistente);
        habilitar(radioButtonCameras, textCameras);
        habilitar(radioButtonCortina, textCurtinas);
        habilitar(radioButtonIrrigacao, textIrrigacao);
        habilitar(radioButtonLampadas, textLampadas);
        habilitar(radioButtonSeguranca, textSeguranca);
        habilitar(radioButtonSom, textSom);
        habilitar(radioButtonTV, textTV);

        //tabela
        TableAparelhos.setCellValueFactory(new PropertyValueFactory<>("tableAparelhos"));
        TableUnidades.setCellValueFactory(new PropertyValueFactory<>("tableUnidades"));
        TablePreço.setCellValueFactory(new PropertyValueFactory<>("tablePreço"));
        TableEconomia.setCellValueFactory(new PropertyValueFactory<>("tableEconomia"));

        // (TABELA, adiciona os dispositivos na tabela)
        Table.setItems(dispositivos);
    }
    
    //Botão Adicionar
    @FXML
    void startAdicionar(ActionEvent event) {
        try {
            /* Verifica qual RadioButton está selecionado e processa o respectivo TextField
            Tenho certeza que existe uma forma mais eficiente de fazer isso porem não me aventurei */

            if (radioButtonAr.isSelected()) {
                int quantidadeAr = Integer.parseInt(textAr.getText());
                Dispositivos dispositivoAr = new Dispositivos("Ar Condicionado", quantidadeAr, 00f, 00f);
                dispositivos.add(dispositivoAr); 
            }

            if (radioButtonTV.isSelected()) {
                int quantidadeTV = Integer.parseInt(textTV.getText());
                Dispositivos dispositivoTv = new Dispositivos("TV", quantidadeTV, 00f, 00f);
                dispositivos.add(dispositivoTv);
            }

            if (radioButtonAssistente.isSelected()) {
                int quantidadeAssistente = Integer.parseInt(textAssistente.getText());
                Dispositivos dispositivoAssistente = new Dispositivos("Assistente Virtual", quantidadeAssistente, 00f, 00f);
                dispositivos.add(dispositivoAssistente);
            }

            if (radioButtonCameras.isSelected()) {
                int quantidadeCameras = Integer.parseInt(textCameras.getText());
                Dispositivos dispositivoCameras = new Dispositivos("Cameras", quantidadeCameras, 00f, 00f);
                dispositivos.add(dispositivoCameras);
            }

            if (radioButtonCortina.isSelected()) {
                int quantidadeCortina = Integer.parseInt(textCurtinas.getText());
                Dispositivos dispositivoCortina = new Dispositivos("Cortina", quantidadeCortina, 00f, 00f);
                dispositivos.add(dispositivoCortina);
            }
            
            if (radioButtonIrrigacao.isSelected()) {
                int quantidadeIrrigacao = Integer.parseInt(textIrrigacao.getText());
                Dispositivos dispositivoIrrigacao = new Dispositivos("Irrigacao", quantidadeIrrigacao, 00f, 00f);
                dispositivos.add(dispositivoIrrigacao);
            }

            if (radioButtonLampadas.isSelected()) {
                int quantidadeLampadas = Integer.parseInt(textLampadas.getText());
                Dispositivos dispositivoLampadas = new Dispositivos("Lampadas", quantidadeLampadas, 00f, 00f);
                dispositivos.add(dispositivoLampadas);
            }

            if (radioButtonSeguranca.isSelected()) {
                int quantidadeSeguranca = Integer.parseInt(textSeguranca.getText());
                Dispositivos dispositivoSeguranca = new Dispositivos("Segurança", quantidadeSeguranca, 00f, 00f);
                dispositivos.add(dispositivoSeguranca);
            }
            
            if (radioButtonSom.isSelected()) {
                int quantidadeSom = Integer.parseInt(textSom.getText());
                Dispositivos dispositivoSom = new Dispositivos("Sistema de Som", quantidadeSom, 00f, 00f);
                dispositivos.add(dispositivoSom);
            }        
        } 

        //Mensagem de erro se o texto não for um número válido
        catch (NumberFormatException e) {
            showAlert("Erro", "Por favor, insira um número Inteiro.");
        }
    }


    //Botões de Eventos (Calcular, Limpar, Garantia)
    @FXML
    void startCalcular(ActionEvent event) {

    }

    @FXML
    void startLimpar(ActionEvent event) {
        dispositivos.clear();
        LimparTudo();
    }

    @FXML
    void startGarantia(ActionEvent event) {

    }
    //MÉTODOS:

    // Mensagem de Erro:
    private void showAlert(String title, String message) 
    {
        Alert alerta = new Alert(AlertType.ERROR);
        alerta.setTitle("ERRO");
        alerta.setHeaderText(null);
        alerta.setContentText(message);
        alerta.showAndWait();
    }

    // Limpa todos os TextFields
    private void LimparTudo()
    {
        textAr.clear();
        textAssistente.clear();
        textCameras.clear();
        textCurtinas.clear();
        textIrrigacao.clear();
        textLampadas.clear();
        textSeguranca.clear();
        textSom.clear();
        textTV.clear();
    }

    // Desabilita todos os TextFields
    private void desativarTudo() 
    {
        textAr.setDisable(true);
        textAssistente.setDisable(true);
        textCameras.setDisable(true);
        textCurtinas.setDisable(true);
        textIrrigacao.setDisable(true);
        textLampadas.setDisable(true);
        textSeguranca.setDisable(true);
        textSom.setDisable(true);
        textTV.setDisable(true);
    }

    // Ativa e desativa os TextFields quando o radiobutton é selecionado
    private void habilitar(RadioButton radioButton, TextField textField) 
    {
        // Adiciona um listener ao RadioButton
        radioButton.selectedProperty().addListener(new ChangeListener<Boolean>() 
        {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) 
            {
                // Habilita o TextField quando o RadioButton é selecionado, e o desabilita caso contrário
                textField.setDisable(!newValue);
            }
        });
    }
}
