package conversion;

import java.io.File;

import com.qoppa.pdfPreflight.PDFPreflight;
import com.qoppa.pdfPreflight.profiles.PDFA_ConversionProfile;
import com.qoppa.pdfPreflight.results.PreflightResults;

import lombok.SneakyThrows;

public class QoppaConverter {

    /**
     * Converts a PDF to PDF/A-1B format using Qoppa's PDFPreflight library.
     *
     * @param file    the input PDF file to convert.
     * @param output  the output file path for the converted PDF/A document.
     * @param profile the PDF/A conversion profile to use.
     */
    @SneakyThrows
    public static void convertToPDFAB(File file, String output, PDFA_ConversionProfile profile) {
        PDFPreflight pdfPreflight = new PDFPreflight(file.getAbsolutePath(), null);
        PreflightResults results = pdfPreflight.convertDocument(profile, null);

        if (results.isSuccessful()) {
            System.out.println("PDF was converted successfully.");
            pdfPreflight.saveDocument(output);
        } else {
            System.out.println("PDF was not converted successfully. See the generated report.");
            pdfPreflight.addResultAnnotations(results);

            pdfPreflight.appendPreflightReport(results, 612, 792);
            pdfPreflight.saveDocument("src/main/resources/report.pdf");
        }
    }
}
