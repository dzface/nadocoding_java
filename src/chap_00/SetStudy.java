package chap_00;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetStudy {
    public static void main(String[] args) {
        // HashSet : Set 인터페이스를 상속받는 클래스
        // 리스트와의 차이: 리스트는 중복O 순서0 셋은 중복X 순서X
        HashSet<String> set1 = new HashSet<>();
        set1.add("Milk");
        set1.add("Bread");
        set1.add("Butter");
        set1.add("Cheeze");
        set1.add("Ham");
        System.out.println(set1);

        // TreeSet: HashSet과 유사하며 트리구조로 되어있어 데이터검색용이, 추가삭제 불리
        TreeSet<String> set2 =new TreeSet<>();
        set2.add("Milk");
        set2.add("Bread");
        set2.add("Butter");
        set2.add("Cheeze");
        set2.add("Ham");
        System.out.println(set2);



    }
}
