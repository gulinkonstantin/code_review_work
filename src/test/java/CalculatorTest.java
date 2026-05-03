import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(80, calculator.add(74, 6));
        assertEquals(-9, calculator.add(5, -14));
    }

    @Test
    void dif() {
        assertEquals(10, calculator.dif(14, 4));
        assertEquals(-5, calculator.dif(0, 5));
    }

    @Test
    void div() {
        assertEquals(11, calculator.div(121, 11));
        assertEquals(0, calculator.div(228, 0));
    }

    @Test
    void times() {
        assertEquals(143, calculator.times(13, 11));
        assertEquals(0, calculator.times(3, 0));
    }

    @Test
    void solver() {
        double[] result = calculator.solver(5, 4);
        assertEquals(-0.8, result[0], 0.001);
    }
}