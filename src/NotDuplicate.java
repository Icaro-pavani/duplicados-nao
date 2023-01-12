import java.util.ArrayList;
import java.util.List;

public class NotDuplicate {
    public static void main(String[] args) {
        String[] arrayOne = {"Morango", "Uva", "Acerola", "Manga", "Banana"};
        String[] arrayTwo = {"Banana", "Pêra", "Morango", "Caju", "Kiwi"};

        List<String> duplicates = new ArrayList<>();

        for (int i = 0; i < arrayOne.length; i++){
            for (int j = 0; j < arrayTwo.length; j++){
                if (arrayOne[i] == arrayTwo[j] && !duplicates.contains(arrayOne[i])) {
                    duplicates.add(arrayOne[i]);
                }
            }
        }

        System.out.println(duplicates);
    }
}
