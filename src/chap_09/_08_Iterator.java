package chap_09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        List<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("(알수 없음)");
        list.add("김종국");
        list.add("강호동");
        list.add("(알수 없음)");
        list.add("박명수");
        list.add("조세호");
        list.add("(알수 없음)");

        for (String s : list){
            System.out.println(s);
        }

        // iterator 로 자료형 변환 list.iterator(); 후 ctrl + alt + v 자료 변환 자동 생성
        Iterator<String> it = list.iterator();
        System.out.println(it.next()); //  리스트를 한줄씩 이동
        System.out.println(it.next());
        System.out.println(it.next());

        // 반복문으로 자동 순회하기
        while (it.hasNext()){ //hasNext() 다음 줄이 있는지 확인
            System.out.println(it.next());
        }
        it = list.iterator(); //커서 처음으로 돌리기
        while (it.hasNext()){
            String s = it.next();
            if (s.contains("(알수 없음)")){
                it.remove(); // 삭제
            }
        }
        it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
