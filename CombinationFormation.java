public class CombinationFormation {
    public static void printAllDecoding(String number, String output) {
        if (number.length() == 0) {
            System.out.println(output);
            return;
        }

        String firstCharacter = number.substring(0, 1);
        int firstNumber = Integer.parseInt(firstCharacter);
        char character = (char)('a' + firstNumber - 1);
        printAllDecoding(number.substring(1), output + character);

        
    }
    public static void main(String[] args) {
        printAllDecoding("23456", "");
    }
}
