package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 : 흐른다?
        int[] scores = {100, 95, 90 ,85, 80};
        // Arrays.stream 으로 스트림 생성
        IntStream scoreStream = Arrays.stream(scores);
        String[] langs = {"python", "java", "javascripy", "C"};
        Stream<String> langStream = Arrays.stream(langs);

        // Collection.stream()
        List<String> langList = new ArrayList<>();
        langList = Arrays.asList(langs);
        System.out.println(langList.size());

        Stream<String> langListStream = langList.stream();
        // 스트림 생성방법 2 Stream.of()
        Stream<String> langListOfStream = Stream.of(langs);
    }
}
