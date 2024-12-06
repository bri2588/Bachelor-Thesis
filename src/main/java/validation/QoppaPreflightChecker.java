package validation;

import com.qoppa.pdfPreflight.PDFPreflight;
import com.qoppa.pdfPreflight.profiles.PDFA_1_A_Verification;
import com.qoppa.pdfPreflight.profiles.PDFA_1_B_Verification;
import com.qoppa.pdfPreflight.profiles.PDFA_2_B_Verification;
import com.qoppa.pdfPreflight.profiles.PDFA_3_B_Verification;
import com.qoppa.pdfPreflight.profiles.VerificationProfile;
import com.qoppa.pdfPreflight.results.PreflightResults;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

import java.io.File;

@UtilityClass
public class QoppaPreflightChecker {

    public boolean isPdfA1A(File file) {
        return isValidPdf(file, new PDFA_1_A_Verification());
    }

    public boolean isPdfA1B(File file) {
        return isValidPdf(file, new PDFA_1_B_Verification());
    }

    public boolean isPdfA2B(File file) {
        return isValidPdf(file, new PDFA_2_B_Verification());
    }

    public boolean isPdfA3A(File file) {
        return isValidPdf(file, new PDFA_3_B_Verification());
    }

    @SneakyThrows
    private boolean isValidPdf(File file, VerificationProfile profile) {
        // Create a PDFPreflight instance
        PDFPreflight preflight = new PDFPreflight(file.getAbsolutePath(), null);

        // Validate for PDF/A compliance (PDF/A-1B)
        final PreflightResults preflightResults = preflight.verifyDocument(profile, null);
        return preflightResults.isSuccessful();
    }

}
