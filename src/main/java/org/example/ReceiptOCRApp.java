// Main class

package org.example;
import net.sourceforge.tess4j.Tesseract;
import java.io.File;

public class ReceiptOCRApp {
    public static void main(String[] args) {
        try {
            Tesseract tesseract = new Tesseract();
            tesseract.setDatapath("C:\\Program Files\\Tesseract-OCR\\tessdata");
            String ocrText = tesseract.doOCR(new File("receipts/receipt3.jpg"));
            System.out.println("OCR Result:");
            System.out.println(ocrText);
            Receipt receipt = ReceiptParser.parse(ocrText);
            System.out.println("\nReceipt Processed Successfully\n");
            System.out.println(
                    "Store Name: " + receipt.getStoreName()
            );
            System.out.println("Date :" + receipt.getDate()
            );
            System.out.println("Total :Rs." + receipt.getTotalAmount()
            );
            JSONExporter.export(receipt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}