## 02/08/2024 Isadora: 
#### Foi responsavel pelo desing da tela, da criação e nomeacão dos objetos da tela e arquivos fxml, utilizando o programa SceneBuilder e foi a pessoa que iniciou a criação dos controller do programa, sendo depois complementados pelo Fabricio. 
## 04/08/2024 Fabricio:
#### Relacionei todos o radiobutton com seus devidos TextField e criei alguns métodos, sendo eles: LimparTudo(limpa os TextFields), desabilitarTudo(desativa todos os TextFields), mostrarAlerta(modelo de alerta para problemas gerais).<br><br> Desenvolvimento do Código do "Adicionar" (Salva os valores em uma tabela para que o usuario possa confirmar quais aparelhos foram registrados) e criação do código da tabela.
## 05/08/2024 Guilherme:
#### Consegui possibilitar com que os botões Calcular e Garantia realizasem suas ações de calculo e transportassem para a tabela, então foram feitos:  
- Desativação de 3 imports não utilizados;
- Criação de 2 imports os java.util.HashMap e java.util.Map;
- Implementação de um mapa hashcode denominado preçosBase, para armazenar os valores padrões dos produtos;
- Complemento no metodo Initialize() que foi a chamada do metodo novo inicializaPrecosBase;
- Criaçãos dos métodos calcular() e calcularEconomia() no Modelo (Dispositivos);
- Por fim, fiz o Controlador converter a ObservableList em uma Array e enviar pro Modelo, receber os valores e atualizar a tabela.
