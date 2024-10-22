package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        // 여기서 .은 현재 현재위치의 상대경로
        // 경로 이동시 \\과 // 둘다 사용가능
        // 상위경로 이동시 ..// 사용 ..//..//
        String folder = ".";
        File filesAndFolders = new File(folder);
        System.out.println(filesAndFolders.getAbsoluteFile());
        //해당경로 파일이나 폴더 조회
        for(File file : filesAndFolders.listFiles()){
            if(file.isFile()){
                System.out.println("파일명: "+ file.getName());
            } else if (file.isDirectory()) {
                System.out.println("폴더명: "+file.getName());
            }
        }
    }
}
