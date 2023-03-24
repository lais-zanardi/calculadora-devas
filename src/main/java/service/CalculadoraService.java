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
        return quadrado.getLado()*quadrado.getLado();
    }

    public double areaTriangulo(Triangulo triangulo) {
//        double base = triangulo.getBase();
//        double altura = triangulo.getAltura();
//        double area = base * altura / 2;
        return (triangulo.getBase()*triangulo.getAltura())/2.0;
    }

    public Triangulo trianguloDeMenorArea(Triangulo triangulo1, Triangulo triangulo2) {
        double areaTriangulo1 = areaTriangulo(triangulo1);
        double areaTriangulo2 = areaTriangulo(triangulo2);

        if(areaTriangulo1 == areaTriangulo2)
            return null;

        return areaTriangulo1 < areaTriangulo2 ? triangulo1 : triangulo2;
    }
    public Quadrado quadradoDeMenorArea(Quadrado quadrado1, Quadrado quadrado2) {
        double areaQuadrado1 = areaQuadrado(quadrado1);
        double areaQuadrado2 = areaQuadrado(quadrado2);

        if(areaQuadrado1 == areaQuadrado2)
            return null;

        return areaQuadrado1 < areaQuadrado2 ? quadrado1 : quadrado2;
    }

}
