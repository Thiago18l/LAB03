package test;

import Entities.Retangulo;
import org.junit.Assert;
import org.junit.Test;

public class Retangulo_spec {
    Retangulo retangulo = new Retangulo(12, 10);

    @Test
    public void perimetroDoRetangulo () {
        int expected = 44;
        int actual = retangulo.calcularPerimetro();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void areaDoRetangulo () {
        int expected = 120;
        int actual = retangulo.calcularArea();
        Assert.assertEquals(expected, actual);
    }
}
