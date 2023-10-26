package org.lessons.java.bonus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert a word");
        String word = scan.nextLine();

        // con un Map associo ogni character a un intero
        Map<Character, Integer> charCount = new HashMap<>();

        // itero ogni carattere della parola
        for (char c : word.toCharArray()) {
            // se il carattere è già presente aumento il counter di 1
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
                // altrimenti gli assegno 1
            } else {
                charCount.put(c, 1);
            }
        }

        //stampo il risultato
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        scan.close();
    }
}
