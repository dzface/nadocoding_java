package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("이름을 입력하세요.");
//        String name = sc.next();
//
//
//        System.out.println("혈액형을 입력하세요");
//        String bloodType = sc.next();
//        System.out.println("키를 입력하세요.(정수값 입력)");
//        //sc.next()는 무조건 String을 반하기 때문에 변환
//        int height =Integer.parseInt(sc.next());
//        // 또는 Int형 바로 받기
//        // int heightInt = sc.nextInt();
//        System.out.println("몸무게를 입력하세요.");
//        double weight = Double.parseDouble(sc.next());
//        // 또는 Double형 바로 받기
//        // double weightDouble = sc.nextDouble();
//        System.out.println("입력하신 정보는 다음과 같습니다.");
//        System.out.println("이름 : "+ name);
//        System.out.println("혈액형 : " +bloodType);
//        System.out.println("키 : " + height);
//        System.out.println("몸무게 : "+ weight);

//        System.out.println("무슨 언어를 배웠나요?");
//        String lang = sc.next();
//        System.out.println(lang);
//        System.out.println("배우고 나서 후기 부탁해요(이덕화 톤으로)");
//        String review = sc.next();
//        System.out.println(review);
        // next()는 공백기준으로 입력값을 분리하는데 입력값이 스페이스로 나뉘어져 있을 경우
        // 다음 next()에서 나뉜 데이터가 입력받아지게 됨
        System.out.println("______________________");
        System.out.println("무슨 언어를 배웠나요?");
        String lang2 = sc.nextLine();
        System.out.println(lang2);
        // 이전 입력값을 다음 입력값에 영향주지 않기 위해 입력값 초기화
        //sc.nextLine();
        System.out.println("배우고 나서 후기 부탁해요(이덕화 톤으로)");
        String review2 = sc.nextLine();
        System.out.println(review2);
    }
}
