package cw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* Complete the function that takes a string of English-language text and returns the number of consonants in the string.
 * Consonants are all letters used to write English excluding the vowels a, e, i, o, u.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(getCount(""));
        System.out.println(getCount("aaaaa"));
        System.out.println(getCount("XaeiouX"));
        System.out.println(getCount("Bbbbb"));
        System.out.println(getCount("helLo world"));
        System.out.println(getCount("h^$&^#$&^elLo world"));
        System.out.println(getCount("012345_Cb"));
        System.out.println(getCount("0123456789"));
        System.out.println(getCount("237^e7a702 _o^5kbmbwsgpdygptltvdnnsqvcmthbypsrtmywhpfhdjpprqgqcjcvmkmkrwtnqxzvvfhqrrrzt"));
    }

    public static int getCount(String str) {
        String s = str.toLowerCase();
        Character[] charObjectArray = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charObjectArray[i] = s.charAt(i);
        }
        ArrayList<Character> list = new ArrayList<>(Arrays.asList(charObjectArray));
        ArrayList<Character> listDel = new ArrayList<>();
        Collections.addAll(listDel, '\n', ' ', 'a', 'e', 'i', 'o', 'u', '^', '$', '&', '#', '_', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
        list.removeAll(listDel);
        return list.size();
    }
}
