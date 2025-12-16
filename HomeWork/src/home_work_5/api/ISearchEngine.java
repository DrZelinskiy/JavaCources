package home_work_5.api;

public interface ISearchEngine {
    /**
     * Поиск слова в тексте
     * @param text текст, в котором ищем
     * @param word слово, которое ищем
     * @return количество вхождений слова в тексте
     */
    long search(String text, String word);
}
