package validationTest;

import org.junit.jupiter.api.Test;
import validation.VeraPdfChecker;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VeraPdfCheckerTest {

    @Test
    public void shouldReturnTrueForPDFA1AFileWhenValidatingAsPDFA1A() {
        VeraPdfChecker checker = new VeraPdfChecker();
        File file = new File("src/main/resources/PDFA1AKomplex.pdf");
        assertTrue(checker.isPdfA1A(file));
    }

    @Test
    public void shouldReturnFalseForNonPDFAFileWhenValidatingAsPDFA1A() {
        VeraPdfChecker checker = new VeraPdfChecker();
        File file = new File("src/main/resources/PDF.pdf");
        assertFalse(checker.isPdfA1A(file));
    }

    @Test
    public void shouldReturnTrueForPDFA1BFileWhenValidatingAsPDFA1B() {
        VeraPdfChecker checker = new VeraPdfChecker();
        File file = new File("src/main/resources/PDFA1B.pdf");
        assertTrue(checker.isPdfA1B(file));
    }

    @Test
    public void shouldReturnTrueForPDFA1AFileWhenValidatingAsPDFA1B() {
        VeraPdfChecker checker = new VeraPdfChecker();
        File file = new File("src/main/resources/PDFA1AKomplex.pdf");
        assertTrue(checker.isPdfA1B(file));
    }

    @Test
    public void shouldReturnFalseForPDFA1BFileWhenValidatingAsPDFA1A() {
        VeraPdfChecker checker = new VeraPdfChecker();
        File file = new File("src/main/resources/PDFA1B.pdf");
        assertFalse(checker.isPdfA1A(file));
    }

    @Test
    public void shouldReturnTrueForPDFA3AFileWhenValidatingAsPDFA3A() {
        VeraPdfChecker checker = new VeraPdfChecker();
        File file = new File("src/main/resources/PDFA3A.pdf");
        assertTrue(checker.isPdfA3A(file));
    }

    @Test
    public void shouldReturnFalseForPDFA3AFileWhenValidatingAsPDFA1A() {
        VeraPdfChecker checker = new VeraPdfChecker();
        File file = new File("src/main/resources/PDFA3A.pdf");
        assertFalse(checker.isPdfA1A(file));
    }
}
