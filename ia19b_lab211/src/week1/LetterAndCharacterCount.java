/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author ASUS
 */
public class LetterAndCharacterCount {

    private final String input;

    public LetterAndCharacterCount(String letter) {
        input = letter;
    }

    Map<String, Integer> countWord() {
        StringTokenizer st1 = new StringTokenizer(input);
        Map<String, Integer> wordCount = new HashMap<>(); // <Key, Value>
        while (st1.hasMoreTokens()) {
            String word = st1.nextToken();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    Map<Character, Integer> countCharater() {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }
        }
        return charCount;
    }

    
}
