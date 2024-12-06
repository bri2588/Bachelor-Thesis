package validation;

import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import org.apache.pdfbox.preflight.Format;
import org.apache.pdfbox.preflight.PreflightDocument;
import org.apache.pdfbox.preflight.parser.PreflightParser;

import java.io.File;

@UtilityClass
public class PdfboxPreflightChecker {

    public boolean isPDFA1A(File file) {
        return isValidPdf(file, Format.PDF_A1A);
    }

    public boolean isPDFA1B(File file) {
        return isValidPdf(file, Format.PDF_A1B);
    }

    @SneakyThrows
    private boolean isValidPdf(File file, Format format) {
        PreflightParser parser = new PreflightParser(file);
        parser.parse(format);

        try (PreflightDocument document = parser.getPreflightDocument()) {
            return document.getResult().isValid();
        }
    }

}
