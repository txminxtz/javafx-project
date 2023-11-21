# Estacionamento

Projeto JavaFX sobre o estacionamento, usando Maven.

Alunos:

-Bruno Taminato
-Caio Bertaglia
-Giovana Obeid
-Miguel Campos
-Janiely Vieira

## Objetivo do Trabalho
O objetivo é criar as telas de entrada de um usuário do estacionamento, para que o mesmo seja capaz de realizar os cadastros, registros e relatórios.

O DAO foi empregado no trabalho com a finalidade de cadastrar os usuarios, proprietarios e veiculos, sendo ligado ao banco de dados do programa "db-estacionamento.sql", localizado na pasta sql do nosso programa.

## Como executar
Para ser executado, basta fazer a conexão correta do programa com o sql, criar as tabalas no banco de dados, e verificar se no arquivo "HelloApplication.java" está ligado ao arquivo "login.fxml", como no exemplo:

    public void start(Stage stage) throws IOException {
    FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
    Scene scene = new Scene(loader.load());
    stage.setScene(scene);
    stage.setTitle("Estacionamento");
    stage.sizeToScene();
    stage.show();
    }
    
Após a verificaçao correta, é possivel rodar o programa, à partir do comando "./mvnw javafx:run".

Com o sucesso de iniciação, a primeira tela a ser aberta será a do login, onde o usuário do estacionamento deverá fazer o login correto, com o usuario (root) e a senha (root), caso contrário a entrada será negada. Com o login bem sucedido o usuário será levado à tela de Menu Principal onde poderá selecionar três botões, "Cadastros", "Registros" e "Relatórios".

1- Cadastros

Ao selecionar o botão cadastros o usuario será levado ao Menu de Cadastros, podendo selecionar uma de funções entre cadastrar usuarios, proprietarios, veiculos ou preços. Os cadastros são diretamente ligadas ao sql, portanto ao incluir um novo cadastro, este deverá ser levado ao banco de dados do programa.

2- Registros

No registro, é possivel incluir um novo registro de veículo ao estacionamento.

3- Relatorios

No relatorio, é possivel selecionar as datas dos períodos desejáveis e será mostrado o relátorios dos veículos que estiveram lá, porém está função ainda está em teste e futuramente veremos uma forma desta função se comunicar com o banco de dados para mostrar o relatório.

Obs geral: possivelmente está faltando a pasta ".mvn/wrapper" contendo o "maven-wrapper.jar" e "maven-wrapper.properties", que são extremamente necessárias para o funcionamento do programa, porém ao fazer o upload dos arquivos do programa, estes não estão sendo inseridas ao git hub.
