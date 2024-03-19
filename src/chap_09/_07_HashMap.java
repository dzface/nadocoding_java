package chap_09;

import java.util.HashMap;
import java.util.Map;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (key, value)
        HashMap<String,Integer> map = new HashMap<>(); // new LinkedHashMap<>(); 할 경우 순서 보장

        // 데이터 추가
        map.put("유재석",10);
        map.put("박명수",5);
        map.put("김종국",3);
        System.out.println("총 고객 수 "+map.size());
        System.out.println("-----------------");

        // 조회
        System.out.println(" 유재석님의 포인트 :" + map.get("유재석")); // value 값 호출

        //확인
        if (map.containsKey("서장훈")){
            int point = map.get("서장훈");
            map.put("서장훈", ++point);
            System.out.println("서장훈님의 누적 포인트 : "+ map.get("서장훈"));
        } else{ // 서장훈이 set에 없고 신규일경우
            map.put("서장훈",1);
            System.out.println("서장훈님 신규 등록 (포인트1)");
        }
        System.out.println("-------------");
        // key 확인
        for (String key : map.keySet()){
            System.out.println(key);
        }
        // value 확인
        for (int value : map.values()){
            System.out.println(value);
        }
        // key & value 확인
        for (String key : map.keySet()){
            System.out.println("고객 이름 : "+key + "포인트 :"+ map.get(key));
        }
    }


}
