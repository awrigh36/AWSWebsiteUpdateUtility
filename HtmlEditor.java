import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class HtmlEditor {
    /**
     * Creates a temporary file with html data to upload to the bucket
     * 
     * @param String[]
     * @return File
     * @throws IOException
     */
    public static File getHTML(String[] dataArray) throws IOException {
        String addr = "websiteAddress";
        Document doc = Jsoup.connect(addr).get();

        // Set week-of caption
        Element caption = doc.select("caption").first();
        caption.text("" + dataArray[0]);
        
        // Set days, titles, and descriptions        
        Element td1 = doc.select("td").first();
        td1.text("" + dataArray[1]);
        
        for(int i = 2; i < dataArray.length; i++) {
            Element td2 = doc.select("td").get(i-1);;
            td2.text("" + dataArray[i]);
        }
        String path = "/Users/User/Path";
		File file = new File(path);
		
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
    	
    	fw.write(doc.head().toString());
    	fw.write(doc.body().toString());
    	
		System.out.println("File index.html edited.");
    	fw.close();
		System.out.println("File index.html closed.");

    	return file;
	}
    
    static List<String> readFromFile(String path, Charset encoding) throws IOException {
    	List<String> lines = Files.readAllLines(Paths.get(path), encoding);
    	return lines;
    }
}