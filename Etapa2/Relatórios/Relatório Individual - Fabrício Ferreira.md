# Programando (Back-End):
### Durante o desenvolvimento do projeto, fiquei responsável por implementar funcionalidades na interface gráfica (tela-1.fxml). As principais tarefas incluem:
### Interatividade do Usuário: <br>
> Desenvolver a lógica que permite ao usuário inserir a quantidade de dispositivos apenas após a seleção de um tipo específico. Isso garante que as entradas do usuário sejam válidas e consistentes.
### Gerenciamento de Listas:<br> 
> Implementar a funcionalidade para adicionar os itens digitados à lista de dispositivos, permitindo uma visualização clara e organizada dos dispositivos selecionados.
### Criação dos Componentes Base:<br>
> Desenvolver os componentes fundamentais da classe Dispositivos, que serve como base para o gerenciamento dos dados relacionados aos dispositivos cadastrados pelo usuário.
## Funcionalidades Específicas:

### habilitar:<br>
Este método é responsável por associar os RadioButtons com os TextFields correspondentes. A seleção de um RadioButton habilita o TextField associado, permitindo a entrada de dados apenas para dispositivos selecionados. Isso é feito utilizando eventos de ação que monitoram a seleção dos RadioButtons.<br>
```
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
```
### desativarTudo:<br>
Um método que desativa todos os RadioButtons e, consequentemente, os TextFields relacionados. Isso é útil para redefinir o estado da interface gráfica ou ao inicializar o aplicativo, garantindo que nenhum campo esteja editável até que uma seleção seja feita.<br>
```
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
```
### showAlert:<br>
Um método que recebe duas String como parâmetros: o título do alerta e a mensagem. Ele cria um pop-up de alerta para tratamento de exceções e comunicação de erros ao usuário. Utiliza o componente Alert do JavaFX para exibir mensagens claras e informativas.<br>
```
private void showAlert(String title, String message) 
    {
        Alert alerta = new Alert(AlertType.ERROR);
        alerta.setTitle("ERRO");
        alerta.setHeaderText(null);
        alerta.setContentText(message);
        alerta.showAndWait();
    }
```
### LimparTudo:<br>
Um método simples que limpa todos os campos dos TextFields. Ele é chamado para redefinir a interface e remover quaisquer entradas de dados, mantendo a interface limpa e pronta para novas interações.<br>
```
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
```
### adicionarDispositivo:<br>
Adiciona o item selecionado pelo Radiobutton e coloca na lista.<br>
```
 private void adicionarDispositivo(RadioButton radioButton, TextField textField, String nome) 
{
    if (radioButton.isSelected()) {
        int quantidade = Integer.parseInt(textField.getText());
        Dispositivos dispositivo = new Dispositivos(nome, quantidade, 00f, 00f);
        dispositivos.add(dispositivo);
    }
}
```
### startLimpar:<br>
Um botão que, quando pressionado, limpa todos os campos de dados e a tabela. Este método garante que o estado atual do formulário seja removido, permitindo ao usuário começar novamente sem dados residuais.<br>
```
void startLimpar(ActionEvent event) {
        dispositivos.clear();
        LimparTudo();
    }
```
### startAdicionar:<br>
Quando pressionado, este botão adiciona os dispositivos selecionados e suas respectivas quantidades à lista de dispositivos. Ele também verifica se as informações fornecidas estão no formato correto, gerando uma mensagem de erro caso contrário. Isso inclui validações de tipo e formato de dados, para assegurar que somente entradas válidas sejam processadas.<br>
```
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
```
