package chap_12.clean;

public class Room {
    public int roomNumber=1;
    synchronized public void clean(String name) {
        System.out.println(name + " : " + roomNumber + "번방 청소 중");
        roomNumber++;
    }
}
