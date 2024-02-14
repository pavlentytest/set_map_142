import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Petr");
        names.add("Olga");
        names.add("Maria");
        names.add("Ivan");

        for(int i=0;i<names.size();i++) {
         //   System.out.println(names.get(i));
        }
        for(String s: names) {
         //   System.out.println(s);
        }

        // Set-ы
        // Set - интерфейс
        // Множество - уникальные!

        TreeSet<String> treeSet = new TreeSet<>(names);
        for(String s: treeSet) {
            System.out.println(s);
        }

        // Maps - мапы, словари, карты, ассоц. массивы
        // Пары: key -> value
      //  Map

        class Game {
            public String genre;
            public int year;

            public Game(String genre, int year) {
                this.genre = genre;
                this.year = year;
            }
        }

        TreeMap<String,Game> games = new TreeMap<>();
        games.put("nfs",new Game("simulator",2000));
        games.put("among us",new Game("simulator",2010));
        games.put("cs",new Game("shooter",2000));
        games.put("ddlc", new Game("novella",2015));

        for(Map.Entry<String,Game> g: games.entrySet()) {
            System.out.println(g.getKey()+", "+g.getValue().genre + ", "+g.getValue().year);
        }

    }
}