package service;

import static org.junit.jupiter.api.Assertions.*;
import lombok.RequiredArgsConstructor;
import model.Quadrado;
import model.Triangulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.CalculadoraService;

@RequiredArgsConstructor
public class CalculadoraServiceTest {
    public static CalculadoraService calculadoraService;

    @BeforeEach
    public void before() {
        calculadoraService = new CalculadoraService();
    }

    @Test
    public void testSomarDeveRetornarCincoQuandoDoisMaisTres() {
        //WHEN
        int resultado = calculadoraService.somar(2, 3);

        //THEN
        assertEquals(5, resultado);
    }

    @Test
    public void testSubtrairDeveRetornarCincoQuandoDezMenosCinco() {
        //WHEN
        int resultado = calculadoraService.subtrair(10, 5);

        //THEN
        assertNotEquals(6, resultado);
    }

    @Test
    public void testDividirDeveRetornarCincoQuandoDezDivididoPorDois() {
        //WHEN
        int resultado = calculadoraService.dividir(10, 2);

        //THEN
        assertFalse(resultado == 2);
    }

    @Test
    public void testMultiplicarDeveRetornarSeisQuandoDoisVezesTres() {
        //WHEN
        int resultado = calculadoraService.multiplicar(2, 3);

        //THEN
        assertSame(6, resultado);
    }

    @Test
    public void testAreaQuadradoDeveRetornarAreaDoQuadrado() {
        //GIVEN
        Quadrado quadrado = new Quadrado(5);

        //WHEN
        double resultado = calculadoraService.areaQuadrado(quadrado);

        //THEN
        assertEquals(25.0, resultado);
    }
    @Test
    public void testAreaTrianguloDeveRetornarAreaDoTriangulo() {
        //GIVEN
        Triangulo triangulo = new Triangulo(6, 4);

        //WHEN
        double resultado = calculadoraService.areaTriangulo(triangulo);

        //THEN
        assertEquals(12.0, resultado);
    }

    @Test
    public void testTrianguloDeMenorAreaDeveRetornarTriangulo1() {
        //GIVEN
        Triangulo triangulo1 = new Triangulo(2, 4);
        Triangulo triangulo2 = new Triangulo(8, 2);

        //WHEN
        Triangulo resultado = calculadoraService.trianguloDeMenorArea(triangulo1, triangulo2);

        //THEN
        assertEquals(triangulo1, resultado);
    }

    @Test
    public void testSeAreasDosTriangulosForemIguaisDeveRetornarNull() {
        //GIVEN
        Triangulo triangulo1 = new Triangulo(3,4);
        Triangulo triangulo2 = new Triangulo(3,4);

        //WHEN
        Triangulo resultado = calculadoraService.trianguloDeMenorArea(triangulo1, triangulo2);

        //THEN
        assertNull(resultado);
    }

    @Test
    public void testSeAreasDosQuadradosForemIguaisDeveRetornarNull() {
        //GIVEN
        Quadrado quadrado1 = new Quadrado(3);
        Quadrado quadrado2 = new Quadrado(3);

        //WHEN
        Quadrado resultado = calculadoraService.quadradoDeMenorArea(quadrado1, quadrado2);

        //THEN
        assertNull(resultado);
    }

    @Test
    public void testQuadradoDeMenorAreaDeveRetornarQuadrado2() {
        Quadrado quadrado1 = new Quadrado(5);
        Quadrado quadrado2 = new Quadrado(2);
        Quadrado resultado = calculadoraService.quadradoDeMenorArea(quadrado1, quadrado2);
        assertEquals(quadrado2, resultado);
    }

}
