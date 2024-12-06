package validationTest;

import org.junit.jupiter.api.Test;
import validation.PdfboxPreflightChecker;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class PdfboxPreflightCheckerTest {

    @Test
    public void shouldReturnTrueForPDFA1BFileWhenValidatingAsPDFA1B() {
        File file = new File("src/main/resources/PDFA1ASample.pdf");
        boolean result = PdfboxPreflightChecker.isPDFA1B(file);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueForPDFA1AFileWhenValidatingAsPDFA1A() {
        File file = new File("src/main/resources/PDFA1ASample.pdf");
        boolean result = PdfboxPreflightChecker.isPDFA1A(file);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueForPDFA1BFileWhenValidatingAsPDFA1A() {
        File file = new File("src/main/resources/PDFA1BSample.pdf");
        boolean result = PdfboxPreflightChecker.isPDFA1A(file);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForNonPDFAFileWhenValidatingAsPDFA1A() {
        File file = new File("src/main/resources/PDF.pdf");
        boolean result = PdfboxPreflightChecker.isPDFA1A(file);
        assertFalse(result);
    }

    // This test should actaully return false, because validation should not be backwards compatible
    @Test
    public void shouldReturnTrueForPDFA3AFileWhenValidatingAsPDFA1A() {
        File file = new File("src/main/resources/PDFA3ASample.pdf");
        boolean result = PdfboxPreflightChecker.isPDFA1A(file);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForNonPDFAFileWhenValidatingAsPDFA1B() {
        File file = new File("src/main/resources/PDF.pdf");
        boolean result = PdfboxPreflightChecker.isPDFA1B(file);
        assertFalse(result);
    }
}
