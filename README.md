# Estacionamento 
  Projeto JavaFX sobre o estacionamento, usando Maven.

Alunos: 
- Bruno Taminato
- Caio Lucas
- Giovana Obeid
- Miguel Campos
- Janiely Vieira

## Objetivo do Trabalho

  O objetivo é criar as telas de entrada de um usuário do estacionamento, para que o mesmo seja capaz de realizar os cadastros, registros e relatórios.

  O DAO foi empregado no trabalho com a finalidade de cadastrar os usuarios, proprietarios e veiculos, sendo ligado ao banco de dados do programa "db-estacionamento.sql", localizado na pasta sql do nosso programa.

## Como executar

  Para ser executado, basta fazer a conexão correta do programa com o sql, e verificar se no arquivo "HelloApplication.java" está ligado ao arquivo "login.fxml", como no exemplo:

    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("Estacionamento");
        stage.sizeToScene();
        stage.show();
        }
    
  Após a verificaçao correta, é possivel rodar o programa, à partir do comando "./mvnw javafx:run".

  Com o sucesso de iniciação, a primeira tela a ser aberta será a do login, onde o usuário do estacionamento deverá fazer o login correto, com o usuario (root) e a senha (root), caso contrário a entrada será negada.
  
