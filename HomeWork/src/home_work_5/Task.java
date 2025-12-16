package home_work_5;

import java.io.*;
import java.util.*;

public class Task {

    public static void main(String[] args) {
        try {
            String filename = "HomeWork/src/home_work_5/Война и мир.txt";
            String text = readTextFromFile(filename);

            System.out.println("=== Анализ текста 'Война и мир' ===");
            System.out.println("Длина текста: " + text.length() + " символов\n");

            Set<String> uniqueWords = findUniqueWords(text);
            System.out.println("2.1. Количество уникальных слов: " + uniqueWords.size());

            int minOccurrences = 100;
            analyzeFrequency(text, minOccurrences);

        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }



    public static String readTextFromFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();

        Reader reader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            content.append(line).append(" ");
        }

        bufferedReader.close();
        reader.close();

        return content.toString().trim();
    }

    public static Set<String> findUniqueWords(String text){
        String[] wordsArray = text
                            .replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "")
                            .replaceAll("\\s+", " ")
                            .split(" ");

        Set<String> allWords = new HashSet<>();
        for (String word : wordsArray) {
            if (!word.isEmpty()){
                allWords.add(word);
            }
        }

        return allWords;
    }

    public static void analyzeFrequency(String text, int limit) throws IOException{
        String[] wordsArray = text
                .replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "")
                .replaceAll("\\s+", " ")
                .split(" ");

        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : wordsArray) {
            if (!word.isEmpty()) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Всего уникальных слов: " + wordFrequency.size());

        List<Map.Entry<String, Integer>> wordList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            wordList.add(entry);
        }

        wordList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        List<Map.Entry<String, Integer>> filteredList = new ArrayList<>();

        for (int i = 0; i < limit; i++) {
            filteredList.add(wordList.get(i));
        }

        System.out.println("\n=== Топ-" + limit + " самых частых слов ===\n");
        System.out.println("Найдено слов: " + filteredList.size() + "\n");

        int rank = 1;
        for (Map.Entry<String, Integer> entry : filteredList) {
            System.out.printf("%3d. %-20s - %d раз%n", rank++, entry.getKey(), entry.getValue());
        }
    }


}
