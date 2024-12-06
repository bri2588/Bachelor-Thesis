package validationTest;

import org.junit.jupiter.api.Test;
import validation.QoppaPreflightChecker;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class QoppaPreflightCheckerTest {

    @Test
    public void shouldReturnTrueForPDFA1AFileWhenValidatingAsPDFA1A() {
        File file = new File("src/main/resources/PDFA1ASample.pdf");
        assertTrue(QoppaPreflightChecker.isPdfA1A(file));
    }

    @Test
    public void shouldReturnFalseForNonPDFAFileWhenValidatingAsPDFA1A() {
        File file = new File("src/main/resources/PDF.pdf");
        assertFalse(QoppaPreflightChecker.isPdfA1A(file));
    }

    @Test
    public void shouldReturnTrueForPDFA1BFileWhenValidatingAsPDFA1B() {
        File file = new File("src/main/resources/PDFA1BSample.pdf");
        assertTrue(QoppaPreflightChecker.isPdfA1B(file));
    }

    @Test
    public void shouldReturnFalseForPDFA1AFileWhenValidatingAsPDFA1B() {
        File file = new File("src/main/resources/PDFA1ASample.pdf");
        assertFalse(QoppaPreflightChecker.isPdfA1B(file));
    }

    @Test
    public void shouldReturnFalseForPDFA1AFileWhenValidatingAsPDFA1BAgain() {
        File file = new File("src/main/resources/PDFA1ASample.pdf");
        assertFalse(QoppaPreflightChecker.isPdfA1B(file));
    }

    @Test
    public void shouldReturnFalseForNonPDFAFileWhenValidatingAsPDFA1B() {
        File file = new File("src/main/resources/PDF.pdf");
        assertFalse(QoppaPreflightChecker.isPdfA1B(file));
    }

    @Test
    public void shouldReturnFalseForPDFA3AFileWhenValidatingAsPDFA2B() {
        File file = new File("src/main/resources/PDFA3ASample.pdf");
        assertFalse(QoppaPreflightChecker.isPdfA2B(file));
    }
}
