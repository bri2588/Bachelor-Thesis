package validation;

import com.qoppa.pdf.PDFException;
import com.qoppa.pdfPreflight.PDFPreflight;
import com.qoppa.pdfPreflight.profiles.PDFA_1_A_Verification;
import com.qoppa.pdfPreflight.profiles.PDFA_1_B_Verification;
import com.qoppa.pdfPreflight.profiles.PDFA_2_B_Verification;
import com.qoppa.pdfPreflight.profiles.PDFA_3_B_Verification;
import com.qoppa.pdfPreflight.results.PreflightResults;

import java.io.File;
import java.io.IOException;

public class QoppaPreflightChecker {

    public boolean isPdfA1A(File file) throws PDFException, IOException {
        PDFPreflight pdfPreflight = new PDFPreflight(file.getAbsolutePath(), null);
        PreflightResults results = pdfPreflight.verifyDocument(new PDFA_1_A_Verification(), null);
        return results.isSuccessful();
    }

    public boolean isPdfA1B(File file) throws PDFException, IOException {
        PDFPreflight pdfPreflight = new PDFPreflight(file.getAbsolutePath(), null);
        PreflightResults results = pdfPreflight.verifyDocument(new PDFA_1_B_Verification(), null);
        return results.isSuccessful();
    }

    public boolean isPdfA2B(File file) throws PDFException, IOException {
        PDFPreflight pdfPreflight = new PDFPreflight(file.getAbsolutePath(), null);
        PreflightResults results = pdfPreflight.verifyDocument(new PDFA_2_B_Verification(), null);
        return results.isSuccessful();
    }

    public boolean isPdfA3A(File file) throws PDFException, IOException {
        PDFPreflight pdfPreflight = new PDFPreflight(file.getAbsolutePath(), null);
        PreflightResults results = pdfPreflight.verifyDocument(new PDFA_3_B_Verification(), null);
        return results.isSuccessful();
    }
}
