package hu.petrik.harcosproject;

import java.util.Scanner;

public class Player {
    private Harcos player;

    public Player() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adja meg a harcosa nevét: ");
        String name = sc.nextLine();
        System.out.println("\nAdja meg a kívánt sablont\n" +
                "1: hp=15 dmg=3\n" +
                "2: hp=12 dmg=4\n" +
                "3: hp=8 dmg=5\n");
        String role = sc.nextLine();
        player = new Harcos(name, Integer.parseInt(role));
    }

    @Override
    public String toString() {
        return player.toString();
    }
}
