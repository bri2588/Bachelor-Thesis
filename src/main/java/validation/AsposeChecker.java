package validation;

import com.aspose.pdf.Document;
import com.aspose.pdf.PdfFormat;

import java.io.File;

public class AsposeChecker {
    public boolean isPDFA1A(File file) {
        Document pdfDocument = new Document(file.getAbsolutePath());
        return pdfDocument.getPdfFormat() == com.aspose.pdf.PdfFormat.PDF_A_1A;
    }

    public boolean isPDFA1B(File file) {
        Document pdfDocument = new Document(file.getAbsolutePath());
        return pdfDocument.getPdfFormat() == com.aspose.pdf.PdfFormat.PDF_A_1B;
    }

    public boolean isPDFA2A(File file) {
        Document pdfDocument = new Document(file.getAbsolutePath());
        return pdfDocument.getPdfFormat() == PdfFormat.PDF_A_2A;
    }

    public boolean isPDFA3A(File file) {
        Document pdfDocument = new Document(file.getAbsolutePath());
        return pdfDocument.getPdfFormat() == PdfFormat.PDF_A_3A;
    }
}
