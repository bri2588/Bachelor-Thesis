package conversion;

import com.spire.pdf.conversion.PdfStandardsConverter;

public class SpireConverter {

    public static void convertToPdfA1A(String inputPath, String outputPath) {
        PdfStandardsConverter converter = new PdfStandardsConverter(inputPath);
        converter.toPdfA1A(outputPath);
    }

    public static void convertToPdfA1B(String inputPath, String outputPath) {
        PdfStandardsConverter converter = new PdfStandardsConverter(inputPath);
        converter.toPdfA1B(outputPath);
    }

    public static void convertToPdfA2A(String inputPath, String outputPath) {
        PdfStandardsConverter converter = new PdfStandardsConverter(inputPath);
        converter.toPdfA2A(outputPath);
    }

    public static void convertToPdfA2B(String inputPath, String outputPath) {
        PdfStandardsConverter converter = new PdfStandardsConverter(inputPath);
        converter.toPdfA2B(outputPath);
    }

    public static void convertToPdfA3A(String inputPath, String outputPath) {
        PdfStandardsConverter converter = new PdfStandardsConverter(inputPath);
        converter.toPdfA3A(outputPath);
    }

}
