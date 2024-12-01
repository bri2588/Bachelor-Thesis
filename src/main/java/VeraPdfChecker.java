import org.verapdf.core.EncryptedPdfException;
import org.verapdf.core.ModelParsingException;
import org.verapdf.core.ValidationException;
import org.verapdf.gf.foundry.VeraGreenfieldFoundryProvider;
import org.verapdf.pdfa.Foundries;
import org.verapdf.pdfa.PDFAParser;
import org.verapdf.pdfa.PDFAValidator;
import org.verapdf.pdfa.flavours.PDFAFlavour;
import org.verapdf.pdfa.results.ValidationResult;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class VeraPdfChecker {

    public boolean isPdfA1A(File file) {
        VeraGreenfieldFoundryProvider.initialise();
        PDFAFlavour flavour = PDFAFlavour.PDFA_1_A;
        try (PDFAParser parser = Foundries.defaultInstance().createParser(new FileInputStream(file), flavour)) {
            PDFAValidator validator = Foundries.defaultInstance().createValidator(flavour, false);
            ValidationResult result = validator.validate(parser);
            if (result.isCompliant()) {
                return true;
            } else {
                return false;
            }
        } catch (IOException | ValidationException | ModelParsingException | EncryptedPdfException exception) {
        }
        return false;
    }

    public boolean isPdfA1B(File file) {
        VeraGreenfieldFoundryProvider.initialise();
        PDFAFlavour flavour = PDFAFlavour.PDFA_1_B;
        try (PDFAParser parser = Foundries.defaultInstance().createParser(new FileInputStream(file), flavour)) {
            PDFAValidator validator = Foundries.defaultInstance().createValidator(flavour, false);
            ValidationResult result = validator.validate(parser);
            if (result.isCompliant()) {
                return true;
            } else {
                return false;
            }
        } catch (IOException | ValidationException | ModelParsingException | EncryptedPdfException exception) {
        }
        return false;
    }


    public boolean isPdfA3A(File file) {
        VeraGreenfieldFoundryProvider.initialise();
        PDFAFlavour flavour = PDFAFlavour.PDFA_3_A;
        try (PDFAParser parser = Foundries.defaultInstance().createParser(new FileInputStream(file), flavour)) {
            PDFAValidator validator = Foundries.defaultInstance().createValidator(flavour, false);
            ValidationResult result = validator.validate(parser);
            if (result.isCompliant()) {
                return true;
            } else {
                return false;
            }
        } catch (IOException | ValidationException | ModelParsingException | EncryptedPdfException exception) {
        }
        return false;
    }


}
