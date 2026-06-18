import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWords {

    public static void findDuplicates(String sentence) {

        String[] words = sentence.toLowerCase().split("\\s+");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word,
                    frequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Duplicate Words:");

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(
                        entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {

        String input =
                "Java is great and Java is powerful";

        findDuplicates(input);
    }
}