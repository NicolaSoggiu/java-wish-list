package org.lessons.java.wishlist;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Present> presentList = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            System.out.println("The number of presents in the list is: " + presentList.size());
            System.out.println("Insert new present? y/n");
            exit = scan.nextLine().equals("n");
            if (!exit) {
                System.out.println("What present is it?");
                String presentDescription = scan.nextLine();
                System.out.println("Who do you want to give the gift to?");
                String receiver = scan.nextLine();
                presentList.add(new Present(presentDescription, receiver));
            }
        }
        System.out.println(presentList);

        try {
            File wishlist = new File("resources/wishlist.txt");
            if (wishlist.createNewFile()) {
                System.out.println("File created!");
            }

            FileWriter writer = new FileWriter(wishlist, true);
            for (Present present : presentList) {
                writer.write(present.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

        scan.close();
    }
}
