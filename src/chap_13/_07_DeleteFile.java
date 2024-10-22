package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("goodjob.txt");
        if(file.exists()){
            if(file.delete()) {
                System.out.println("파일 삭제 성공: "+ file.getName());
            } else System.out.println("파일삭제 실패:"+ file.getName());
        } else System.out.println("파일이 없습니다."+ file.getName());
        // delete()를 사용해서 폴더를 삭제할 경우 내부에 하위 폴더가 있을 경우 삭제 불가
        File folder = new File("A");
        if(folder.exists()) {
            if(folder.delete()){
                System.out.println("폴더삭제 성공: "+folder.getAbsolutePath());
            } else System.out.println("폴더삭제 실패 " +folder.getAbsolutePath());
        }
        if(deleteFolder(folder)) {
            System.out.println("*폴더삭제 성공: "+folder.getAbsolutePath());
        } else System.out.println("*폴더삭제 실패 " +folder.getAbsolutePath());
    }
    // 한번에 트리구조 폴더 삭제하는 방법
    // 해당 폴더가 폴더인지 확인하고 폴더이면 하위폴더 들어가고 계속 반복해서 확인 후
    // 최하위 폴더부터 하나씩 삭제하기
    public static boolean deleteFolder(File folder) {
        if(folder.isDirectory()) {
            for(File file :folder.listFiles()) {
                deleteFolder(file);
            }
        }
        System.out.println("삭제 대상: "+folder.getAbsolutePath());
        return folder.delete();
    }

}
