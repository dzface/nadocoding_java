package chap_00;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// ctrl + shift + i : 메서드 설명보기
// alt + enter : 오류 추천 방법 제시
public class Practice {
    public static void main(String[] args) {
        // arraylist 생성 및 조회
        ArrayList<String> al = new ArrayList<>();
        al.add("구렁이");
        al.add("팔렁이");
        al.add("칠렁이");

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        // HashMap
        HashMap<String,String> dic =new HashMap<>();
        dic.put("apple", "사과");
        dic.put("banana", "바나나");
        dic.put("cap", "모자");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("뜻을 찾고싶은 영어단어는? :");
            String eng = sc.next();

            if (eng.equals("exit")){
                    System.out.println("종료 합니다.");
                    break;
            }
            String kor = dic.get(eng);
            if(kor == null)
                System.out.println(eng + "는 없는 단어 입니다.");
            else System.out.println(kor);
        }
        sc.close();
    }
}
