package module11.Task1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Main replaceWord = new Main();
        BufferedReader br = replaceWord.readFile();
        Map<String, String> replace = replaceWord.replacer("lion", "pig", br);
        System.out.println(replace);
    }

    public Map<String, String> replacer(String oldString, String newString, BufferedReader buff) {
        Map<String, String> replacer = new HashMap<>();
        try {
            StringBuilder sb = new StringBuilder();
            String line = buff.readLine();

            while (line != null) {
                String[] s = line.split(" ");
                for (int i = 0; i < s.length; i++) {
                    if (s[i].equals(oldString)) {
                        sb.append(s[i].replace(oldString, newString) + " new");
                    } else {
                        sb.append(s[i] + " old");
                    }
                }
                line = buff.readLine();
                sb.append(System.lineSeparator());
            }
            String result = sb.toString();
            replacer.put(oldString, result);
            return replacer;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You have IOexception");
        }
        return null;
    }

    static BufferedReader readFile() {
        try {
            File file = new File("E:/Read.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            return reader;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
