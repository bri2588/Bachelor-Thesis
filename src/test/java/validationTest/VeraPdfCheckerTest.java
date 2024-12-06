package validationTest;

import org.junit.jupiter.api.Test;
import validation.VeraPdfChecker;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VeraPdfCheckerTest {

    @Test
    public void shouldReturnTrueForPDFA1AFileWhenValidatingAsPDFA1A() {
        File file = new File("src/main/resources/PDFA1ASample.pdf");
        assertTrue(VeraPdfChecker.isPdfA1A(file));
    }

    @Test
    public void shouldReturnFalseForNonPDFAFileWhenValidatingAsPDFA1A() {
        File file = new File("src/main/resources/PDF.pdf");
        assertFalse(VeraPdfChecker.isPdfA1A(file));
    }

    @Test
    public void shouldReturnTrueForPDFA1BFileWhenValidatingAsPDFA1B() {
        File file = new File("src/main/resources/PDFA1BSample.pdf");
        assertTrue(VeraPdfChecker.isPdfA1B(file));
    }

    @Test
    public void shouldReturnTrueForPDFA1AFileWhenValidatingAsPDFA1B() {
        File file = new File("src/main/resources/PDFA1ASample.pdf");
        assertTrue(VeraPdfChecker.isPdfA1B(file));
    }

    @Test
    public void shouldReturnFalseForPDFA1BFileWhenValidatingAsPDFA1A() {
        File file = new File("src/main/resources/PDFA1BSample.pdf");
        assertFalse(VeraPdfChecker.isPdfA1A(file));
    }

    @Test
    public void shouldReturnTrueForPDFA3AFileWhenValidatingAsPDFA3A() {
        File file = new File("src/main/resources/PDFA3ASample.pdf");
        assertTrue(VeraPdfChecker.isPdfA3A(file));
    }

    @Test
    public void shouldReturnFalseForPDFA3AFileWhenValidatingAsPDFA1A() {
        File file = new File("src/main/resources/PDFA3ASample.pdf");
        assertFalse(VeraPdfChecker.isPdfA1A(file));
    }
}
