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
            String s = st1.nextToken();
            wordCount.put(s, wordCount.getOrDefault(s, 0) + 1);
        }
        return wordCount;
    }

    Map<Character, Integer> countCharater() {
        Map<Character, Integer> charCount = new HashMap<>();
//        for(char c : input.toCharArray())
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) != ' ') {
            charCount.put(input.charAt(i), charCount.getOrDefault(input.charAt(i), 0) + 1);
            }         
        }
        //
        return charCount;
    }

}
