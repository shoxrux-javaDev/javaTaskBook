package OOP.MoodleThree.LessonEight.TaskOne;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

public class URLDemo {
    public static void main(String[] args) {
        System.out.print("Enter text: ");
        Scanner scanner = new Scanner(System.in);
        String searchText = scanner.nextLine();
        searchText = searchText.replaceAll(" ", "%20");
        try {
            Document doc = Jsoup.connect("https://yandex.uz/search/?lr=10335&text=" + searchText).get();
            Elements links = doc.select("a[href]");
            for (Element link : links) {
                System.out.println(onlyLink(link));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String onlyLink(org.jsoup.nodes.Element link) {
        int startCut = link.toString().lastIndexOf("href")+5;
        int finishCut = link.toString().lastIndexOf("/");
        return link.toString().substring(startCut,finishCut);
        /*try {
            URL url = new URL("https://kun.uz/");
            URLConnection connection = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            boolean lastNews = false;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Сўнгги  янгиликлар")) {
                    lastNews = true;
                }
                if (line.contains("Кўпроқ янгилик")) {
                    lastNews = false;
                }
                if (lastNews) {
                    if (line.contains("<span>")) {
                        System.out.println(StringUtils.substringBetween(line, "<span>", "</span>"));
                    } else if (line.contains("<span class=\"news-lenta__title\">")) {
                        System.out.println(StringUtils.substringBetween(line,
                                "<span class=\"news-lenta__title\">", "</span>"));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
