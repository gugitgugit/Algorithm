import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW2 {
    static List<List<Integer>> answer = new ArrayList<>();
    static List<Integer> subSet = new ArrayList<>();

    public static List<List<Integer>> solution(int n, int k) {

        subSetList(answer, subSet, 1, n, k);

        return answer;
    }
    

    public static void subSetList(List<List<Integer>> answer, List<Integer> subSet, int start, int n, int k) {
        if(subSet.size() == k) {
            answer.add(new ArrayList<>(subSet));
            return;
        }

        for(int i = start; i <= n; i++) {
            subSet.add(i);
            subSetList(answer, subSet, i + 1, n, k);
            subSet.remove(subSet.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 n과 k를 입력? ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        List<List<Integer>> answer = solution(n, k);
        for(List<Integer> subSet : answer) {
            System.out.print(subSet + " ");
        }

        scanner.close();
    }
}
