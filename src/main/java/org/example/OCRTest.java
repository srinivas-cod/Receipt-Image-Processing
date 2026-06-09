package org.example;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class OCRTest {
    public static void main(String[] args) {
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("C:\\Program Files\\Tesseract-OCR\\tessdata");
        try{
            String text = tesseract.doOCR(new File("receipts/receipt3.jpg"));
            System.out.println("OCR Result");
            System.out.println(text);
        }
        catch (TesseractException e){
            e.printStackTrace();
        }
    }
}
