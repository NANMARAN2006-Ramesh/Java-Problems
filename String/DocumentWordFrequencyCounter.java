import java.util.Scanner;

public class DocumentWordFrequencyCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toLowerCase();
        str = str.replaceAll("[^a-z ]", "");

        String[] words = str.split("\\s+");
        int len = words.length;
        int uniqueCount = 0;

        System.out.println("Word Frequency Report:");
        for (int i = 0; i < len; i++) {
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (words[i].equals(words[k])) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < len; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            System.out.println(words[i] + ": " + count);
            uniqueCount++;
        }
        System.out.println("Total Unique Words: " + uniqueCount);

        sc.close();
    }
}