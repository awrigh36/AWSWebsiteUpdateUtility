import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlEditor {
    /**
     * Creates a temporary file with html data to upload to the bucket
     * 
     * @param input
     * @return
     * @throws IOException
     */
    public static File getHTML(String[] dataArray) throws IOException {
        String addr = "http://baristasofeastcobb.com";
        Document doc = Jsoup.connect(addr).get();


        // Set week-of caption
        Element caption = doc.select("caption").first();
        caption.text("" + dataArray[0]);
//        System.out.println("" + caption.toString());
        
        // Set days, titles, and descriptions        
        Element td1 = doc.select("td").first();
        td1.text("" + dataArray[1]);
        
        for(int i = 2; i < dataArray.length; i++) {
            Element td2 = doc.select("td").get(i-1);;
            td2.text("" + dataArray[i]);
        }
        
    	FileWriter fw = new FileWriter("index.html");
    	fw.write(doc.head().toString());
    	fw.write(doc.body().toString());
    	
    	fw.close();
    	File newHTML = new File("/Users/Aly/Documents/workspace/Website_Update_Utility/test.html");
    	System.out.println("New file index.html created.");
    	return newHTML;
	}
    
    static List<String> readFromFile(String path, Charset encoding) throws IOException {
    	List<String> lines = Files.readAllLines(Paths.get(path), encoding);
    	return lines;
    }
}
