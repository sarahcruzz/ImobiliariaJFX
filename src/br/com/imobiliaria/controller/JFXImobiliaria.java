package br.com.imobiliaria.controller;

import br.com.imobiliaria.model.Calculos;
import br.com.imobiliaria.model.Imovel;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;

public class JFXImobiliaria {
    public Button bQuadrado;
    public Button bRetangulo;
    public Button bTriangulo;
    public Button bCirculo;
    public Button bLosango;
    public Button bSalvar;
    public Button bFechar;
    public TextField tfProprietario;
    public TextField tfCidade;
    public TextField tfArea;

    Calculos calcular = new Calculos();
    Imovel imovel = new Imovel();

    public void fechar(javafx.event.ActionEvent actionEvent) {
        System.exit(0);
    }

    public void salvar(javafx.event.ActionEvent actionEvent) {
        String nomeProprietario = tfProprietario.getText();
        String cidade = tfCidade.getText();
        double area = Double.parseDouble(tfArea.getText());

        imovel.setProprietario(nomeProprietario);
        imovel.setCidade(cidade);
        imovel.setAreaTerreno(String.valueOf(area));

        String dados = imovel.obterDadosImovel();
        JOptionPane.showMessageDialog(null, dados);

    }


    public void CalcularLosango(ActionEvent actionEvent) {
        double diagonalMenor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da diagonal menor do losango: "));
        double diagonalMaior = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da diagona maior do losango: "));
        tfArea.setText(String.valueOf(calcular.calcularAreaLosango(diagonalMenor, diagonalMaior)));
    }

    public void CalcularCirculo(ActionEvent actionEvent) {
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do círculo: "));
        tfArea.setText(String.valueOf(calcular.calcularAreaCirculo(raio)));
    }

    public void CalcularTriangulo(ActionEvent actionEvent) {
        double pBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do triângulo: "));
        double pAltura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do triângulo: "));
        tfArea.setText(String.valueOf(calcular.calcularAreaTriangulo(pBase, pAltura)));

    }

    public void CalcularRetangulo(ActionEvent actionEvent) {
        double ladoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado A do retângulo: "));
        double ladoB = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado B do retângulo: "));
        tfArea.setText(String.valueOf(calcular.calcularAreaRetangulo(ladoA, ladoB)));
    }

    public void CalcularQuadrado(ActionEvent actionEvent) {
        double lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do quadrado: "));
        tfArea.setText(String.valueOf(calcular.calcularAreaQuadrado(lado)));
    }
}
