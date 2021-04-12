import Entities.Circulo;
import Entities.Quadrado;
import Entities.Retangulo;
import Exception.FiguraInvalida;
public class Program {
    public static void main(String[] args) throws FiguraInvalida {

        Circulo circulo = new Circulo(10);
        Quadrado quadrado = new Quadrado(2);
        Retangulo retangulo = new Retangulo(12, 10);


        //figuraInvalida
        String figura = "cone";


        try{
            //perimetro
            System.out.println("o perimetro do circulo é " + circulo.calcularPerimetro());
            System.out.println("O perimetro do quadrado é " + quadrado.calcularPerimetro());
            System.out.println("O perimetro do Retângulo é " + retangulo.calcularPerimetro());

            //Area
            System.out.println("A área do circulo é " + circulo.calcularArea());
            System.out.println("A área do quadrado é " + quadrado.calcularArea());
            System.out.println("A área do Retângulo é " + retangulo.calcularArea());


            if(figura != "circulo" || figura != "retangulo" || figura != "quadrado" )  {
                throw new FiguraInvalida();
            }

        } catch (FiguraInvalida exp){
            System.out.println(exp.getMessage());
        }

        //toString
        System.out.println(circulo.toString());
        System.out.println(quadrado.toString());
        System.out.println(retangulo.toString());

    }
}
