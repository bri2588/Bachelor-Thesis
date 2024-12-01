import com.qoppa.pdf.PDFException;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QoppaPreflightCheckerTest {

    @Test
    public void shouldReturnTrueForPDFA1AFileWhenValidatingAsPDFA1A() throws PDFException, IOException {
        QoppaPreflightChecker checker = new QoppaPreflightChecker();
        File file = new File("src/main/resources/PDFA1A.pdf");
        assertTrue(checker.isPdfA1A(file));
    }

    @Test
    public void shouldReturnFalseForNonPDFAFileWhenValidatingAsPDFA1A() throws PDFException, IOException {
        QoppaPreflightChecker checker = new QoppaPreflightChecker();
        File file = new File("src/main/resources/PDF.pdf");
        assertFalse(checker.isPdfA1A(file));
    }

    @Test
    public void shouldReturnTrueForPDFA1BFileWhenValidatingAsPDFA1B() throws PDFException, IOException {
        QoppaPreflightChecker checker = new QoppaPreflightChecker();
        File file = new File("src/main/resources/PDFA1B.pdf");
        assertTrue(checker.isPdfA1B(file));
    }

    @Test
    public void shouldReturnFalseForPDFA1AFileWhenValidatingAsPDFA1B() throws PDFException, IOException {
        QoppaPreflightChecker checker = new QoppaPreflightChecker();
        File file = new File("src/main/resources/PDFA1A.pdf");
        assertFalse(checker.isPdfA1B(file));
    }

    @Test
    public void shouldReturnFalseForPDFA1AFileWhenValidatingAsPDFA1BAgain() throws PDFException, IOException {
        QoppaPreflightChecker checker = new QoppaPreflightChecker();
        File file = new File("src/main/resources/PDFA1A.pdf");
        assertFalse(checker.isPdfA1B(file));
    }

    @Test
    public void shouldReturnFalseForNonPDFAFileWhenValidatingAsPDFA1B() throws PDFException, IOException {
        QoppaPreflightChecker checker = new QoppaPreflightChecker();
        File file = new File("src/main/resources/PDF.pdf");
        assertFalse(checker.isPdfA1B(file));
    }

    @Test
    public void shouldReturnFalseForPDFA3AFileWhenValidatingAsPDFA2B() throws PDFException, IOException {
        QoppaPreflightChecker checker = new QoppaPreflightChecker();
        File file = new File("src/main/resources/PDFA3A.pdf");
        assertFalse(checker.isPdfA2B(file));
    }
}
