package chap_09;

import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트
        HashSet<String>set = new HashSet<>(); //new LinkedHashSet<>(); 할경우 순서 보장
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살"); // 이미 있으므로 저장안됨
        set.add("깻잎");

        System.out.println("총 필요목록 : "+set.size());

        // 순회
        for(String s : set){
            System.out.println(s); // 무작위 호출
        }
        System.out.println("-------------");
        // 확인
        if (set.contains("삼겹살")) {
            System.out.println("삼겹살 사러 출발");
        }
        System.out.println("-------------");

        // 삭제
        System.out.println("총 필요 상품 수 (삼겹살 구매전) : "+set.size());
        set.remove("삼겹살");
        System.out.println();
        System.out.println("총 필요 상품 수 (삼겹살 구매후) : "+set.size());

        // 전체 삭제
        set.clear();
        System.out.println("남은 구매 상품 수 : "+set.size());
        System.out.println("집으로 출발");

    }
}
