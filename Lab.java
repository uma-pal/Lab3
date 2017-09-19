import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Lab{
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static void main(String[] args) {
        //word count
        //System.out.println(urlToString("http://erdani.com/tdpl/hamlet.txt"));
        wordCount("http://erdani.com/tdpl/hamlet.txt");
    }

    public static void wordCount(String s){
        //Count number of spaces
        String str1 = urlToString(s);
        int words = 1;
        for(int i = 0; str1.charAt(i) < str1.length(); i++)
            {
            if(str1.charAt(i) == ' ')
            {
                words++;
            }
            }


        System.out.println("Word count is " + words);


    }

}
