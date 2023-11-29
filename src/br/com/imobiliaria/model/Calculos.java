package br.com.imobiliaria.model;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Calculos {
    // cálculos das formas geométricas

    public double calcularAreaQuadrado(double lado){
        return lado * lado;
    }

    public double calcularAreaRetangulo(double ladoA, double ladoB){
        return ladoA * ladoB;
    }

    public double calcularAreaTriangulo(double pBase, double pAltura){
        return (pBase * pAltura) / 2;
    }

    public double calcularAreaCirculo(double raio){
        return Math.pow(Math.PI * raio, 2);
    }

    public double calcularAreaLosango(double diagonalMenor, double diagonalMaior){
        return (diagonalMenor * diagonalMaior) / 2;
    }



}
