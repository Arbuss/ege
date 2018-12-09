import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

public class Parser {
    public static void parse() throws IOException {
        Document doc = Jsoup.connect("https://ege.sdamgia.ru/test?id=20755054").get();

        Element title = doc.selectFirst("div#body999647");
        String text = title.text();

        //System.out.println(title.toString());
        System.out.println(text);
        System.out.println("cool");
    }

    public static void main(String[] args) throws IOException {
        parse();
        File file = new File("src\\main\\java\\file.txt");
        if(!file.exists())
            System.out.println(file.createNewFile());
    }
}
