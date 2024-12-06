package validation;

import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import org.verapdf.gf.foundry.VeraGreenfieldFoundryProvider;
import org.verapdf.pdfa.Foundries;
import org.verapdf.pdfa.PDFAParser;
import org.verapdf.pdfa.PDFAValidator;
import org.verapdf.pdfa.VeraPDFFoundry;
import org.verapdf.pdfa.flavours.PDFAFlavour;
import org.verapdf.pdfa.results.ValidationResult;

import java.io.File;
import java.io.FileInputStream;

@UtilityClass
public class VeraPdfChecker {

    public boolean isPdfA1A(File file) {
        return isValidPdf(file, PDFAFlavour.PDFA_1_A);
    }

    public boolean isPdfA1B(File file) {
        return isValidPdf(file, PDFAFlavour.PDFA_1_B);
    }

    public boolean isPdfA3A(File file) {
        return isValidPdf(file, PDFAFlavour.PDFA_3_A);
    }

    @SneakyThrows
    private boolean isValidPdf(File file, PDFAFlavour flavour) {
        VeraGreenfieldFoundryProvider.initialise();
        try (VeraPDFFoundry veraPDFFoundry = Foundries.defaultInstance();
             PDFAParser parser = veraPDFFoundry.createParser(new FileInputStream(file), flavour)) {
            PDFAValidator validator = veraPDFFoundry.createValidator(flavour, false);
            ValidationResult result = validator.validate(parser);
            return result.isCompliant();
        }
    }

}
