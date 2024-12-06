package validation;

import com.aspose.pdf.Document;
import com.aspose.pdf.PdfFormat;
import lombok.experimental.UtilityClass;

import java.io.File;

@UtilityClass
public class AsposeChecker {

    public boolean isPDFA1A(File file) {
        return isValidPdf(file, PdfFormat.PDF_A_1A);
    }

    public boolean isPDFA1B(File file) {
        return isValidPdf(file, PdfFormat.PDF_A_1B);
    }


    public boolean isPDFA2A(File file) {
        return isValidPdf(file, PdfFormat.PDF_A_2A);
    }

    public boolean isPDFA3A(File file) {
        return isValidPdf(file, PdfFormat.PDF_A_3A);
    }

    private boolean isValidPdf(File file, PdfFormat pdfFormat) {
        try (Document pdfDocument = new Document(file.getAbsolutePath())) {
            return pdfDocument.validate("validation-log.xml", pdfFormat);
        }
    }

}
