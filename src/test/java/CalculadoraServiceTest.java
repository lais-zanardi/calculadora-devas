import static org.junit.jupiter.api.Assertions.*;
import lombok.RequiredArgsConstructor;
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
    public void testSomar() {
        int resultado = calculadoraService.somar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testSubtrair() {
        int resultado = calculadoraService.subtrair(10, 5);
        assertNotEquals(6, resultado);
    }

    @Test
    public void testDividir() {
        int resultado = calculadoraService.dividir(10, 2);
        assertFalse(resultado == 2);
    }

    @Test
    public void testMultiplicar() {
        int resultado = calculadoraService.multiplicar(2, 3);
        assertSame(6, resultado);
    }

}
