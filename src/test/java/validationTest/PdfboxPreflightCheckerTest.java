package validationTest;

import org.junit.jupiter.api.Test;
import validation.PdfboxPreflightChecker;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PdfboxPreflightCheckerTest {

    @Test
    public void shouldReturnTrueForPDFA1BFileWhenValidatingAsPDFA1B() throws IOException {
        PdfboxPreflightChecker checker = new PdfboxPreflightChecker();
        File file = new File("src/main/resources/PDFA1AKomplex.pdf");
        boolean result = checker.isPDFAB1(file);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueForPDFA1AFileWhenValidatingAsPDFA1A() throws IOException {
        PdfboxPreflightChecker checker = new PdfboxPreflightChecker();
        File file = new File("src/main/resources/PDFA1AKomplex.pdf");
        boolean result = checker.isPDFAA1(file);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueForPDFA1BFileWhenValidatingAsPDFA1A() throws IOException {
        PdfboxPreflightChecker checker = new PdfboxPreflightChecker();
        File file = new File("src/main/resources/PDFA1B.pdf");
        boolean result = checker.isPDFAA1(file);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForNonPDFAFileWhenValidatingAsPDFA1A() throws IOException {
        PdfboxPreflightChecker checker = new PdfboxPreflightChecker();
        File file = new File("src/main/resources/PDF.pdf");
        boolean result = checker.isPDFAA1(file);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseForPDFA3AFileWhenValidatingAsPDFA1A() throws IOException {
        PdfboxPreflightChecker checker = new PdfboxPreflightChecker();
        File file = new File("src/main/resources/PDFA3A.pdf");
        boolean result = checker.isPDFAA1(file);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseForNonPDFAFileWhenValidatingAsPDFA1B() throws IOException {
        PdfboxPreflightChecker checker = new PdfboxPreflightChecker();
        File file = new File("src/main/resources/PDF.pdf");
        boolean result = checker.isPDFAB1(file);
        assertFalse(result);
    }
}
