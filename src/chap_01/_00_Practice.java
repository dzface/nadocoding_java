package chap_01;

//키워드에 마우스 올려놓고 Cntr + 클릭하면 설명 or 변수나 객체는 해당 클래스로 이동
public class _00_Practice {
    public static void main(String[] args) {
        Point a = new Point(1,2);
        System.out.println(a);

    }

}
class Point{
    int x;
    int y;
    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }

}

