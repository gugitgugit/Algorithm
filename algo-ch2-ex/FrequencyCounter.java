import java.util.Scanner;
import java.io.File;

public class FrequencyCounter {
    public static void main(String[] args) {
        int minlen = Integer.parseInt(args[0]); …
        try {
            Scanner sc = new Scanner(file);
            long start = System.currentTimeMillis(); // 실행 시간 측정
            while (sc.hasNext()) {
            String word = sc.next();
            if (word.length() < minlen) continue;
            if (!st.contains(word)) st.put(word, 1);
            else st.put(word, st.get(word) + 1);
            }
            String maxKey = ""; int maxValue = 0;
            for (String word : st.keys())
            if (st.get(word) > maxValue) { maxValue = st.get(word); maxKey = word; }
            long end = System.currentTimeMillis();
            System.out.println(maxKey + " " + maxValue);
            System.out.println("소요 시간 = " + (end-start) + "ms");
            }
    }
 } …