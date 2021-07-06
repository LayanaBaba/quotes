/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import quotes.quotesFile.Quotes;

import java.awt.print.Book;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static <Founder> void main(String[] args) {
//        quotesData();
//        ArrayList <String> list = new ArrayList<>();
//        File input = new File("C:/Users/Student/Downloads/recentquotes.json");'


        try {
            // create Gson instance
            Gson gson = new Gson();

            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("C:/Users/Student/asac/401/quotes/app/src/main/resources/quotesFile.json"));

            Type founderListType = new TypeToken<ArrayList<Founder>>(){}.getType();
            List<Founder> founderList = gson.fromJson(reader, founderListType);

            // convert JSON array to list of books
//            List<Quotes> quotes = Arrays.asList(gson.fromJson(reader, Quotes.class));
            // print books
            System.out.println(founderList.size());
//            founderList.forEach(System.out::println);
            Object txt =  founderList.get(getRandomNumber(1,155));
            System.out.println(txt);
                        quotesData(txt);

            // close reader
            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private static void quotesData(Object list){
//        Quotes quotes= new Quotes(list);
        Gson gson = new Gson();

        String jsonOut=gson.toJson(list);
        System.out.println(jsonOut);

        Quotes userObj = gson.fromJson(jsonOut, Quotes.class);
        System.out.println("Text : "+userObj.getText());
        System.out.println("Author : "+userObj.getAuthor());


    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
