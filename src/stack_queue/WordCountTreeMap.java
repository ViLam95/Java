package stack_queue;

import java.util.Map;
import java.util.TreeMap;

public class WordCountTreeMap {
    public static void main(String[] args) {
        String text = "This is a sample text with several words. This text can be used to " +
                "demonstrate how to count the occurrences of each word in a string.";
        String[] words = text.split("[\\s,.]+");

        // Tạo một TreeMap để lưu trữ số lượng từ
        Map<String, Integer> wordCount = new TreeMap<>();

        // Lặp lại các từ và đếm số lần xuất hiện
        for (String word : words) {
            // Chuyển từ thành chữ thường hoặc chữ hoa
            word = word.toUpperCase();

            // Nếu từ đã có trong map thì tăng số lượng
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            }
            // Nếu từ không có trong map, thêm từ đó với số lượng là  1
            else {
                wordCount.put(word, 1);
            }
        }

        // In các từ ra màn hình
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
