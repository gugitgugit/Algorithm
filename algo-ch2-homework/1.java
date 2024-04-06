import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    static class Node {
        int value;
        Node left_child;
        Node right_child;
    
        Node(int value) {  // value를 설정하는 생성자만 있으면 됨.
            this.value = value;
        }
    
        
        void insert(int input_value) {
            if(input_value < this.value) {  // input_value가 현재 노드의 value보다 작을 때
                if(this.left_child == null)  // left_child가 null이면
                    this.left_child = new Node(input_value);  // left_child에 input_value 삽입
                else
                    this.left_child.insert(input_value);  // null이 아니면 left_child에서 다시 insertion.
            }
            else {  // input_value가 현재 노드의 value보다 클 때
                if(this.right_child == null)  // right_child가 null이면
                    this.right_child = new Node(input_value);  // right_child에 input_value 삽입
                else
                    this.right_child.insert(input_value);  // null이 아니면 right_child에서 다시 insertion.
            }
        }
    }
    
    static StringBuilder sb = new StringBuilder(); // 출력함수 호출을 줄이기 위해 StringBuilder사용
    static void postOrder(Node current) {  // 재귀적으로 후위 순회 구현
        if(current == null)
            return;
        postOrder(current.left_child);
        postOrder(current.right_child);
        sb.append(current.value + "\n");
    }
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input_value;
        Node root;
        
        root = new Node(Integer.parseInt(br.readLine()));
        while(true) {
            input_value = br.readLine();
            if(input_value == null || input_value == "")
                break;
            root.insert(Integer.parseInt(input_value));
        }

        postOrder(root);
        System.out.println(sb);
    }
}