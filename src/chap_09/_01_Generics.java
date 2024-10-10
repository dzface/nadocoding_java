package chap_09;

public class _01_Generics {
    public static void main(String[] args) {

        //제네릭스
        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};


        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("=================");
        // int배열과 double 타입은 에러가 남 참조형 타입이라서 따라서 wrapper 클래스로 감싸주어야 함
        // int 는 Interger로 double 은 Double로 변경
        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);

    }
    private static <T> void printAnyArray(T[] array){
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");

        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " ");

        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.print(i+ " ");
        }
        System.out.println();
        }
}

