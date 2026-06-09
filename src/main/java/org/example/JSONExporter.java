package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
public class JSONExporter {
    public static void export(
            Receipt receipt
    )
    {
        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter().writeValue(
                    new File(
                            "output/receipt.json"
                    ),
                    receipt
            );
            System.out.println("\nJSON saved successfully");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
