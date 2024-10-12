package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args) {
        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인메서드에서 에러 처리하기");
        }
    }
    public static void writeFile() throws IOException {
//        try {
//            FileWriter writer = new FileWriter("test.txt");
//            // 에러 유도
//            throw new IOException("파일 쓰기에 실패 했습니다.");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("writeFIle 메서드내에서 자체 해결했어요.");
//        }
        FileWriter writer = new FileWriter("test.txt");
        // 에러 유도
        throw new IOException("파일 쓰기에 실패 했습니다.");
    }
}
