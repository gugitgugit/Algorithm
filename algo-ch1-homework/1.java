// 22011475 구준혁

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) { //입력으로 numbers 배열을 받는 함수 solution
        
        int[] answer; //결과 배열
        List<Integer> list = new ArrayList<>(); //두 수의 합을 임시 저장할 ArrayList
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j]; //두 수의 합
                if(!list.contains(sum)) { //두 수의 합이 list에 없을 시
                    list.add(sum); //ArrayList에 추가
                }
            }
        }

        int index = 0;
        answer = new int[list.size()]; //ArrayLIst의 크기만큼의 배열 생성
        for(int num : list) {
            answer[index++] = num; //ArrayList의 원소들을 배열에 저장
        }
        Arrays.sort(answer); //배열을 오름차순으로 정렬

        return answer;
    }
}