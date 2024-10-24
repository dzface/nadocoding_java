package chap_00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int l = 5;
        int r= 555;

        String sl = String.valueOf(l);
        String sr = String.valueOf(r);
        String first = "5";
        for (int i = 1; i < sl.length(); i++) {
            first +="0";
        }
        List<String> list = new ArrayList<>();
        list.add(first);
        addString(list, first,sr.length()-sl.length());

        for(String i: list) {
            System.out.println(i);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            if(Integer.parseInt(list.get(i))>=l && Integer.parseInt(list.get(i))<=r){
                answer[i] = Integer.parseInt(list.get(i));
            }
        }
        Arrays.sort(answer);
        if(answer[list.size()-1]==0){
            answer[list.size()-1] =-1;
        }
        for(int i: answer) {
            System.out.println(i);
        }
    }

    public static List<String> addString(List<String> list, String s, int limit) {
        if(limit ==0){
            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = Integer.parseInt(list.get(i));
            }
            Collections.sort(list);
            return list;
        }
        String a = s+ "0";
        String b = s+ "5";
        list.add(a);
        list.add(b);
        limit -=1;
        addString(list,a, limit);
        addString(list,b, limit);

        return null;
    }
}
