package chap_00;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudy {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("강인구","010-4167-3262");
        map1.put("이영은","010-3676-3745");

        Scanner sc =new Scanner(System.in);
        while (true){
            System.out.println("조회 할 이름을 입력하세요 : ");
            String inputName = sc.next();
            if (inputName.equals("exit") ){
                System.out.println("종료합니다.");
                break;
            }
            String searchName = map1.get(inputName);

            if (searchName == null) {
                System.out.println(searchName + "는 없는 사람입니다.");
            }
            else {
                System.out.println(searchName);
            }
        }

    }
}
