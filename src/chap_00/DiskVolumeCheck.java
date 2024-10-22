package chap_00;

import java.io.File;

public class DiskVolumeCheck {

    public DiskVolumeCheck() {
        // 측정 할 경로를 받기위한 변수
        File root =null;
        try{
            // C 드라이브 절대 경로 그냥 root 경로로 설정하고 싶으면 / 입력
            root = new File("C:\\");
            //용량을 측정하여 값을 넣을 리스트 생성
            String[] list = new String[2];
            list[0] = toMB(root.getTotalSpace());
            list[1] = toMB(root.getUsableSpace());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String toMB(long size) {
        // 바이트 단위로 반환되기 때문에 메가바이트 단위로 환산 2^20
        String result = String.valueOf((size/(1024*1024)));
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        // 객체 생성하면 용량 측정;
        DiskVolumeCheck d1 = new DiskVolumeCheck();
    }
}
