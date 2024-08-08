import java.util.HashMap;
import java.util.Map;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;
/* Durante a análise do código, identificamos a possibilidade de uma refatoração que poderia melhorar a 
organização sendo ela dividir o controller em dois. */
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

    // Mapa de preços base
    private Map<String, Float> precosBase = new HashMap<>();

    @FXML
    public void initialize() {
        // Inicializa a tabela de valores base
        inicializarPrecosBase();

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
    
    private void inicializarPrecosBase() {
        precosBase.put("Ar-Condicionado", 700f);
        precosBase.put("TV", 120f);
        precosBase.put("Assistente Virtual", 300f);
        precosBase.put("Câmeras", 450f);
        precosBase.put("Cortina", 320f);
        precosBase.put("Irrigacao", 1400f);
        precosBase.put("Lâmpadas", 100f);
        precosBase.put("Sistema de Segurança", 2500f);
        precosBase.put("Sistema de Som", 420f);
    }

    //Botão Adicionar
    @FXML
    void startAdicionar(ActionEvent event) {
        try
        {
            adicionarDispositivo(radioButtonAr, textAr, "Ar-Condicionado");
            adicionarDispositivo(radioButtonTV, textTV, "TV");
            adicionarDispositivo(radioButtonAssistente, textAssistente, "Assistente Virtual");
            adicionarDispositivo(radioButtonCameras, textCameras, "Câmeras");
            adicionarDispositivo(radioButtonCortina, textCurtinas, "Cortina");
            adicionarDispositivo(radioButtonIrrigacao, textIrrigacao, "Irrigação");
            adicionarDispositivo(radioButtonLampadas, textLampadas, "Lâmpadas");
            adicionarDispositivo(radioButtonSom, textSom, "Sistema de Som");
            adicionarDispositivo(radioButtonSeguranca, textSeguranca, "Sistema de Segurança");

    } catch (NumberFormatException e) 
    {
        showAlert("Erro", "Por favor, insira um número Inteiro.");
    }

    }

    //Verifica se o Radiobutton está ligado e adiciona na lista.
    private void adicionarDispositivo(RadioButton radioButton, TextField textField, String nome) 
    {
        if (radioButton.isSelected()) {
            int quantidade = Integer.parseInt(textField.getText());
            Dispositivos dispositivo = new Dispositivos(nome, quantidade, 00f, 00f);
            dispositivos.add(dispositivo);
        }
    }

    //Botões de Eventos (Calcular, Limpar, Garantia)
    @FXML
    void startCalcular(ActionEvent event) {
        Dispositivos[] dpsCalcular = dispositivos.toArray(new Dispositivos[0]);
        calcular("V", dpsCalcular);
    }

    @FXML
    void startLimpar(ActionEvent event) {
        dispositivos.clear();
        LimparTudo();
    }

    @FXML
    void startGarantia(ActionEvent event) {
        Dispositivos[] dpsCalcular = dispositivos.toArray(new Dispositivos[0]);
        calcular("G", dpsCalcular);
    }
    //MÉTODOS:

    // Envia e chama o metodo calcular no modelo
    private void calcular(String tipo, Dispositivos[] dpsCalcular) {

            for (Dispositivos dispositivo : dpsCalcular) {
                String nome = dispositivo.getTableAparelhos();
                float precoBase = precosBase.getOrDefault(nome, 0f);
                dispositivo.calcular(tipo, precoBase);
            }
        
    // Atualiza a tabela para mostrar os preços calculados
        Table.refresh();
    }

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