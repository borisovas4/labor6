import java.io.*;

public class Variant4 {
    public static void main(String[] args) throws IOException {
        BufferedReader inFile = null;
        BufferedWriter outFile = null;
        try {
            inFile = new BufferedReader(new FileReader("C:\\Users\\мвидео\\IdeaProjects\\labor6\\src\\Var4_in.txt"),1024);
            outFile = new BufferedWriter(new FileWriter("C:\\Users\\мвидео\\IdeaProjects\\labor6\\src\\Var4_out.txt"));
            int lineNum = 1;
            String line;
            while ((line = inFile.readLine()) != null) {
                String[] words = line.split(" ");
                outFile.write("" + lineNum);

                int wordsCount = 0;
                if (words.length != 0) {
                    int firstWordLength = words[0].length();
                    for (String word : words) {
                        if (word.length() < firstWordLength) {
                            outFile.write(" " + word);
                            wordsCount++;
                        }
                    }
                }

                outFile.write(" " + wordsCount + "\n");
                lineNum++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!");
        }
        finally {
            inFile.close();
            outFile.flush();
            outFile.close();
        }
    }
}
