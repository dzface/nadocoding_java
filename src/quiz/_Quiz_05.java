package quiz;

/*
신발사이즈 출력 문제
250부터 5단위로 295까지 10가지 사이즈출력
실행 결과 예
사이즈 250 (재고 있음)
 */
public class _Quiz_05 {
    public static void main(String[] args) {
        int[] size= new int[10];
        for (int i = 0; i < 10; i++) {
            size[i] = 250 + (5*i);
            System.out.println("사이즈 " + size[i] + " (재고 있음)");
        }
    }
}
