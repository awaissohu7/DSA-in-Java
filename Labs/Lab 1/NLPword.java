
import java.io.File;
import java.util.Scanner;
public class NLPword {

    public static void main(String[] args) {
        System.out.println("Words From File:");
        String[] words = extractWords();
        for (String string : words) {
            System.out.println(string);}    }
    private static String[] extractWords() {
        String[] words = new String[500];
        try {
            File file = new File("//home//fuser//IdeaProjects//Lab1//src//MyFile.txt");
            Scanner sc = new Scanner(file);

            String line = "";
            int idx = 0;
            while (sc.hasNextLine()) {
                line += sc.nextLine();
                String lines[] = line.split("\\s+");
                for (String s : lines) {
                    words[idx++] = s;
                }
                line = "";
            }
            sc.close();
        } catch (Exception e) {
        }
        return words;}}
