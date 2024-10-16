package chap_09;

import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // ArrayList는 삭제 추가 되면 한칸씩 인덱스가 이동됨
        // 링크드리스트
        LinkedList<Integer> list = new LinkedList<>();
        // 데이터 추가
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        // 데이터 조회
        System.out.println(list.get(0));
        // 처음 데이터 조회
        System.out.println(list.getFirst());
        // 마지막 데이터 조회
        System.out.println(list.getLast());

        //맨앞에 추가
        list.addFirst(0);
        //마지막에 추가
        list.addLast(6);
        // 중간에 추가
        list.add(3,3);
        for(int i : list) {
            System.out.println(i);
        }

        // size()사용해서 마지막 데이터 삭제
        System.out.println(list.remove(list.size()-1));
        // 처음 데이터 삭제
        System.out.println(list.removeFirst());

        // 전체 삭제
        list.clear();
        // 전체 삭제 확인
        System.out.println(list.isEmpty());

    }
}
