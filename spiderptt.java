import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class spiderptt {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://www.ptt.cc/bbs/index.html").get();
            System.out.println("doc.title(): " + doc.title());

            Elements newsHeadlines = doc.select("#main-container a");
            for (Element headline : newsHeadlines) {
                System.out.println(headline.attr("title"));
                System.out.println(headline.absUrl("href"));
            }
        } catch (Exception e) {
            System.out.println("error: " + e);
        }

    }
}
//public class spider.ptt {
//  public static void main (String[] args) {
// try{
//  Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
//  System.out.println(doc.title());
//    Elements newsHeadlines = doc.select("#mp-itn b a");
//  for (Element headline : newsHeadlines) {
//      System.out.println(headline.attr("title"));
//      System.out.println(headline.absUrl("href"));

//   }
//  }catch (Exception e){
//      System.out.println(e);
//   }
//  }
//}

