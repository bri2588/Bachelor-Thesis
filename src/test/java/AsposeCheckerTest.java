import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AsposeCheckerTest {

    @Test
    public void shouldReturnFalseForNonPDFA1AWhenValidatingAsPDFA1A() {
        AsposeChecker checker = new AsposeChecker();
        File file = new File("src/main/resources/PDFA1B.pdf");
        boolean result = checker.isPDFA1A(file);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueForPDFA1BWhenValidatingAsPDFA1B() {
        AsposeChecker checker = new AsposeChecker();
        File file = new File("src/main/resources/PDFA1B.pdf");
        boolean result = checker.isPDFA1B(file);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueForPDFA1AWhenValidatingAsPDFA1A() {
        AsposeChecker checker = new AsposeChecker();
        File file = new File("src/main/resources/PDFA1A.pdf");
        boolean result = checker.isPDFA1A(file);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForPDFA3AWhenValidatingAsPDFA1A() {
        AsposeChecker checker = new AsposeChecker();
        File file = new File("src/main/resources/PDFA3A.pdf");
        boolean result = checker.isPDFA1A(file);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseForNonPDFA1BWhenValidatingAsPDFA1B() {
        AsposeChecker checker = new AsposeChecker();
        File file = new File("src/main/resources/PDF.pdf");
        boolean result = checker.isPDFA1B(file);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueForPDFA3AWhenValidatingAsPDFA3A() {
        AsposeChecker checker = new AsposeChecker();
        File file = new File("src/main/resources/PDFA1A.pdf");
        boolean result = checker.isPDFA3A(file);
        assertFalse(result);
    }
}
