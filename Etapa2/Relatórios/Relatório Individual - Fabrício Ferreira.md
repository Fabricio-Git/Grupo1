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
> Este método é responsável por associar os RadioButtons com os TextFields correspondentes. A seleção de um RadioButton habilita o TextField associado, permitindo a entrada de dados apenas para dispositivos selecionados. Isso é feito utilizando eventos de ação que monitoram a seleção dos RadioButtons.<br>
### desativarTudo:<br>
> Um método que desativa todos os RadioButtons e, consequentemente, os TextFields relacionados. Isso é útil para redefinir o estado da interface gráfica ou ao inicializar o aplicativo, garantindo que nenhum campo esteja editável até que uma seleção seja feita.<br>
### showAlert:<br>
> Um método que recebe duas String como parâmetros: o título do alerta e a mensagem. Ele cria um pop-up de alerta para tratamento de exceções e comunicação de erros ao usuário. Utiliza o componente Alert do JavaFX para exibir mensagens claras e informativas.<br>
### LimparTudo:<br>
> Um método simples que limpa todos os campos dos TextFields. Ele é chamado para redefinir a interface e remover quaisquer entradas de dados, mantendo a interface limpa e pronta para novas interações.<br>
### Limpar:<br>
> Um botão que, quando pressionado, limpa todos os campos de dados e a tabela. Este método garante que o estado atual do formulário seja removido, permitindo ao usuário começar novamente sem dados residuais.<br>
### Adicionar:<br>
> Quando pressionado, este botão adiciona os dispositivos selecionados e suas respectivas quantidades à lista de dispositivos. Ele também verifica se as informações fornecidas estão no formato correto, gerando uma mensagem de erro caso contrário. Isso inclui validações de tipo e formato de dados, para assegurar que somente entradas válidas sejam processadas.<br>
> Nota: Estou ciente de que existe uma maneira mais eficiente de implementar o método startAdicionar, mas devido ao tempo disponível, não consegui otimizá-lo. Planejo revisitar essa parte do código para melhorar a eficiência e reduzir a complexidade futuramente.
