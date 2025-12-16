package home_work_5.search;

import home_work_5.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        if (text == null || word == null || text.isEmpty() || word.isEmpty()) {
            return 0;
        }

        long count = 0;
        int index = 0;

        while ((index = text.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }

        return count;
    }
}
