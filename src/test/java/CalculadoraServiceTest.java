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
        int resultado = calculadoraService.somar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testSubtrairDeveRetornarCincoQuandoDezMenosCinco() {
        int resultado = calculadoraService.subtrair(10, 5);
        assertNotEquals(6, resultado);
    }

    @Test
    public void testDividirDeveRetornarCincoQuandoDezDivididoPorDois() {
        int resultado = calculadoraService.dividir(10, 2);
        assertFalse(resultado == 2);
    }

    @Test
    public void testMultiplicarDeveRetornarSeisQuandoDoisVezesTres() {
        int resultado = calculadoraService.multiplicar(2, 3);
        assertSame(6, resultado);
    }

    @Test
    public void testAreaQuadradoDeveRetornarAreaDoQuadrado() {
        Quadrado quadrado = new Quadrado(5);
        double resultado = calculadoraService.areaQuadrado(quadrado);
        assertEquals(25.0, resultado);
    }
    @Test
    public void testAreaTrianguloDeveRetornarAreaDoTriangulo() {
        Triangulo triangulo = new Triangulo(6, 4);
        double resultado = calculadoraService.areaTriangulo(triangulo);
        assertEquals(12.0, resultado);
    }

    @Test
    public void testTrianguloDeMenorAreaDeveRetornarTriangulo1() {
        Triangulo triangulo1 = new Triangulo(6, 4);
        Triangulo triangulo2 = new Triangulo(8, 2);
        Triangulo resultado = calculadoraService.trianguloDeMenorArea(triangulo1, triangulo2);
        assertEquals(triangulo1, resultado);
    }

    @Test
    public void testQuadradoDeMenorAreaDeveRetornarQuadrado2() {
        Quadrado quadrado1 = new Quadrado(5);
        Quadrado quadrado2 = new Quadrado(2);
        Quadrado resultado = calculadoraService.quadradoDeMenorArea(quadrado1, quadrado2);
        assertEquals(quadrado2, resultado);
    }

}
