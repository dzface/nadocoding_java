package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 : 흐른다?
        int[] scores = {100, 95, 90 ,85, 80};
        // Arrays.stream 으로 스트림 생성
        IntStream scoreStream = Arrays.stream(scores);
        String[] langs = {"python", "java", "javascript", "C","C++","C#" };
        Stream<String> langStream = Arrays.stream(langs);

        // Collection.stream()
        List<String> langList = new ArrayList<>();
        langList = Arrays.asList(langs);
        System.out.println(langList.size());

        Stream<String> langListStream = langList.stream();
        // 스트림 생성방법 2 Stream.of()
        Stream<String> langListOfStream = Stream.of(langs);

        //스트림 사용
        // 중간연산 (Intermediate Operation) :filter, map sorted, distinct, skip ...
        // 최종연산 (Terminal Operation) : count, min, max, sum forEach, anyMatch, allMatch

        // 90점 이상이 점수만 출력
        Arrays.stream(scores).filter(x -> x>=90).forEach(x -> System.out.println(x));
//        Arrays.stream(scores).filter(x -> x>=90).forEach(System.out::println);
        System.out.println("________________________________________");

        // 90점 이상인 사람의 수 count()로 반환 반환값 long 이므로 long 타입 반환 명시하거나 int로 형변환
        int count = (int) Arrays.stream(scores).filter(x-> x>=90).count();
        System.out.println(count);

        // 90점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x-> x>=90).sum();
        System.out.println(sum);

        // 90점 이상인 점수 오름차순 정렬
        Arrays.stream(scores).filter(x -> x>=90).sorted().forEach(System.out::println);
        System.out.println("________________________________");

        // String[] langs = {"python", "java", "javascripy", "C"};
        // c로 시작하는 프로그래밍 언어 추출 대소문자를 구분함
        Arrays.stream(langs).filter(x->x.startsWith("C")).forEach(System.out::println);
        System.out.println("____________________________");

        // java 라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x-> x.contains("java")).forEach(System.out::println);
        System.out.println("_____________________________");

        // 4글자 이하의 언어를 정렬해서 출력
        langList.stream().filter(x -> x.length() <=4).sorted().forEach(System.out::println);
        System.out.println("_____________________________");

        // 4글자 이하의 언어 중에서 C 라는 글자를 포함하느 언어
        langList.stream()
                .filter(x->x.length() <=4)
                .filter(x->x.contains("C"))
                .forEach(System.out::println);
        System.out.println("______________________________");

        // 4글자 이하의 언어 중에서 c라는 글자가 하나라도 있는지
        boolean anyMatch = langList.stream()
                .filter(x->x.length() <=4)
                .anyMatch(x -> x.contains("C"));
        System.out.println(anyMatch);
        System.out.println("_______________________________");

        // 4글자 이하의 언어들이 모두 c라는 글자를 포함하는지 여부
        boolean allMatch = langList.stream()
                .filter(x->x.length() <=4)
                .allMatch(x -> x.contains("C"));
        System.out.println(allMatch);

        // 4글자 이하의 언어 중에서 C라는 글자를 포함하는 언어 뒤에 (어려움) 글자 함께 출력
        // map
        langList.stream()
                .filter(x->x.length()<=4)
                .filter(x->x.contains("C"))
                .map(x ->x + "(어려움)")
                .forEach(System.out::println);
        System.out.println("_______________________________");

        // C라는 글자를 포함하는 언어 소문자로 출력
        langList.stream()
                .filter(x -> x.contains("C"))
                .map(String::toLowerCase)
                .forEach(System.out::println);
        System.out.println("________________________________");
        
        //c라는 글자를 포함하는 언어를 소문자로 변경 후 리스트로 저장하기
        List<String> langListStartWithC = langList.stream()
                .filter(x -> x.contains("C"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(langListStartWithC);
    }
}
