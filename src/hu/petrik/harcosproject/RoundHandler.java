package hu.petrik.harcosproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RoundHandler {
    private List<Harcos> harcosok = new LinkedList<>();
    Player player;

    public RoundHandler() {
        player = new Player();
        Harcos h = new Harcos("Ödön", 3);
        Harcos h1 = new Harcos("Karcsy", 1);
        Harcos h2 = new Harcos("Rafael", 2);
        harcosok.add(h);
        harcosok.add(h1);
        harcosok.add(h2);
        try {
            readFromFile("harcosok.csv");
        } catch (FileNotFoundException e) {
            System.err.println("Fájl nem található!");
        } catch (IOException e) {
            System.err.println("IOException error!");
        }
    }

    public void newRound() {
        System.out.println(player);
        int i = 1;
        for (Harcos e : harcosok) {
            System.out.println(i + ". " + e);
            i++;
        }
    }

    public void playersMove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mit szeretne tenni?\n" +
                "a.) Megküzdeni egy harcossal\n" +
                "b.) Gyógyulni\n" +
                "c.) Kilépni");
        if (sc.nextLine() == "a") {

        } else if (sc.nextLine() == "b") {
            player
        } else if (sc.nextLine() == "c") {
            System.out.println("Viszlát!");
            System.exit(0);
        } else {
            System.err.println("Rossz adatot adott meg, próbálja újra!");
        }
    }

    public void readFromFile(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null && !line.equals("")) {
            String[] split = line.split(";");
            Harcos h = new Harcos(split[0], Integer.parseInt(split[1]));
            harcosok.add(h);
            line = br.readLine();
        }
    }
}
