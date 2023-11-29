package br.com.imobiliaria.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Inicial extends Application {
    public static void main(String[] args) {
    launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Objeto que carrega o arquivo fxml
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/br/com/imobiliaria/view/JFXImobiliaria.fxml"));
        // Objeto AnchorPane (container utilizado no layout)
        // Controle (nó) raiz recebe a referência do arquivo fxml
        AnchorPane nodeRoot = loader.load();
        // Criação da cena recebendo o controle raiz
        Scene scene = new Scene(nodeRoot);
        // Atribuição da cena no palco
        stage.setScene(scene);


        // Retira a barra superior da janela (icone, título, minimizar, maximizar e fechar)
        stage.initStyle(StageStyle.UNDECORATED);
        // Não permite redimensionamento
        stage.setResizable(false);
        // Apresenta a janela centralizada na tela
        stage.centerOnScreen();

        // Apresenta o palco
        stage.show();
    }
}
