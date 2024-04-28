// 22011475 구준혁
import java.util.Scanner;
import java.util.HashSet;


public class Main { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        HashSet<String> hs = new HashSet<String>();
        

        for(int i = 0; i < S.length(); i++) {
            for(int j = i + 1; j <= S.length(); j++) {
                hs.add(S.substring(i, j));
            }       
        }

        System.out.println(hs.size());
        scanner.close();
    }
}