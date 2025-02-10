package conversionTest;

import com.qoppa.pdfPreflight.profiles.PDFA_1_B_Conversion;
import com.qoppa.pdfPreflight.profiles.PDFA_2_B_Conversion;
import com.qoppa.pdfPreflight.profiles.PDFA_3_B_Conversion;
import conversion.QoppaConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import validation.VeraPdfChecker;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class QoppaConverterTest {
    @BeforeEach
    public void setUp() {
        File converted = new File("src/main/resources/converted.pdf");
        if (converted.exists()) {
            converted.delete();
        }
    }

    @Test
    public void shouldConvertToPdfA1B() {
        File inputFile = new File("src/main/resources/PDFSample.pdf");
        PDFA_1_B_Conversion profile = new PDFA_1_B_Conversion();
        String outputFile = "src/main/resources/converted.pdf";
        QoppaConverter.convertToPDFAB(inputFile, outputFile, profile);
        File converted = new File("src/main/resources/converted.pdf");
        assert converted.exists();
        assertTrue(VeraPdfChecker.isPdfA1B(converted));
    }

    @Test
    public void shouldConvertToPdfA2B() {
        File inputFile = new File("src/main/resources/PDFSample.pdf");
        PDFA_2_B_Conversion profile = new PDFA_2_B_Conversion();
        String outputFile = "src/main/resources/converted.pdf";
        QoppaConverter.convertToPDFAB(inputFile, outputFile, profile);
        File converted = new File("src/main/resources/converted.pdf");
        assert converted.exists();
        assertTrue(VeraPdfChecker.isPdfA2B(converted));
    }

    @Test
    public void shouldConvertToPdfA3B() {
        File inputFile = new File("src/main/resources/PDFSample.pdf");
        PDFA_3_B_Conversion profile = new PDFA_3_B_Conversion();
        String outputFile = "src/main/resources/converted.pdf";
        QoppaConverter.convertToPDFAB(inputFile, outputFile, profile);
        File converted = new File("src/main/resources/converted.pdf");
        assert converted.exists();
        assertTrue(VeraPdfChecker.isPdfA3B(converted));
    }

    @Test
    public void shouldConvertToPdfA1BLongerPDF() {
        File inputFile = new File("src/main/resources/PDF_sample.pdf");
        String outputFile = "src/main/resources/converted.pdf";
        PDFA_1_B_Conversion profile = new PDFA_1_B_Conversion();
        QoppaConverter.convertToPDFAB(inputFile, outputFile, profile);
        File converted = new File("src/main/resources/converted.pdf");
        assert converted.exists();
        assertTrue(VeraPdfChecker.isPdfA1B(converted));
    }

    @Test
    public void shouldConvertToPdfA2BLongerPDF() {
        File inputFile = new File("src/main/resources/PDF_sample.pdf");
        String outputFile = "src/main/resources/converted.pdf";
        PDFA_2_B_Conversion profile = new PDFA_2_B_Conversion();
        QoppaConverter.convertToPDFAB(inputFile, outputFile, profile);
        File converted = new File("src/main/resources/converted.pdf");
        assert converted.exists();
        assertTrue(VeraPdfChecker.isPdfA2B(converted));
    }
}
