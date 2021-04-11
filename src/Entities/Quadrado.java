package Entities;

import utils.FiguraGeometrica;

public class Quadrado extends FiguraGeometrica {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public int calcularPerimetro() {
        return 4 * this.lado;
    }

    @Override
    public int calcularArea() {
        return 2 * this.lado;
    }

    @Override
    public String toString() {
        return "O quadrado criado tem lados de tamanho: " + this.lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}