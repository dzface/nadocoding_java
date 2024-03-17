package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키코드(ANSI) : 미국 표준코드
        char c = 'A';
        System.out.println(c);
        System.out.println((int) c);

        c = 'B';
        System.out.println(c);
        System.out.println((int) c);

        c++;
        System.out.println(c);
        System.out.println((int) c);

        String[][] seats3 = new String[10][15];
        char ch = 'A';

        //아스키코드로 좌석번호 배열 출력

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }
        // 영화관 좌석 확인
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
    }
    }
}