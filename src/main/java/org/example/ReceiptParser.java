//OCR Text --> Receipt Object

package org.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ReceiptParser {
    public static Receipt parse(String text){
        String storeName = extractStoreName(text);
        String date = extractDate(text);
        double total = extractTotal(text);

        return new Receipt(storeName,date,total);

    }
    private static String extractStoreName(String text){
        String[] lines = text.split("\\r?\\n");
        for(String line:lines){
           line = line.trim();
           if(!line.isEmpty()){
               return line;
           }
        }
        return "Unknown Store";
    }
    private static String extractDate(String text){
        Pattern pattern = Pattern.compile("\\b\\d{2}[/-]\\d{2}[/-]\\d{4}\\b");
        Matcher matcher = pattern.matcher(text);
        if(matcher.find()){
            return matcher.group();
        }
        return "Date Not Found";
    }
    private static double extractTotal(String text){
        Pattern pattern = Pattern.compile("(?i)total\\s*[:]?\\s*(\\d+\\.?\\d*)");
    Matcher matcher = pattern.matcher(text);
    if(matcher.find()){
        return Double.parseDouble(
            matcher.group(1)
        );
    }
    return 0.0;
    }
}
