package JavaLogicBuilding.logic;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Java is awesome";
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        System.out.println("Reversed sentence: " + reversed.toString().trim());
    }
}

