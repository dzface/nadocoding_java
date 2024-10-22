package chap_12.clean;

public class Room {
    int number = 1;
    //clean() 메서드가 호출 될 때마다 number가 1씩 증가
    synchronized public void clean(String name){
        System.out.println(name + " : " + number + "번방 청소 중...");
        number ++;
    }
}
