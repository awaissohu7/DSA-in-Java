
import java.util.Scanner;
import java.io.File;

public class NLPEmail {
    
    public static void main(String[] args) {
        String[] emails = extractEmails();
        System.out.println("Emails from file:");
        for (String string : emails) {
            System.out.println(string);}}
    private static String[] extractEmails() {
        String[] emails = new String[50];
        int idx = 0;
        try {
            File file = new File("//home//fuser//IdeaProjects//Lab1//src//MyMail.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] words = line.split("\\s+");
                for (String s : words) {
                    if (s.contains("@")) {
                        if (s.endsWith(".") || s.endsWith(",") || s.endsWith(" ")) {
                            s = s.substring(0, s.length() - 1);
                        }
                        emails[idx++] = s;}}}
            sc.close();
        } catch (Exception e) {

            }        return emails;}}
