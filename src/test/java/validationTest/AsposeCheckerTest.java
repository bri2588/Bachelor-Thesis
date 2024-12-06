package validationTest;

import org.junit.jupiter.api.Test;
import validation.AsposeChecker;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class AsposeCheckerTest {

    @Test
    public void shouldReturnFalseForNonPDFA1AWhenValidatingAsPDFA1A() {
        File file = new File("src/main/resources/PDFA1BSample.pdf");
        boolean result = AsposeChecker.isPDFA1A(file);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueForPDFA1BWhenValidatingAsPDFA1B() {
        File file = new File("src/main/resources/PDFA1BSample.pdf");
        boolean result = AsposeChecker.isPDFA1B(file);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueForPDFA1AWhenValidatingAsPDFA1A() {
        File file = new File("src/main/resources/PDFA1ASample.pdf");
        boolean result = AsposeChecker.isPDFA1A(file);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForPDFA3AWhenValidatingAsPDFA1A() {
        File file = new File("src/main/resources/PDFA3ASample.pdf");
        boolean result = AsposeChecker.isPDFA1A(file);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseForNonPDFA1BWhenValidatingAsPDFA1B() {
        File file = new File("src/main/resources/PDF.pdf");
        boolean result = AsposeChecker.isPDFA1B(file);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueForPDFA3AWhenValidatingAsPDFA3A() {
        File file = new File("src/main/resources/PDFA1ASample.pdf");
        boolean result = AsposeChecker.isPDFA3A(file);
        assertFalse(result);
    }

}
