package chap_13;

public class _02_Output {
    public static void main(String[] args) {
//        System.out.format();
//        System.out.printf("");
        // 여러개 자료형을 지정하여 출력할수있고 \n이나 %n으로 다음줄로 넘길 수 있음
        System.out.printf("정수\n%d%n%d", 10,100);
        //6자리 공간 확보하고 빈공간을 0으로 채움
        System.out.printf("%06d\n", 1234);
        //자료에 양수표시
        System.out.printf("%+6d\n", 1234);
        //,로 3자리마다 구분
        System.out.printf("%,12d\n", 123456789);
        // 기본적으로 자릿수가 남을경우 오른쪽정렬 되는데 이번엔 왼쪽정렬
        System.out.printf("%-6d\n", 1234);

        //실수 표현하기
        System.out.println("_____________________________");
        // %전체자릿수.소숫점뒤에 자릿수f
        // 원주율 전체 12자리에서 소숫점 5번째 자리까지 출력하기
        System.out.printf("%12.5f\n", Math.PI);
        // 남는 공간 왼쪽 정렬로 채우기
        System.out.printf("%-12.5f\n", Math.PI);
        //남는공간 0으로 채우기
        System.out.printf("%012.5f\n", Math.PI);

        System.out.println("___________________________________");
        System.out.printf("%s%n", "Java");
        // 6자리 확보하고 2글자 출력
        System.out.printf("%6.2s%n","Java");
        //응용 여러가지 값 정렬
        System.out.println("이름      영어   수학   평균"); //
        System.out.printf("%-6s %3d %5d %6.1f%n","강백호",90,80, 85.0);
        System.out.printf("%-6s %3d %5d %6.1f%n","서태웅",100,100, 100.0);
        System.out.printf("%-6s %3d %5d %6.1f%n","채치수",85,85, 85.0);

    }
}
