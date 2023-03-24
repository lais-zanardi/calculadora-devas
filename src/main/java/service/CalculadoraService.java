package service;

import model.Quadrado;
import model.Triangulo;

public class CalculadoraService {

    public int somar(int a, int b) {
        return a+b;
    }

    public int subtrair(int a, int b) {
        return a-b;
    }

    public int dividir(int a, int b) {
        return a/b;
    }

    public int multiplicar(int a, int b) {
        return a*b;
    }

    public double areaQuadrado(Quadrado quadrado) {
        return quadrado.getLado()*2;
    }

    public double areaTriangulo(Triangulo triangulo) {
        return triangulo.getBase()* triangulo.getAltura()/2;
    }

    public Triangulo trianguloDeMenorArea(Triangulo triangulo1, Triangulo triangulo2) {
        double areaTringulo_1 = areaTriangulo(triangulo1);
        double areaTringulo_2 = areaTriangulo(triangulo2);

        return areaTringulo_1 < areaTringulo_2 ? triangulo1 : triangulo2;
    }
    public Quadrado quadradoDeMenorArea(Quadrado quadrado1, Quadrado quadrado2) {
        double areaQuadrado_1 = areaQuadrado(quadrado1);
        double areaQuadrado_2 = areaQuadrado(quadrado2);

        return areaQuadrado_1 < areaQuadrado_2 ? quadrado1 : quadrado2;
    }

}
