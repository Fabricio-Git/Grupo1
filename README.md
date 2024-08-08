# Divisão do Projeto
## O projeto está organizado em duas etapas distintas:
# Etapa 1

### Na Etapa 1, houve uma falha no registro das alterações no README, o que resultou em uma documentação menos clara e potencialmente confusa. As alterações realizadas nesta fase não foram documentadas adequadamente.
# Etapa 2

### Na Etapa 2, foi feita uma melhoria significativa na documentação, com o objetivo de registrar de forma mais precisa e clara todas as modificações realizadas. Esta etapa apresenta uma documentação mais robusta e compreensível.

### Projeto: Marketplace de Automação Residencial

## Descrição do Projeto

Este projeto visa desenvolver um marketplace para a venda e ensino de automação residencial. A aplicação permite aos usuários selecionar diversos dispositivos de automação, calcular os custos e economias, e visualizar as informações em uma tabela. A interface gráfica foi criada utilizando JavaFX e FXML, facilitando a interação do usuário com a aplicação.

## Estrutura do Projeto

### 1. Controller

A classe `Controller` é responsável por gerenciar a interação entre a interface gráfica e a lógica do aplicativo. Ele gerencia os seguintes componentes:

- **Botões**: `buttonAdicionar`, `buttonCalcular`, `buttonGarantia`, `buttonLimpar`
- **RadioButtons**: `radioButtonAr`, `radioButtonAssistente`, `radioButtonCameras`, `radioButtonCortina`, `radioButtonIrrigacao`, `radioButtonLampadas`, `radioButtonSeguranca`, `radioButtonSom`, `radioButtonTV`
- **TextFields**: `textAr`, `textAssistente`, `textCameras`, `textCurtinas`, `textIrrigacao`, `textLampadas`, `textSeguranca`, `textSom`, `textTV`
- **TableView**: `Table` e suas colunas `TableAparelhos`, `TableEconomia`, `TablePreço`, `TableUnidades`

#### Principais Funcionalidades

- **Inicialização**: Desativa todos os campos de texto inicialmente e configura listeners para habilitar/desabilitar campos de texto com base na seleção dos RadioButtons.
- **Adicionar Dispositivo**: Adiciona os dispositivos selecionados à tabela, após verificar se a quantidade inserida é válida.
- **Calcular Preço e Economia**: Calcula o preço total e a economia para os dispositivos adicionados, com ou sem garantia.
- **Limpar Campos**: Limpa todos os campos de texto e a tabela.
- **Exibição de Alertas**: Exibe mensagens de erro caso os valores inseridos não sejam válidos.

### 2. Modelo de Dispositivos

A classe `Dispositivos` representa os dispositivos de automação residencial. Cada dispositivo possui:

- `tableAparelhos`: Nome do dispositivo
- `tableUnidades`: Quantidade do dispositivo
- `tablePreço`: Preço total calculado do dispositivo
- `tableEconomia`: Economia calculada do dispositivo

#### Principais Funcionalidades

- **Cálculo de Preço e Economia**: Métodos para calcular o preço total e a economia com ou sem garantia.

### 3. Interface Gráfica

A interface gráfica foi criada utilizando FXML e SceneBuilder, garantindo uma experiência de usuário intuitiva e amigável.

- **Tabs**: A interface possui duas abas principais:
  - **Aparelhos**: Onde o usuário seleciona os dispositivos e insere as quantidades.
  - **Dados**: Onde o usuário visualiza os dispositivos adicionados, juntamente com os preços e economias calculados.

### 4. PooView

A classe `PooView` é responsável por iniciar a aplicação JavaFX. Ela carrega o arquivo FXML e configura a cena e o palco.

## Responsabilidades dos Integrantes

### 02/08/2024 - Isadora
- Design da tela, criação e nomeação dos objetos na tela e arquivos FXML utilizando SceneBuilder.
- Início da criação dos controllers, complementados posteriormente por Fabricio.

### 04/08/2024 - Fabricio
- Relacionamento dos RadioButtons com seus respectivos TextFields.
- Criação dos métodos `LimparTudo`, `desativarTudo` e `mostrarAlerta`.
- Desenvolvimento do código para adicionar dispositivos à tabela e criação do código da tabela.

### 05/08/2024 - Guilherme
- Implementação dos botões `Calcular` e `Garantia` para realizar cálculos e atualizar a tabela.
- Desativação de imports não utilizados e criação de novos imports.
- Implementação de um mapa para armazenar os preços base dos produtos.
- Complemento no método `initialize()` e criação dos métodos `calcular()` e `calcularEconomia()`.

### 06/08/2024 - Pedro
- Documentação do projeto.
- Desenvolvimento inicial da interface gráfica e funcionalidades para interatividade e gerenciamento da interface, substituídas posteriormente.

## Conclusão

Este projeto fornece uma plataforma inicial para um marketplace de automação residencial, permitindo que os usuários selecionem, calculem e visualizem informações sobre diversos dispositivos de automação. A colaboração entre os membros da equipe garantiu a implementação de funcionalidades essenciais e uma interface amigável.
