package chap_09;

import java.util.*;
import java.util.HashSet;
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
        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-----HashSet------");
        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        Iterator<String> itSet = set.iterator(); // set.iterator(); 작성 후 ctrl alt v
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println("------HashMap Key--------");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석",10);
        map.put("박명수",5);
        // map.iterator() // key value 로 이루어져 사용 불가
        Iterator itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }
        System.out.println("------HashMap Value--------");
        Iterator<Integer> itMapVal = map.values().iterator();
        while (itMapVal.hasNext()) {
            System.out.println(itMapVal.next());
        }
        System.out.println("------HashMap entry 순회--------");
        Iterator<Map.Entry<String, Integer>> itEntry = map.entrySet().iterator();
        while (itEntry.hasNext()) {
            System.out.println(itEntry.next());
        }


    }
}
