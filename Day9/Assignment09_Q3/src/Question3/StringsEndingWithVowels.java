package Question3;

public class StringsEndingWithVowels {

    public static void printStringEndingWithVowels(String[] strings) {
        System.out.println("Strings ending with vowels:");
        for (String str : strings) {
            char lastChar = str.toLowerCase().charAt(str.length() - 1);
            if (lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u') {
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        String[] array = {"Apple", "Mango", "Banana", "Tree", "Mumbai", "Sunbeam", "Kolhapur"};

        printStringEndingWithVowels(array);
    }
}
