# Relatório de Desenvolvimento de Interface Gráfica

## Introdução

Durante o desenvolvimento do projeto, fiquei responsável pelo front-end, focando principalmente na criação da interface gráfica do usuário (GUI) utilizando JavaFX. Minha tarefa inicial foi desenvolver uma interface detalhada, mas devido à complexidade e inexperiência com código, meu colega de equipe, Fabrício, fez uma simplificação significativa no layout original. Este relatório detalha o trabalho realizado, as mudanças implementadas, e as razões pelas quais a simplificação foi necessária.

## Desenvolvimento Inicial

### Descrição da Interface Original

A interface original foi projetada para ser bastante detalhada, permitindo ao usuário inserir quantidades de diferentes dispositivos em uma aplicação de análise de automação. O código FXML inicial estava estruturado da seguinte forma:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.control.*?>
<?import javafx.scene.layout.*?>

<TabPane fx:id="tabPane" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/8.0.171" xmlns:fx="http://javafx.com/fxml/1" fx:controller="AppController">
   <tabs>
      <Tab text="Aparelhos" fx:id="TabAparelhos">
         <AnchorPane>
            <children>
               <VBox alignment="TOP_CENTER" spacing="10.0" AnchorPane.topAnchor="10.0" AnchorPane.leftAnchor="10.0" AnchorPane.rightAnchor="10.0">
                  <children>
                     <HBox alignment="CENTER" spacing="10.0">
                        <children>
                           <RadioButton fx:id="radioButtonAr" text="Ar Condicionado" />
                           <TextField fx:id="textAr" promptText="Quantidade" />
                        </children>
                     </HBox>
                     <HBox alignment="CENTER" spacing="10.0">
                        <children>
                           <RadioButton fx:id="radioButtonCameras" text="Câmeras" />
                           <TextField fx:id="textCameras" promptText="Quantidade" />
                        </children>
                     </HBox>
                     <!-- Outros RadioButtons e TextFields podem ser adicionados aqui -->
                     <HBox alignment="CENTER" spacing="10.0">
                        <children>
                           <Button fx:id="buttonAdicionar" text="Adicionar" />
                           <Button fx:id="buttonCalcular" text="Calcular" />
                           <Button fx:id="buttonLimpar" text="Limpar" />
                        </children>
                     </HBox>
                  </children>
               </VBox>
            </children>
         </AnchorPane>
      </Tab>
      <Tab text="Economia" fx:id="TabEconomia">
         <AnchorPane>
            <children>
               <TableView fx:id="Table" layoutX="10.0" layoutY="10.0" prefHeight="200.0" prefWidth="580.0">
                  <columns>
                     <TableColumn fx:id="TableAparelhos" text="Aparelho" />
                     <TableColumn fx:id="TablePreço" text="Preço" />
                     <TableColumn fx:id="TableUnidades" text="Unidades" />
                  </columns>
               </TableView>
            </children>
         </AnchorPane>
      </Tab>
   </tabs>
</TabPane>
```

### Razões para a Simplificação

O código original apresentava vários problemas:

1. **Complexidade Excessiva:** A estrutura detalhada era difícil de gerenciar e manter, especialmente para alguém inexperiente com JavaFX.
2. **Performance:** A complexidade poderia impactar negativamente o desempenho da aplicação.
3. **Usabilidade:** A interface original poderia confundir os usuários devido à quantidade de elementos e à disposição dos mesmos.

## Versão Simplificada

Fabrício, meu colega de equipe, simplificou a interface para torná-la mais gerenciável e eficiente. O novo código principal ficou sendo (PooView.java).

## Minhas Contribuições

### Documentação

Devido à minha inexperiência com código, minha principal contribuição foi na documentação do projeto. Isso incluiu detalhar as funcionalidades da interface e a lógica por trás das interações do usuário.

### Interatividade do Usuário

- **Habilitar Campos:** Desenvolvi a lógica para permitir que o usuário insira a quantidade de dispositivos apenas após a seleção de um tipo específico, garantindo entradas válidas.
- **Adicionar Dispositivos:** Implementei a funcionalidade para adicionar dispositivos à lista, permitindo uma visualização clara e organizada.

### Gerenciamento de Interface

- **Habilitar/Desativar Campos:** Criei métodos para associar os RadioButtons aos TextFields correspondentes, garantindo que apenas os campos relevantes fossem editáveis.
- **Resetar Interface:** Implementei métodos para desativar todos os campos e limpar as entradas, mantendo a interface organizada e pronta para novas interações.

### Tratamento de Erros

- **Mostrar Alertas:** Desenvolvi um método para exibir alertas de erro e exceções ao usuário, utilizando o componente Alert do JavaFX para garantir mensagens claras e informativas.
- **Validação de Entradas:** Implementei validações de tipo e formato de dados, assegurando que apenas entradas válidas fossem processadas e adicionadas à lista de dispositivos.

### Otimizações Futuras

Embora as funcionalidades básicas estejam implementadas, reconheço que há espaço para otimizações, especialmente no método `startAdicionar`. Planejo revisitar essa parte do código no futuro para melhorar a eficiência e reduzir a complexidade.

## Conclusão

A experiência de trabalhar no front-end deste projeto foi desafiadora devido à minha inexperiência com código, mas também foi uma oportunidade valiosa de aprendizado. A simplificação da interface realizada por Fabrício foi essencial para tornar o projeto mais gerenciável e eficiente. Minhas contribuições focaram principalmente na documentação e na lógica de interatividade do usuário, garantindo uma interface funcional e intuitiva.
