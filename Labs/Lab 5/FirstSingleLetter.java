public class FirstSingleLetter {

    public static char firstSingleLetter(char[] text) {
        for (char c : text) {
            if (countOccurrences(text, c) == 1) {
                return c;
            }
        }
        return ' ';
    }

    private static int countOccurrences(char[] text, char c) {
        int count = 0;
        for (char ch : text) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[] text = "algorithm".toCharArray();
        char result = firstSingleLetter(text);
        System.out.println(result);
    }
}