package assignment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TrieTest {
    String makeRandomString() {
        StringBuilder ans = new StringBuilder();
        int len = 1 + (int) (Math.random() * 10);
        for (int i = 0; i < len; i++) {
            ans.append((char) ('A' + Math.random() * 26));
        }

        return ans.toString();
    }


    @Test
    void testAddAndIterate() {
        Trie t = new Trie();

        Set<String> expectedValuesSet = new HashSet<String>();
        int numStrings = 1000;
        for (int i = 0; i < numStrings; i++) {
            expectedValuesSet.add(makeRandomString());
        }

        List<String> expectedValues = new ArrayList<String>(expectedValuesSet);
        Collections.sort(expectedValues);

        for (String word : expectedValues) {
            t.add(word);
        }

        int i = 0;
        for (String word : t) {
            Assertions.assertTrue(word.equals(expectedValues.get(i)));
            i++;
        }
    }

    @Test
    void testAddAndContains() {
        Trie t = new Trie();

        Set<String> expectedValuesSet = new HashSet<String>();
        int numStrings = 1000;
        for (int i = 0; i < numStrings; i++) {
            expectedValuesSet.add(makeRandomString());
        }

        List<String> expectedValues = new ArrayList<String>(expectedValuesSet);
        Collections.sort(expectedValues);

        for (String word : expectedValues) {
            t.add(word);
        }

        int numChecks = 10000;
        for (int i = 0; i < numChecks; i++) {
            Assertions.assertTrue(t.contains(expectedValues.get((int)(Math.random() * expectedValues.size()))));
        }
    }

    @Test
    void testAddAndPrefix() {
        Trie t = new Trie();

        Set<String> expectedValuesSet = new HashSet<String>();
        int numStrings = 1000;
        for (int i = 0; i < numStrings; i++) {
            expectedValuesSet.add(makeRandomString());
        }

        List<String> expectedValues = new ArrayList<String>(expectedValuesSet);
        Collections.sort(expectedValues);

        for (String word : expectedValues) {
            t.add(word);
        }

        int numChecks = 10000;
        for (int i = 0; i < numChecks; i++) {
            String origWord = expectedValues.get((int)(Math.random() * expectedValues.size()));
            String prefix = origWord.substring(0, 1 + (int) (Math.random() * origWord.length()));
            Assertions.assertTrue(t.hasPrefix(prefix));
        }
    }

    @Test
    void loadDictionary() throws IOException {
        Trie t = new Trie();
        BufferedReader br = new BufferedReader(new FileReader("words.txt"));

        String word = br.readLine();
        Set<String> words = new HashSet<String>();

        while (word != null) {
            t.add(word);
            words.add(word);
            word = br.readLine();
        }

        for (String currWord : t) {
            Assertions.assertTrue(words.contains(currWord));
        }

        for (String currWord : words) {
            Assertions.assertTrue(t.contains(currWord));
        }

        Assertions.assertFalse(t.contains("thaecp"));
    }
}