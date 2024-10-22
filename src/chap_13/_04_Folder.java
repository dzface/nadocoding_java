package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir();
        if(folder.exists()){
            System.out.println("폴더가 존재합니다. " +folder.getAbsolutePath() );
        }
        //하위폴더 만들기 mkdir은 상위폴더가 존재하지 않을경우 생성 할 수 없음
        folderName = "A/B/C";
        // 윈도우 : C\\Users\\사용자명\\Desktop
        // 맥 : /Users/사용자명/Desktop
        // "A" + File.separator + "B" +File.separator+"C"
        folder = new File(folderName);
        folder.mkdirs();
        if (folder.exists()){
            System.out.println("폴더가 존재합니다. : "+folder.getAbsolutePath());
        } else System.out.println("폴더 생성 실패");
    }

}
