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
    }
}
