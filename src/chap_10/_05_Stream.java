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

        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascripy", "C"};
        Stream<String> stream = Arrays.stream(langs);
        List<String> langList = new ArrayList<>();
        langList = Arrays.asList(langs);
        System.out.println(langList.size());
    }
}
