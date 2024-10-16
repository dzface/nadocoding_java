package chap_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        int[] array =new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
//      array[3] = 5; 배열은 처음 초기화한 크기이상으로 데이터를 넣을 수 없었음
//      컬렉션 프레임워크
//        List, Set, Map 크게 3가지가 있음
        // 리스트에는 ArrayList, LinkedList가 있음
        // ArrayList 선언
        ArrayList<String> list = new ArrayList<>();
        // 데이터 추가
        list.add("강아지");
        list.add("고양이");
        list.add("코알라");
        list.add("꿩");
        // 데이터 조회
        System.out.println(list.get(0));
        // 인덱스 기준 데이터 삭제 출력이 되고 삭제됨
        System.out.println(list.remove(2));
        // 데이터 조회 후 삭제 삭제되었으면 true, 실패면 false
        System.out.println(list.remove("고양이2"));
        // 리스트 크기 출력
        System.out.println(list.size());
        // 리스트 전체 순회해서 출력
        for(String i : list) {
            System.out.println(i);
        }

        // 리스트 변경 set(index, 바꿀데이터)
        // 꿩 >> 캥거루
        list.set(2, "캥거루");
        System.out.println(list.get(2));

        // 데이터 포함 여부확인
        // index 위치를 반환
        System.out.println(list.indexOf("캥거루"));
        // 존재여부를 true false로 반환
        System.out.println(list.contains("캥거루"));

        // 정렬 한글은 가나다순으로 정렬
        Collections.sort(list);
        for(String i : list) {
            System.out.println(i);
        }
        // 리스트 전체삭제
        list.clear();
        System.out.println(list.size());
    }
}
