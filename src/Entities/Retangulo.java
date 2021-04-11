package Entities;

import utils.FiguraGeometrica;

public class Retangulo extends FiguraGeometrica {

    private int altura;
    private int largura;

    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }
    @Override
    public int calcularPerimetro() {
        return (2 * this.altura) + (2 * this.largura);
    }

    @Override
    public int calcularArea() {
        return this.altura * this.largura;
    }

    @Override
    public String toString() {
        return "O Retângulo criado tem altura= " + this.altura +
                " e largura de tamanho: " + this.largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }
}