package test;

import Entities.Quadrado;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class Quadrado_spec {
    Quadrado quadrado = new Quadrado(2);
    @Test
    public void perimetroDoQuadrado () {
        int expected = 8;
        int actual = quadrado.calcularPerimetro();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void areaDoQuadrado () {
        int expected = 4;
        int actual = quadrado.calcularArea();
        Assert.assertEquals(expected, actual);
    }
}
