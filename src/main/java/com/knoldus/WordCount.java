package com.knoldus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class WordCount {
    Map<String, Integer> getWordCount(String fileName) {
        Map<String, Integer> counts = new HashMap<>();
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            lines.forEach(line ->
                    Arrays.stream(line.split("[ ,!.]")).forEach(word ->
                    {
                        String getWord = word.toLowerCase();
                        int oldCount = 0;
                        if (counts.containsKey(getWord)) oldCount = counts.get(getWord);
                        counts.put(getWord, oldCount + 1);
                    }));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return counts;
    }
}
