package conversionTest;

import conversion.SpireConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import validation.VeraPdfChecker;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpireConverterTest {

    @BeforeEach
    public void setUp() {
        File converted = new File("src/main/resources/converted.pdf");
        if (converted.exists()) {
            converted.delete();
        }
    }

    // File with image
   @Test
    public void shouldConvertToPdfA1A() {
        File inputFile = new File("src/main/resources/PDFSample.pdf");
        File outputFile = new File("src/main/resources/converted.pdf");
        SpireConverter.convertToPdfA1A(inputFile.getAbsolutePath(), outputFile.getAbsolutePath());
        File converted = new File("src/main/resources/converted.pdf");
        assert converted.exists();
        assertFalse(VeraPdfChecker.isPdfA1A(converted));
    }

    @Test
    public void shouldConvertToPdfA1B() {
        File inputFile = new File("src/main/resources/PDFSample.pdf");
        File outputFile = new File("src/main/resources/converted.pdf");
        SpireConverter.convertToPdfA1B(inputFile.getAbsolutePath(), outputFile.getAbsolutePath());
        File converted = new File("src/main/resources/converted.pdf");
        assert converted.exists();
        assertFalse(VeraPdfChecker.isPdfA1B(converted));
    }

    @Test
    public void shouldConvertToPdfA2A() {
        File inputFile = new File("src/main/resources/PDFSample.pdf");
        File outputFile = new File("src/main/resources/converted.pdf");
        SpireConverter.convertToPdfA2A(inputFile.getAbsolutePath(), outputFile.getAbsolutePath());
        File converted = new File("src/main/resources/converted.pdf");
        assert converted.exists();
        assertTrue(VeraPdfChecker.isPdfA2A(converted));
    }

    @Test
    public void shouldConvertToPdfA2B() {
        File inputFile = new File("src/main/resources/PDFSample.pdf");
        File outputFile = new File("src/main/resources/converted.pdf");
        SpireConverter.convertToPdfA2B(inputFile.getAbsolutePath(), outputFile.getAbsolutePath());
        File converted = new File("src/main/resources/converted.pdf");
        assert converted.exists();
        assertTrue(VeraPdfChecker.isPdfA2B(converted));
    }

    @Test
    public void shouldConvertToPdfA3A() {
        File inputFile = new File("src/main/resources/PDFSample.pdf");
        File outputFile = new File("src/main/resources/converted.pdf");
        SpireConverter.convertToPdfA3A(inputFile.getAbsolutePath(), outputFile.getAbsolutePath());
        File converted = new File("src/main/resources/converted.pdf");
        assert converted.exists();
        assertTrue(VeraPdfChecker.isPdfA3A(converted));
    }

    //File without image
    @Test
    public void shouldConvertToPdfA1AFileWithoutImage() {
        File inputFile = new File("src/main/resources/PDF.pdf");
        File outputFile = new File("src/main/resources/converted.pdf");
        SpireConverter.convertToPdfA2A(inputFile.getAbsolutePath(), outputFile.getAbsolutePath());
        File converted = new File("src/main/resources/converted.pdf");
        assert converted.exists();
        assertFalse(VeraPdfChecker.isPdfA1A(converted));
    }

    @Test
    public void shouldConvertToPdfA1BFileWithoutImage() {
        File inputFile = new File("src/main/resources/PDF.pdf");
        File outputFile = new File("src/main/resources/converted.pdf");
        SpireConverter.convertToPdfA2B(inputFile.getAbsolutePath(), outputFile.getAbsolutePath());
        File converted = new File("src/main/resources/converted.pdf");
        assert converted.exists();
        assertFalse(VeraPdfChecker.isPdfA1B(converted));
    }
}
