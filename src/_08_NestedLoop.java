public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 별 (*) 사각형 만들기
/*
        *****
        *****
        *****
        *****
        *****
 */
        for (int i = 0; i < 5; i++) {
            for ( int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }

        // 별 (*) 왼쪽 삼각형 만들기
        /*
        *
        **
        ***
        ****
        *****
         */
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        // 별 (*) 왼쪽 삼각형 만들기
        for (int i = 0; i < 5; i++) {
            System.out.print(" ");
            for (int j = 0 ; j < 5 -i -1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.println("*");

            }
            System.out.println(" ");
        }
    }
}
