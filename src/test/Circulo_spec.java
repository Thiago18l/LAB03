package test;

import Entities.Circulo;
import org.junit.Assert;
import org.junit.Test;

public class Circulo_spec {
    Circulo circulo = new Circulo(10);
    @Test
    public void perimetroCirculo () {
        int expected = 31;
        int actual = circulo.calcularPerimetro();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void areaDoCirculo () {
        int expected = 62;
        int actual = circulo.calcularArea();
        Assert.assertEquals(expected, actual);
    }
}
