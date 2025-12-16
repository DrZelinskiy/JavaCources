package home_work_5.search;

import home_work_5.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        if (text == null || word == null || text.isEmpty() || word.isEmpty()) {
            return 0;
        }

        String escapedWord = Pattern.quote(word);

        Pattern pattern = Pattern.compile("\\b" + escapedWord + "\\b");
        Matcher matcher = pattern.matcher(text);

        long count = 0;

        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
