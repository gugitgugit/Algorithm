// 22011475 구준혁

import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //표준입력의 스캐너 추가가

        int n = scanner.nextInt(); //좌표의 개수

        int[] arr = new int[n]; //좌표값을 저장할 배열
        int[] sortedArr = new int[n]; //좌표값을 정렬할 배열
        HashMap<Integer, Integer> rankMap = new HashMap<>(); 
        //좌표값의 크기 rank를 저장할 Map

        for(int i = 0; i < n; i++) {
            arr[i] = sortedArr[i] = scanner.nextInt(); 
            //먼저 각 배열에 좌표값 저장
        }

        Arrays.sort(sortedArr); //좌표값 정렬

        int rank = 0;
        for(int val : sortedArr) {
            if(!rankMap.containsKey(val)) { //중복값 제거
                rankMap.put(val, rank); 
                //각 val의 크기 rank 0(최솟값)부터 저장
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder(); 
        //출력함수 호출을 줄이기 위해 StringBuilder사용
        for(int key : arr) { 
            int ranking = rankMap.get(key); //원래 좌표값의 랭킹 찾기
            sb.append(ranking).append(' ');
        }
        System.out.println(sb);
    }
}
